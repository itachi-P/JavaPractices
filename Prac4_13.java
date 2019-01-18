package jouken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prac4_13 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ストライクなら1,ボールなら2を入力してください");
		int num, strike = 0, ball = 0;

		while (strike < 3 && ball < 4) {
			System.out.println("ストライク=1 or ボール=2 ？");
			num = Integer.parseInt(br.readLine());
			if (num == 1) {
				strike++;
				System.out.println(strike);
			} else if (num == 2) {
				ball++;
				System.out.println(ball);
			} else {
				System.out.println("1か2以外が入力されました");
				continue;
			}
		}
		System.out.println(ball + "ボール," + strike + "ストライク");
	}
}