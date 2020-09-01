package Basicos;
import java.util.Locale;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		s.useLocale(Locale.US);
		
		System.out.println("Vamos saber a média aritmética de 3 numeros");
		System.out.println("Digite o primeiro valor: ");
		float Val1 = s.nextFloat();
		System.out.println("Digite o segundo valor: ");
		float Val2 = s.nextFloat();
		System.out.println("Digite o terceiro valor: ");
		float Val3 = s.nextFloat();
		
		float media = (Val1 + Val2 + Val3)/3;
		
		System.out.printf("A média dos valores é %.1f", media);
		
		s.close();

	}

}
