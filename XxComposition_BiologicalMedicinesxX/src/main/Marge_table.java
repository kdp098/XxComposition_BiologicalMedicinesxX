package main;

import java.util.ArrayList;

import textmanipulation.InOutFile;

public class Marge_table {


	static String InputFileName01_1 = "Result_ClusterNumber01.csv";
	static String InputFileName01_2 = "cluster_data01.csv";
	static String InputFileName01_3 = "CountPattern01.csv";
	static String OutputFileName01 = "Result01.csv";
	static String InputFileName02_1 = "Result_ClusterNumber02.csv";
	static String InputFileName02_2 = "cluster_data02.csv";
	static String InputFileName02_3 = "CountPattern02.csv";
	static String OutputFileName02 = "Result02.csv";

	//フォルダPath
	static String FilePath = "Marge/";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		ArrayList<String> AAA = InOutFile.InputTextFile(FilePath +InputFileName01_1);
		ArrayList<String> BBB = InOutFile.InputTextFile(FilePath +InputFileName01_2);
		ArrayList<String> EEE = InOutFile.InputTextFile(FilePath +InputFileName01_3);

		ArrayList<String> OUT01 = new ArrayList<String>();


		for(int i=0; i<BBB.size(); i++){
			if(i==0){
				OUT01.add(AAA.get(i) + "," + BBB.get(i));
			}
			else{
				String[] TempB = BBB.get(i).split(",", -1);

				for(int j=1; j<AAA.size(); j++){
					String[] TempA = AAA.get(j).split(",", -1);
					if(TempA[1].equals(TempB[1])){
						OUT01.add(AAA.get(j) + "," + BBB.get(i));
					}

				}
			}
		}

		for(int i=0; i<OUT01.size(); i++){
			String[] Temp = OUT01.get(i).replaceAll("\"", "").split(",", -1);

			if(i==0){
				Temp[3] = "Count";
			}
			else{
				for(int j=0; j<EEE.size(); j++){
					String temp = EEE.get(j).split(",", -1)[0];
					String count = EEE.get(j).split(",", -1)[1];

					if(Temp[0].equals(temp)){
						Temp[3] = count;
					}
				}
			}

			String data = Temp[0];
			for(int j=1; j<Temp.length; j++){
				data = data + "," + Temp[j];
			}

			OUT01.set(i, data);

		}

		InOutFile.OutputText(OutputFileName01, FilePath, OUT01);


		ArrayList<String> CCC = InOutFile.InputTextFile(FilePath +InputFileName02_1);
		ArrayList<String> DDD = InOutFile.InputTextFile(FilePath +InputFileName02_2);
		ArrayList<String> FFF = InOutFile.InputTextFile(FilePath +InputFileName02_3);


		ArrayList<String> OUT02 = new ArrayList<String>();


		for(int i=0; i<DDD.size(); i++){
			if(i==0){
				OUT02.add(CCC.get(i) + "," + DDD.get(i));
			}
			else{
				String[] TempB = DDD.get(i).split(",", -1);

				for(int j=1; j<CCC.size(); j++){
					String[] TempA = CCC.get(j).split(",", -1);
					if(TempA[1].equals(TempB[1])){
						OUT02.add(CCC.get(j) + "," + DDD.get(i));
					}

				}
			}
		}

		for(int i=0; i<OUT02.size(); i++){
			String[] Temp = OUT02.get(i).replaceAll("\"", "").split(",", -1);

			if(i==0){
				Temp[3] = "Count";
			}
			else{
				for(int j=0; j<FFF.size(); j++){
					String temp = FFF.get(j).split(",", -1)[0];
					String count = FFF.get(j).split(",", -1)[1];

					if(Temp[0].equals(temp)){
						Temp[3] = count;
					}
				}
			}

			String data = Temp[0];
			for(int j=1; j<Temp.length; j++){
				data = data + "," + Temp[j];
			}

			OUT02.set(i, data);
		}


		InOutFile.OutputText(OutputFileName02, FilePath, OUT02);
	}

}
