/*Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar.*/


package estruturas_repeticao;

import java.util.Scanner;

public class par_impar {

	public static void main(String[] args) {
	

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com um n�mero inteiro: ");
		int x = sc.nextInt();
		
		if (x % 2 == 0) {
			System.out.print("O numero � PAR");
		}
		else
			System.out.print("O numero � IMPAR");
		
		sc.close();

	}

}
