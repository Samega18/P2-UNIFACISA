package Basicos;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Vamos saber os multiplos de 4 de algum intervalo");
		System.out.println("Digite o primeiro numero:");
		int Val1 = s.nextInt();
		System.out.println("Digite o segundo numero:");
		int Val2 = s.nextInt();
		
		s.close();
		
		int num = 0;
		int An = 0;
		int Ex = 0;
		
		for(num = 4; num < Val2; num += 4) {
			
			if(num > Val1) {
				
				if(An < 1) {
					System.out.println("Os multiplos são:");
					An++;
					Ex++;
				}
				
				System.out.println(num);
			}
			
		}
		
		if(Ex == 0 && num > Val1) {
			System.out.println("Não tem multiplos de 4 nesse intervalo");
		}

	}

}
