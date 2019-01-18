package jouken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prac4_14 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("素数判定プログラム\r\n4以上の整数を入力してください：");
		int num;
		boolean isPrimeNum;

		while (true) {
			isPrimeNum = true;
			num = Integer.parseInt(br.readLine());
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					System.out.println(num + "は素数ではありません");
					isPrimeNum = false;
					break;
				}
			}
			if (isPrimeNum) {
			System.out.println(num + "は素数です");
			}
		}
	}
}