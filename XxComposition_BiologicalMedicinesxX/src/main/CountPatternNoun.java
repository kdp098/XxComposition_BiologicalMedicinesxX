package main;

import java.util.ArrayList;

import textmanipulation.InOutFile;
import textmanipulation.MorphologicalAnalysis.MorphologicalAnalysis;

public class CountPatternNoun {


	//�L�q�p�^�[�����i�[����Ă���t�@�C����
	static String PatternFileName01 = "UniquePatternList01.txt";
	static String PatternFileName02 = "UniquePatternList02.txt";
	//�W�v���ʂ��o�͂���t�@�C����
	static String OutputFileName01 = "CountPatternNounList01.csv";
	static String OutputFileName01_2 = "NounList01.txt";
	static String OutputFileName02 = "CountPatternNounList02.csv";
	static String OutputFileName02_2 = "NounList02.txt";
	//�t�@�C���p�X
	static String Path = "List/";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u

		MorphologicalAnalysis MA01 = new MorphologicalAnalysis(Path + PatternFileName01);
		ArrayList<String> Output01 = MA01.CountWord_SurfaceForm("����");
		InOutFile.OutputText(OutputFileName01, Path, Output01);
		ArrayList<String> Output01_2 = new ArrayList<String>();
		for(int i=0; i<Output01.size(); i++){
			Output01_2.add(Output01.get(i).split(",")[0]);
		}
		InOutFile.OutputText(OutputFileName01_2, Path, Output01_2);


		MorphologicalAnalysis MA02 = new MorphologicalAnalysis(Path + PatternFileName02);
		ArrayList<String> Output02 = MA02.CountWord_SurfaceForm("����");
		InOutFile.OutputText(OutputFileName02, Path, Output02);
		ArrayList<String> Output02_2 = new ArrayList<String>();
		for(int i=0; i<Output02.size(); i++){
			Output02_2.add(Output02.get(i).split(",")[0]);
		}
		InOutFile.OutputText(OutputFileName02_2, Path, Output02_2);

	}

}
