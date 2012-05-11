package textmanipulation;

import java.io.*;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


/**
 * �w�肵���L�q������Y�t����SGML����擾����N���X
 *
 * @author Okuya
 *
 */
public class XMLPart_Extraction {


	/**
	 * �擾�������͌Q
	 */
	private ArrayList<String> TextArray = new ArrayList<String>();

	/**
	 * �R���X�g���N�^
	 * ���s���Ɏ����I�Ƀ^�O���當�͌Q�𒊏o����TextArray�Ɋi�[
	 * @param ObjectFolder �Ώ�SGML�������Ă���t�H���_
	 * @param ObjectTagName �ΏۂƂȂ�^�O
	 */
	public XMLPart_Extraction(String ObjectFolder, String ObjectTagName){


		//�V�����t�H���_�̐���
		File NewFolder = new File(ObjectFolder + "/" + ObjectTagName);
		if(!NewFolder.exists()){
			NewFolder.mkdir();
		}

		//�t�@�C�����X�g�̍쐬
		File Folder = new File(ObjectFolder);
		File[] Files = Folder.listFiles();

		//Log
		ArrayList<String> Log = new ArrayList<String>();


		//�K�v�ȃ^�O�݂̂𒊏o���āA�V����TEXT�t�@�C���ɕۑ�
		for(int i=0; i<Files.length; i++){
			String[] Temp = Extraction(Files[i], ObjectTagName);

			if(Temp.length!=0){
				for(int j=0; j<Temp.length; j++){
					TextArray.add(Files[i].getName()+">>"+Temp[j]);
				}
			}
			else{
				Log.add(Files[i].getName());
			}
		}

		InOutFile.OutputText("NotCompositionLog.txt", "", Log);
	}

	/**
	 * SGML�̃^�O���w�肵�A���̕����̃e�L�X�g�f�[�^�𒊏o����
	 * @param �^�O�̎w��
	 * @return ����̋L�q�����̔z��
	 */
	public String[] Extraction(File FileName, String TagName){

		String[] TextList = {};

		try {
			//DOM����
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(FileName);


			//�w�肵���^�O�̎擾
			Element root = doc.getDocumentElement();
			Element TargetNode = (Element)root.getElementsByTagName(TagName).item(0);
			//�w�肵���^�O�̎q�m�[�h�W�����擾
			NodeList ItemNodeList = TargetNode.getElementsByTagName("item");
			NodeList DetailNodeList = TargetNode.getElementsByTagName("detail");

			//���g�̃^�O�𔻒肵�āA�e�L�X�g�f�[�^�𒊏o
			if(ItemNodeList.getLength() == 0 && DetailNodeList.getLength() == 0){
				NodeList NList = TargetNode.getChildNodes();
				int N = NList.getLength();
				TextList = new String[N];
				for(int i=0; i<N; i++){
					TextList[i] = NList.item(i).getTextContent();
				}
			}
			else if(ItemNodeList.getLength() == 0 && DetailNodeList.getLength() != 0){
				TextList = Detail(DetailNodeList);
			}
			else if(ItemNodeList.getLength() != 0 && DetailNodeList.getLength() == 0){
				TextList = Item(ItemNodeList);
			}
			else if(ItemNodeList.getLength() != 0 && DetailNodeList.getLength() != 0 && ItemNodeList.getLength() != DetailNodeList.getLength()){
				TextList = NotItemDetailLength(TargetNode);
			}
			else if(ItemNodeList.getLength() != 0 && DetailNodeList.getLength() != 0 && ItemNodeList.getLength() == DetailNodeList.getLength()){
				TextList = ItemDetail(ItemNodeList, DetailNodeList);
			}

		}
		catch (ParserConfigurationException e) {
			// TODO �����������ꂽ catch �u���b�N
			e.printStackTrace();
		}
		catch (SAXException e) {
			// TODO �����������ꂽ catch �u���b�N
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO �����������ꂽ catch �u���b�N
			e.printStackTrace();
		}
		catch(NullPointerException e){
			e.printStackTrace();

		}

		return TextList;
	}

	/**
	 * �q�̃^�O����item�^�O��detail�^�O���܂܂�Ă���ꍇ�A
	 * �����̃e�L�X�g�f�[�^��<BR>�^�O�Ō������ĕԂ�
	 * @param ItemNodeList, DetailNodeList
	 * @return ���������e�L�X�g�f�[�^�z��
	 */
	public String[] ItemDetail(NodeList ItemNodeList, NodeList DetailNodeList){


		int N = ItemNodeList.getLength();
		String[] ReturnTextList = new String[N];
		for(int i=0; i<N; i++){
			String ItemText = ItemNodeList.item(i).getTextContent();
			String DetailText = DetailNodeList.item(i).getTextContent();

			ReturnTextList[i] = ItemText + "<BR>" + DetailText;
		}

		return ReturnTextList;
	}

	/**
	 * �q�̃^�O��Detail�^�O�݂̂ł���ꍇ�A
	 * ����Ɋ܂܂�Ă���e�L�X�g�f�[�^�̔z���Ԃ�
	 * @param DetailNodeList
	 * @return �e�L�X�g�f�[�^�z��
	 */
	public String[] Detail(NodeList DetailNodeList){

		int N = DetailNodeList.getLength();
		String[] ReturnTextList = new String[N];
		for(int i=0; i<N; i++){
			ReturnTextList[i] = DetailNodeList.item(i).getTextContent();
		}
		return ReturnTextList;
	}

	/**
	 * �q�̃^�O��Item�^�O�݂̂ł���ꍇ�A
	 * ����Ɋ܂܂�Ă���e�L�X�g�f�[�^�̔z���Ԃ�
	 * @param DetailNodeList
	 * @return �e�L�X�g�f�[�^�z��
	 */
	public String[] Item(NodeList ItemNodeList){

		int N = ItemNodeList.getLength();
		String[] ReturnTextList = new String[N];
		for(int i=0; i<N; i++){
			ReturnTextList[i] = ItemNodeList.item(i).getTextContent();
		}
		return ReturnTextList;
	}

	/**
	 * �q�̃^�O��Item�^�O��Detail�^�O�̐�����v���Ȃ��Ƃ��ɁA
	 * ���ʂ��āA2�Ƃ�������̂��������ăe�L�X�g�f�[�^�̔z���Ԃ��B
	 * @param TargetNode
	 * @return �e�L�X�g�f�[�^�̔z��
	 */
	public String[] NotItemDetailLength(Element TargetNode){

		NodeList TargetNodeList = TargetNode.getChildNodes();
		ArrayList<String> ReturnTextList = new ArrayList<String>();
		for(int i=0; i<TargetNodeList.getLength(); i++){
			String Text = "";
			Node Target = TargetNodeList.item(i);
			if(Target.getNodeName().equals("detail")){
				if(i != 0){
					Node PreviousNode = TargetNodeList.item(i-1);
					if(PreviousNode.getNodeName().equals("item")){
						Text = PreviousNode.getTextContent() + "<BR>" + Target.getTextContent();
					}
					else{
						Text = Target.getTextContent();
					}
				}
				else{
					Text = Target.getTextContent();
				}
			}
			else if(!Target.getNodeName().equals("item")){
				Text = Target.getTextContent();
			}

			ReturnTextList.add(Text);

		}

		while(ReturnTextList.remove("")){

		}

		return (String[])ReturnTextList.toArray(new String[0]);

	}

	/**
	 * Get
	 */
	public ArrayList<String>getTextArray(){
		return TextArray;
	}



}
