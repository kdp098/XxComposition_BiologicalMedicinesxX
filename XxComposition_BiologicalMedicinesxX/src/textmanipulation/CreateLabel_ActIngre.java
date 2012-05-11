package textmanipulation;

import java.util.ArrayList;
import textmanipulation.miniprosessing.StringConv;


/**
 *
 *
 * @author Okuya
 *
 */
public class CreateLabel_ActIngre {


	////////////////////////////////////////////////////
	//各添付文書項目に応じたラベル作成に用いるファイル名
	////////////////////////////////////////////////////

	//販売名リストファイル名
	private String BrandNameList01 = "BrandnameTextList.txt";
	private String BrandNameList02 = "手動_販売名.txt";
	//単位リストファイル名
	private String UnitList01 = "単位リスト（～中）.csv";
	private String UnitList02 = "単位リスト（残り）.csv";
	private String UnitList03 = "単位リスト（日本薬局方）.csv";
	private String UnitList04 = "単位.txt";
	//有効成分名リストファイル名
	private String ActiveIngredientNameList01 = "一般名（有効成分に関する理化学的知見）.csv";
	private String ActiveIngredientNameList02 = "成分名（括弧内○○として）.csv";
	private String ActiveIngredientNameList03 = "成分名（組成EED抽出・平仮名含まない）.csv";
	private String ActiveIngredientNameList04 = "手動_有効成分名.txt";
	private String ActiveIngredientNameList05 = "手動_有効成分名_血液製剤.txt";
	private String ActiveIngredientNameList06 = "血液製剤_医薬発.txt";
	//有効成分名対象外ファイル名
	private String NotActiveIngredientNameList01 = "有効成分名置換対象外.txt";
	//有効成分名略名リストファイル名
	private String ActiveIngredientShortNameList01 = "有効成分略名.txt";
	//有効成分名分子式リストファイル名
	private String ActiveIngredientFomulaNameList01 = "分子式.txt";
	//有効成分名別名リストファイル名
	private String ActiveIngredientOtherwiseNameList01 = "有効成分別名.txt";
	//有効成分詳細リストファイル名
	private String ActiveIngredientDetailList01 = "有効成分詳細.txt";
	//電解質組成リストファイル名
	private String ElectrolyteList01 = "電解質イオン.txt";
	//剤形リストファイル名
	private String FormList01 = "手動_剤形.txt";
	private String FormList02 = "Form1.csv";
	private String FormList03 = "Form2.csv";
	//剤形置換対象外リストファイル名
	private String NotFormList01 = "剤形_置換対象外.txt";
	//企業名リストファイル名
	private String CompanyNameList01 = "企業名.txt";
	//漢方薬名リストファイル名
//	private String KampoNameList01 = "KampoNameList.txt";
	private String KampoNameList01 = "ConfirmedKampoList.csv";
	//漢方薬名読み仮名リストファイル名
	private String KampoYomiNameList01 = "KampoYomiList.txt";
	//色リストファイル名
	private String ColorList01 = "色.txt";
	//においリストファイル名
	private String SmellList01 = "におい.txt";
	//味リストファイル名
	private String TasteList01 = "味.txt";
	//状態リストファイル名
	private String StateList01 = "製剤状態.txt";
	//医薬品特徴リストファイル名
	private String DrugCharacterList01 = "医薬品特徴.txt";
	//医薬品種類リストファイル名
	private String DrugKindList01 = "医薬品種類.txt";
	//部分情報リストファイル名
	private String PartsList01 = "医薬品部分.txt";
	private String PartsList02 = "セット部分.txt";
	//生物原料リストファイル名
	private String CreatureList01 = "生物名.txt";
	//生物以外原料リストファイル名
	private String NotCreatureList01 = "生物以外原料.txt";
	//原料部位リストファイル名
	private String MaterialPartsList01 = "原料部分.txt";
	//原料別名リストファイル名
	private String MaterialOtherwiseNameList01 = "原料別名.txt";
	//原料成分リストファイル名
	private String MaterialIngredientList01 = "原料成分.txt";
	//容器名リストファイル名
	private String CaseNameList01 = "容器名.txt";
	//機器名リストファイル名
	private String DeviceNameList01 = "機器名.txt";
	//製造方法リストファイル名
	private String ManufactureMethodList01 = "製造方法.txt";
	//製造工程材料リストファイル名
	private String ManufacutureMaterialList01 = "製造工程材料.txt";
	//採血国リストファイル名
	private String BloodingCountryList01 = "採血国.txt";
	//採血区分リストファイル名
	private String BloodMethodList01 = "採血区分.txt";
	//血液保存液種類リストファイル名
	private String BloodDrugKindList01 = "血液保存液種類.txt";
	//元素記号リストファイル名
	private String ElementSymbolList01 = "元素記号.txt";



	//フォルダパス
	private String FolderPath = "LabelList/";

	////////////////////////////////////////////////////
	/////////////			ここまで		////////////
	////////////////////////////////////////////////////

	//リスト格納用配列
	private ArrayList<String> FileNameBrandNameList = null;
	private ArrayList<String> BrandNameList = null;
	private ArrayList<String> UnitList = null;
	private ArrayList<String> ActiveIngredientNameList = null;
	private ArrayList<String> ActiveIngredientShortNameList = null;
	private ArrayList<String> ActiveIngredientFomulaNameList = null;
	private ArrayList<String> ActiveIngredientOtherwiseNameList = null;
	private ArrayList<String> ActiveIngredientDetailList = null;
	private ArrayList<String> ElectrolyteList = null;
	private ArrayList<String> ElementSymbolList = null;
	private ArrayList<String> FormList = null;
	private ArrayList<String> CompanyNameList = null;
	private ArrayList<String> KampoNameList = null;
	private ArrayList<String> KampoYomiNameList = null;
	private ArrayList<String> ColorList = null;
	private ArrayList<String> SmellList = null;
	private ArrayList<String> TasteList = null;
	private ArrayList<String> StateList = null;
	private ArrayList<String> DrugCharacterList = null;
	private ArrayList<String> DrugKindList = null;
	private ArrayList<String> PartsList = null;
	private ArrayList<String> CreatureList = null;
	private ArrayList<String> NotCreatureList = null;
	private ArrayList<String> MaterialPartList = null;
	private ArrayList<String> MaterialOtherwiseNameList = null;
	private ArrayList<String> MaterialIngredientList = null;
	private ArrayList<String> CaseNameList = null;
	private ArrayList<String> DeviceNameList = null;
	private ArrayList<String> ManufactureMethodList = null;
	private ArrayList<String> ManufacutureMaterialList = null;
	private ArrayList<String> BloodingCountryList = null;
	private ArrayList<String> BloodingMethodList = null;
	private ArrayList<String> BloodDrugKindList = null;


