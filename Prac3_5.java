package jouken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prac3_5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("正の整数値を入力してください：");
		//とりあえずこの練習問題では例外処理までは考えない。
		//整数値以外を入力されるとエラー終了
		int x = Integer.parseInt(br.readLine());

		if (x % 2 == 0) {
			System.out.println(x + "は偶数です");
		} else {
			System.out.println(x + "は奇数です");
		}

	}

}
