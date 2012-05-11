package main;

import java.util.ArrayList;
import textmanipulation.InOutFile;
import textmanipulation.TermDocumentMatrix;

public class CreateTermDocument {


	//���̓p�^�[���t�@�C����
	static String PatternListFileName01 = "UniquePatternList01.txt";
	static String PatternListFileName02 = "UniquePatternList02.txt";
	//�P��List�t�@�C����
	static String WordListFileName01 = "NounList01.txt";
	static String WordListFileName02 = "NounList02.txt";
	//�t�H���_Path
	static String PatternFilePath = "List/";

	//�P�ꕶ���s��̃t�@�C����
	static String TDMFileName01 = "TermDocumentMatrix01.csv";
	static String TDMFileName02 = "TermDocumentMatrix02.csv";
	//�t�H���_Path
	static String TDMPath = "TDM/";


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u

		TermDocumentMatrix TDM01 = new TermDocumentMatrix(PatternFilePath + WordListFileName01, PatternFilePath + PatternListFileName01);
		TDM01.CreateMorphemeList();
		TDM01.CreateTermDocumentMatrixAppearance();

		ArrayList<String> Output01 = TDM01.OutputTermDocumentMatrix();
		InOutFile.OutputText(TDMFileName01, TDMPath, Output01);

		TermDocumentMatrix TDM02 = new TermDocumentMatrix(PatternFilePath + WordListFileName02, PatternFilePath + PatternListFileName02);
		TDM02.CreateMorphemeList();
		TDM02.CreateTermDocumentMatrixAppearance();

		ArrayList<String> Output02 = TDM02.OutputTermDocumentMatrix();
		InOutFile.OutputText(TDMFileName02, TDMPath, Output02);
	}

}
