package jouken;

public class Prac4_3 {

	public static void main(String[] args) {
		System.out.println("2の1乗から8乗までをただ表示するだけのプログラム");

		for (int i = 1; i <= 8; i++) {
			System.out.print((int)Math.pow(2, i) + " ");
		}
	}
}
