/*Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1, o
c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago.*/

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Entre com o c�digo da peca 1 ");
		
		int cod = sc.nextInt();
		
		System.out.print("Entre com a quantidade de pecas 1 ");
		int quant = sc.nextInt();
		
		System.out.print("Entre com o valor da peca 1 ");
		double val = sc.nextDouble();
		
		
		System.out.print("Entre com o c�digo da peca 2 ");
		
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
