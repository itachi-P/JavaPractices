package jouken;

import java.util.Scanner;

public class Prac4_14_A {

	public static void main(String[] args) {
		System.out.println("素数判定プログラム\r\n整数値を入力してください：");
		Scanner num = new Scanner(System.in);

		while (true) {
			int x = num.nextInt();

			if (x == 1) {
				System.out.println(x + "は1でしか割り切れないので素数ではありません");
			} else if (x <= 0) {
				System.out.println(x + "は正の整数でないので素数ではありません");
			}

			for (int i = 2; i <= x; i++) {
				if (x % i == 0) {
					if (x == i) {
						System.out.println(x + "は素数です");
					} else {
						System.out.println(x + "は素数ではありません");
						break;
					}
				}

			}
		}
	}
}