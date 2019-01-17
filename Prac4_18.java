package jouken;

import java.util.Scanner;

public class Prac4_18 {

	public static void main(String[] args) {
		//平均値を求めるのでintでなくdouble
		double totalNum = 0;
		System.out.println("整数値を繰り返し入力してください\r\n0を入力すると平均値を表示し終了します");

		//0が入力されたらBreak;で抜ける無限ループ
		for (int i = 1; true; i++) {
			int num = new Scanner(System.in).nextInt();

			if (num == 0) {
				//入力回数をリセット(平均値計算の除数カウンターに含めない)
				i -= 1;
				if (i == 0) {
					System.out.println("少なくとも1回は0以外の整数を入力してください");
					continue;
				}
				System.out.println("平均値：" + totalNum / i);
				break;
			}
			totalNum += num;
		}

	}

}