package jouken;

import java.util.Scanner;
// 配列の特定要素のインデックスを取得(ArrayListを使わずにゴリゴリ)
public class Prac5_Array_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int empNo[] = {1001, 1002, 1005, 1010, 1012,
						1013, 1015, 1020, 1021, 1022};
		String empName[] = {"鈴木", "井上", "山本", "田川", "田中",
							"松田", "木下", "上野", "岡本", "吉永"};
		System.out.print("社員番号を入力してください：");
		int inpNo = sc.nextInt();
		//入力された社員番号の有無
		boolean isExist = false;

		//Listを使わずに社員番号配列の中身を一周して探す方式
		for (int i = 0; i < empNo.length; i++) {
			if (inpNo == empNo[i]) {
				System.out.println(empName[i]);
				isExist = true;
			}
		}
		if (!isExist) {
			System.out.println("入力された番号の社員は存在しません");
		}
	}
}
