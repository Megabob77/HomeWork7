package Excercise2;

/*
Создайте перечислительный тип (enum) Animals,
 содержащий конструктор, который должен принимать целочисленное значение (возраст животного).
  Энум должен содержать перегруженный метод toString(),
   который должен возвращать название экземпляра и возраст животного.
 */
public class Animal {

	enum Animals {

		Giraffe(5), Lion(3),
		Rhinoceros(11), Hippopotamus(9);

		private int year;

		Animals(int year) {
			this.year = year;
		}

		@Override
		public String toString() {
			return "Animals{" +
					"year=" + year +
					'}';
		}

		public int year() {
			return year;
		}
	}

	public static void main(String[] args) {
		Animals myAnimal = Animals.Hippopotamus;
		System.out.println(Animals.Hippopotamus.toString());
	}
}

