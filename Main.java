/* Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o*/

package estruturas_repeticao;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com um n�mero inteiro: ");
		int x = sc.nextInt();
		
		if (x >= 0) {
			System.out.print("O numero � positivo");
		}
		else
			System.out.print("O numero � negativo");
		
		sc.close();

	}

}
