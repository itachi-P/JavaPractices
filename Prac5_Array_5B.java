package jouken;

//昇順ソートだけならArraysクラスだけでいい
import java.util.Arrays;
/* 降順ソートをする場合はArraysに加えてCorrectionsクラスが必要 */
import java.util.Collections;	//※1
import java.util.Scanner;

public class Prac5_Array_5B {

	public static void main(String[] args) {
		System.out.println("整数を10回入力してください：");
		Scanner sc = new Scanner(System.in);

/* 2.Collectionsクラスを使う場合、配列にはInteger型などのクラス型を指定 */
		Integer num[] = new Integer[10];	//※2
		//int型などのプリミティブ型を指定するとエラーが発生
		//int num[] = new int[10];

		for (int i = 0; i < 10; i++) {
		num[i] = sc.nextInt();
		}

/* 3.降順に並び替え(昇順と比べ、※1～3の変更が必要なので要注意) */
		Arrays.sort(num, Collections.reverseOrder());		//※3

		for (int j = 0; j < 10; j++) {
		System.out.print(num[j] + " ");
		}
	}
}