package jouken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prac4_5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("整数を10回入力してください");
		//int num[] = new int[10];
		int num = 0;

		for (int i = 0; i < 10; i++) {
			//num[i] = Integer.parseInt(br.readLine());
			num += Integer.parseInt(br.readLine());
		}
		System.out.print("平均値は" + num / 10);
	}
}
