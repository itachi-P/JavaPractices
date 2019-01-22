package jouken;

//Cat,Dog2クラスの利用2
public class Prac8_3 {

	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog2 dog = new Dog2();

		cat.Name = "太郎丸";
		cat.Age = 13;
		dog.Name = "次郎丸";
		dog.Age = 10;

		cat.ShowProfile();
		dog.ShowProfile();
		cat.Speak();
		dog.Speak();

	}

}