package textmanipulation;

import java.util.ArrayList;
import textmanipulation.MorphologicalAnalysis.Morpheme;
import textmanipulation.MorphologicalAnalysis.MorphologicalAnalysis;
import textmanipulation.miniprosessing.StringConv;

/**
 * �P�ꕶ���s�񐶐��N���X
 * @author Okuya
 */
public class TermDocumentMatrix{


	//�P�ꕶ���s��Ɏg�p������LIST
	ArrayList<String> WordList = null;
	//�����p�^�[��LIST
	ArrayList<String> PatternList = null;
	//�`�ԑf��͂̑ΏۂƂȂ镶���p�^�[�����������t�@�C���̖��O
	String PatternFileName = null;
	//�����p�^�[���ɑ΂��Č`�ԑf��͂��s�������ʂ��i�[����LIST
	ArrayList<Morpheme[]> MorphemeList = new ArrayList<Morpheme[]>();
	//�P�ꕶ�͍s��
	ArrayList<ArrayList<Integer>> TDM = new ArrayList<ArrayList<Integer>>();

	/**
	 * �Ώۃt�@�C�������僊�X�g�ƕ����p�^�[�����X�g���i�[����R���X�g���N�^
	 * @param WordListFileName ��僊�X�g���i�[����Ă���t�@�C����
	 * @param PatternListFileName �����p�^�[�����X�g���i�[����Ă���t�@�C����
	 */
	public TermDocumentMatrix(String WordListFileName, String PatternListFileName){
		this.WordList = InOutFile.InputTextFile(WordListFileName);
		System.out.println("�t�@�C������P�ꃊ�X�g�𐶐����܂���");
		this.PatternFileName = PatternListFileName;
		this.PatternList = InOutFile.InputTextFile(PatternListFileName);
		System.out.println("�t�@�C�����當���p�^�[�����X�g�𐶐����܂���");
	}



	/**
	 * �����p�^�[�����X�g�ɑ΂��Č`�ԑf��͂��s�����ʂ��i�[
	 */
	public void CreateMorphemeList(){
		MorphologicalAnalysis MA = new MorphologicalAnalysis(PatternFileName);
		MorphemeList = MA.getMAList();
	}


	/**
	 * ��僊�X�g���當�͂̒P��x�N�g���𐶐�(�p�x�J�E���g)
	 * @param �Ώە���
	 * @return �P��o���s��<br>
	 * CountList
	 */
	public ArrayList<Integer> WordAppearanceCount(Morpheme[] MorphemeList){

		//�P��o���s�񐶐�
		ArrayList<Integer> CountList = new ArrayList<Integer>();


		for(int i=0; i<WordList.size(); i++){
			//�Ώی����擾
			String Word = WordList.get(i);
			//���K�\���Ɉ���������Ȃ��悤�A�S�p�����ɕϊ�
			Word = StringConv.eisukigoHanToZen(Word);

			//�o���p�x���J�E���g
			int counter = 0;
			for(int j=0; j<MorphemeList.length; j++){
				String Noun = StringConv.eisukigoHanToZen(MorphemeList[j].SURFACE_FORM);

				if(Noun.equals(Word)){
					counter++;
				}
			}
			CountList.add(counter);
		}



		return CountList;
	}

	/**
	 * �P�ꕶ���s��쐬
	 */
	public void CreateTermDocumentMatrixCount(){

		//��Ɍ`�ԑf��͂��s���Ă��Ȃ��ꍇ�A�G���[���b�Z�[�W�Ƃ��ĕ\��
		if(MorphemeList.isEmpty()){
			System.out.println(	"�`�ԑf��͂��ɍs���Ă��������B\n" +
								"Method:CreateMorphemeList");
			}
		else{
			//�e�p�^�[���̒P��x�N�g�����쐬
			for(int i=0; i<MorphemeList.size(); i++){
				TDM.add(WordAppearanceCount(MorphemeList.get(i)));
				if(i%1000==0){
					System.out.println("�P��x�N�g���쐬����:"+ i);
				}
			}
			System.out.println("�P�ꕶ���s��𐶐����܂���");
		}
	}


	/**
	 * ��僊�X�g���當�͂̒P��x�N�g���𐶐�(�o���̗L��)
	 * @param �Ώە���
	 * @return �P��o���s��<br>
	 * CountList
	 */
	public ArrayList<Integer> WordAppearance(Morpheme[] MorphemeList){

		//�P��o���s�񐶐�
		ArrayList<Integer> CountList = new ArrayList<Integer>();


		for(int i=0; i<WordList.size(); i++){
			//�Ώی����擾
			String Word = WordList.get(i);
			//���K�\���Ɉ���������Ȃ��悤�A�S�p�����ɕϊ�
			Word = StringConv.eisukigoHanToZen(Word);

			//�o���p�x���J�E���g
			int counter = 0;
			for(int j=0; j<MorphemeList.length; j++){
				String Noun = StringConv.eisukigoHanToZen(MorphemeList[j].SURFACE_FORM);

				if(Noun.equals(Word)){
					counter = 1;
				}
			}
			CountList.add(counter);
		}



		return CountList;
	}

