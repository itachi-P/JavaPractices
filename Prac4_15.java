package jouken;

import java.util.Scanner;

public class Prac4_15 {

	public static void main(String[] args) {
		System.out.println("素因数分解\r\n2以上の整数値を入力してください：");
		int x = new Scanner(System.in).nextInt();
		
		for (int i = 2; i <= x; i++) {
			if (x % i == 0) {
				//x(被除数)がi(除数)で割り切れる場合、その除数を順に表示
				System.out.print(i + " ");
				//その商を新たなxとして代入
				x /= i;
				//除数iを2に戻す ※ループの最初でインクリメント(i++)される点に注意
				i = 1;
			}
		}
	}
}