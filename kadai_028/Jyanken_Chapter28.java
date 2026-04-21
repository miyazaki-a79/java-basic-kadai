package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
	String [] myHand = {"r", "s", "p"};
	
	//自分のじゃんけんの手を入力する
	public String getMyChoice() {
		
		Scanner scanner = new Scanner(System.in);
		
		String myHands = "";
		
		while(true) {
		
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
			
			if(scanner.hasNext()) {
				myHands = scanner.next();
			}
		
			if(myHands.equals("r") || myHands.equals("s") || myHands.equals("p")) {
				break;
			}else {
				System.out.println("エラーです");
			}
		}
		return myHands;
		
	}
	
	//対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom() {
		int randomHands = (int)Math.floor(Math.random()*3);
		
		String yourHands = myHand[randomHands];
		
		return yourHands;
	}
	
	//じゃんけんを行う
	public void playGame() {
		
		HashMap<String, String> hashHands = new HashMap<String, String>();
		
		hashHands.put("r", "グー");
		hashHands.put("s", "チョキ");
		hashHands.put("p", "パー");
		
		String myChoice = getMyChoice();
		String yourChoice = getRandom();
		
		System.out.println("自分の手は" + hashHands.get(myChoice) + ",対戦相手の手は" + hashHands.get(yourChoice));
		
		if(myChoice.equals(yourChoice)) {
			System.out.println("あいこです");
		}else if
			(myChoice.equals("r") && yourChoice.equals("s") ||
			myChoice.equals("s") && yourChoice.equals("p") ||
			myChoice.equals("p") && yourChoice.equals("r")) {
			System.out.println("自分の勝ちです");
		}else{
			System.out.println("自分の負けです");
		}
	
	}
	
}

