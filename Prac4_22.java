package jouken;

import java.util.Scanner;

//文字で中抜き四角形□を描画
public class Prac4_22 {

	public static void main(String[] args) {
		System.out.print("サイズを入力してください：");
		int size = new Scanner(System.in).nextInt();

		for (int height = 1; height <= size; height++) {
			for (int width = 1; width <= size; width++) {
				if (height > 1 && height < size && width > 1 && width < size) {
					System.out.print(" ");
					continue;
				}
				System.out.print("$");
			}
			System.out.println();
		}
	}
}