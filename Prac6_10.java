package jouken;

//フィボナッチ数列を再帰的プログラミングで！
public class Prac6_10 {

	public static void main(String[] args) {
		System.out.println("フィボナッチ数列の11番目～20番目までの項：");
		for (int i = 11; i <= 20; i++) {
			System.out.print(fibonacci(i));
		}
	}
	//フィボナッチ数列のn番目の項を返す再帰的(自己参照)メソッド
	private static int fibonacci(int num) {
		if (num == 0) {		//これが無いと延々自己参照し続けStackOverflowエラー発生
			return 1;
		} else {
			return num * fibonacci(num - 1);
		}
	}
}