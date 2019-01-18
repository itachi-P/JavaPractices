package jouken;

//コマンドライン引数で与えられた文字列からバナー(?)作成プログラム
public class Prac6_8 {

	public static void main(String[] args) {
		Banner(args[0]);
	}

	//文字列包囲メソッド
	private static void Banner(String str) {
		for (int h = 1; h <= 3; h++) {
			if (h == 2) {
				System.out.print("+ " + str + " +");
			} else {
				for (int i = 0; i < str.length() + 4; i++) {
					System.out.print("+");
				}
			}
			System.out.println();
		}
	}
}