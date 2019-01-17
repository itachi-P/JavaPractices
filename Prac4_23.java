package jouken;

//文字で"E"を描画
public class Prac4_23 {

	public static void main(String[] args) {

		for (int height = 1; height <= 5; height++) {
			if (height % 2 == 1) {
				System.out.print("*****");
			} else {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}