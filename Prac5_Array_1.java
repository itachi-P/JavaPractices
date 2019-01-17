package jouken;

import java.util.Scanner;

//配列内の各要素の値を2倍にして表示
public class Prac5_Array_1 {

	public static void main(String[] args) {
		System.out.println("数値を10回入力してください：");
		Scanner sc = new Scanner(System.in);
		int num[] = new int[10];

		for (int i = 0; i < 10; i++) {
			num[i] = sc.nextInt();
		}

//配列要素の取り出し
/*		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] * 2 + " ");
		}
*/
		//for-eachを使用
		for (int ans : num) {
			System.out.print(ans * 2 + " ");
		}
	}
}