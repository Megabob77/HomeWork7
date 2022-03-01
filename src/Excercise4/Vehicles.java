package Excercise4;

import java.awt.*;

import static Excercise4.Vehicles.Vehicle.*;

/*
Создайте перечислительный тип (enum) Vehicles, содержащий конструктор,
 который должен принимать целочисленное значение (стоимость автомобиля).
  Энум должен содержать метод getColor(), который возвращает строку с цветом автомобиля,
   и  перегруженный метод toString(),
    который должен возвращать строку с названием экземпляра, цветом и стоимостью автомобиля.
 */
public class Vehicles {

	public enum Vehicle {
		Mercedes(10100, "Red"), BMW(12000, "Blu"), Opel(8000, "Roze");

		private final int prise;
		private String color;

		@Override
		public String toString() {
			return "Vehicle{" + " Mark " + name() + ": prise " +
					prise + ": color " + color +
					'}';
		}

		Vehicle(int prise, String color) {
			this.prise = prise;
			this.color = color;
			this.getColor();
		}

		private void getColor() {
		}
	}

	public static void main(String[] args) {
		Vehicle myVehicle = BMW;
		System.out.println(BMW.toString());
	}
}