	//削除対象記号・文字一覧
	private String[] DeleteSymbolList = {	"「」",
											"（）",
											"？",
											"Ｌ？",
											"※",
											"＊",
											"Ｌ―",
											"Ｌー",
											"Ｌ‐",
											"○",
											"注２",
											"注３",
											"注）",
											"注<Number>",
											"注<Number>）"
										};

	private String[] DeletePhraseList = {	"日局",
											"日本薬局方",
											"薬局方",
											"局外生規",
											"局外規",
											"力価"
										};


	//置換対象テキスト配列
	private ArrayList<String> TargetTextArray = null;
	//置換対象テキストのYJList
	private ArrayList<String> TargetTextYJ = null;
	//置換後テキスト配列
	private ArrayList<String> ReplacementAfterTextArray = new ArrayList<String>();




	/**
	 * コンストラクタ実行時に置換用リスト作成
	 * @param TA 置換対象となるテキスト配列
	 */
	public CreateLabel_ActIngre(ArrayList<String> TA, ArrayList<String> TJ){

		this.TargetTextArray = TA;
		this.TargetTextYJ = TJ;

		//リスト作成
		ArrayList<String> Temp01 = new ArrayList<String>();
		ArrayList<String> Temp02 = new ArrayList<String>();

		//////////
		//販売名//
		//////////
		Temp02.addAll(InOutFile.InputTextFile(FolderPath + BrandNameList01));
		FileNameBrandNameList = new ArrayList<String>(Temp02);
		Temp01.addAll(InOutFile.InputTextFile(FolderPath + BrandNameList02));
		for(int i=0; i<Temp01.size(); i++){
			Temp01.set(i, StringConv.eisukigoHanToZen(Temp01.get(i)));
		}
		//空を除外
		while(Temp01.remove("")){

		}
		BrandNameList = new ArrayList<String>(LengthSort(Temp01));
		Temp01.clear();
		Temp02.clear();

		//空を除外
		while(BrandNameList.remove("")){

		}

		Temp01.clear();
		Temp02.clear();

		////////
		//単位//
		////////
		Temp01.addAll(InOutFile.InputTextFile(FolderPath + UnitList01));
		Temp01.addAll(InOutFile.InputTextFile(FolderPath + UnitList02));
		Temp01.addAll(InOutFile.InputTextFile(FolderPath + UnitList03));
		Temp01.addAll(InOutFile.InputTextFile(FolderPath + UnitList04));
		for(int i=0; i<Temp01.size(); i++){
			Temp01.set(i, StringConv.eisukigoHanToZen(Temp01.get(i)));
		}
		UnitList = new ArrayList<String>(LengthSort(Temp01));
		Temp01.clear();
		Temp02.clear();

		//////////////
		//有効成分名//
		//////////////
		Temp02.addAll(InOutFile.InputTextFile(FolderPath + ActiveIngredientNameList01));
		for(int i=0; i<Temp02.size(); i++){
			String temp = Temp02.get(i).split("\t", -1)[2];
			String temp2  = Temp02.get(i).split("\t", -1)[3];
			if(temp2.equals("JPN")){
				Temp01.add(temp);
			}
		}
		Temp02.clear();
		Temp02.addAll(InOutFile.InputTextFile(FolderPath + ActiveIngredientNameList02));
		for(int i=0; i<Temp02.size(); i++){
			String temp = Temp02.get(i).split("\t", -1)[2];
			Temp01.add(temp);
		}
		Temp02.clear();
		Temp02.addAll(InOutFile.InputTextFile(FolderPath + ActiveIngredientNameList03));
		for(int i=0; i<Temp02.size(); i++){
			String temp = Temp02.get(i).split("\t", -1)[2];
			Temp01.add(temp);
		}
		Temp02.clear();
		Temp01.addAll(InOutFile.InputTextFile(FolderPath + ActiveIngredientNameList04));
		Temp01.addAll(InOutFile.InputTextFile(FolderPath + ActiveIngredientNameList05));
		Temp01.addAll(InOutFile.InputTextFile(FolderPath + ActiveIngredientNameList06));
		//対象外削除
		Temp02.addAll(InOutFile.InputTextFile(FolderPath + NotActiveIngredientNameList01));
		for(int i=0; i<Temp02.size(); i++){
			while(Temp01.remove(Temp02.get(i)));
		}
		for(int i=0; i<Temp01.size(); i++){
			Temp01.set(i, StringConv.eisukigoHanToZen(Temp01.get(i)));
		}
		ActiveIngredientNameList = new ArrayList<String>(LengthSort(Temp01));
		Temp01.clear();
		Temp02.clear();

		////////////////
		//有効成分略名//
		////////////////
		Temp01.addAll(InOutFile.InputTextFile(FolderPath + ActiveIngredientShortNameList01));
		for(int i=0; i<Temp01.size(); i++){
			Temp01.set(i, StringConv.eisukigoHanToZen(Temp01.get(i)));
		}
		ActiveIngredientShortNameList = new ArrayList<String>(LengthSort(Temp01));
		Temp01.clear();
		Temp02.clear();

		//////////
		//分子式//
		//////////
		Temp01.addAll(InOutFile.InputTextFile(FolderPath + ActiveIngredientFomulaNameList01));
		for(int i=0; i<Temp01.size(); i++){
			Temp01.set(i, StringConv.eisukigoHanToZen(Temp01.get(i)));
		}
		ActiveIngredientFomulaNameList = new ArrayList<String>(LengthSort(Temp01));
		Temp01.clear();
		Temp02.clear();

		////////////////
		//有効成分別名//
		////////////////
		Temp01.addAll(InOutFile.InputTextFile(FolderPath + ActiveIngredientOtherwiseNameList01));
		for(int i=0; i<Temp01.size(); i++){
			Temp01.set(i, StringConv.eisukigoHanToZen(Temp01.get(i)));
		}
		ActiveIngredientOtherwiseNameList = new ArrayList<String>(LengthSort(Temp01));
		Temp01.clear();
		Temp02.clear();

		////////////////
		//有効成分詳細//
		////////////////
		Temp01.addAll(InOutFile.InputTextFile(FolderPath + ActiveIngredientDetailList01));
		for(int i=0; i<Temp01.size(); i++){
			Temp01.set(i, StringConv.eisukigoHanToZen(Temp01.get(i)));
		}
		ActiveIngredientDetailList = new ArrayList<String>(LengthSort(Temp01));
		Temp01.clear();
		Temp02.clear();

		////////////////
		//電解質イオン//
		////////////////
		Temp01.addAll(InOutFile.InputTextFile(FolderPath + ElectrolyteList01));
		for(int i=0; i<Temp01.size(); i++){
			Temp01.set(i, StringConv.eisukigoHanToZen(Temp01.get(i)));
		}
		ElectrolyteList = new ArrayList<String>(LengthSort(Temp01));
		Temp01.clear();
		Temp02.clear();

		////////////
		//元素記号//
		////////////
		Temp01.addAll(InOutFile.InputTextFile(FolderPath + ElementSymbolList01));
		for(int i=0; i<Temp01.size(); i++){
			Temp01.set(i, StringConv.eisukigoHanToZen(Temp01.get(i)));
		}
		ElementSymbolList = new ArrayList<String>(LengthSort(Temp01));
		Temp01.clear();
		Temp02.clear();

		////////
		//剤形//
		////////
		Temp01.addAll(InOutFile.InputTextFile(FolderPath + FormList01));
		Temp01.addAll(InOutFile.InputTextFile(FolderPath + FormList02));
		Temp01.addAll(InOutFile.InputTextFile(FolderPath + FormList03));
		Temp02.addAll(InOutFile.InputTextFile(FolderPath + NotFormList01));
		for(int i=0; i<Temp02.size(); i++){
			while(Temp01.remove(Temp02.get(i)));
		}
		for(int i=0; i<Temp01.size(); i++){
			Temp01.set(i, StringConv.eisukigoHanToZen(Temp01.get(i)));
		}
		FormList = new ArrayList<String>(LengthSort(Temp01));
		Temp01.clear();
		Temp02.clear();

		//////////
		//企業名//
		//////////
		Temp01.addAll(InOutFile.InputTextFile(FolderPath + CompanyNameList01));
		for(int i=0; i<Temp01.size(); i++){
			Temp01.set(i, StringConv.eisukigoHanToZen(Temp01.get(i)));
		}
		CompanyNameList = new ArrayList<String>(LengthSort(Temp01));
		Temp01.clear();
		Temp02.clear();

		////////////
		//漢方薬名//
		////////////
		Temp01.addAll(InOutFile.InputTextFile(FolderPath + KampoNameList01));
		for(int i=0; i<Temp01.size(); i++){
			Temp01.set(i, StringConv.eisukigoHanToZen(Temp01.get(i)));
		}
		KampoNameList = new ArrayList<String>(LengthSort(Temp01));
		Temp01.clear();
		Temp02.clear();

		////////////////
		//漢方薬名読み//
		////////////////
		Temp01.addAll(InOutFile.InputTextFile(FolderPath + KampoYomiNameList01));
		for(int i=0; i<Temp01.size(); i++){
			Temp01.set(i, StringConv.eisukigoHanToZen(Temp01.get(i)));
		}
		KampoYomiNameList = new ArrayList<String>(LengthSort(Temp01));
		Temp01.clear();
		Temp02.clear();

		//////
		//色//
		//////
		Temp01.addAll(InOutFile.InputTextFile(FolderPath + ColorList01));
		for(int i=0; i<Temp01.size(); i++){
			Temp01.set(i, StringConv.eisukigoHanToZen(Temp01.get(i)));
		}
		ColorList = new ArrayList<String>(LengthSort(Temp01));
		Temp01.clear();
		Temp02.clear();

		//////////
		//におい//
		//////////
		Temp01.addAll(InOutFile.InputTextFile(FolderPath + SmellList01));
		for(int i=0; i<Temp01.size(); i++){
			Temp01.set(i, StringConv.eisukigoHanToZen(Temp01.get(i)));
		}
		SmellList = new ArrayList<String>(LengthSort(Temp01));
		Temp01.clear();
		Temp02.clear();

		//////
		//味//
		//////
		Temp01.addAll(InOutFile.InputTextFile(FolderPath + TasteList01));
		for(int i=0; i<Temp01.size(); i++){
			Temp01.set(i, StringConv.eisukigoHanToZen(Temp01.get(i)));
		}
		TasteList = new ArrayList<String>(LengthSort(Temp01));
		Temp01.clear();
		Temp02.clear();

//		////////
//		//状態//
//		////////
//		Temp01.addAll(InOutFile.InputTextFile(FolderPath + StateList01));
//		for(int i=0; i<Temp01.size(); i++){
//			Temp01.set(i, StringConv.eisukigoHanToZen(Temp01.get(i)));
//		}
//		StateList = new ArrayList<String>(LengthSort(Temp01));
//		Temp01.clear();
//		Temp02.clear();
//
//		//////////////
//		//医薬品特徴//
//		//////////////
//		Temp01.addAll(InOutFile.InputTextFile(FolderPath + DrugCharacterList01));
//		for(int i=0; i<Temp01.size(); i++){
//			Temp01.set(i, StringConv.eisukigoHanToZen(Temp01.get(i)));
//		}
//		DrugCharacterList = new ArrayList<String>(LengthSort(Temp01));
//		Temp01.clear();
//		Temp02.clear();
//
//		//////////////
//		//医薬品種類//
//		//////////////
//		Temp01.addAll(InOutFile.InputTextFile(FolderPath + DrugKindList01));
//		for(int i=0; i<Temp01.size(); i++){
//			Temp01.set(i, StringConv.eisukigoHanToZen(Temp01.get(i)));
//		}
//		DrugKindList = new ArrayList<String>(LengthSort(Temp01));
//		Temp01.clear();
//		Temp02.clear();

		////////////
		//部分情報//
		////////////
		Temp01.addAll(InOutFile.InputTextFile(FolderPath + PartsList01));
		for(int i=0; i<Temp01.size(); i++){
			Temp01.set(i, StringConv.eisukigoHanToZen(Temp01.get(i)));
		}
		PartsList = new ArrayList<String>(LengthSort(Temp01));
		Temp01.clear();
		Temp02.clear();

//		////////////
//		//生物原料//
//		////////////
//		Temp01.addAll(InOutFile.InputTextFile(FolderPath + CreatureList01));
//		for(int i=0; i<Temp01.size(); i++){
//			Temp01.set(i, StringConv.eisukigoHanToZen(Temp01.get(i)));
//		}
//		CreatureList = new ArrayList<String>(LengthSort(Temp01));
//		Temp01.clear();
//		Temp02.clear();
//
//		////////////////
//		//生物以外原料//
//		////////////////
//		Temp01.addAll(InOutFile.InputTextFile(FolderPath + NotCreatureList01));
//		for(int i=0; i<Temp01.size(); i++){
//			Temp01.set(i, StringConv.eisukigoHanToZen(Temp01.get(i)));
//		}
//		NotCreatureList = new ArrayList<String>(LengthSort(Temp01));
//		Temp01.clear();
//		Temp02.clear();
//
//		////////////
//		//原料部分//
//		////////////
//		Temp01.addAll(InOutFile.InputTextFile(FolderPath + MaterialPartsList01));
//		for(int i=0; i<Temp01.size(); i++){
//			Temp01.set(i, StringConv.eisukigoHanToZen(Temp01.get(i)));
//		}
//		MaterialPartList = new ArrayList<String>(LengthSort(Temp01));
//		Temp01.clear();
//		Temp02.clear();
//
//		////////////
//		//原料別名//
//		////////////
//		Temp01.addAll(InOutFile.InputTextFile(FolderPath + MaterialOtherwiseNameList01));
//		for(int i=0; i<Temp01.size(); i++){
//			Temp01.set(i, StringConv.eisukigoHanToZen(Temp01.get(i)));
//		}
//		MaterialOtherwiseNameList = new ArrayList<String>(LengthSort(Temp01));
//		Temp01.clear();
//		Temp02.clear();
//
//		////////////
//		//原料成分//
//		////////////
//		Temp01.addAll(InOutFile.InputTextFile(FolderPath + MaterialIngredientList01));
//		for(int i=0; i<Temp01.size(); i++){
//			Temp01.set(i, StringConv.eisukigoHanToZen(Temp01.get(i)));
//		}
//		MaterialIngredientList = new ArrayList<String>(LengthSort(Temp01));
//		Temp01.clear();
//		Temp02.clear();

		//////////
		//容器名//
		//////////
		Temp01.addAll(InOutFile.InputTextFile(FolderPath + CaseNameList01));
		for(int i=0; i<Temp01.size(); i++){
			Temp01.set(i, StringConv.eisukigoHanToZen(Temp01.get(i)));
		}
		CaseNameList = new ArrayList<String>(LengthSort(Temp01));
		Temp01.clear();
		Temp02.clear();

//		//////////
//		//機器名//
//		//////////
//		Temp01.addAll(InOutFile.InputTextFile(FolderPath + DeviceNameList01));
//		for(int i=0; i<Temp01.size(); i++){
//			Temp01.set(i, StringConv.eisukigoHanToZen(Temp01.get(i)));
//		}
//		DeviceNameList = new ArrayList<String>(LengthSort(Temp01));
//		Temp01.clear();
//		Temp02.clear();
//
//		////////////
//		//製造方法//
//		////////////
//		Temp01.addAll(InOutFile.InputTextFile(FolderPath + ManufactureMethodList01));
//		for(int i=0; i<Temp01.size(); i++){
//			Temp01.set(i, StringConv.eisukigoHanToZen(Temp01.get(i)));
//		}
//		ManufactureMethodList = new ArrayList<String>(LengthSort(Temp01));
//		Temp01.clear();
//		Temp02.clear();
//
//		////////////////
//		//製造工程材料//
//		////////////////
//		Temp01.addAll(InOutFile.InputTextFile(FolderPath + ManufacutureMaterialList01));
//		for(int i=0; i<Temp01.size(); i++){
//			Temp01.set(i, StringConv.eisukigoHanToZen(Temp01.get(i)));
//		}
//		ManufacutureMaterialList = new ArrayList<String>(LengthSort(Temp01));
//		Temp01.clear();
//		Temp02.clear();
//
//		//////////
//		//採血国//
//		//////////
//		Temp01.addAll(InOutFile.InputTextFile(FolderPath + BloodingCountryList01));
//		for(int i=0; i<Temp01.size(); i++){
//			Temp01.set(i, StringConv.eisukigoHanToZen(Temp01.get(i)));
//		}
//		BloodingCountryList = new ArrayList<String>(LengthSort(Temp01));
//		Temp01.clear();
//		Temp02.clear();
//
//		////////////
//		//採血区分//
//		////////////
//		Temp01.addAll(InOutFile.InputTextFile(FolderPath + BloodMethodList01));
//		for(int i=0; i<Temp01.size(); i++){
//			Temp01.set(i, StringConv.eisukigoHanToZen(Temp01.get(i)));
//		}
//		BloodingMethodList = new ArrayList<String>(LengthSort(Temp01));
//		Temp01.clear();
//		Temp02.clear();
//
//		//////////////////
//		//血液保存液種類//
//		//////////////////
//		Temp01.addAll(InOutFile.InputTextFile(FolderPath + BloodDrugKindList01));
//		for(int i=0; i<Temp01.size(); i++){
//			Temp01.set(i, StringConv.eisukigoHanToZen(Temp01.get(i)));
//		}
//		BloodDrugKindList = new ArrayList<String>(LengthSort(Temp01));
//		Temp01.clear();
//		Temp02.clear();

		//リスト作成ここまで
	}


