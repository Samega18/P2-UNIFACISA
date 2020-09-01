package Basicos;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int quant = 0;
		System.out.println("Vamos saber quantos números digitados são positivos e pares");
		System.out.println("digite 25 números:");
		
		for(int cont = 0; cont < 25; cont++){
			
			int x = s.nextInt();
			
			if(x > 0 && x%2 == 0) {
				quant++;
			}
		}
		
		System.out.printf("A quantidade de números é: %d", quant);
		
		s.close();
	}

}
