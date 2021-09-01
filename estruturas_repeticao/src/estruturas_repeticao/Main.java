/* Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não*/

package estruturas_repeticao;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com um número inteiro: ");
		int x = sc.nextInt();
		
		if (x >= 0) {
			System.out.print("O numero é positivo");
		}
		else
			System.out.print("O numero é negativo");
		
		sc.close();

	}

}
