package jouken;

import java.util.Scanner;

//文字で四角形を描画
public class Prac4_19 {

	public static void main(String[] args) {
		System.out.print("サイズを入力してください：");
		int size = new Scanner(System.in).nextInt();

		for (int i = 0; i < size; i++) {
			System.out.println("$$$$");
		}
	}
}