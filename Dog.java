package jouken;

public class Dog {
	private String Name;
	private int Age;
	private String Breed;

	Dog() {
		//引数を渡されないインスタンス生成に対しBreed=nullが返らないよう設定
		this.Breed = "不明";
	}

	Dog(String breed) {
		this.Breed = breed;
	}

	public void SetName(String nm) {
		Name = nm;
	}
	public void SetAge(int age) {
		Age = age;
	}

	public void ShowProfile() {
		System.out.println("犬種：" + Breed + " 名前：" + Name + " 年齢：" + Age);
	}
}