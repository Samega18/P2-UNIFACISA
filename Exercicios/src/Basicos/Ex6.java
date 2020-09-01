package Basicos;
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int soma = 0;
		System.out.println("Vamos saber a soma dos multiplos de 3 digitados: ");
		System.out.println("digite 50 números:");
		
		for(int cont = 0; cont < 50; cont++){
			
			int x = s.nextInt();
			
			if(x > 2 && x%3 == 0) {
				soma += x;
			}
		}
		
		System.out.printf("O resultado da soma é: %d", soma);
		
		s.close();
	}

}
