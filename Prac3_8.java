package jouken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prac3_8 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//スーパーの開店・閉店状態
		System.out.print("スーパーは開店していますか？ y/n");
		//boolean型の宣言はif文の外＆初期値設定必要
		boolean isSupermarketOpen = true;
		String answer = br.readLine();

		if (answer.equals("y")) {
			isSupermarketOpen = true;
		} else if (answer.equals("n")) {
			isSupermarketOpen = false;
		} else {
			System.out.println("yかnで答えてください");
			answer = br.readLine();
		}

		//スーパーの開店状態で分岐
		if (!isSupermarketOpen) {
			System.out.println("家に帰ります…");
		} else {
			System.out.print("りんごの値段は？：");
			int price1 = Integer.parseInt(br.readLine());
			System.out.print("みかんの値段は？：");
			int price2 = Integer.parseInt(br.readLine());

			if (price1 == price2) {
				System.out.println("りんごとは違う値段を入力してください：");
				price2 = Integer.parseInt(br.readLine());
			}

			if (price1 > price2) {
				System.out.println("みかんを買って帰ります");
			} else {
				System.out.println("りんごを買って帰ります");
			}
		}


	}
}
