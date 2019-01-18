package jouken;

import java.util.Arrays;
import java.util.Scanner;

//配列内の要素を並べ替え(素直に便利なArray.sortメソッドを利用)
public class Prac5_Array_5 {

	public static void main(String[] args) {
		System.out.println("整数を10回入力してください：");
		Scanner sc = new Scanner(System.in);
		int num[] = new int[10];

		for (int i = 0; i < 10; i++) {
		num[i] = sc.nextInt();
		}
		//昇順に並び替え
		Arrays.sort(num);
		//※降順にソートする場合はやや複雑→Prac5_Array_5B

		for (int j = 0; j < 10; j++) {
		System.out.print(num[j] + " ");
		}
	}
}