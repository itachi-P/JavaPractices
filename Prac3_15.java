package jouken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prac3_15 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("何月の日数が知りたい？：");
		int month =Integer.parseInt(br.readLine());

		switch (month) {
		case 1:
			System.out.println(month + "月：31日");
			break;
		case 2:
			System.out.println(month + "月：28日");
			break;
		case 3:
			System.out.println(month + "月：31日");
			break;
		case 4:
			System.out.println(month + "月：30日");
			break;
		case 5:
			System.out.println(month + "月：31日");
			break;
		case 6:
			System.out.println(month + "月：30日");
			break;
		case 7:
			System.out.println(month + "月：31日");
			break;
		case 8:
			System.out.println(month + "月：31日");
			break;
		case 9:
			System.out.println(month + "月：30日");
			break;
		case 10:
			System.out.println(month + "月：31日");
			break;
		case 11:
			System.out.println(month + "月：30日");
			break;
		case 12:
			System.out.println(month + "月：31日");
			break;
		default:
			System.out.println("入力が間違っています");
		}
	}

}
