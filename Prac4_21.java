package jouken;

import java.util.Scanner;

//文字で逆三角形を描画
public class Prac4_21 {

	public static void main(String[] args) {
		System.out.print("サイズを入力してください：");
		int size = new Scanner(System.in).nextInt();
		//環境に合わせて改行コードを取得
		String lineSepa = System.getProperty("line.separator");

		for (int height = 0; height < size; height++) {
			for (int width = size - height; width > 0; width--) {
				System.out.print("$");
			}
			System.out.print(lineSepa); //lineSepaにはWindows環境の場合"\r\n"が入る(デバッグで確認可能)
		}
	}
}