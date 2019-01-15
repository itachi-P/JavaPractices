package jouken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prac3_11 {

	public static void main(String[] args) throws IOException
	{
		//1～9の整数値入力
		System.out.print("1～9の間の整数値を入力してください：");
		int number = numberInput();

		//数値判定
		judgement(number);
	}

	private static int numberInput() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		if (number < 1 | number > 9) {
			System.out.println("数値は1～9の間で入力してください。");
			number = Integer.parseInt(br.readLine());
		}
		return number;
	}

	private static void judgement(int number) {
		/*	numberInputメソッド内で入力値は1～9に絞られているので下記でもよい。
		 if (number <= 3 | number >= 7) {
			System.out.println("当たり");
		}else {
			System.out.println("はずれ");
		}
		 */
		if (number >= 1 & number <= 3) {
			System.out.println("当たり");
		} else if (7 <= number & number <= 9) {
			System.out.println("当たり");
		}else {
			System.out.println("はずれ");
		}

	}

}