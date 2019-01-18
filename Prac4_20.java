package jouken;

import java.util.Scanner;

//文字で三角形を描画
public class Prac4_20 {

	public static void main(String[] args) {
		System.out.print("サイズを入力してください：");
		int size = new Scanner(System.in).nextInt();

		//高さ・幅を表す変数の初期値は0でもいいが、この場合1の方がわかりやすい(配列を使う場合要注意)
		for (int height = 1; height <= size; height++) {
			for (int width = 1; width <= height; width++) {
				System.out.print("$");
			}
			System.out.println();
/*			改行の別の方法(環境に合わせて改行コードを取得する方法)
			String lineSepa = System.getProperty("line.separator");
			System.out.print(lineSepa); //lineSepaにはWindows環境の場合"\r\n"が入る(デバッグで確認可能)
*/
		}
	}
}