package mostra_valor_conta;

import java.util.Locale;
import java.util.Scanner;

public class valorconta {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com o codigo do pedido: ");
		

		int cod = sc.nextInt();

		System.out.print("Entre com a quantidade de lanches: ");
		
		int quant = sc.nextInt();
		
		double valor;
		
		if ( cod==1) {
			
			valor = (4 * quant);}
		
	
		else if (cod==2) {
			
			valor = (4.5 * quant);
		}	
		else if (cod==3) {
				
			valor = (5 * quant);
		}		
		else if (cod==4) {
				
			valor = (2 * quant);
		}
		else {
			valor = (1.5 * quant);		
			
		}	System.out.printf("O total a pagar eh: R$ %.2f%n", valor);	 
			
		sc.close();
		
		
	} 
			
	}

