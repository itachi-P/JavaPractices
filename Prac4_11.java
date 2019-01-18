package jouken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prac4_11 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("何個？");
		int num = Integer.parseInt(br.readLine());
		int count = 0;

		for (int i = 0; i < num; i++) {
			System.out.print(count);
			count++;
			if (count > 9) {
				count = 0;
			}
		}
	}
}
