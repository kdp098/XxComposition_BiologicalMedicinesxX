package main;

import java.util.ArrayList;

import textmanipulation.CreateLabel_ActIngre;
import textmanipulation.InOutFile;

public class CreatePatternList_ActIngre {



	//組成テキストが入っているファイル名
	static String TextFileName = "HOT9YJ_CompotisionTextList.txt";
	//出力用ファイル名
	static String OutputFileName = "PatternList.txt";
	//パス
	static String Path = "List/";


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		ArrayList<String[]> Lists = InOutFile.InputTextFilePlusSplit(Path + TextFileName, ",");
		ArrayList<String> YJList = new ArrayList<String>();
		ArrayList<String> TextList = new ArrayList<String>();
		for(int i=0; i<Lists.size(); i++){
			String[] Temp = Lists.get(i);
			YJList.add(Temp[1]);

			String temp = Temp[2];
			for(int j=3; j<Temp.length; j++){
				temp = temp + "," + Temp[j];
			}
			TextList.add(temp);
		}
		Lists = null;
		CreateLabel_ActIngre CL_A = new CreateLabel_ActIngre(TextList, YJList);
		CL_A.CreatePatternActiveIngreandUnit();
		ArrayList<String> OutPut = CL_A.getReplaceAfterTextArray();

		InOutFile.OutputText(OutputFileName, Path, OutPut);


	}

}
