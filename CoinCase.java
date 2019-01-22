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
			System.out.println(type + " エラー：500円玉以下の一般的な流通硬貨を指定してください");
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
//			下記のメッセージを表示するなら呼び出し側のmainの中で戻り値0の時if分岐する方がベター
//			System.out.println("その額面の硬貨は存在しません");
			return 0;
		}
	}

	//引数なしで全ての硬貨の総枚数を取得するオーバーロードメソッド
	public int GetCount() {
		return this.GetCount(500) + this.GetCount(100) + this.GetCount(50)
				+ this.GetCount(10) + this.GetCount(5) + this.GetCount(1);
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