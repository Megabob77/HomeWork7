package Excercise1;

/**
 * Создать функциональный интерфейс ErrorPrinter с абстрактным методом printError,
 * принимающий строку error. Создайте на базе интерфейса ErrorPrinter анонимный класс,
 * реализующий метод printError.
 * printError принимает строку и выводит ее в консоль красным цветом.
 */
public class Printer {

	@FunctionalInterface
	public interface ErrorPrinter {


		public abstract void printError();
		String h = "error";

		static ErrorPrinter error = new ErrorPrinter() {
			@Override
			public void printError() {
				System.out.println("\033[31m"+(h));
			}
		};

		public static void main(String[] args) {
			error.printError();
		}
	}
}