	//////////////////////////////
	//以下パターン作成用メソッド//
	//////////////////////////////


	/**
	 *有効成分名と含量用パターン作成
	 *対象外(添加物とそれに準ずる語句)<br>
	 *添加物　添加剤　賦形剤　基剤　安定剤　等張化剤　性状　備考　緩衝剤　添付溶解液<br>
	 *溶剤(現在対象外リストから除外)　溶解液(現在対象外リストから除外)　専用希釈液　免疫補助剤　矯味剤　張化剤　専用溶解液　添付溶剤
	 *
	 */
	public void CreatePatternActiveIngreandUnit(){


		//対象外は除外
		String[] OutTargetList = {	"添加物",		"添加剤",		"賦形剤",		"基剤",			"安定剤",
									"等張化剤",		"緩衝剤",		"添付溶解液",
									"専用希釈液",	"免疫補助剤",	"矯味剤",
									"張化剤",		"専用溶解液",	"添付溶剤"
		};

		//対象語が出た部分より後ろの部分文字列を削除するためのフラグ(一部のみ削除の場合は使わない)
		boolean outflag;

		//テキスト1つ1つからパターンを作成
		for(int i=0; i<TargetTextArray.size(); i++){

			//テキスト抽出
			String TargetText = TargetTextArray.get(i);
			//YJコード
			String TargetYJ = TargetTextYJ.get(i);

			outflag = false;

			//テキスト部分を全角に置換
			TargetText = StringConv.eisukigoHanToZen(TargetText);




			//<<BR>>ごとにテキストデータを分割
			String[] TextList = TargetText.split("＜＜ＢＲ＞＞", -1);

			//1つのitemタグとdetailタグをセットとして添加物の記載部分を削除
			for(int j=0; j<TextList.length; j++){


				boolean flag = true;

				//outflagがtureの時、全て削除
				if(outflag){
					TextList[j] = "";
					continue;
				}

				//一文字目から出てきたらそのテキストは飛ばす
				for(int k=0; k<OutTargetList.length; k++){
					if(TextList[j].indexOf(OutTargetList[k])==0){
						TextList[j] = "";
						flag = false;
						outflag = true;
						continue;
					}
				}

				//itemタグ内であればそのテキストは飛ばす(ただしタグが1つの場合は飛ばさない)
				if(flag){
					String[] tmp = TextList[j].split("＜ＢＲ＞", -1);
					if(tmp.length!=1){
						for(int k=0; k<OutTargetList.length; k++){
							if(tmp[0].contains(OutTargetList[k])){
								TextList[j] = "";
								flag = false;
								outflag = true;
								continue;
							}
						}
					}
				}
				//文の途中からならばその語句から<<BR>>もしくは文末まで削除
				if(flag){
					int index;
					for(int k=0; k<OutTargetList.length; k++){
						if((index = TextList[j].indexOf("※"+OutTargetList[k])) != -1){
							TextList[j] = SearchDeletePart(TextList[j], index);
							outflag = true;
						}
						if((index = TextList[j].indexOf("＊"+OutTargetList[k])) != -1){
							TextList[j] = SearchDeletePart(TextList[j], index);
							outflag = true;
						}
						if((index = TextList[j].indexOf("※※"+OutTargetList[k])) != -1){
							TextList[j] = SearchDeletePart(TextList[j], index);
							outflag = true;
						}
						if((index = TextList[j].indexOf("＊＊"+OutTargetList[k])) != -1){
							TextList[j] = SearchDeletePart(TextList[j], index);
							outflag = true;
						}
						if((index = TextList[j].indexOf("＊＊＊"+OutTargetList[k])) != -1){
							TextList[j] = SearchDeletePart(TextList[j], index);
							outflag = true;
						}
						if((index = TextList[j].indexOf("及び" + OutTargetList[k])) != -1){
							TextList[j] = SearchDeletePart(TextList[j], index);
							outflag = true;
						}
						if((index = TextList[j].indexOf("および" + OutTargetList[k])) != -1){
							TextList[j] = SearchDeletePart(TextList[j], index);
							outflag = true;
						}
						if((index = TextList[j].indexOf("￥ｎ" + OutTargetList[k])) != -1){
							TextList[j] = SearchDeletePart(TextList[j], index);
							outflag = true;
						}
						if((index = TextList[j].indexOf("。"+OutTargetList[k])) != -1){
							TextList[j] = SearchDeletePart(TextList[j], index);
							outflag = true;
						}
						if((index = TextList[j].indexOf("＜ＢＲ＞"+OutTargetList[k])) != -1){
							TextList[j] = SearchDeletePart(TextList[j], index);
							outflag = true;
						}
						if((index = TextList[j].indexOf("＜ＢＲ＞※"+OutTargetList[k])) != -1){
							TextList[j] = SearchDeletePart(TextList[j], index);
							outflag = true;
						}
						if((index = TextList[j].indexOf("＜ＢＲ＞＊"+OutTargetList[k])) != -1){
							TextList[j] = SearchDeletePart(TextList[j], index);
							outflag = true;
						}
						if((index = TextList[j].indexOf("＜ＢＲ＞※※"+OutTargetList[k])) != -1){
							TextList[j] = SearchDeletePart(TextList[j], index);
							outflag = true;
						}
						if((index = TextList[j].indexOf("＜ＢＲ＞＊＊"+OutTargetList[k])) != -1){
							TextList[j] = SearchDeletePart(TextList[j], index);
							outflag = true;
						}
						if((index = TextList[j].indexOf(OutTargetList[k]+"として")) != -1){
							TextList[j] = SearchDeletePart(TextList[j], index);
							outflag = true;
						}
						if((index = TextList[j].indexOf(OutTargetList[k]+"＜ＢＲ＞")) != -1){
							TextList[j] = SearchDeletePart(TextList[j], index);
							outflag = true;
						}
		//				if((index = TextList[j].indexOf("＜" + OutTargetList[k]+"＞")) != -1){
		//					TextList[j] = SearchDeletePart(TextList[j], index);
		//					outflag = true;
		//				}
		//				if((index = TextList[j].indexOf("〈" + OutTargetList[k]+"〉")) != -1){
		//					TextList[j] = SearchDeletePart(TextList[j], index);
		//					outflag = true;
		//				}
						if((index = TextList[j].indexOf("成分：" + OutTargetList[k]+"：")) != -1){
							TextList[j] = SearchDeletePart(TextList[j], index);
							outflag = true;
						}
						if((index = TextList[j].indexOf("成分含有量：" + OutTargetList[k]+"：")) != -1){
							TextList[j] = SearchDeletePart(TextList[j], index);
							outflag = true;
						}
						if((index = TextList[j].indexOf("成分・含有量：" + OutTargetList[k]+"：")) != -1){
							TextList[j] = SearchDeletePart(TextList[j], index);
							outflag = true;
						}
						if((index = TextList[j].indexOf("＜" + OutTargetList[k]+"＞")) != -1){
							TextList[j] = SearchDeletePart(TextList[j], index);
							outflag = true;
						}
						if((index = TextList[j].indexOf("〈" + OutTargetList[k]+"〉")) != -1){
							TextList[j] = SearchDeletePart(TextList[j], index);
							outflag = true;
						}
						if((index = TextList[j].indexOf("：" + OutTargetList[k]+"：")) != -1){
							TextList[j] = SearchDeletePart(TextList[j], index);
							outflag = true;
						}
					}
				}

			}

			//分割していたテキストデータを結合
			TargetText = TextList[0];
			for(int j=1; j<TextList.length; j++){
				TargetText += "＜＜ＢＲ＞＞" + TextList[j];
			}

			while(true){
				String tmp = TargetText;
				TargetText = TargetText.replaceAll("＜＜ＢＲ＞＞＜＜ＢＲ＞＞", "＜＜ＢＲ＞＞");
				if(tmp.equals(TargetText)){
					break;
				}
			}


			////////////
			//置換開始//
			////////////

			//Step.1
			//販売名を<BrandName>に
			for(int j=0; j<FileNameBrandNameList.size(); j++){
				String BName = FileNameBrandNameList.get(j);
				if(BName.contains(TargetYJ)){
					String Temp = BName.split(",", -1)[2];
					Temp = StringConv.eisukigoHanToZen(Temp);
					Temp = Temp.replaceAll("※", "");
					Temp = Temp.replaceAll("＊", "");
					Temp = Temp.replaceAll("　", "");
					Temp = Temp.replaceAll(" ", "");
					if(Temp.length()!=0){
						TargetText = TargetText.replaceAll(Temp, "<BrandName>");
					}
				}
			}
			for(int j=0; j<BrandNameList.size(); j++){
				TargetText = TargetText.replaceAll(BrandNameList.get(j), "<BrandName>");
			}

			//Step.2
			//漢方薬情報を置換
			//漢方薬名→<KampoName>
			for(int j=0; j<KampoNameList.size(); j++){
				TargetText = TargetText.replaceAll(KampoNameList.get(j), "<KampoName>");
			}
			//漢方薬名の読み→<KampoYomi>
			for(int j=0; j<KampoYomiNameList.size(); j++){
				TargetText = TargetText.replaceAll(KampoYomiNameList.get(j), "<KampoYomi>");
			}


			//Step.2
			//有効成分名を<ActIngreName>に
			boolean replaceflag;
			for(int j=0; j<ActiveIngredientNameList.size(); j++){
				//有効成分+単位を置換しないようにする処理
				replaceflag = false;
				if(TargetText.contains(ActiveIngredientNameList.get(j)+"単位")){
					TargetText = TargetText.replaceAll(ActiveIngredientNameList.get(j)+"単位", "＄");
				}
				TargetText = TargetText.replaceAll(ActiveIngredientNameList.get(j), "<ActIngreName>");
				if(replaceflag){
					TargetText = TargetText.replaceAll("＄", ActiveIngredientNameList.get(j)+"単位");
				}
			}
			//Step.3
			//有効成分名に付属する情報をそれぞれのタグに
			//有効成分の略名→<ActIngreShortName>
			for(int j=0; j<ActiveIngredientShortNameList.size(); j++){
				TargetText = TargetText.replaceAll(ActiveIngredientShortNameList.get(j), "<ActIngreShortName>");
			}
			//有効成分の別名→<ActIngreOtherName>
			for(int j=0; j<ActiveIngredientOtherwiseNameList.size(); j++){
				TargetText = TargetText.replaceAll(ActiveIngredientOtherwiseNameList.get(j), "<ActIngreOtherName>");
			}

			//Step.4
			//分子式と単位以外の情報をそれぞれのタグに
			//企業名→<Company>
//			for(int j=0; j<CompanyNameList.size(); j++){
//				TargetText = TargetText.replaceAll(CompanyNameList.get(j), "<Company>");
//			}
			//色→<Color>
			for(int j=0; j<ColorList.size(); j++){
				TargetText = TargetText.replaceAll(ColorList.get(j), "<Color>");
			}
			//におい→<Smell>
			for(int j=0; j<SmellList.size(); j++){
				//芳香水剤のみ除外
				if(!(SmellList.get(j).equals("芳香") && TargetText.contains(SmellList.get(j)+"水剤"))){
					TargetText = TargetText.replaceAll(SmellList.get(j), "<Smell>");
				}
			}
			//味→<Taste>
			for(int j=0; j<TasteList.size(); j++){
				TargetText = TargetText.replaceAll(TasteList.get(j), "<Taste>");
			}
//			//状態→<State>
//			for(int j=0; j<StateList.size(); j++){
//				TargetText = TargetText.replaceAll(StateList.get(j), "<State>");
//			}
//			//医薬品特徴→<Chara>
//			for(int j=0; j<DrugCharacterList.size(); j++){
//				TargetText = TargetText.replaceAll(DrugCharacterList.get(j), "<Chara>");
//			}
//			//医薬品種類→<Kind>
//			for(int j=0; j<DrugKindList.size(); j++){
//				TargetText = TargetText.replaceAll(DrugKindList.get(j), "<Kind>");
//			}
			//部分情報→<DrugParts>
			for(int j=0; j<PartsList.size(); j++){
				TargetText = TargetText.replaceAll(PartsList.get(j), "<DrugParts>");
			}
//			//生物原料→<CreatureMaterialName>
//			for(int j=0; j<CreatureList.size(); j++){
//				TargetText = TargetText.replaceAll(CreatureList.get(j), "<CreatureMaterialName>");
//			}
//			//生物以外原料→<NotCreatureMaterial>
//			for(int j=0; j<NotCreatureList.size(); j++){
//				TargetText = TargetText.replaceAll(NotCreatureList.get(j), "<NotCreatureMaterial>");
//			}
//			//原料部分→<MaterialParts>
//			for(int j=0; j<MaterialPartList.size(); j++){
//				TargetText = TargetText.replaceAll(MaterialPartList.get(j), "<MaterialParts>");
//			}
//			//原料別名→<MaterialOtherName>
//			for(int j=0; j<MaterialOtherwiseNameList.size(); j++){
//				TargetText = TargetText.replaceAll(MaterialOtherwiseNameList.get(j), "<MaterialOtherName>");
//			}
//			//原料成分→<MaterialIngreName>
//			for(int j=0; j<MaterialIngredientList.size(); j++){
//				TargetText = TargetText.replaceAll(MaterialIngredientList.get(j), "<MaterialIngreName>");
//			}
//
//			//機器名→<DeviceName>
//			for(int j=0; j<DeviceNameList.size(); j++){
//				TargetText = TargetText.replaceAll(DeviceNameList.get(j), "<DeviceName>");
//			}
//			//製造方法→<Method>
//			for(int j=0; j<ManufactureMethodList.size(); j++){
//				TargetText = TargetText.replaceAll(ManufactureMethodList.get(j), "<Method>");
//			}



			//Step.5
			//分子式を<Fomula>に(前に有効成分がつくのが前提)
			TargetText = TargetText.replaceAll("Name>（[Ａ-ｚ][Ａ-ｚ０-９・]+）", "Name>（<Formula>）");
			TargetText = TargetText.replaceAll("Name>（[Ａ-ｚ][Ａ-ｚ０-９・]+：", "Name>（<Formula>：");
//			TargetText = TargetText.replaceAll("（([Ａ-ｚ]+[０-９]+)+[Ａ-ｚ]+）", "（<Formula>）");
//			TargetText = TargetText.replaceAll("（([Ａ-ｚ]+[０-９]+)+）", "（<Formula>）");
			for(int j=0; j<ActiveIngredientFomulaNameList.size(); j++){
				//イオン式以外を対象外にする処理
				if((TargetText.indexOf(ActiveIngredientFomulaNameList.get(j) + "Ｕ") == -1) &&
				  ((TargetText.indexOf(ActiveIngredientFomulaNameList.get(j) + "＋") != -1) || (TargetText.indexOf(ActiveIngredientFomulaNameList.get(j) + "－") != -1) || (TargetText.indexOf(ActiveIngredientFomulaNameList.get(j) + "？") != -1)) ){
					TargetText = TargetText.replaceAll(ActiveIngredientFomulaNameList.get(j), "<Formula>");
				}
			}

			//元素記号を<ElementSymbol>に
			for(int j=0; j<ElementSymbolList.size(); j++){
				TargetText = TargetText.replaceAll("（" + ElementSymbolList.get(j) + "）", "（<ElementSymbol>）");
			}

			//電解質イオンの情報を<ElectIon>
			for(int j=0; j<ElectrolyteList.size(); j++){
				TargetText = TargetText.replaceAll(ElectrolyteList.get(j), "<ElectIon>");
			}


			//Step.5
			//数字+単位を<Number><Unit>に
			String NumberRegex = "[０-９](([０-９]|[，．／～？×][０-９])+)?";
			boolean Replaceflag = false;
			if(TargetText.contains("億")){
				Replaceflag = true;
				TargetText = TargetText.replaceAll("億", "００００００００");
			}
			else if(TargetText.contains("万")){
				TargetText = TargetText.replaceAll("万", "００００");
				Replaceflag = true;
			}
			for(int j=0; j<UnitList.size(); j++){
				TargetText = TargetText.replaceAll(NumberRegex + UnitList.get(j), "<Number><Unit>");
			}
			NumberRegex = "約" + NumberRegex;
			for(int j=0; j<UnitList.size(); j++){
				TargetText = TargetText.replaceAll(NumberRegex + UnitList.get(j), "<Number><Unit>");
			}

			if(Replaceflag){
				TargetText = TargetText.replaceAll("００００００００", "億");
				TargetText = TargetText.replaceAll("００００", "万");
			}






			//Step.7
			//／＋単位を／<Unit>に
			for(int j=0; j<UnitList.size(); j++){
				TargetText = TargetText.replaceAll("／" + UnitList.get(j), "／<Unit>");
			}
			//単位／単位を<Unit>に
			for(int j=0; j<UnitList.size(); j++){
				TargetText = TargetText.replaceAll(UnitList.get(j) + "<Unit>", "／<Unit>");
			}

			//Step.8
			//（単位）を（<Unit>）に
			for(int j=0; j<UnitList.size(); j++){
				TargetText = TargetText.replaceAll("（" + UnitList.get(j) + "）", "（<Unit>）");
			}





			//Step.9
			//剤形→<Form>
			for(int j=0; j<FormList.size(); j++){
				TargetText = TargetText.replaceAll(FormList.get(j), "<Form>");
			}
			//容器名→<CaseName>
			for(int j=0; j<CaseNameList.size(); j++){
				TargetText = TargetText.replaceAll(CaseNameList.get(j), "<CaseName>");
			}


			//Step.8
			//<Label>(<Label>)を<Label>に



			//Step.9
			//調整
			TargetText = TargetText.replaceAll("<Number><Unit>／<Number><Unit>", "<Number><Unit>");
			TargetText = TargetText.replaceAll("<Unit>／<Unit>", "<Unit>");
			TargetText = TargetText.replaceAll("…+", "…");
			TargetText = TargetText.replaceAll("・+", "・");

			//数字を<Number>に
			NumberRegex = "[０-９](([０-９]|[，．／～？×][０-９])+)?";
			TargetText = TargetText.replaceAll(NumberRegex, "<Number>");

			//Step.10
			//不要記号・文字の削除
			for(int j=0; j<DeletePhraseList.length; j++){
				TargetText = TargetText.replaceAll(DeletePhraseList[j], "");
			}
			for(int j=0; j<DeleteSymbolList.length; j++){
				TargetText = TargetText.replaceAll(DeleteSymbolList[j], "");
			}


//			//採血国→<Country>
//			for(int j=0; j<BloodingCountryList.size(); j++){
//				TargetText = TargetText.replaceAll(BloodingCountryList.get(j), "<Country>");
//			}
//			//採血区分→<BloodingMethod>
//			for(int j=0; j<BloodingMethodList.size(); j++){
//				TargetText = TargetText.replaceAll(BloodingMethodList.get(j), "<BloodingMethod>");
//			}


			//Step.11
			//区切り文字の削除
			TargetText = TargetText.replaceAll("、", "");
			TargetText = TargetText.replaceAll("。", "");
			TargetText = TargetText.replaceAll("，", "");
			TargetText = TargetText.replaceAll("・", "");
			TargetText = TargetText.replaceAll("￥ｎ", "");
			TargetText = TargetText.replaceAll("　", "");

			//添加物除去
			int index;

			if((index = TargetText.indexOf("<Number><Unit>添加物")) != -1){
				TargetText = TargetText.substring(0, index+14);
			}
			if((index = TargetText.indexOf("<Number><Unit>中の添加物")) != -1){
				TargetText = TargetText.substring(0, index);
			}
			if((index = TargetText.indexOf("<Number><Unit>中添加物")) != -1){
				TargetText = TargetText.substring(0, index);
			}
			if((index = TargetText.indexOf("…（添加物）")) != -1){
				TargetText = TargetText.substring(0, index);
			}
			if((index = TargetText.indexOf("（添加物）")) != -1){
				TargetText = TargetText.substring(0, index);
			}


			TargetText = TargetText.replaceAll("^＜ＢＲ＞", "");
			TargetText = TargetText.replaceAll("＜ＢＲ＞$", "");
			TargetText = TargetText.replaceAll("^＜＜ＢＲ＞＞", "");
			TargetText = TargetText.replaceAll("＜＜ＢＲ＞＞$", "");


			if(!(TargetText.length()==0) && TargetText.indexOf("＜")==TargetText.length()-1){
				TargetText = TargetText.substring(0, TargetText.length()-1);
			}

			//タグ(<aaa>)をラベル([aaa])に置換
			TargetText = TargetText.replaceAll("<", "[");
			TargetText = TargetText.replaceAll(">", "]");

			//＜＜ＢＲ＞＞や＜ＢＲ＞を半角に
			TargetText = TargetText.replaceAll("＜＜ＢＲ＞＞", "<<BR>>");
			TargetText = TargetText.replaceAll("＜ＢＲ＞", "<BR>");



			//出力用に格納
			ReplacementAfterTextArray.add(TargetYJ + "\t" + TargetText);

			if(i%1000==0){
				System.out.println(i+":終了");
			}
		}
	}



