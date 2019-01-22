package jouken;
//Cat,Dog2クラスの利用
public class Prac8_2 {

	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog2 dog = new Dog2();

		cat.Name = "タマ";
		cat.Age = 7;
		dog.Name = "ポチ";
		dog.Age = 12;

		cat.ShowProfile();
		dog.ShowProfile();
		cat.Sleep();
		dog.Run();

	}

}
