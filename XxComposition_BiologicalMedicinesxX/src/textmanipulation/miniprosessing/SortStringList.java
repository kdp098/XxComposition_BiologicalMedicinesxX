package textmanipulation.miniprosessing;

import java.util.ArrayList;
import java.util.HashSet;


/**
 * 文字列のリストの並び替えを行うクラス
 * @author Okuya
 *
 */
public class SortStringList {

	private ArrayList<String> TextList = null;

	/**
	 * コンストラクタ(引数によって文字列リストを格納)
	 */
	public SortStringList(ArrayList<String> TL){
		this.TextList = TL;

	}



	/**
	 * 文字長の大きい順に並び替える
	 */
	public void SortLong(){

		int size = TextList.size();
		//バブルソート
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
	 * 文字長の小さい順に並び替える
	 */
	public void SortShort(){

		int size = TextList.size();
		//バブルソート
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
	 * テキストリストを辞書順に並び替える
	 */
	public void SortDictionary(){
		//バブルソートで整列
		int size = TextList.size();
		//バブルソート
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
	 * 重複データを削除する
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
