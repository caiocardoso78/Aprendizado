/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.*/

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Entre com o código da peca 1 ");
		
		int cod = sc.nextInt();
		
		System.out.print("Entre com a quantidade de pecas 1 ");
		int quant = sc.nextInt();
		
		System.out.print("Entre com o valor da peca 1 ");
		double val = sc.nextDouble();
		
		
		System.out.print("Entre com o código da peca 2 ");
		
		int cod2 = sc.nextInt();
		
		System.out.print("Entre com a quantidade de pecas 2 ");
		int quant2 = sc.nextInt();
		
		System.out.print("Entre com o valor da peca 2 ");
		double val2 = sc.nextDouble();
		
		
		
		
		double total = ((quant * val) + (quant2 * val2)) ;
	
		
		System.out.printf("O valor total eh: R$ %.2f%n" , total);	
		
		
		sc.close();

	}

}
