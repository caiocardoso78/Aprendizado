import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		System.out.print("Digite nome, idade e altura de uma pessoa:");

		Scanner sc = new Scanner(System.in);

		String x;
		int y;
		double z;

		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();

		System.out.println("Os dados digitados foram:");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		sc.close();
		
	}

}
