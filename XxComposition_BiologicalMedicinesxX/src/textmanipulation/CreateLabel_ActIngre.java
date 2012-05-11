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
	//�e�Y�t�������ڂɉ��������x���쐬�ɗp����t�@�C����
	////////////////////////////////////////////////////

	//�̔������X�g�t�@�C����
	private String BrandNameList01 = "BrandnameTextList.txt";
	private String BrandNameList02 = "�蓮_�̔���.txt";
	//�P�ʃ��X�g�t�@�C����
	private String UnitList01 = "�P�ʃ��X�g�i�`���j.csv";
	private String UnitList02 = "�P�ʃ��X�g�i�c��j.csv";
	private String UnitList03 = "�P�ʃ��X�g�i���{��Ǖ��j.csv";
	private String UnitList04 = "�P��.txt";
	//�L�����������X�g�t�@�C����
	private String ActiveIngredientNameList01 = "��ʖ��i�L�������Ɋւ��闝���w�I�m���j.csv";
	private String ActiveIngredientNameList02 = "�������i���ʓ������Ƃ��āj.csv";
	private String ActiveIngredientNameList03 = "�������i�g��EED���o�E�������܂܂Ȃ��j.csv";
	private String ActiveIngredientNameList04 = "�蓮_�L��������.txt";
	private String ActiveIngredientNameList05 = "�蓮_�L��������_���t����.txt";
	private String ActiveIngredientNameList06 = "���t����_���.txt";
	//�L���������ΏۊO�t�@�C����
	private String NotActiveIngredientNameList01 = "�L���������u���ΏۊO.txt";
	//�L���������������X�g�t�@�C����
	private String ActiveIngredientShortNameList01 = "�L����������.txt";
	//�L�����������q�����X�g�t�@�C����
	private String ActiveIngredientFomulaNameList01 = "���q��.txt";
	//�L���������ʖ����X�g�t�@�C����
	private String ActiveIngredientOtherwiseNameList01 = "�L�������ʖ�.txt";
	//�L�������ڍ׃��X�g�t�@�C����
	private String ActiveIngredientDetailList01 = "�L�������ڍ�.txt";
	//�d�����g�����X�g�t�@�C����
	private String ElectrolyteList01 = "�d�����C�I��.txt";
	//�܌`���X�g�t�@�C����
	private String FormList01 = "�蓮_�܌`.txt";
	private String FormList02 = "Form1.csv";
	private String FormList03 = "Form2.csv";
	//�܌`�u���ΏۊO���X�g�t�@�C����
	private String NotFormList01 = "�܌`_�u���ΏۊO.txt";
	//��Ɩ����X�g�t�@�C����
	private String CompanyNameList01 = "��Ɩ�.txt";
	//�����򖼃��X�g�t�@�C����
