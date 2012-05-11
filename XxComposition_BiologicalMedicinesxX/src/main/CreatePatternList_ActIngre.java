package main;

import java.util.ArrayList;

import textmanipulation.CreateLabel_ActIngre;
import textmanipulation.InOutFile;

public class CreatePatternList_ActIngre {



	//�g���e�L�X�g�������Ă���t�@�C����
	static String TextFileName = "HOT9YJ_CompotisionTextList.txt";
	//�o�͗p�t�@�C����
	static String OutputFileName = "PatternList.txt";
	//�p�X
	static String Path = "List/";


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u

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
