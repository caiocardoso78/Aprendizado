/*Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.*/


package estruturas_repeticao;

import java.util.Scanner;

public class par_impar {

	public static void main(String[] args) {
	

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com um número inteiro: ");
		int x = sc.nextInt();
		
		if (x % 2 == 0) {
			System.out.print("O numero é PAR");
		}
		else
			System.out.print("O numero é IMPAR");
		
		sc.close();

	}

}
