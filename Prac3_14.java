package jouken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prac3_14 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("何月の休日が知りたい？：");
		int month =Integer.parseInt(br.readLine());

		switch (month) {
		case 1:
			System.out.println(month + "月：元日、成人の日");
			break;
		case 2:
			System.out.println(month + "月：建国記念の日");
			break;
		case 3:
			System.out.println(month + "月：春分の日");
			break;
		case 4:
			System.out.println(month + "月：昭和の日");
			break;
		case 5:
			System.out.println(month + "月：憲法記念日、みどりの日、こどもの日");
			break;
		case 6:
			System.out.println(month + "月に国民の休日はありません");
			break;
		case 7:
			System.out.println(month + "月：海の日");
			break;
		case 8:
			System.out.println(month + "月に国民の休日はありません");
			break;
		case 9:
			System.out.println(month + "月：秋分の日");
			break;
		case 10:
			System.out.println(month + "月：体育の日");
			break;
		case 11:
			System.out.println(month + "月：文化の日、勤労感謝の日");
			break;
		case 12:
			System.out.println(month + "月：天皇誕生日");
			break;
		default:
			System.out.println("1～12の間で入力してください");
		}
	}

}
