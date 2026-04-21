package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {

	//英単語の辞書として機能するHashMapを宣言
	HashMap<String, String> dictionary = new HashMap<String, String>();
	
	public void addWords() {
		dictionary.put("apple", "りんご");
		dictionary.put("peach", "桃");
		dictionary.put("banana", "バナナ");
		dictionary.put("lemon", "レモン");
		dictionary.put("pear", "梨");
		dictionary.put("kiwi", "キウィ");
		dictionary.put("strawberry", "いちご");
		dictionary.put("grape", "ぶどう");
		dictionary.put("muscat", "マスカット");
		dictionary.put("cherry", "さくらんぼ");
	}
	
	public void search(String[] words) {
		for(String word : words) {
			
		if(dictionary.containsKey(word)) {
			System.out.println(word + "の意味は" + dictionary.get(word));
		}else {
			System.out.println(word + "は辞書に存在しません");
		}	
	}
	
	//10通りの英単語と意味を追加
	//String [][] words = {{"apple", "りんご"}, {"peach", "桃"}, {"banana", "バナナ"}, {"lemon", "レモン"}, {"pear", "梨"}, {"kiwi", "キウィ"}, {"strawberry", "いちご"}, {"grape", "ブドウ"}, {"muscat", "マスカット"}, {"cherry", "さくらんぼ"}};

	//for(int i =0; i > words.length; i++) {
		//dictionary.put(words[i][0], words[i][1]); 
	//} 
	
	//for(String key : dictionary.keySet()) {
		//String value = dictionary.get(key);
	
	
		//(key != null) {
			//System.out.println(key+ "の意味は" + value);
		
		//}else {
			//System.out.println(key + "は辞書に存在しません");
		//}
	///}
	
} }