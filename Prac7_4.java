package jouken;
//Dogクラスの利用
public class Prac7_4 {

	public static void main(String[] args) {
		Dog dog1 = new Dog();
		Dog dog2 = new Dog("柴犬");
		
		dog1.SetName("にんじゃわんこ");
		dog1.SetAge(3);
		dog2.SetName("タロウ");
		dog2.SetAge(12);
		
		dog1.ShowProfile();
		dog2.ShowProfile();
	}
}
