package jouken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prac3_6{

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("整数値を入力してください：");
		int x = Integer.parseInt(br.readLine());

		if (x >= 0) {
			if (x % 2 == 0) {
				System.out.println(x + "は正の偶数です");
			} else {
				System.out.println(x + "は正の奇数です");
			}
		} else {
			if (x % 2 == 0) {
				System.out.println(x + "は負の偶数です");
			} else {
				System.out.println(x + "は負の奇数です");
			}
		}
	}

}
