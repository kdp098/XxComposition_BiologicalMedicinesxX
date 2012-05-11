package main;

import java.util.ArrayList;

import textmanipulation.InOutFile;

public class DeleteTDM {


	//TDMファイル
	static String TDMFileName = "TermDocumentMatrix.csv";
	static String TDMFileName2 = "TermDocumentMatrix_Count.csv";

	//出力
	static String OutputFileName = "Tanmi_TermDocumentMatrix.csv";
	static String OutputFileName2 = "Haigo_TermDocumentMatrix.csv";
	static String OutputFileName3 = "Delete_TermDocumentMatrix.csv";

	//フォルダPath
	static String TDMPath = "TDM/";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		ArrayList<String> TDM = InOutFile.InputTextFile(TDMPath + TDMFileName);
		ArrayList<String> TDM2 = InOutFile.InputTextFile(TDMPath + TDMFileName2);
		for(int i=TDM2.size()-1; i>0; i--){
			String[] Value = TDM2.get(i).split(",", -1);
			if(Value[1].equals("0") && Value[2].equals("0") || Value[27].equals("1")){
				TDM.remove(i);
				TDM2.remove(i);
			}
		}

		InOutFile.OutputText(OutputFileName3, TDMPath, TDM);

		ArrayList<String> TDM3 = new ArrayList<String>();
		ArrayList<String> TDM4 = new ArrayList<String>();


		for(int i=TDM2.size()-1; i>0; i--){
			String temp = TDM.get(i);
			String[] Value = TDM2.get(i).split(",", -1);
			if(!(Value[2].equals("1")) && !(Value[2].equals("0"))){
				TDM.remove(i);
				TDM3.add(temp);
			}
		}

		InOutFile.OutputText(OutputFileName, TDMPath, TDM);

		TDM4.add(TDM.get(0));

		for(int i=TDM3.size()-1; i>0; i--){
			TDM4.add(TDM3.get(i));
		}

		InOutFile.OutputText(OutputFileName2, TDMPath, TDM4);




	}

}
