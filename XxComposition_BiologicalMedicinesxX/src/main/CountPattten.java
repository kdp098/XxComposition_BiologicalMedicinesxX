package main;

import java.util.ArrayList;

import textmanipulation.InOutFile;
import textmanipulation.WordCount;

public class CountPattten {

	//�p�^�[�����X�g
	static String PatternListFileName = "PatternList.txt";

	//�o�̓t�@�C����
	static String OutputFileName01 = "CountPattern01.csv";
	static String OutputFileName01_2 = "UniquePatternList01.txt";
	static String OutputFileName02 = "CountPattern02.csv";
	static String OutputFileName02_2 = "UniquePatternList02.txt";
	static String OutputFileName03 = "YJCount.csv";
	//�p�X
	static String Path = "List/";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		ArrayList<String> PatternList = InOutFile.InputTextFile(Path + PatternListFileName);
		ArrayList<String> PatternList01 = new ArrayList<String>();
		ArrayList<String> PatternList02 = new ArrayList<String>();
		ArrayList<String> YJCount = new ArrayList<String>();

		//�����w�I����(���t����)�A����A������A���ː����i��02�ցA����ȊO��01��
		for(int i=0; i<PatternList.size(); i++){
			String Text = PatternList.get(i).split("\t", -1)[1];
			String PartofYJ = PatternList.get(i).split("\t", -1)[0].substring(0, 2);
			if(PartofYJ.equals("43") || PartofYJ.equals("51") || PartofYJ.equals("52") || PartofYJ.equals("59") || PartofYJ.equals("63")){
				PatternList02.add(Text);
			}
			else{
				PatternList01.add(Text);
			}
			YJCount.add(PatternList.get(i).split("\t", -1)[0].substring(0, 3));
		}
		WordCount WC = new WordCount(PatternList01);
		WC.Desc();
		ArrayList<String> Output01 = WC.getWordCount();
		InOutFile.OutputText(OutputFileName01, Path, Output01);
		ArrayList<String> Output01_2 = new ArrayList<String>();
		for(int i=0; i<Output01.size(); i++){
			Output01_2.add(Output01.get(i).split(",")[0]);
		}
		InOutFile.OutputText(OutputFileName01_2, Path, Output01_2);

		WordCount WC02 = new WordCount(PatternList02);
		WC02.Desc();
		ArrayList<String> Output02 = WC02.getWordCount();
		InOutFile.OutputText(OutputFileName02, Path, Output02);
		ArrayList<String> Output02_2 = new ArrayList<String>();
		for(int i=0; i<Output02.size(); i++){
			Output02_2.add(Output02.get(i).split(",")[0]);
		}
		InOutFile.OutputText(OutputFileName02_2, Path, Output02_2);

		WordCount WC03 = new WordCount(YJCount);
		WC03.Desc();
		ArrayList<String> Output03 = WC03.getWordCount();
		InOutFile.OutputText(OutputFileName03, Path, Output03);


	}

}
