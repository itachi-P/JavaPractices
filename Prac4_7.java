package jouken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prac4_7 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("巨人・阪神戦の1回表から9回裏までの毎回の得点を入力してください");
		//int num[] = new int[10];
		int scoreYG, scoreHT, tScoreYG = 0, tScoreHT = 0;

		for (int i = 1; i < 10; i++) {
			//num[i] = Integer.parseInt(br.readLine());
			System.out.print(i + "回表、巨人の得点は？：");
			scoreYG = Integer.parseInt(br.readLine());
			tScoreYG += scoreYG;
			System.out.print(i + "回裏、阪神の得点は？；");
			scoreHT = Integer.parseInt(br.readLine());
			tScoreHT += scoreHT;

		}
		System.out.println("巨人：" + tScoreYG + "　阪神：" + tScoreHT);
		if (tScoreYG > tScoreHT) System.out.println("巨人軍の勝ちです…(ｹｯ)");
		else if (tScoreYG < tScoreHT) System.out.println("さすが我らの阪神タイガース快勝です！");
		else System.out.println("他球団ならともかく阪神・巨人戦に同点引き分けなど有り得ぬわ。");
	}
}