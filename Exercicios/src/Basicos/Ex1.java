package Basicos;
import java.util.Locale;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		s.useLocale(Locale.US);
		
		System.out.println("Vamos saber qual o maior valor");
		System.out.println("Digite o primeiro valor: ");
		float Val1 = s.nextFloat();
		System.out.println("Digite o segundo valor: ");
		float Val2 = s.nextFloat();
		
		if(Val1 > Val2) {
			System.out.printf("Valor 1 é o maior(%.1f)", Val1);
		}
		
		else if(Val1 == Val2) {
			System.out.printf("Os dois tem o mesmo valor(%.1f)", Val1);
		}
		
		else {
			System.out.printf("Valor 2 é o maior(%.1f)", Val2);
		}
		
		s.close();
	}

}
