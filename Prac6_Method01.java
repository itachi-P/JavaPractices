package jouken;

public class Prac6_Method01 {

	public static void main(String[] args) {
		int num = 5;
		System.out.println(Square(num));
	}

	private static int Square(int num) {
		//int ans = (int)Math.pow(num, 2);		まわりくどい、ここまで必要なし
		return num * num;
	}

}
