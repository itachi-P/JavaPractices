package jouken;

//再帰的プログラミング
public class Prac6_9A {

	public static void main(String[] args) {
		System.out.println(factorial(6));
	}
	//最もシンプルな再帰的(自己参照)メソッド
	private static int factorial(int num) {
//再帰プログラミングでは遡りが有限回数で終了して値(や手続き)が定義されていないと無限ループに陥るので注意
//内部処理的にはn-1,n-2,n-3...と遡り、n=0に達した時に初めて計算が始まる→1(return 1)*1(n=1)*2(n=2)...)
		if (num == 0) {		//これが無いと延々自己参照し続けStackOverflowエラー発生
			return 1;
		} else {
		return num * factorial(num - 1);
		}
	}
}