	/**
	 * 文字長の大きい純に並び替える
	 * @param 対象文字配列
	 * @return 並び替え済み文字配列
	 */
	public ArrayList<String> LengthSort(ArrayList<String> TargetArray){

		int size = TargetArray.size();
		//バブルソート
		for(int i=0; i<size-1; i++){
			for(int j=size-1; j>0; j--){

				int Length01 = TargetArray.get(j-1).length();
				int Length02 = TargetArray.get(j).length();

				if(Length01<Length02){
					String Temp = TargetArray.get(j-1);
					TargetArray.set(j-1, TargetArray.get(j));
					TargetArray.set(j, Temp);
				}
			}
		}
		return TargetArray;
	}

	/**
	 * ラベル作成時の不要部分探索・削除用\n
	 * 添加物等の不要語句に対して、残りの<BR>部分までを削除するために、その部分を探索して部分文字列を作成し、削除
	 * @param 削除対象TEXT, 不要語句開始Index
	 * @return 不要部分削除済みTEXT
	 */
	private String SearchDeletePart(String TargetText, int fromindex){
		int lastindex;

		//該当部分の最後を探索
		//該当部分を探索 +2となっているのは開始部分と終わりの部分を一致させないため
		if((lastindex = TargetText.indexOf("＜＜ＢＲ＞＞", fromindex+2)) != -1){
			//＜＜ＢＲ＞＞も削除するために調整
			lastindex += 5;
		}
		//見つからなかったら、対象語句以降を全て削除するために、一番最後のIndex番号を取得
		else{
			lastindex = TargetText.length();
		}

		//削除部分の文字列を取得
		String S = TargetText.substring(fromindex, lastindex);

		//削除
		TargetText = TargetText.replaceFirst(S, "");


		return TargetText;
	}

	/**
	 * get
	 */
	public ArrayList<String>getReplaceAfterTextArray(){
		return ReplacementAfterTextArray;
	}


}
