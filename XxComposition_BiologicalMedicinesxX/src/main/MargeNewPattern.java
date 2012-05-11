package main;

import java.util.ArrayList;

import textmanipulation.InOutFile;


/**
 * �N���X�^�����O���ʂ�V���ȃp�^�[���ƃ}�[�W����N���X
 * @author Okuya
 *
 */
public class MargeNewPattern {

	//�N���X�^�����O���ʂ��������t�@�C��
	static String Tanmi_ClusteringFileName = "Tanmi_Result.csv";
	static String Haigo_ClusteringFileName = "Haigo_Result.csv";
	//���̃p�^�[�����X�g
	static String OldPatternListFileName = "PatternList.txt";
	static ArrayList<String[]> OldPatternList = null;
	//�V�����p�^�[�����X�g
	static String NewPatternListFileName = "NewPatternList.txt";
	static ArrayList<String[]> NewPatternList = null;

	//�o�͗p�t�@�C��
	static String Output01 = "New_Tanmi_Reslut.csv";
	static String Output02 = "New_Haigo_Reslut.csv";
	//Path
	static String Path = "Marge/";





	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u


		//����
		ArrayList<String[]> TanmiList = InOutFile.InputTextFilePlusSplit(Path + Tanmi_ClusteringFileName, ",");
		ArrayList<String[]> HaigoList = InOutFile.InputTextFilePlusSplit(Path + Haigo_ClusteringFileName, ",");
		OldPatternList = InOutFile.InputTextFilePlusSplit(Path + OldPatternListFileName, "\t");
		NewPatternList = InOutFile.InputTextFilePlusSplit(Path + NewPatternListFileName, "\t");


		//�P���̕�
		ArrayList<String> output01 = UnitCSV(TanmiList);
		InOutFile.OutputText(Output01, Path, output01);

		//�z���̕�
		ArrayList<String> output02 = UnitCSV(HaigoList);
		InOutFile.OutputText(Output02, Path, output02);



	}

	//�����p���\�b�h
	static ArrayList<String> UnitCSV(ArrayList<String[]> ClusterList){

		//�o�͗p
		ArrayList<String> ReturnList = new ArrayList<String>();




		for(int i=0; i<ClusterList.size(); i++){

			//�d���������p
			ArrayList<String> AvoidList = new ArrayList<String>();

			String[] Cluster = ClusterList.get(i);

			if(i==0){
				String Temp = Cluster[0];
				for(int j=1; j<Cluster.length; j++){

					Temp = Temp + "," + Cluster[j];
				}

				ReturnList.add(Temp);
			}
			else{

				String Pattern = Cluster[0];

				for(int j=0; j<OldPatternList.size(); j++){

					String[] Patterns = OldPatternList.get(j);

					if(Patterns[1].equals(Pattern) && !AvoidList.contains(Pattern)){

						AvoidList.add(Pattern);
						String PartofPattern01 = Pattern.substring(0, 5);
						String YJ = Patterns[0];

						for(int k=0; k<NewPatternList.size(); k++){

							String[] Patternss = NewPatternList.get(k);

							if(Patternss[0].equals(YJ) && Patternss[1].indexOf(PartofPattern01) == 0){

								String Temp = Patternss[1];
								for(int l=0; l<Cluster.length; l++){
									Temp = Temp + "," + Cluster[l];
								}

								ReturnList.add(Temp);
								break;
							}
						}
					}
				}
			}

			if(i!=0 && AvoidList.isEmpty()){
				String Temp = "";
				for(int j=0; j<Cluster.length; j++){

					Temp = Temp + "," + Cluster[j];
				}

				ReturnList.add(Temp);
			}
		}

		return ReturnList;
	}

}
