package jouken;
//小銭入れクラス
public class CoinCase {
	private int c500 = 0;
	private int c100 = 0;
	private int c50 = 0;
	private int c10 = 0;
	private int c5 = 0;
	private int c1 = 0;

	public void AddCoins(int type, int num) {

		switch (type) {
		case 500:
			c500 += num;
			break;
		case 100:
			c100 += num;
			break;
		case 50:
			c50 += num;
			break;
		case 10:
			c10 += num;
			break;
		case 5:
			c5 += num;
			break;
		case 1:
			c1 += num;
			break;
		default:
			System.out.println("500円以下の現存する硬貨で入力してください");
		}

	}
	public int GetCount(int type) {
		switch (type) {
		case 500:
			return c500;
		case 100:
			return c100;
		case 50:
			return c50;
		case 10:
			return c10;
		case 5:
			return c5;
		case 1:
			return c1;
		default:
			System.out.println("その額面の硬貨は存在しません");
			return 0;
		}
	}

	//引数なしで全ての効果の枚数を取得するオーバーロードメソッド
	public void GetCount() {
		System.out.println("500円玉の枚数：" + this.GetCount(500));
		System.out.println("100円玉の枚数：" + this.GetCount(100));
		System.out.println("50円玉の枚数：" + this.GetCount(50));
		System.out.println("10円玉の枚数：" + this.GetCount(10));
		System.out.println("5円玉の枚数：" + this.GetCount(5));
		System.out.println("1円玉の枚数：" + this.GetCount(1));
	}

	public int GetAmount() {
		return 500 * c500 + 100 * c100 + 50 * c50 + 10 * c10 + 5 * c5 + c1;
	}

	//引数で指定した種類の硬貨の総額を取得するオーバーロードメソッド
	public int GetAmount(int type) {
		switch (type) {
		case 500:
			return 500 * c500;
		case 100:
			return 100 * c100;
		case 50:
			return 50 * c50;
		case 10:
			return 10 * c10;
		case 5:
			return 5 * c5;
		case 1:
			return c1;
		default:
			return 0;
		}
	}
}