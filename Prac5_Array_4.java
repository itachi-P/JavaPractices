package jouken;

import java.util.Scanner;

public class Prac5_Array_4 {

	public static void main(String[] args) {
		System.out.println("数値を10回入力してください：");
		Scanner sc = new Scanner(System.in);
		int num[] = new int[10];
		int total = 0;
//配列への入力回数を10回(インデックス0～最大9)として初期化
		int index = 9;

		for (int i = 0; i < 10; i++) {
			num[i] = sc.nextInt();
			total += num[i];
			if (total > 100) {
//入力10回以内で合計100を超えた時の入力回数(最大インデックス値)を保存
				index = i;
				break;
			}
		}

//100を超えた時点で配列の残りの空要素読み出しを中断(0を表示しない)
		for (int j = 0; j <= index; j++) {
		System.out.println(num[j]);
		}
	}
}