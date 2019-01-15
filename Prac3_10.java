package jouken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prac3_10 {

	public static void main(String[] args) throws IOException
	{
		//試験結果入力
		System.out.print("中間試験の点数を入力してください：");
		int score1 = scoreInput();
		System.out.print("期末試験の点数を入力してください：");
		int score2 = scoreInput();

		//合否判定
		judgement(score1, score2);
	}

	public static int scoreInput() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int score = Integer.parseInt(br.readLine());
		if (score < 0 || score >100) {
			System.out.println("試験の点数は0～100点で入力してください。");
			score = Integer.parseInt(br.readLine());
		}
		return score;
	}

	public static void judgement(int score1, int score2) {
		if (score1 >= 60 & score2 >=60) {
			System.out.println("合格1");
		} else if (score1 + score2 >= 130) {
			System.out.println("合格2");
		}else if (score1 + score2 >= 100 && (score1 >= 90 | score2 >= 90)) {
				System.out.println("合格3");
		} else {
			System.out.println("不合格");
		}

	}

}