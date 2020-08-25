import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		s.useLocale(Locale.US);
		double entrada = s.nextDouble();
		int valor = (int) (entrada*100);
		
		int N100 = valor/10000;
		valor = valor%10000;
		int N50 = valor/5000;
		valor = valor%5000;
		int N20 = valor/2000;
		valor = valor%2000;
		int N10 = valor/1000;
		valor = valor%1000;
		int N5 = valor/500;
		valor = valor%500;
		int N2 = valor/200;
		valor = valor%200;
		int M100 = valor/100;
		valor = valor%100;
		int M50 = valor/50;
		valor = valor%50;
		int M25 = valor/25;
		valor = valor%25;
		int M10 = valor/10;
		valor = valor%10;
		int M5 = valor/5;
		valor = valor%5;
		
		System.out.println("NOTAS:");
		System.out.printf("%d nota(s) de R$ 100.00%n", N100);
		System.out.printf("%d nota(s) de R$ 50.00%n", N50);
		System.out.printf("%d nota(s) de R$ 20.00%n", N20);
		System.out.printf("%d nota(s) de R$ 10.00%n", N10);
		System.out.printf("%d nota(s) de R$ 5.00%n", N5);
		System.out.printf("%d nota(s) de R$ 2.00%n", N2);
		System.out.println("MOEDAS:");
		System.out.printf("%d moeda(s) de R$ 1.00%n", M100);
		System.out.printf("%d moeda(s) de R$ 0.50%n", M50);
		System.out.printf("%d moeda(s) de R$ 0.25%n", M25);
		System.out.printf("%d moeda(s) de R$ 0.10%n", M10);
		System.out.printf("%d moeda(s) de R$ 0.05%n", M5);
		System.out.printf("%d moeda(s) de R$ 0.01%n", valor);
		
		s.close();
	}

}
