package jouken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prac4_9 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("整数を10回入力してください");
		int number, maxNum = 0, minNum = 0;

		for (int i = 0; i < 10; i++) {
			number = Integer.parseInt(br.readLine());
			//最初の入力値を最小値・最大値に代入
			if(i == 0) {
				maxNum = number; minNum = number;
			} else {
				//最大値,最小値を更新
				if(number > maxNum) {
					maxNum = number;
				} else if (number < minNum) {
					minNum = number;
				}
			}
		}
		System.out.println("最大値：" + maxNum + "最小値：" + minNum);
	}
}