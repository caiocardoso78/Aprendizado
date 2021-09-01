/* Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.*/


import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o valor do raio do circulo: ");
		
		double r = sc.nextDouble();
		
		double pi = 3.14159;
				
		double area = (r * r) * pi;
		
		System.out.printf("O valor da area do circulo eh: %.4f%n" , area);	
		
		
		sc.close();

	}

}
