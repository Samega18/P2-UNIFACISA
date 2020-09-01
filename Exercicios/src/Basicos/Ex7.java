package Basicos;
import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		int soma = 0;
		int div = 0;
		int x = 0;
		
		System.out.println("Vamos saber a media de numeros pares, programa encerra com valor 100");
		System.out.println("digite os números:");
		
		while(x != 100){
			
			x = s.nextInt();
			
			if(x > 0 && x%2 == 0 && x != 100) {
				soma += x;
				div++;
			}
		}
		
		int media = soma/div;
		
		System.out.printf("O resultado da média é: %d", media);
		
		s.close();
	}

}
