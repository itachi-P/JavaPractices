package jouken;

//CoinCaseクラスの利用2
public class Prac7_6 {

	public static void main(String[] args) throws Exception {
		CoinCase cc = new CoinCase();

		cc.AddCoins(500, 1);
		cc.AddCoins(100, 4);
		cc.AddCoins(50, 1);
		cc.AddCoins(10, 4);
		cc.AddCoins(5, 1);
		cc.AddCoins(1, 4);
		cc.AddCoins(100000, 1); //弾かれテスト
		cc.AddCoins(10, 9);
		cc.AddCoins(100, 2);
		cc.AddCoins(500, 2);

		System.out.println("500円玉の枚数：" + cc.GetCount(500) + " 小計：" + cc.GetAmount(500));
		System.out.println("100円玉の枚数：" + cc.GetCount(100) + " 小計：" + cc.GetAmount(100));
		System.out.println("50円玉の枚数：" + cc.GetCount(50) + " 小計：" + cc.GetAmount(50));
		System.out.println("10円玉の枚数：" + cc.GetCount(10) + " 小計：" + cc.GetAmount(10));
		System.out.println("5円玉の枚数：" + cc.GetCount(5) + " 小計：" + cc.GetAmount(5));
		System.out.println("1円玉の枚数：" + cc.GetCount(1) + " 小計：" + cc.GetAmount(1));
		//弾かれテスト※メソッドの中でエラーメッセージ返すと表示順が前後するので呼び出し側のmainの中でif分岐書いた方が良い
		System.out.println("**************************");
		System.out.println("各硬貨の総枚数：" + cc.GetCount());
		System.out.println("総額：" + cc.GetAmount());

	}
}
