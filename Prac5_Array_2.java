package jouken;

//配列内の要素を逆順で表示
public class Prac5_Array_2 {

	public static void main(String[] args) {
		int num[] = {1,2,3,4,5,6,7,8,9,10};

		//配列要素の取り出し(逆順)
		for (int i = num.length -1; i >= 0; i--) {
			System.out.print(num[i] + " ");
		}

	}
}
