package jouken;
//九九の指定の段を表示するメソッドの実装
public class Prac6_6 {

	public static void main(String[] args) {
		//九九表
		for (int i = 1; i < 10; i++) {
		kuku(i);
		}
	}
	//九九の特定の段を表示
	private static void kuku(int num) {
		for (int i = 1; i < 10; i++) {
			//1桁の数字は0埋めして表示位置合わせ
			System.out.print(String.format("%02d", num * i) + " ");
		}
		System.out.println();
	}
}