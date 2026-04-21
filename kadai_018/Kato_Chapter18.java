package kadai_018;

public abstract class Kato_Chapter18 {
	
	public String FamilyName = "加藤";	//姓を表す
	public String givenName;	//名を表す
	public String address = "東京都中野区〇×";	//住所を表す
	
	//共通の紹介を出力する
	public  void commonIntroduce(){
		System.out.println("名前は" + FamilyName + givenName + "です");
		System.out.println("住所は" + address + "です");
	}
	
	public abstract void setGivenName();
	
	//個別の紹介を出力する
	public abstract void eachIntroduce() ;
	
	//紹介を実行する
	public void execIntroduce(){
		commonIntroduce();
		eachIntroduce();
	}
}
