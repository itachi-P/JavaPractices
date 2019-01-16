package jouken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prac4_12 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("整数を繰り返し入力してください");
		int number, totalNum = 0;

		while (totalNum < 100) {
			number = Integer.parseInt(br.readLine());
			totalNum += number;
		}
		System.out.println("合計値：" + totalNum);
	}
}