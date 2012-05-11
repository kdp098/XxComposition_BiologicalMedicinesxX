package textmanipulation.MorphologicalAnalysis;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import textmanipulation.WordCount;


/**
 * �`�ԑf��͂��s���āA���ʂ�Ԃ��N���X
 * @author Ryo Okuya
 */
public class MorphologicalAnalysis {


	//�`�ԑf��͂ɗp���郆�[�U�[�����̃t�@�C��Path
	static String UserDicFilePath = "E:\\okuya\\Data\\�`�ԑf���\\user.dic";


	private String FileName;
	private ArrayList<Morpheme[]> MAList = new ArrayList<Morpheme[]>();

	/**
	 * �R���X�g���N�^
	 * �Ώۂ̃t�@�C�����̃e�L�X�g�ɑ΂��Č`�ԑf��͂��s���A�܂܂�Ă���i���ƒP����i�[
	 */
	public MorphologicalAnalysis(String FileName){

		this.FileName = FileName;

		//�Ώۃt�@�C���̐�΃p�X���擾
		String AbsoluteFilePath	= new File(this.FileName).getAbsolutePath();

		try{
			//MeCab�̃v���Z�X�쐬(���[�U�[�����w��)
			Runtime r = Runtime.getRuntime();
			Process p = r.exec("mecab " + AbsoluteFilePath + " -u " + UserDicFilePath);
			System.out.println("mecab " + AbsoluteFilePath + " -u " + UserDicFilePath);

			//����
			InputStream is = p.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);

			//�ꎞ�i�[�p
			ArrayList<Morpheme> TempList = new ArrayList<Morpheme>();

			//�ǂݍ���
			String tmp;
			while((tmp = br.readLine()) != null){
				System.out.println(tmp);
				if(!tmp.equals("EOS")){
					//�`�ԑf���
					Morpheme M = new Morpheme(tmp);
					TempList.add(M);
				}
				else{
					//NounList��String[]�ɒ�����List�Ɋi�[
					Morpheme[] TEMP = new Morpheme[TempList.size()];


					for(int i=0; i<TEMP.length; i++){
						TEMP[i] = TempList.get(i);
					}
					MAList.add(TEMP);

					//�ꎞ�i�[List�̏�����
					TempList.clear();
				}
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

	/**
	 * �ΏۂƂȂ�i����I�сA�W�v���ĕԂ�(���`)
	 * @param �i����
	 * @return CSV�p�W�v�\<br>CountList
	 */
	public ArrayList<String> CountWord_BaseForm(String PartofSpeech){

		ArrayList<String> TempList = new ArrayList<String>();

		for(int i=0; i<MAList.size(); i++){
			Morpheme[] MAArray = MAList.get(i);

			for(int j=0; j<MAArray.length; j++){

				String Word = MAArray[j].BASE_FORM;
				String Kind = MAArray[j].PART_OF_SPEECH;

				if(Kind.equals(PartofSpeech)){
					TempList.add(Word);
				}
			}
		}
		WordCount WC = new WordCount(TempList);
		WC.Desc();

		return WC.getWordCount();
	}

	/**
	 * �ΏۂƂȂ�i����I�сA�W�v���ĕԂ�(�\�w�`)
	 * @param �i����
	 * @return CSV�p�W�v�\<br>CountList
	 */
	public ArrayList<String> CountWord_SurfaceForm(String PartofSpeech){

		ArrayList<String> TempList = new ArrayList<String>();

		for(int i=0; i<MAList.size(); i++){
			Morpheme[] MAArray = MAList.get(i);

			for(int j=0; j<MAArray.length; j++){

				String Word = MAArray[j].SURFACE_FORM;
				String Kind = MAArray[j].PART_OF_SPEECH;

				if(Kind.equals(PartofSpeech)){
					TempList.add(Word);
				}
			}
		}
		WordCount WC = new WordCount(TempList);
		WC.Desc();

		return WC.getWordCount();
	}



	/**
	 * �ΏۂƂȂ�i����I�сA�i�����A���������̂͌������A�W�v���Ĕz��ŕԂ�
	 * @param �i����
	 * @return �e�P��Əo���p�x�̔z��<br>ReturnList
	 */
	public ArrayList<String> CountUnitWord(String PartofSpeech){

		ArrayList<String> TempList = new ArrayList<String>();

		for(int i=0; i<MAList.size(); i++){
			Morpheme[] MAArray = MAList.get(i);
			ArrayList<String> UnitStringList = new ArrayList<String>();

			for(int j=0; j<MAArray.length; j++){

				String Word = MAArray[j].SURFACE_FORM;
				String Kind = MAArray[j].PART_OF_SPEECH;

				if(Kind.equals(PartofSpeech)){
					UnitStringList.add(Word);
				}
				else{
					if(!UnitStringList.isEmpty()){
						String UnitString = "";
						for(int k=0; k<UnitStringList.size(); k++){
							UnitString += UnitStringList.get(k);
						}
						TempList.add(UnitString);
						UnitStringList.clear();
					}
				}

				if(j==MAArray.length-1){
					String UnitString = "";
					for(int k=0; k<UnitStringList.size(); k++){
						UnitString += UnitStringList.get(k);
					}
					TempList.add(UnitString);
					UnitStringList.clear();
				}
			}
		}
		WordCount WC = new WordCount(TempList);
		WC.Desc();

		return WC.getWordCount();
	}

	/**
	 * get
	 */
	public ArrayList<Morpheme[]> getMAList(){
		return MAList;
	}





}
