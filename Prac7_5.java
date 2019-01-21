package jouken;

//CoinCaseクラスの利用
public class Prac7_5 {

	public static void main(String[] args) throws Exception {
//時間短縮の為標準入力から値を受け取らず値を直書きする
//		Scanner sc = new Scanner(System.in);
		CoinCase cc = new CoinCase();

		cc.AddCoins(500, 1);
		cc.AddCoins(100, 3);
		cc.AddCoins(50, 1);
		cc.AddCoins(10, 4);
		cc.AddCoins(5, 1);
		cc.AddCoins(1, 3);
		cc.AddCoins(100000, 1); //弾かれテスト
		cc.AddCoins(10, 7);
		cc.AddCoins(100, 3);
		cc.AddCoins(500, 1);

		System.out.println("500円玉の枚数：" + cc.GetCount(500));
		System.out.println("100円玉の枚数：" + cc.GetCount(100));
		System.out.println("50円玉の枚数：" + cc.GetCount(50));
		System.out.println("10円玉の枚数：" + cc.GetCount(10));
		System.out.println("5円玉の枚数：" + cc.GetCount(5));
		System.out.println("1円玉の枚数：" + cc.GetCount(1));
		System.out.println("100000円硬貨の枚数：" + cc.GetCount(100000));
		System.out.println("==============================");
		System.out.println("総額：" + cc.GetAmount());

	}
}
