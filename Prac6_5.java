package jouken;
//指定の文字で三角形を描くメソッド作成
public class Prac6_5 {

	public static void main(String[] args) {
		TriangleDraw(3, '$');
		TriangleDraw(4, '*');
		TriangleDraw(5, '&');
	}

	private static void TriangleDraw(int size, char chr) {
		for (int height = 1; height <= size; height++) {
			for (int width = 1; width <= height; width++) {
				System.out.print(chr);
			}
			System.out.println();
		}
		//見えにくいので1つの三角形描画毎に空白行を追加
		System.out.println();
	}
}