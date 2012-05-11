package textmanipulation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


/**
 * �t�@�C�����o�͗p�̃N���X
 * @author Okuya
 */
public class InOutFile {


	/**
	 * �Ώۃt�@�C�����畡���s���͂��āAString�z��ŕԂ����\�b�h
	 * @param �ΏۂƂȂ�t�@�C����
	 * @return �Ώۃt�@�C�����̕�������i�[�����z��<br>
	 * TempList��String�^�z��
	 */
	public static ArrayList<String> InputTextFile(String TargetFileName){

		//�ꎞ�i�[�p
		ArrayList<String> TempList = new ArrayList<String>();
		try{
			//����
			FileInputStream	fis = new FileInputStream(TargetFileName);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);

			String Temp;
			while((Temp = br.readLine()) != null){
				TempList.add(Temp);
			}

			//�N���[�Y
			br.close();
			isr.close();
			fis.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}

		return TempList;
	}

	/**
	 * �Ώۃt�@�C�����畡���s���͂��A�w�肵�������ŕ��������������String�񎟌��z��ŕԂ����\�b�h
	 * @param �ΏۂƂȂ�t�@�C����, �����Ɏg������
	 * @return �Ώۃt�@�C�����̕�������i�[�����z��<br>
	 * TempList��String�^�񎟌��z��
	 */
	public static ArrayList<String[]> InputTextFilePlusSplit(String TargetFileName, String SplitString){

		//�ꎞ�i�[�p
		ArrayList<String[]> TempList = new ArrayList<String[]>();
		try{
			//����
			FileInputStream	fis = new FileInputStream(TargetFileName);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);

			String Temp;
			while((Temp = br.readLine()) != null){
				//����
				String[] SplitTemp = Temp.split(SplitString, -1);
				TempList.add(SplitTemp);
			}

			//�N���[�Y
			br.close();
			isr.close();
			fis.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}

		return TempList;
	}

	/**
	 * �Ώۃt�@�C�����畡���s���͂��āA����̃w�b�_�[�̕������String�z��ŕԂ����\�b�h(CSV��z��)
	 * @param �ΏۂƂȂ�t�@�C����,�ΏۂƂȂ�w�b�_�[
	 * @return �Ώۃt�@�C�����̕�������i�[�����z��<br>
	 * TempList<br>
	 */
	public static ArrayList<String> InputTextFileforHeader(String TargetFileName, String TargetHeader){


		//�Ώۃt�@�C������̓���
		ArrayList<String[]> StringList = InputTextFilePlusSplit(TargetFileName, ",");

		//Return�p�z��
		ArrayList<String> TempList = new ArrayList<String>();


		//�w�b�_�[�ԍ��̓���
		String[] Temp = StringList.get(0);
		int Index = -1;
		for(int i=0; i<Temp.length; i++){
			if(Temp[i].equals(TargetHeader)){
				Index = i;
				break;
			}
		}

		//Return�p�z��Ɋi�[
		for(int i=0; i<TempList.size()-1; i++){
			TempList.set(i, StringList.get(i+1)[Index]);
		}

		return TempList;
	}



	/**
	 * �Ώۃt�@�C����String�z����������݂��郁�\�b�h(�������񂾓��t�Ǝ��Ԃ��t�@�C�����̐擪�ɕt����)
	 * @param �ΏۂƂȂ�t�@�C����, �t�@�C�����i�[����Ă���t�H���_�ւ̃p�X, ��������String�^�z��
	 */
	public static void OutputText(String FileName, String Path, ArrayList<String> TargetArray){

		try{
			Date D = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd_HHmmss_");
			String DateS = sdf.format(D);


			//�o��
			FileOutputStream fos = new FileOutputStream(Path + DateS + FileName);
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);


			for(int i=0; i<TargetArray.size(); i++){

				bw.write(TargetArray.get(i));
				bw.newLine();

			}



			//�N���[�Y
			bw.close();
			osw.close();
			fos.close();


		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

}
