//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
//mensagem explicativa, conforme exemplos.


import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com o valor da primeira parcela: ");
		double parcela1 = sc.nextDouble();

		System.out.print("Entre com o valor da segunda parcela: ");
		double parcela2 = sc.nextDouble();

		double x = parcela1 + parcela2;

		System.out.printf("A soma doas parcelas eh: %.2f%n", x);
		
		sc.close();

	}

}
