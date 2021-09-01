import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		//Estrutura usada para entrada de dados pelo teclado.
		Scanner sc = new Scanner(System.in);
		//Nome
		System.out.print("Digite um nome:"); 
		String x;
		x = sc.next();
		System.out.println("Voce digitou: " + x);
		//Numero
		System.out.print("Digite um numero:"); 
		int y;
		y = sc.nextInt();
		System.out.println("Voce digitou: " + y);
		//numero ponto flutuante
		System.out.println("Digite um numero ponto flutuante: ");
		double z;
		z = sc.nextDouble();
		//usado para converter para o padrão americano usando "." e não ","
		
		System.out.println("Voce digitou: " + z);
		//usado para fechar a estrutura do scanner
		
		//primeira letra de uma palavra
		System.out.println("Digite uma palavra");
		char w;
		w = sc.next().charAt(0);
		System.out.println("Voce digitou: " + w);
		
		sc.close(); 
		
	}

}
