package jouken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prac3_9_3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("試験の点数を入力してください：");
		int score = Integer.parseInt(br.readLine());

		if (score < 0 || score >100) {
			System.out.println("エラーです。");
		} else if (score >= 80) {
			System.out.println("優");
		} else if (score < 80 && score >= 70) {
			System.out.println("良");
		} else if (score < 70 && score >= 60) {
			System.out.println("可");
		} else {
			System.out.println("不可");
		}

	}

}