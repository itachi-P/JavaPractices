package jouken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prac4_8 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("自然数(正の整数)を10回入力してください");
		int number, maxNum = 0;

		for (int i = 0; i < 10; i++) {
			number = Integer.parseInt(br.readLine());
			//最大値を更新 ※numberが「正の整数」であるかはチェックしない
			if(number > maxNum) {
				maxNum = number;
			}
		}
		System.out.println("最大値：" + maxNum);
	}
}