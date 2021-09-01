import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com a largura do terreno:");
		double b = sc.nextDouble();

		System.out.println("Entre com o comprimento do terreno:");
		double h = sc.nextDouble();

		System.out.println("Entre com o valor do metro quadrado");
		double valor = sc.nextDouble();

		double area = b * h;
		double preco = area * valor;

		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);

		sc.close();

	}

}
