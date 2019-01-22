package jouken;

import java.util.Scanner;

public class Prac6_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//forループで回すこともできるが「int型の変数x,y,zにそれぞれ数値を入力し」という問題文に忠実に
		System.out.print("x = ");
		int x = sc.nextInt();
		System.out.print("y = ");
		int y = sc.nextInt();
		System.out.print("z = ");
		int z = sc.nextInt();

		System.out.println("最大値:" + Bigger(z, Bigger(x, y)));
	}

	private static int Bigger(int a, int b) {
//Math.max()を使ってしまうとBiggerクラスを定義する意味がないのでゴリゴリ
		//return Math.max(a, b);

		int max;
		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		return max;
	}
}
