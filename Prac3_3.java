package jouken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prac3_3 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("整数値１：");
		int x = Integer.parseInt(br.readLine());
		System.out.print("整数値２：");
		int y = Integer.parseInt(br.readLine());

		if (x > y) {
			System.out.println(x + "は" + y +"より大きい");
		} else if (x < y) {
			System.out.println(x + "は" + y + "より小さい");
		}

	}

}
