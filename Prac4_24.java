package jouken;

//フィボナッチ数列を表示
public class Prac4_24 {

	public static void main(String[] args) {

		int a = 0, b = 1, sum = 0;
		System.out.print(a + ", " + b);

		while (a + b <= 1000) {
			sum = a + b;
			System.out.print(", " + sum);
			a = b;
			b = sum;
		}
	}
}