package textmanipulation.miniprosessing;

import java.util.ArrayList;
import java.util.HashSet;


/**
 * ������̃��X�g�̕��ёւ����s���N���X
 * @author Okuya
 *
 */
public class SortStringList {

	private ArrayList<String> TextList = null;

	/**
	 * �R���X�g���N�^(�����ɂ���ĕ����񃊃X�g���i�[)
	 */
	public SortStringList(ArrayList<String> TL){
		this.TextList = TL;

	}



	/**
	 * �������̑傫�����ɕ��ёւ���
	 */
	public void SortLong(){

		int size = TextList.size();
		//�o�u���\�[�g
		for(int i=0; i<size-1; i++){
			for(int j=size-1; j>0; j--){

				int Length01 = TextList.get(j-1).length();
				int Length02 = TextList.get(j).length();

				if(Length01<Length02){
					String Temp = TextList.get(j-1);
					TextList.set(j-1, TextList.get(j));
					TextList.set(j, Temp);
				}
			}
		}
	}

	/**
	 * �������̏��������ɕ��ёւ���
	 */
	public void SortShort(){

		int size = TextList.size();
		//�o�u���\�[�g
		for(int i=0; i<size-1; i++){
			for(int j=size-1; j>0; j--){

				int Length01 = TextList.get(j-1).length();
				int Length02 = TextList.get(j).length();

				if(Length01>Length02){
					String Temp = TextList.get(j-1);
					TextList.set(j-1, TextList.get(j));
					TextList.set(j, Temp);
				}
			}
		}
	}


	/**
	 * �e�L�X�g���X�g���������ɕ��ёւ���
	 */
	public void SortDictionary(){
		//�o�u���\�[�g�Ő���
		int size = TextList.size();
		//�o�u���\�[�g
		for(int j=0; j<size-1; j++){
			for(int k=size-1; k>0; k--){

				String S01 = TextList.get(k-1);
				String S02 = TextList.get(k);

				if(S01.compareTo(S02)>0){
					String Temp = S01;
					TextList.set(k-1, S02);
					TextList.set(k, Temp);

					String TempL = TextList.get(k-1);
					TextList.set(k-1, TextList.get(k));
					TextList.set(k, TempL);
				}
			}
		}
	}


	/**
	 * �d���f�[�^���폜����
	 */
	public void DeleteOverlappingData(){
		HashSet<String> Temp = new HashSet<String>(TextList);
		TextList = new ArrayList<String>(Temp);
	}



	/**
	 * Get
	 */
	public ArrayList<String> getTextList(){
		return this.TextList;
	}

}
