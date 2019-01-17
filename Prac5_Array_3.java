package jouken;

import java.util.Scanner;

//配列内の要素を偶数と奇数に分けて表示
public class Prac5_Array_3 {

	public static void main(String[] args) {
		System.out.println("数値を10回入力してください：");
		Scanner sc = new Scanner(System.in);
		int num[] = new int[10];
//ArrayList等のListは使わず、あくまでも「配列」の練習として記述
		String evenNum = "", oddNum = "";

		for (int i = 0; i < 10; i++) {
			num[i] = sc.nextInt();
		}

//配列要素の取り出し(for-eachを使用)と偶数・奇数の分類
		for (int x : num) {
			if (x % 2 == 0) {
				evenNum += x + " ";
			} else {
				oddNum += x + " ";
			}
		}
		System.out.println("偶数：" + evenNum);
		System.out.println("奇数：" + oddNum);
	}
}