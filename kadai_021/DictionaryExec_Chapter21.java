package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[]args) {
		Dictionary_Chapter21 fruits = new Dictionary_Chapter21();
		
		fruits.addWords();
		
		String[] searchList = {"apple", "grape", "banana", "orange"};
		
		fruits.search(searchList);
	}
}
