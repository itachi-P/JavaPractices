package jouken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prac3_2 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("整数値１：");
		int a = Integer.parseInt(br.readLine());
		System.out.print("整数値２：");
		int b = Integer.parseInt(br.readLine());

		if (a == b) {
			System.out.println("等しい。");
		}

	}

}
