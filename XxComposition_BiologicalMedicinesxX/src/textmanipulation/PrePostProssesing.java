package textmanipulation;

import java.util.ArrayList;

import textmanipulation.miniprosessing.LabelReplacement;


/**
 * �O������㏈���p�̃N���X
 * @author Okuya
 */
public class PrePostProssesing {


	/**
	 * ���͒��̃��x��<.+>���L���ɕϊ����鏈��
	 * @param �ΏۂƂȂ镶�͔z��
	 * @return �ϊ��ςݕ��͔z��
	 */
	public static ArrayList<String> ReplaceLabeltoSymbol(ArrayList<String> TargetTextList){

		for(int i=0; i<TargetTextList.size(); i++){
			TargetTextList.set(i, LabelReplacement.ReplaceLabeltoSymbol(TargetTextList.get(i)));
		}

		return TargetTextList;
	}





	/**
	 * * ���͒��̋L�������x��<.+>�ɕϊ����鏈��
	 * @param �ΏۂƂȂ镶�͔z��
	 * @return �ϊ��ςݕ��͔z��
	 */
	public static ArrayList<String> ReplaceSymboltoLabel(ArrayList<String> TargetTextList){

		for(int i=0; i<TargetTextList.size(); i++){
			TargetTextList.set(i, LabelReplacement.ReplaceSymboltoLabel(TargetTextList.get(i)));
		}

		return TargetTextList;
	}
}
