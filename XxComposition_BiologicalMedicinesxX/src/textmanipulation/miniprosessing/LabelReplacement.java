package textmanipulation.miniprosessing;



/**
 *�Y�t������̕����̒u������<br>
 *
 *@author Okuya
 */
public class LabelReplacement {


	//���x�������L���ϊ��e�[�u��
	static String[][] LabelSymbolTable = {	{"<BR>", 			"��"},
											{"<BrandName>",		"��"},
											{"<ActIngreName>",	"��"},
											{"<Number>",		"��"},
											{"<Unit>",			"��"}};


	/**
	 * ���͒��̃��x��<.+>���L���ɕϊ����鏈��
	 * @param �ΏۂƂȂ镶��
	 * @return �ϊ��ςݕ���<br>
	 */
	public static String ReplaceLabeltoSymbol(String TargetText){

		for(int i=0; i<LabelSymbolTable.length; i++){
			TargetText = TargetText.replaceAll(LabelSymbolTable[i][0], LabelSymbolTable[i][1]);
		}

		return TargetText;

	}
	/**
	 * ���͒��̋L�������x��<.+>�ɕϊ����鏈��
	 * @param �ΏۂƂȂ镶��
	 * @return �ϊ��ςݕ���<br>
	 * TargetText
	 */
	public static String ReplaceSymboltoLabel(String TargetText){

		for(int i=0; i<LabelSymbolTable.length; i++){
			TargetText = TargetText.replaceAll(LabelSymbolTable[i][1], LabelSymbolTable[i][0]);
		}

		return TargetText;

	}






}
