package jouken;

public class Prac4_16A {
	public static void main (String args[]) {
		for (int X = 1; X < 10; X++) {
			for (int Y = 1; Y < 10; Y++) {
				System.out.print(X * Y + "  ");
				if (digits(X * Y) == 1) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
//	RubyやPHPのようなスクリプト言語と比べ基本的にjavaの文字列変換は処理が重い
	public static int digits(int num) {
		int digits = 0;
		//入力された数値をintから文字列変換する
		String strNum;
		//パターンA (最も記述が速く楽)
		strNum = "" + num;
		//下記パターンB,Cでも同じ
//		strNum = Integer.toString(num);
//		strNum = String.valueOf(num);

		//文字列化された数値の桁数を取得
		digits = strNum.length();
		return digits;
	}

}
