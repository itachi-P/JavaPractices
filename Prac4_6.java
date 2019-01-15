package jouken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prac4_6 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("0(負け)か1(勝ち)のどちらかを10回入力してください");
		//int num[] = new int[10];
		//if分岐よりも配列使って同じ要素の数を数えた方がスマートかも
		int num, win = 0, lose = 0;

		for (int i = 0; i < 10; i++) {
			//num[i] = Integer.parseInt(br.readLine());
			num = Integer.parseInt(br.readLine());
			if (num == 0) lose++;
			else if (num == 1) win++;
			else {
				System.out.println("0または1以外が入力されたので中断します");
				break;
			}
		}
		System.out.print("対戦成績 勝ち総数：" + win + "負け総数：" + lose);
	}
}
