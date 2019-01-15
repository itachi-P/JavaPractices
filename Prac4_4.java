package jouken;

public class Prac4_4 {

	public static void main(String[] args) {
		System.out.println("7の倍数を延々表示するだけのプログラム");

		for (int i = 1; i <= 1000; i++) {
			System.out.print(7 * i + " ");
			if (i % 10 == 0) System.out.println();
		}
		System.out.print("もう充分でしょう…いつまでやらせるおつもりですか？私は疲れました。");
	}
}