	/**
	 * �P�ꕶ���s��쐬(�o���̗L��)
	 */
	public void CreateTermDocumentMatrixAppearance(){

		//��Ɍ`�ԑf��͂��s���Ă��Ȃ��ꍇ�A�G���[���b�Z�[�W�Ƃ��ĕ\��
		if(MorphemeList.isEmpty()){
			System.out.println(	"�`�ԑf��͂��ɍs���Ă��������B\n" +
								"Method:CreateMorphemeList");
			}
		else{
			//�e�p�^�[���̒P��x�N�g�����쐬
			for(int i=0; i<MorphemeList.size(); i++){
				TDM.add(WordAppearance(MorphemeList.get(i)));
				if(i%1000==0){
					System.out.println("�P��x�N�g���쐬����:"+ i);
				}
			}
			System.out.println("�P�ꕶ���s��𐶐����܂���");
		}
	}








	/**
	 * ����̃��[�h���������p�^�[�����Ɏw�肵���o���񐔂����o�������炻�̕����p�^�[�����폜
	 * @param �ΏۂƂȂ��� DWord
	 * @param �o���� Count
	 */
	public void DeleteWord(String DWord, int Count){

		//���[�h�̏o���ʒu
		int Index = WordList.indexOf(DWord);

		for(int i=0; i<TDM.size(); i++){
			ArrayList<Integer> TDMLine = TDM.get(0);
			String Pattern = PatternList.get(0);
			TDM.remove(0);
			PatternList.remove(0);

			//�o���񐔔���(�قȂ�������ɒǉ�)
			if(TDMLine.get(Index) != Count){
				TDM.add(TDMLine);
				PatternList.add(Pattern);
			}
		}
	}

	/**
	 * ����̃��[�h���������p�^�[�����Ɏw�肵���o���񐔈ȏ�o�������炻�̕����p�^�[�����폜
	 * @param �ΏۂƂȂ��� DWord
	 * @param �o���� Count
	 */
	public void DeleteWordCountOver(String DWord, int Count){

		//���[�h�̏o���ʒu
		int Index = WordList.indexOf(DWord);

		for(int i=0; i<TDM.size(); i++){
			ArrayList<Integer> TDMLine = TDM.get(0);
			String Pattern = PatternList.get(0);
			TDM.remove(0);
			PatternList.remove(0);

			//�o���񐔔���(Count��菬������������ɒǉ�)
			if(TDMLine.get(Index) < Count){
				TDM.add(TDMLine);
				PatternList.add(Pattern);
			}
		}
	}
	/**
	 * ����̃��[�h���������p�^�[�����Ɏw�肵���o���񐔈ȉ��o�������炻�̕����p�^�[�����폜
	 * @param �ΏۂƂȂ��� DWord
	 * @param �o���� Count
	 */
	public void DeleteWordCountUnder(String DWord, int Count){

		//���[�h�̏o���ʒu
		int Index = WordList.indexOf(DWord);

		for(int i=0; i<TDM.size(); i++){
			ArrayList<Integer> TDMLine = TDM.get(0);
			String Pattern = PatternList.get(0);
			TDM.remove(0);
			PatternList.remove(0);

			//�o���񐔔���(Count���傫����������ɒǉ�)
			if(TDMLine.get(Index) > Count){
				TDM.add(TDMLine);
				PatternList.add(Pattern);
			}
		}
	}





	/**
	 * �P�ꕶ���s����^�C�g���������\�ɂ���CSV�`���ɒ�������ŏo��
	 */
	public ArrayList<String> OutputTermDocumentMatrix(){

		ArrayList<String> ReturnList = new ArrayList<String>();

		System.out.println("�P�ꕶ���s��쐬�J�n");

		//�w�b�_�[�̏�������
		String Header = "";
		for(int i=0; i<WordList.size(); i++){
			Header += "," + WordList.get(i);
		}
		ReturnList.add(Header);

		//�����s��̏�������
		for(int i=0; i<TDM.size(); i++){
			//�p�^�[��
			String temp = PatternList.get(i);
			for(int j=0; j<TDM.get(i).size(); j++){
				temp += "," + TDM.get(i).get(j);
			}

			ReturnList.add(temp);
			if(i%1000==0){
				System.out.println("�������݊���:" + i);
			}
		}

		return ReturnList;
	}






	/**
	 * �������̑傫�����ɕ��ёւ���
	 * @param �Ώە����z��
	 * @return ���ёւ��ςݕ����z��
	 */
	public String[] LengthSort(String[] TargetArray){

		int size = TargetArray.length;
		//�o�u���\�[�g
		for(int i=0; i<size-1; i++){
			for(int j=size-1; j>0; j--){

				int Length01 = TargetArray[j].length();
				int Length02 = TargetArray[j].length();

				if(Length01<Length02){
					String Temp = TargetArray[j-1];
					TargetArray[j-1] = TargetArray[j];
					TargetArray[j] = Temp;;
				}
			}
		}
		return TargetArray;
	}




}
