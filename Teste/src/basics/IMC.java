package basics;
import java.util.Locale;
import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		
		//Scanner é uma classe do Java, fica no pacote java.util(Utilitários)
		//Criando um objeto de classe scanner, e atribuindo á variável entrada
		//Um objeto é uma entidade que contém funções que podem ser executadas
		Scanner entrada = new Scanner(System.in);
		//Para receber o double com . (separador entre casa decimal e ponto flutuante)
		entrada.useLocale(Locale.US);
		
		// nextDouble(); é uma função da classe Scanner
		// Ou seja, nextDouble() é uma função que pode ser executada a partir
		// de objetos criados a partir da classe Scanner
		System.out.println("Digite sua altura: ");
		double altura = entrada.nextDouble();
		System.out.println("Digite seu peso: ");
		double peso = entrada.nextDouble();
		
		double imc = peso / (altura*altura);
		
		if(imc < 16) {
			System.out.println("Magreza grave");
		}
		else if(imc < 17) {
			System.out.println("Magreza moderada");
		}
		else if(imc < 18.5) {
			System.out.println("Magreza leve");
		}
		else if(imc < 25) {
			System.out.println("Saudável");
		}
		else if(imc < 30) {
			System.out.println("Sobrepeso I");
		}
		else if(imc < 35) {
			System.out.println("Obesidade");
		}

		else if(imc < 40) {
			System.out.println("Obesidade I");
		}
		else if(imc > 40) {
			System.out.println("Obesidade II");
		}


		entrada.close();
	}

}
