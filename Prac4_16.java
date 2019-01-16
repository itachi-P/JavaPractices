package jouken;

public class Prac4_16 {
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

	//桁数算出(10で割る方法バージョン)
	public static int digits(int num) {
		int digits = 0;

		//九九なので負の数への対応は考えない条件式で可
		while (num >= 1) {
			num /= 10;
			digits++;
		}
		return digits;
	}

}