//	private String KampoNameList01 = "KampoNameList.txt";
	private String KampoNameList01 = "ConfirmedKampoList.csv";
	//�����򖼓ǂ݉������X�g�t�@�C����
	private String KampoYomiNameList01 = "KampoYomiList.txt";
	//�F���X�g�t�@�C����
	private String ColorList01 = "�F.txt";
	//�ɂ������X�g�t�@�C����
	private String SmellList01 = "�ɂ���.txt";
	//�����X�g�t�@�C����
	private String TasteList01 = "��.txt";
	//��ԃ��X�g�t�@�C����
	private String StateList01 = "���܏��.txt";
	//���i�������X�g�t�@�C����
	private String DrugCharacterList01 = "���i����.txt";
	//���i��ރ��X�g�t�@�C����
	private String DrugKindList01 = "���i���.txt";
	//������񃊃X�g�t�@�C����
	private String PartsList01 = "���i����.txt";
	private String PartsList02 = "�Z�b�g����.txt";
	//�����������X�g�t�@�C����
	private String CreatureList01 = "������.txt";
	//�����ȊO�������X�g�t�@�C����
	private String NotCreatureList01 = "�����ȊO����.txt";
	//�������ʃ��X�g�t�@�C����
	private String MaterialPartsList01 = "��������.txt";
	//�����ʖ����X�g�t�@�C����
	private String MaterialOtherwiseNameList01 = "�����ʖ�.txt";
	//�����������X�g�t�@�C����
	private String MaterialIngredientList01 = "��������.txt";
	//�e�햼���X�g�t�@�C����
	private String CaseNameList01 = "�e�햼.txt";
	//�@�햼���X�g�t�@�C����
	private String DeviceNameList01 = "�@�햼.txt";
	//�������@���X�g�t�@�C����
	private String ManufactureMethodList01 = "�������@.txt";
	//�����H���ޗ����X�g�t�@�C����
	private String ManufacutureMaterialList01 = "�����H���ޗ�.txt";
	//�̌������X�g�t�@�C����
	private String BloodingCountryList01 = "�̌���.txt";
	//�̌��敪���X�g�t�@�C����
	private String BloodMethodList01 = "�̌��敪.txt";
	//���t�ۑ��t��ރ��X�g�t�@�C����
	private String BloodDrugKindList01 = "���t�ۑ��t���.txt";
	//���f�L�����X�g�t�@�C����
	private String ElementSymbolList01 = "���f�L��.txt";



	//�t�H���_�p�X
	private String FolderPath = "LabelList/";

	////////////////////////////////////////////////////
	/////////////			�����܂�		////////////
	////////////////////////////////////////////////////

	//���X�g�i�[�p�z��
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


	//�폜�ΏۋL���E�����ꗗ
	private String[] DeleteSymbolList = {	"�u�v",
											"�i�j",
											"�H",
											"�k�H",
											"��",
											"��",
											"�k�\",
											"�k�[",
											"�k�]",
											"��",
											"���Q",
											"���R",
											"���j",
											"��<Number>",
											"��<Number>�j"
										};

	private String[] DeletePhraseList = {	"����",
											"���{��Ǖ�",
											"��Ǖ�",
											"�ǊO���K",
											"�ǊO�K",
											"�͉�"
										};


	//�u���Ώۃe�L�X�g�z��
	private ArrayList<String> TargetTextArray = null;
	//�u���Ώۃe�L�X�g��YJList
	private ArrayList<String> TargetTextYJ = null;
	//�u����e�L�X�g�z��
	private ArrayList<String> ReplacementAfterTextArray = new ArrayList<String>();




	/**
	 * �R���X�g���N�^���s���ɒu���p���X�g�쐬
	 * @param TA �u���ΏۂƂȂ�e�L�X�g�z��
	 */
	public CreateLabel_ActIngre(ArrayList<String> TA, ArrayList<String> TJ){

		this.TargetTextArray = TA;
		this.TargetTextYJ = TJ;

		//���X�g�쐬
		ArrayList<String> Temp01 = new ArrayList<String>();
		ArrayList<String> Temp02 = new ArrayList<String>();

		//////////
		//�̔���//
		//////////
		Temp02.addAll(InOutFile.InputTextFile(FolderPath + BrandNameList01));
		FileNameBrandNameList = new ArrayList<String>(Temp02);
		Temp01.addAll(InOutFile.InputTextFile(FolderPath + BrandNameList02));
		for(int i=0; i<Temp01.size(); i++){
			Temp01.set(i, StringConv.eisukigoHanToZen(Temp01.get(i)));
		}
		//������O
		while(Temp01.remove("")){

		}
		BrandNameList = new ArrayList<String>(LengthSort(Temp01));
		Temp01.clear();
		Temp02.clear();

		//������O
		while(BrandNameList.remove("")){

		}

		Temp01.clear();
		Temp02.clear();

		////////
		//�P��//
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
		//�L��������//
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
		//�ΏۊO�폜
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
		//�L����������//
		////////////////
		Temp01.addAll(InOutFile.InputTextFile(FolderPath + ActiveIngredientShortNameList01));
		for(int i=0; i<Temp01.size(); i++){
			Temp01.set(i, StringConv.eisukigoHanToZen(Temp01.get(i)));
		}
		ActiveIngredientShortNameList = new ArrayList<String>(LengthSort(Temp01));
		Temp01.clear();
		Temp02.clear();

		//////////
		//���q��//
		//////////
		Temp01.addAll(InOutFile.InputTextFile(FolderPath + ActiveIngredientFomulaNameList01));
		for(int i=0; i<Temp01.size(); i++){
			Temp01.set(i, StringConv.eisukigoHanToZen(Temp01.get(i)));
		}
		ActiveIngredientFomulaNameList = new ArrayList<String>(LengthSort(Temp01));
		Temp01.clear();
		Temp02.clear();

		////////////////
		//�L�������ʖ�//
		////////////////
		Temp01.addAll(InOutFile.InputTextFile(FolderPath + ActiveIngredientOtherwiseNameList01));
		for(int i=0; i<Temp01.size(); i++){
			Temp01.set(i, StringConv.eisukigoHanToZen(Temp01.get(i)));
		}
		ActiveIngredientOtherwiseNameList = new ArrayList<String>(LengthSort(Temp01));
		Temp01.clear();
		Temp02.clear();

		////////////////
		//�L�������ڍ�//
		////////////////
		Temp01.addAll(InOutFile.InputTextFile(FolderPath + ActiveIngredientDetailList01));
		for(int i=0; i<Temp01.size(); i++){
			Temp01.set(i, StringConv.eisukigoHanToZen(Temp01.get(i)));
		}
		ActiveIngredientDetailList = new ArrayList<String>(LengthSort(Temp01));
		Temp01.clear();
		Temp02.clear();

		////////////////
		//�d�����C�I��//
		////////////////
		Temp01.addAll(InOutFile.InputTextFile(FolderPath + ElectrolyteList01));
		for(int i=0; i<Temp01.size(); i++){
			Temp01.set(i, StringConv.eisukigoHanToZen(Temp01.get(i)));
		}
		ElectrolyteList = new ArrayList<String>(LengthSort(Temp01));
		Temp01.clear();
		Temp02.clear();

		////////////
		//���f�L��//
		////////////
		Temp01.addAll(InOutFile.InputTextFile(FolderPath + ElementSymbolList01));
		for(int i=0; i<Temp01.size(); i++){
			Temp01.set(i, StringConv.eisukigoHanToZen(Temp01.get(i)));
		}
		ElementSymbolList = new ArrayList<String>(LengthSort(Temp01));
		Temp01.clear();
		Temp02.clear();

		////////
		//�܌`//
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
		//��Ɩ�//
		//////////
		Temp01.addAll(InOutFile.InputTextFile(FolderPath + CompanyNameList01));
		for(int i=0; i<Temp01.size(); i++){
			Temp01.set(i, StringConv.eisukigoHanToZen(Temp01.get(i)));
		}
		CompanyNameList = new ArrayList<String>(LengthSort(Temp01));
		Temp01.clear();
		Temp02.clear();

		////////////
		//������//
		////////////
		Temp01.addAll(InOutFile.InputTextFile(FolderPath + KampoNameList01));
		for(int i=0; i<Temp01.size(); i++){
			Temp01.set(i, StringConv.eisukigoHanToZen(Temp01.get(i)));
		}
		KampoNameList = new ArrayList<String>(LengthSort(Temp01));
		Temp01.clear();
		Temp02.clear();

		////////////////
		//�����򖼓ǂ�//
		////////////////
		Temp01.addAll(InOutFile.InputTextFile(FolderPath + KampoYomiNameList01));
		for(int i=0; i<Temp01.size(); i++){
			Temp01.set(i, StringConv.eisukigoHanToZen(Temp01.get(i)));
		}
		KampoYomiNameList = new ArrayList<String>(LengthSort(Temp01));
		Temp01.clear();
		Temp02.clear();

		//////
		//�F//
		//////
		Temp01.addAll(InOutFile.InputTextFile(FolderPath + ColorList01));
		for(int i=0; i<Temp01.size(); i++){
			Temp01.set(i, StringConv.eisukigoHanToZen(Temp01.get(i)));
		}
		ColorList = new ArrayList<String>(LengthSort(Temp01));
		Temp01.clear();
		Temp02.clear();

		//////////
		//�ɂ���//
		//////////
		Temp01.addAll(InOutFile.InputTextFile(FolderPath + SmellList01));
		for(int i=0; i<Temp01.size(); i++){
			Temp01.set(i, StringConv.eisukigoHanToZen(Temp01.get(i)));
		}
		SmellList = new ArrayList<String>(LengthSort(Temp01));
		Temp01.clear();
		Temp02.clear();

		//////
		//��//
		//////
		Temp01.addAll(InOutFile.InputTextFile(FolderPath + TasteList01));
		for(int i=0; i<Temp01.size(); i++){
			Temp01.set(i, StringConv.eisukigoHanToZen(Temp01.get(i)));
		}
		TasteList = new ArrayList<String>(LengthSort(Temp01));
		Temp01.clear();
		Temp02.clear();

//		////////
//		//���//
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
//		//���i����//
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
//		//���i���//
//		//////////////
//		Temp01.addAll(InOutFile.InputTextFile(FolderPath + DrugKindList01));
//		for(int i=0; i<Temp01.size(); i++){
//			Temp01.set(i, StringConv.eisukigoHanToZen(Temp01.get(i)));
//		}
//		DrugKindList = new ArrayList<String>(LengthSort(Temp01));
//		Temp01.clear();
//		Temp02.clear();

		////////////
		//�������//
		////////////
		Temp01.addAll(InOutFile.InputTextFile(FolderPath + PartsList01));
		for(int i=0; i<Temp01.size(); i++){
			Temp01.set(i, StringConv.eisukigoHanToZen(Temp01.get(i)));
		}
		PartsList = new ArrayList<String>(LengthSort(Temp01));
		Temp01.clear();
		Temp02.clear();

//		////////////
//		//��������//
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
//		//�����ȊO����//
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
//		//��������//
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
//		//�����ʖ�//
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
//		//��������//
//		////////////
//		Temp01.addAll(InOutFile.InputTextFile(FolderPath + MaterialIngredientList01));
//		for(int i=0; i<Temp01.size(); i++){
//			Temp01.set(i, StringConv.eisukigoHanToZen(Temp01.get(i)));
//		}
//		MaterialIngredientList = new ArrayList<String>(LengthSort(Temp01));
//		Temp01.clear();
//		Temp02.clear();

		//////////
		//�e�햼//
		//////////
		Temp01.addAll(InOutFile.InputTextFile(FolderPath + CaseNameList01));
		for(int i=0; i<Temp01.size(); i++){
			Temp01.set(i, StringConv.eisukigoHanToZen(Temp01.get(i)));
		}
		CaseNameList = new ArrayList<String>(LengthSort(Temp01));
		Temp01.clear();
		Temp02.clear();

//		//////////
//		//�@�햼//
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
//		//�������@//
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
//		//�����H���ޗ�//
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
//		//�̌���//
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
//		//�̌��敪//
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
//		//���t�ۑ��t���//
//		//////////////////
//		Temp01.addAll(InOutFile.InputTextFile(FolderPath + BloodDrugKindList01));
//		for(int i=0; i<Temp01.size(); i++){
//			Temp01.set(i, StringConv.eisukigoHanToZen(Temp01.get(i)));
//		}
//		BloodDrugKindList = new ArrayList<String>(LengthSort(Temp01));
//		Temp01.clear();
//		Temp02.clear();

		//���X�g�쐬�����܂�
	}


	//////////////////////////////
	//�ȉ��p�^�[���쐬�p���\�b�h//
	//////////////////////////////


	/**
	 *�L���������Ɗܗʗp�p�^�[���쐬
	 *�ΏۊO(�Y�����Ƃ���ɏ�������)<br>
	 *�Y�����@�Y���܁@���`�܁@��܁@����܁@�������܁@����@���l�@�ɏՍ܁@�Y�t�n���t<br>
	 *�n��(���ݑΏۊO���X�g���珜�O)�@�n���t(���ݑΏۊO���X�g���珜�O)�@��p��߉t�@�Ɖu�⏕�܁@�����܁@�����܁@��p�n���t�@�Y�t�n��
	 *
	 */
	public void CreatePatternActiveIngreandUnit(){


		//�ΏۊO�͏��O
		String[] OutTargetList = {	"�Y����",		"�Y����",		"���`��",		"���",			"�����",
									"��������",		"�ɏՍ�",		"�Y�t�n���t",
									"��p��߉t",	"�Ɖu�⏕��",	"������",
									"������",		"��p�n���t",	"�Y�t�n��"
		};

		//�Ώیꂪ�o�����������̕�����������폜���邽�߂̃t���O(�ꕔ�̂ݍ폜�̏ꍇ�͎g��Ȃ�)
		boolean outflag;

		//�e�L�X�g1��1����p�^�[�����쐬
		for(int i=0; i<TargetTextArray.size(); i++){

			//�e�L�X�g���o
			String TargetText = TargetTextArray.get(i);
			//YJ�R�[�h
			String TargetYJ = TargetTextYJ.get(i);

			outflag = false;

			//�e�L�X�g������S�p�ɒu��
			TargetText = StringConv.eisukigoHanToZen(TargetText);




			//<<BR>>���ƂɃe�L�X�g�f�[�^�𕪊�
			String[] TextList = TargetText.split("�����a�q����", -1);

			//1��item�^�O��detail�^�O���Z�b�g�Ƃ��ēY�����̋L�ڕ������폜
			for(int j=0; j<TextList.length; j++){


				boolean flag = true;

				//outflag��ture�̎��A�S�č폜
				if(outflag){
					TextList[j] = "";
					continue;
				}

				//�ꕶ���ڂ���o�Ă����炻�̃e�L�X�g�͔�΂�
				for(int k=0; k<OutTargetList.length; k++){
					if(TextList[j].indexOf(OutTargetList[k])==0){
						TextList[j] = "";
						flag = false;
						outflag = true;
						continue;
					}
				}

				//item�^�O���ł���΂��̃e�L�X�g�͔�΂�(�������^�O��1�̏ꍇ�͔�΂��Ȃ�)
				if(flag){
					String[] tmp = TextList[j].split("���a�q��", -1);
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
				//���̓r������Ȃ�΂��̌�傩��<<BR>>�������͕����܂ō폜
				if(flag){
					int index;
					for(int k=0; k<OutTargetList.length; k++){
						if((index = TextList[j].indexOf("��"+OutTargetList[k])) != -1){
							TextList[j] = SearchDeletePart(TextList[j], index);
							outflag = true;
						}
						if((index = TextList[j].indexOf("��"+OutTargetList[k])) != -1){
							TextList[j] = SearchDeletePart(TextList[j], index);
							outflag = true;
						}
						if((index = TextList[j].indexOf("����"+OutTargetList[k])) != -1){
							TextList[j] = SearchDeletePart(TextList[j], index);
							outflag = true;
						}
						if((index = TextList[j].indexOf("����"+OutTargetList[k])) != -1){
							TextList[j] = SearchDeletePart(TextList[j], index);
							outflag = true;
						}
						if((index = TextList[j].indexOf("������"+OutTargetList[k])) != -1){
							TextList[j] = SearchDeletePart(TextList[j], index);
							outflag = true;
						}
						if((index = TextList[j].indexOf("�y��" + OutTargetList[k])) != -1){
							TextList[j] = SearchDeletePart(TextList[j], index);
							outflag = true;
						}
						if((index = TextList[j].indexOf("�����" + OutTargetList[k])) != -1){
							TextList[j] = SearchDeletePart(TextList[j], index);
							outflag = true;
						}
						if((index = TextList[j].indexOf("����" + OutTargetList[k])) != -1){
							TextList[j] = SearchDeletePart(TextList[j], index);
							outflag = true;
						}
						if((index = TextList[j].indexOf("�B"+OutTargetList[k])) != -1){
							TextList[j] = SearchDeletePart(TextList[j], index);
							outflag = true;
						}
						if((index = TextList[j].indexOf("���a�q��"+OutTargetList[k])) != -1){
							TextList[j] = SearchDeletePart(TextList[j], index);
							outflag = true;
						}
						if((index = TextList[j].indexOf("���a�q����"+OutTargetList[k])) != -1){
							TextList[j] = SearchDeletePart(TextList[j], index);
							outflag = true;
						}
						if((index = TextList[j].indexOf("���a�q����"+OutTargetList[k])) != -1){
							TextList[j] = SearchDeletePart(TextList[j], index);
							outflag = true;
						}
						if((index = TextList[j].indexOf("���a�q������"+OutTargetList[k])) != -1){
							TextList[j] = SearchDeletePart(TextList[j], index);
							outflag = true;
						}
						if((index = TextList[j].indexOf("���a�q������"+OutTargetList[k])) != -1){
							TextList[j] = SearchDeletePart(TextList[j], index);
							outflag = true;
						}
						if((index = TextList[j].indexOf(OutTargetList[k]+"�Ƃ���")) != -1){
							TextList[j] = SearchDeletePart(TextList[j], index);
							outflag = true;
						}
						if((index = TextList[j].indexOf(OutTargetList[k]+"���a�q��")) != -1){
							TextList[j] = SearchDeletePart(TextList[j], index);
							outflag = true;
						}
		//				if((index = TextList[j].indexOf("��" + OutTargetList[k]+"��")) != -1){
		//					TextList[j] = SearchDeletePart(TextList[j], index);
		//					outflag = true;
		//				}
		//				if((index = TextList[j].indexOf("�q" + OutTargetList[k]+"�r")) != -1){
		//					TextList[j] = SearchDeletePart(TextList[j], index);
		//					outflag = true;
		//				}
						if((index = TextList[j].indexOf("�����F" + OutTargetList[k]+"�F")) != -1){
							TextList[j] = SearchDeletePart(TextList[j], index);
							outflag = true;
						}
						if((index = TextList[j].indexOf("�����ܗL�ʁF" + OutTargetList[k]+"�F")) != -1){
							TextList[j] = SearchDeletePart(TextList[j], index);
							outflag = true;
						}
						if((index = TextList[j].indexOf("�����E�ܗL�ʁF" + OutTargetList[k]+"�F")) != -1){
							TextList[j] = SearchDeletePart(TextList[j], index);
							outflag = true;
						}
						if((index = TextList[j].indexOf("��" + OutTargetList[k]+"��")) != -1){
							TextList[j] = SearchDeletePart(TextList[j], index);
							outflag = true;
						}
						if((index = TextList[j].indexOf("�q" + OutTargetList[k]+"�r")) != -1){
							TextList[j] = SearchDeletePart(TextList[j], index);
							outflag = true;
						}
						if((index = TextList[j].indexOf("�F" + OutTargetList[k]+"�F")) != -1){
							TextList[j] = SearchDeletePart(TextList[j], index);
							outflag = true;
						}
					}
				}

			}

			//�������Ă����e�L�X�g�f�[�^������
			TargetText = TextList[0];
			for(int j=1; j<TextList.length; j++){
				TargetText += "�����a�q����" + TextList[j];
			}

			while(true){
				String tmp = TargetText;
				TargetText = TargetText.replaceAll("�����a�q���������a�q����", "�����a�q����");
				if(tmp.equals(TargetText)){
					break;
				}
			}


			////////////
			//�u���J�n//
			////////////

			//Step.1
			//�̔�����<BrandName>��
			for(int j=0; j<FileNameBrandNameList.size(); j++){
				String BName = FileNameBrandNameList.get(j);
				if(BName.contains(TargetYJ)){
					String Temp = BName.split(",", -1)[2];
					Temp = StringConv.eisukigoHanToZen(Temp);
					Temp = Temp.replaceAll("��", "");
					Temp = Temp.replaceAll("��", "");
					Temp = Temp.replaceAll("�@", "");
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
			//���������u��
			//�����򖼁�<KampoName>
			for(int j=0; j<KampoNameList.size(); j++){
				TargetText = TargetText.replaceAll(KampoNameList.get(j), "<KampoName>");
			}
			//�����򖼂̓ǂ݁�<KampoYomi>
			for(int j=0; j<KampoYomiNameList.size(); j++){
				TargetText = TargetText.replaceAll(KampoYomiNameList.get(j), "<KampoYomi>");
			}


			//Step.2
			//�L����������<ActIngreName>��
			boolean replaceflag;
			for(int j=0; j<ActiveIngredientNameList.size(); j++){
				//�L������+�P�ʂ�u�����Ȃ��悤�ɂ��鏈��
				replaceflag = false;
				if(TargetText.contains(ActiveIngredientNameList.get(j)+"�P��")){
					TargetText = TargetText.replaceAll(ActiveIngredientNameList.get(j)+"�P��", "��");
				}
				TargetText = TargetText.replaceAll(ActiveIngredientNameList.get(j), "<ActIngreName>");
				if(replaceflag){
					TargetText = TargetText.replaceAll("��", ActiveIngredientNameList.get(j)+"�P��");
				}
			}
			//Step.3
			//�L���������ɕt������������ꂼ��̃^�O��
			//�L�������̗�����<ActIngreShortName>
			for(int j=0; j<ActiveIngredientShortNameList.size(); j++){
				TargetText = TargetText.replaceAll(ActiveIngredientShortNameList.get(j), "<ActIngreShortName>");
			}
			//�L�������̕ʖ���<ActIngreOtherName>
			for(int j=0; j<ActiveIngredientOtherwiseNameList.size(); j++){
				TargetText = TargetText.replaceAll(ActiveIngredientOtherwiseNameList.get(j), "<ActIngreOtherName>");
			}

			//Step.4
			//���q���ƒP�ʈȊO�̏������ꂼ��̃^�O��
			//��Ɩ���<Company>
//			for(int j=0; j<CompanyNameList.size(); j++){
//				TargetText = TargetText.replaceAll(CompanyNameList.get(j), "<Company>");
//			}
			//�F��<Color>
			for(int j=0; j<ColorList.size(); j++){
				TargetText = TargetText.replaceAll(ColorList.get(j), "<Color>");
			}
			//�ɂ�����<Smell>
			for(int j=0; j<SmellList.size(); j++){
				//�F�����܂̂ݏ��O
				if(!(SmellList.get(j).equals("�F��") && TargetText.contains(SmellList.get(j)+"����"))){
					TargetText = TargetText.replaceAll(SmellList.get(j), "<Smell>");
				}
			}
			//����<Taste>
			for(int j=0; j<TasteList.size(); j++){
				TargetText = TargetText.replaceAll(TasteList.get(j), "<Taste>");
			}
//			//��ԁ�<State>
//			for(int j=0; j<StateList.size(); j++){
//				TargetText = TargetText.replaceAll(StateList.get(j), "<State>");
//			}
//			//���i������<Chara>
//			for(int j=0; j<DrugCharacterList.size(); j++){
//				TargetText = TargetText.replaceAll(DrugCharacterList.get(j), "<Chara>");
//			}
//			//���i��ށ�<Kind>
//			for(int j=0; j<DrugKindList.size(); j++){
//				TargetText = TargetText.replaceAll(DrugKindList.get(j), "<Kind>");
//			}
			//�������<DrugParts>
			for(int j=0; j<PartsList.size(); j++){
				TargetText = TargetText.replaceAll(PartsList.get(j), "<DrugParts>");
			}
//			//����������<CreatureMaterialName>
//			for(int j=0; j<CreatureList.size(); j++){
//				TargetText = TargetText.replaceAll(CreatureList.get(j), "<CreatureMaterialName>");
//			}
//			//�����ȊO������<NotCreatureMaterial>
//			for(int j=0; j<NotCreatureList.size(); j++){
//				TargetText = TargetText.replaceAll(NotCreatureList.get(j), "<NotCreatureMaterial>");
//			}
//			//����������<MaterialParts>
//			for(int j=0; j<MaterialPartList.size(); j++){
//				TargetText = TargetText.replaceAll(MaterialPartList.get(j), "<MaterialParts>");
//			}
//			//�����ʖ���<MaterialOtherName>
//			for(int j=0; j<MaterialOtherwiseNameList.size(); j++){
//				TargetText = TargetText.replaceAll(MaterialOtherwiseNameList.get(j), "<MaterialOtherName>");
//			}
//			//����������<MaterialIngreName>
//			for(int j=0; j<MaterialIngredientList.size(); j++){
//				TargetText = TargetText.replaceAll(MaterialIngredientList.get(j), "<MaterialIngreName>");
//			}
//
//			//�@�햼��<DeviceName>
//			for(int j=0; j<DeviceNameList.size(); j++){
//				TargetText = TargetText.replaceAll(DeviceNameList.get(j), "<DeviceName>");
//			}
//			//�������@��<Method>
//			for(int j=0; j<ManufactureMethodList.size(); j++){
//				TargetText = TargetText.replaceAll(ManufactureMethodList.get(j), "<Method>");
//			}



			//Step.5
			//���q����<Fomula>��(�O�ɗL�����������̂��O��)
			TargetText = TargetText.replaceAll("Name>�i[�`-��][�`-���O-�X�E]+�j", "Name>�i<Formula>�j");
			TargetText = TargetText.replaceAll("Name>�i[�`-��][�`-���O-�X�E]+�F", "Name>�i<Formula>�F");
//			TargetText = TargetText.replaceAll("�i([�`-��]+[�O-�X]+)+[�`-��]+�j", "�i<Formula>�j");
//			TargetText = TargetText.replaceAll("�i([�`-��]+[�O-�X]+)+�j", "�i<Formula>�j");
			for(int j=0; j<ActiveIngredientFomulaNameList.size(); j++){
				//�C�I�����ȊO��ΏۊO�ɂ��鏈��
				if((TargetText.indexOf(ActiveIngredientFomulaNameList.get(j) + "�t") == -1) &&
				  ((TargetText.indexOf(ActiveIngredientFomulaNameList.get(j) + "�{") != -1) || (TargetText.indexOf(ActiveIngredientFomulaNameList.get(j) + "�|") != -1) || (TargetText.indexOf(ActiveIngredientFomulaNameList.get(j) + "�H") != -1)) ){
					TargetText = TargetText.replaceAll(ActiveIngredientFomulaNameList.get(j), "<Formula>");
				}
			}

			//���f�L����<ElementSymbol>��
			for(int j=0; j<ElementSymbolList.size(); j++){
				TargetText = TargetText.replaceAll("�i" + ElementSymbolList.get(j) + "�j", "�i<ElementSymbol>�j");
			}

			//�d�����C�I���̏���<ElectIon>
			for(int j=0; j<ElectrolyteList.size(); j++){
				TargetText = TargetText.replaceAll(ElectrolyteList.get(j), "<ElectIon>");
			}


			//Step.5
			//����+�P�ʂ�<Number><Unit>��
			String NumberRegex = "[�O-�X](([�O-�X]|[�C�D�^�`�H�~][�O-�X])+)?";
			boolean Replaceflag = false;
			if(TargetText.contains("��")){
				Replaceflag = true;
				TargetText = TargetText.replaceAll("��", "�O�O�O�O�O�O�O�O");
			}
			else if(TargetText.contains("��")){
				TargetText = TargetText.replaceAll("��", "�O�O�O�O");
				Replaceflag = true;
			}
			for(int j=0; j<UnitList.size(); j++){
				TargetText = TargetText.replaceAll(NumberRegex + UnitList.get(j), "<Number><Unit>");
			}
			NumberRegex = "��" + NumberRegex;
			for(int j=0; j<UnitList.size(); j++){
				TargetText = TargetText.replaceAll(NumberRegex + UnitList.get(j), "<Number><Unit>");
			}

			if(Replaceflag){
				TargetText = TargetText.replaceAll("�O�O�O�O�O�O�O�O", "��");
				TargetText = TargetText.replaceAll("�O�O�O�O", "��");
			}






			//Step.7
			//�^�{�P�ʂ��^<Unit>��
			for(int j=0; j<UnitList.size(); j++){
				TargetText = TargetText.replaceAll("�^" + UnitList.get(j), "�^<Unit>");
			}
			//�P�ʁ^�P�ʂ�<Unit>��
			for(int j=0; j<UnitList.size(); j++){
				TargetText = TargetText.replaceAll(UnitList.get(j) + "<Unit>", "�^<Unit>");
			}

			//Step.8
			//�i�P�ʁj���i<Unit>�j��
			for(int j=0; j<UnitList.size(); j++){
				TargetText = TargetText.replaceAll("�i" + UnitList.get(j) + "�j", "�i<Unit>�j");
			}





			//Step.9
			//�܌`��<Form>
			for(int j=0; j<FormList.size(); j++){
				TargetText = TargetText.replaceAll(FormList.get(j), "<Form>");
			}
			//�e�햼��<CaseName>
			for(int j=0; j<CaseNameList.size(); j++){
				TargetText = TargetText.replaceAll(CaseNameList.get(j), "<CaseName>");
			}


			//Step.8
			//<Label>(<Label>)��<Label>��



			//Step.9
			//����
			TargetText = TargetText.replaceAll("<Number><Unit>�^<Number><Unit>", "<Number><Unit>");
			TargetText = TargetText.replaceAll("<Unit>�^<Unit>", "<Unit>");
			TargetText = TargetText.replaceAll("�c+", "�c");
			TargetText = TargetText.replaceAll("�E+", "�E");

			//������<Number>��
			NumberRegex = "[�O-�X](([�O-�X]|[�C�D�^�`�H�~][�O-�X])+)?";
			TargetText = TargetText.replaceAll(NumberRegex, "<Number>");

			//Step.10
			//�s�v�L���E�����̍폜
			for(int j=0; j<DeletePhraseList.length; j++){
				TargetText = TargetText.replaceAll(DeletePhraseList[j], "");
			}
			for(int j=0; j<DeleteSymbolList.length; j++){
				TargetText = TargetText.replaceAll(DeleteSymbolList[j], "");
			}


//			//�̌�����<Country>
//			for(int j=0; j<BloodingCountryList.size(); j++){
//				TargetText = TargetText.replaceAll(BloodingCountryList.get(j), "<Country>");
//			}
//			//�̌��敪��<BloodingMethod>
//			for(int j=0; j<BloodingMethodList.size(); j++){
//				TargetText = TargetText.replaceAll(BloodingMethodList.get(j), "<BloodingMethod>");
//			}


			//Step.11
			//��؂蕶���̍폜
			TargetText = TargetText.replaceAll("�A", "");
			TargetText = TargetText.replaceAll("�B", "");
			TargetText = TargetText.replaceAll("�C", "");
			TargetText = TargetText.replaceAll("�E", "");
			TargetText = TargetText.replaceAll("����", "");
			TargetText = TargetText.replaceAll("�@", "");

			//�Y��������
			int index;

			if((index = TargetText.indexOf("<Number><Unit>�Y����")) != -1){
				TargetText = TargetText.substring(0, index+14);
			}
			if((index = TargetText.indexOf("<Number><Unit>���̓Y����")) != -1){
				TargetText = TargetText.substring(0, index);
			}
			if((index = TargetText.indexOf("<Number><Unit>���Y����")) != -1){
				TargetText = TargetText.substring(0, index);
			}
			if((index = TargetText.indexOf("�c�i�Y�����j")) != -1){
				TargetText = TargetText.substring(0, index);
			}
			if((index = TargetText.indexOf("�i�Y�����j")) != -1){
				TargetText = TargetText.substring(0, index);
			}


			TargetText = TargetText.replaceAll("^���a�q��", "");
			TargetText = TargetText.replaceAll("���a�q��$", "");
			TargetText = TargetText.replaceAll("^�����a�q����", "");
			TargetText = TargetText.replaceAll("�����a�q����$", "");


			if(!(TargetText.length()==0) && TargetText.indexOf("��")==TargetText.length()-1){
				TargetText = TargetText.substring(0, TargetText.length()-1);
			}

			//�^�O(<aaa>)�����x��([aaa])�ɒu��
			TargetText = TargetText.replaceAll("<", "[");
			TargetText = TargetText.replaceAll(">", "]");

			//�����a�q�����⁃�a�q���𔼊p��
			TargetText = TargetText.replaceAll("�����a�q����", "<<BR>>");
			TargetText = TargetText.replaceAll("���a�q��", "<BR>");



			//�o�͗p�Ɋi�[
			ReplacementAfterTextArray.add(TargetYJ + "\t" + TargetText);

			if(i%1000==0){
				System.out.println(i+":�I��");
			}
		}
	}



	/**
	 * �������̑傫�����ɕ��ёւ���
	 * @param �Ώە����z��
	 * @return ���ёւ��ςݕ����z��
	 */
	public ArrayList<String> LengthSort(ArrayList<String> TargetArray){

		int size = TargetArray.size();
		//�o�u���\�[�g
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
	 * ���x���쐬���̕s�v�����T���E�폜�p\n
	 * �Y�������̕s�v���ɑ΂��āA�c���<BR>�����܂ł��폜���邽�߂ɁA���̕�����T�����ĕ�����������쐬���A�폜
	 * @param �폜�Ώ�TEXT, �s�v���J�nIndex
	 * @return �s�v�����폜�ς�TEXT
	 */
	private String SearchDeletePart(String TargetText, int fromindex){
		int lastindex;

		//�Y�������̍Ō��T��
		//�Y��������T�� +2�ƂȂ��Ă���̂͊J�n�����ƏI���̕�������v�����Ȃ�����
		if((lastindex = TargetText.indexOf("�����a�q����", fromindex+2)) != -1){
			//�����a�q�������폜���邽�߂ɒ���
			lastindex += 5;
		}
		//������Ȃ�������A�Ώی��ȍ~��S�č폜���邽�߂ɁA��ԍŌ��Index�ԍ����擾
		else{
			lastindex = TargetText.length();
		}

		//�폜�����̕�������擾
		String S = TargetText.substring(fromindex, lastindex);

		//�폜
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
