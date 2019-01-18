package jouken;

//メソッドを再帰的に呼び出すことによって、引数で受け取った値の階乗(n!)を計算するメソッド作成プログラム
public class Prac6_9 {

	public static void main(String[] args) {
		int ans = 1;
		System.out.println(factorial(6, ans));

	}
	//自身を再帰的に呼び出すことで階乗を計算するメソッド…を1から自分の頭だけで考えてみた版
	//いちおう再帰的メソッドになってるが、本来もっとシンプルに書けるのでPrac6_9Aに書き直し
	private static int factorial(int num, int ans) {
		ans *= num;
		if (num > 1) {
			ans = factorial(num - 1, ans);
		}
		return ans;
	}
}