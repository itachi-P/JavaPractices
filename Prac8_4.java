package jouken;

//Cat, Dog2共通スーパークラスの利用
public class Prac8_4 {

	public static void main(String[] args) {
		//スーパークラスの配列を用意し、そこにCatとDog2のインスタンスを生成
		Animal[] animal = new Animal[4];

		for (int i = 0; i < animal.length; i++) {
			if (i % 2 == 0) {
				animal[i] = new Cat();
			} else {
				animal[i] = new Dog2();
			}
			animal[i].Speak();
		}
	}

}