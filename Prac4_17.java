package jouken;

import java.util.Scanner;

public class Prac4_17 {

	public static void main(String[] args) {
		int totalNum = 0;
		System.out.println("整数値を繰り返し入力してください\r\n0を入力すると合計値を表示し終了します");

		while (true) {
			int num = new Scanner(System.in).nextInt();

			if (num == 0) {
				System.out.println("合計：" + totalNum);
				break;
			}
			totalNum += num;
		}

	}

}