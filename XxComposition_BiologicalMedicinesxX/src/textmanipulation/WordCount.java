package textmanipulation;

import java.util.ArrayList;



/**
 * �����W�v����N���X
 */
public class WordCount {


	private ArrayList<String> WordList = new ArrayList<String>();
	private ArrayList<Integer> CountList = new ArrayList<Integer>();

	/**
	 * �����W�v����CountList�Ɋi�[����R���X�g���N�^
	 */
	public WordCount(ArrayList<String> AllWordList){

		//�W�v
		for(int i=0; i<AllWordList.size(); i++){

			String TargetWord = AllWordList.get(i);
			int Index;
			//���ɂ���p�^�[��
			if((Index = WordList.indexOf(TargetWord)) != -1){
				CountList.set(Index, CountList.get(Index) + 1);
			}
			//�܂������p�^�[��
			else{
				WordList.add(TargetWord);
				CountList.add(1);
			}
		}
	}

	/**
	 * �W�v���ʂ������ɂ���
	 */
	public void Asc(){

		int size = WordList.size();
		//�o�u���\�[�g
		for(int i=0; i<size-1; i++){
			for(int j=size-1; j>0; j--){

				int Count01 = CountList.get(j-1);
				int Count02 = CountList.get(j);

				if(Count01>Count02){

					CountList.set(j-1, Count02);
					CountList.set(j, Count01);

					String Temp = WordList.get(j-1);
					WordList.set(j-1, WordList.get(j));
					WordList.set(j, Temp);
				}
			}
		}
	}

	/**
	 * �W�v���ʂ��~���ɂ���
	 */
	public void Desc(){

		int size = WordList.size();
		//�o�u���\�[�g
		for(int i=0; i<size-1; i++){
			for(int j=size-1; j>0; j--){

				int Count01 = CountList.get(j-1);
				int Count02 = CountList.get(j);

				if(Count01<Count02){

					CountList.set(j-1, Count02);
					CountList.set(j, Count01);

					String Temp = WordList.get(j-1);
					WordList.set(j-1, WordList.get(j));
					WordList.set(j, Temp);
				}
			}
		}
	}


	/**
	 * �W�v���ʂ�CSV�`���ɂ��ĕԂ�
	 * @return CSV�`����String�z��<br>ReturnList
	 */
	public ArrayList<String> getWordCount(){

		ArrayList<String> ReturnList = new ArrayList<String>();

		for(int i=0; i<WordList.size(); i++){
			ReturnList.add(WordList.get(i) + "," + CountList.get(i));
		}

		return ReturnList;
	}
}
