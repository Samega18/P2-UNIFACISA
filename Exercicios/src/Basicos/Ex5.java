package Basicos;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int quant = 0;
		System.out.println("Vamos saber quantos n�meros digitados s�o positivos e pares");
		System.out.println("digite 25 n�meros:");
		
		for(int cont = 0; cont < 25; cont++){
			
			int x = s.nextInt();
			
			if(x > 0 && x%2 == 0) {
				quant++;
			}
		}
		
		System.out.printf("A quantidade de n�meros �: %d", quant);
		
		s.close();
	}

}
