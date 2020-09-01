package Basicos;
import java.util.Locale;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		s.useLocale(Locale.US);
		
		System.out.println("Vamos saber o desconto de um produto");
		System.out.println("Digite o nome do produto:");
		String name = s.nextLine();
		System.out.println("Digite o preço do produto:");
		float valor = s.nextFloat();
		
		if(valor > 0 && valor < 100) {
			valor = valor - ((5*valor)/100);
		}
		
		else if(valor >= 100 && valor < 500) {
			valor = valor - ((10*valor)/100);
		}
		else if(valor >= 500) {
			valor = valor - ((15*valor)/100);
		}
		
		System.out.printf("Nome do produto: %s", name);
		System.out.printf("\nPreço com desconto: %.2f", valor);
		
		s.close();
	}

}
