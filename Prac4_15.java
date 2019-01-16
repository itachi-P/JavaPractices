package jouken;

import java.util.Scanner;

public class Prac4_15 {

	public static void main(String[] args) {
		System.out.println("素因数分解\r\n2以上の整数値を入力してください：");
		Scanner num = new Scanner(System.in);

		int x = num.nextInt();

		for (int i = 2; i <= x; i++) {
			if (x % i == 0) {

				System.out.print(i);
				x /= i;
			}

		}
	}
}