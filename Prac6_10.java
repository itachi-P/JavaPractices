package jouken;

//フィボナッチ数列を再帰的プログラミングで！
public class Prac6_10 {

	public static void main(String[] args) {
		int n1 = 11; int n2 = 20;
		System.out.println("フィボナッチ数列の" + n1 +"番目～" + n2 +"番目までの項");

		for (int i = n1; i <= n2; i++) {
			System.out.print(fibonacci(i));
			if (i < n2) {
				System.out.print(", ");
			}
		}
	}
	//フィボナッチ数列のn番目の項を返す再帰的(自己参照)メソッド
	private static int fibonacci(int num) {
		//最初の2つの項は0番目0, 1番目1で基本的にnum>=2の前提
		int a = 0; int b = 1;
		if (num == 0) {		//これが無いと延々自己参照し続けStackOverflowエラー発生
			return 0;
		} else if (num == 1) {
			return 1;
		} else {
//以下がnum=2になるまで計算保留のまま繰り返し呼び出され、引数0から遡行して計算される
			return fibonacci(num - 1) + fibonacci(num - 2);
		}
	}
}