package jouken;
//二乗
public class Prac6_1 {

	public static void main(String[] args) {
		int num = 5;
		System.out.println(Square(num));
	}

	private static int Square(int num) {
		//int ans = (int)Math.pow(num, 2);	まわりくどい、ここまでは不要
		return num * num;
	}

}
