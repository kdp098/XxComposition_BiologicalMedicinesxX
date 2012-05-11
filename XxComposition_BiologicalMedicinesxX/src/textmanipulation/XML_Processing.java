package textmanipulation;

import java.io.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XML_Processing {



	/**
	 * ���̃m�[�h�Ǝq�m�[�h�̑S�Ă�\��(�ŏ��ɌĂяo���Ƃ���0������)
	 * @param N
	 * @param IndentN
	 */
	public static void showSelfandChild(Node N, int IndentN){


		//�C���f���g�̐��𒲐����ĕ\��
		String IndentS = "";
		for(int i=0; i<IndentN; i++){
			IndentS += "\t";
		}
		System.out.print(IndentS);


		//nodeName���擾
		String Name = N.getNodeName();

		//�\��
		if(!Name.equals("#document") && !Name.equals("#text")){
			System.out.print("<" + Name);

			//�����̗L��
			if(N.hasAttributes()){
				NamedNodeMap NNM = N.getAttributes();
				for(int i=0; i<NNM.getLength(); i++){
					System.out.print(" " + NNM.item(i).getNodeName() + " = " + NNM.item(i).getNodeValue());
				}
			}

			System.out.print(">");
		}
		else if(Name.equals("#text")){
			System.out.println(N.getNodeValue());
		}


		//�q�m�[�h������΍ČĂяo��
		if(N.hasChildNodes()){
			System.out.println("");
			NodeList Nlist = N.getChildNodes();
			for(int i=0; i<Nlist.getLength(); i++){
				showSelfandChild(Nlist.item(i), IndentN+1);
			}
			System.out.print(IndentS);
		}


		//�I���^�O�̕\��
		if(!Name.equals("#document") && !Name.equals("#text")){
			System.out.println("</" + Name + ">");
		}
	}





	/**
	 * String��Document�ɕϊ�
	 * @param XMLString
	 * @return Document�N���X
	 */
	public static Document StringtoDocument(String XMLString){


		Document doc = null;
		try {
			DocumentBuilderFactory dbfactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docbuilder = dbfactory.newDocumentBuilder();
			doc = docbuilder.parse(new ByteArrayInputStream(XMLString.getBytes("UTF-8")));
		} catch (ParserConfigurationException e) {
			// TODO �����������ꂽ catch �u���b�N
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO �����������ꂽ catch �u���b�N
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO �����������ꂽ catch �u���b�N
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �����������ꂽ catch �u���b�N
			e.printStackTrace();
		}

		return doc;


	}







	/**
	 * Document�N���X�Ƃ��ēW�J���Ă���DOM��ۑ�
	 * @param SaveFileName
	 * @param XMLDocument
	 */
	public static void SaveXMLDocument(String SaveFileName, Document XMLDocument){

		try {
			TransformerFactory TF = TransformerFactory.newInstance();
			Transformer T = TF.newTransformer();

			File F = new File(SaveFileName);
			T.transform(new DOMSource(XMLDocument), new StreamResult(F));

			System.out.println("Success Save");

		} catch (TransformerConfigurationException e) {
			// TODO �����������ꂽ catch �u���b�N
			e.printStackTrace();
		} catch (TransformerException e) {
			// TODO �����������ꂽ catch �u���b�N
			e.printStackTrace();
		}
	}

	/**
	 * �ΏۂƂȂ�m�[�h�̎q�m�[�h�ɉ��s��C���f���g�݂̂��܂܂�Ă����炻�̎q�m�[�h���폜
	 * @param N
	 */
	public static void DeleteEmptyNode(Node N){

		//�q�m�[�h���擾
		NodeList NList = N.getChildNodes();
		for(int i=0; i<NList.getLength(); i++){

			Node ObjectNode = NList.item(i);
			//�m�[�h�̃^�C�v���e�L�X�g�̂Ƃ�
			if(ObjectNode.getNodeType()==3){

				String TextValue = ObjectNode.getNodeValue();

				//�q�m�[�h�̃e�L�X�g�����s�ƃC���f�b�N�X�݂̂Ȃ�폜
				if(TextValue.indexOf("\n") != -1){
					TextValue = TextValue.replaceAll("\n", "");
				}
				if(TextValue.indexOf("\t") != -1){
					TextValue = TextValue.replaceAll("\t", "");
				}
				//�폜
				if(TextValue.length()==0){
					N.removeChild(ObjectNode);
				}
			}
			//�q�m�[�h�̎q�m�[�h������΁A�����\�b�h���Ă�
			if(ObjectNode.hasChildNodes()){
				Delete_UnwantedTag(ObjectNode);
			}
		}
	}

	/**
	 * �Y�t�������̕s�v�ȗv�f�Ƃ��̒��g���폜
	 * @param N
	 */
	static public void Delete_UnwantedTag(Node N){


		//�s�v�v�f��
		String[] DeleteTagNames = {	"variablelabel", "serialno"};

		//�q�m�[�h���擾
		NodeList NList = N.getChildNodes();
		for(int i=0; i<NList.getLength(); i++){

			Node ObjectNode = NList.item(i);

			for(int j=0; j<DeleteTagNames.length; j++){

				//�q�m�[�h�̗v�f�����s�v�v�f���ł���΍폜
				if(ObjectNode.getNodeName().equals(DeleteTagNames[j])){
					N.removeChild(ObjectNode);
				}
				//�q�m�[�h�̎q�m�[�h������΁A�����\�b�h���Ă�
				else if(ObjectNode.hasChildNodes()){
					Delete_UnwantedTag(ObjectNode);
				}
			}
		}
	}



	/**
	 * �t�@�C�����������Ƃ��āAXML���͒��̉��s��C���f���g���Ȃ����O����(�V���ɍ쐬����XML�`���̃t�@�C���������^�[��)
	 * @param FileName
	 * @return
	 */
	public static String ReplaceProcessing(String FileName){

		//���������镶����̐ݒ�(�u���Ώ�:�u����̕���)
		String[] ReplaceString = {	"\n",	"",
									"\t",	""
		};



		String NewFileName = "";
		String[] Temp = FileName.split("/", -1);
		for(int i=0; i<Temp.length; i++){
			if(i!=Temp.length-1){
				NewFileName += Temp[i] + "/";
			}
			else{
				NewFileName += "New" + Temp[i];
			}
		}

		try {
			//XML�t�@�C���̓��o�͂̐ݒ�
			FileInputStream fis = new FileInputStream(FileName);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			FileOutputStream fos = new FileOutputStream(NewFileName);
			OutputStreamWriter osr = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osr);

			String temp;
			while((temp = br.readLine()) != null){

				//�u��
				for(int i=0; i<ReplaceString.length; i+=2){
					temp = temp.replaceAll(ReplaceString[i], ReplaceString[i+1]);
				}

				bw.write(temp);
			}

			//�N���[�Y
			bw.close();
			osr.close();
			fos.close();
			br.close();
			isr.close();
			fis.close();


		}
		catch (FileNotFoundException e) {
			// TODO �����������ꂽ catch �u���b�N
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO �����������ꂽ catch �u���b�N
			e.printStackTrace();
		}

		return NewFileName;


	}
	/**
	 * �t�H���_����XML���͂̉��s��C���f���g���Ȃ����A�V�����t�H���_�ɕۑ�
	 * @param FolderName
	 */
	public static void ReplaceProcessing_and_MakeFolder(String FolderName){

		//���������镶����̐ݒ�(�u���Ώ�:�u����̕���)
		String[] ReplaceString = {	"\n",	"",
									"\t",	"",
									"�@",	"",
									" ",	""

		};

		String NewFolderName = "ImprovementXML/";
		File NewFolder = new File(FolderName + NewFolderName);
		if(!NewFolder.exists()){
			NewFolder.mkdir();
		}


		File Folder = new File(FolderName);
		String[] FileNameList = Folder.list();

		for(int i=0; i<FileNameList.length; i++){
			String NewFileName = "";
			String[] Temp = FileNameList[i].split("/", -1);
			for(int j=0; j<Temp.length; j++){
				if(j!=Temp.length-1){
					NewFileName += Temp[j] + "/";
				}
				else{
					NewFileName += NewFolderName + "Improvement_" + Temp[j];
				}
			}

			try {
				//XML�t�@�C���̓��o�͂̐ݒ�
				FileInputStream fis = new FileInputStream(FolderName + FileNameList[i]);
				InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
				BufferedReader br = new BufferedReader(isr);
				FileOutputStream fos = new FileOutputStream(FolderName + NewFileName);
				OutputStreamWriter osr = new OutputStreamWriter(fos, "UTF-8");
				BufferedWriter bw = new BufferedWriter(osr);

				String temp;
				while((temp = br.readLine()) != null){

					//�u��
					for(int j=0; j<ReplaceString.length; j+=2){
						temp = temp.replaceAll(ReplaceString[j], ReplaceString[j+1]);
						if(j==ReplaceString.length-2){
							temp = temp.replaceAll("version", " version");
							temp = temp.replaceAll("encoding", " encoding");
							temp = temp.replaceAll("standalone", " standalone");
						}
					}

					bw.write(temp);
				}

				//�N���[�Y
				bw.close();
				osr.close();
				fos.close();
				br.close();
				isr.close();
				fis.close();


			}
			catch (FileNotFoundException e) {
				// TODO �����������ꂽ catch �u���b�N
				e.printStackTrace();
			}
			catch (IOException e) {
				// TODO �����������ꂽ catch �u���b�N
				e.printStackTrace();
			}
		}



	}

}
