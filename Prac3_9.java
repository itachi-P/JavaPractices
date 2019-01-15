package jouken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prac3_9 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("試験の点数を入力してください：");
		int score = Integer.parseInt(br.readLine());

		if (score < 0 || score >100) {
			System.out.println("エラーです。");
		}

		//以下にケース１～３の各処理を別クラスまたはメソッド呼び出しで記述可能
		//とりあえず今回は問題文通り？Prac3_9_1～3の３つのプログラムに分ける

	}

}