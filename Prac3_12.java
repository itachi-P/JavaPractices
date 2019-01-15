package jouken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prac3_12 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("鮨占い");
		System.out.println("<゜)))彡　くコ:彡　<゜)))彡　くコ:彡　<゜)))彡　くコ:彡");
		System.out.println("お好きなネタを数字で選んでくだせえ");
		String sushiNeta = "1:まぐろ 2:えび 3:こはだ 4:はまち 5:かんぱち 6:のどぐろ";
		System.out.print(sushiNeta);
		int answerNo =Integer.parseInt(br.readLine());

		switch (answerNo) {
		case 1:
			System.out.println("受け身な方ですね");
			break;
		case 2:
			System.out.println("活発な人ですね");
			break;
		case 3:
			System.out.println("渋いっすね");
			break;
		case 4:
			System.out.println("…普通？");
			break;
		case 5:
			System.out.println("イケてますね");
			break;
		case 6:
			System.out.println("高級志向ですね");
			break;
		default:
			System.out.println("1～6で選んでください");

		}
	}
}
