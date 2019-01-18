package jouken;
//素数表示プログラム
public class Prac6_7 {

	public static void main(String[] args) {
		for (int num = 10000; num < 10100; num++)
		if(isPrimeNumber(num)) {
			System.out.println(num);
		}
	}
	//素数判定メソッド
	private static boolean isPrimeNumber(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}