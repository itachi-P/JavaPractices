package jouken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prac3_7{

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("名前１：");
		String name1 = br.readLine();
		System.out.print(name1 + "の点数：");
		int score1 = Integer.parseInt(br.readLine());

		System.out.print("名前２：");
		String name2 = br.readLine();
		System.out.print(name2 + "の点数：");
		int score2 = Integer.parseInt(br.readLine());

		if (score1 == score2) {
			System.out.println(name1 + "さんとは違う点数を入力してください：");
			System.out.print(name2 + "の点数：");
			score2 = Integer.parseInt(br.readLine());
		}

		if (score1 > score2) {
			System.out.println(name1 + "さんの勝ち");
		} else {
			System.out.println(name2 + "さんの勝ち");
		}
	}
}
