package basics;

class Pessoa {
	
	char sexo;
	int idade;
	String nome;
	double peso, altura;
	String cpf;
	
	// Construtor default
	// Construtor sem argumentos
	// Se a gente não especifica, a JVM, automaticamente injeta o construtor default na classe em nosso código
	Pessoa(char s, int i, String n, double p, double a, String c){
		sexo = s;
		idade = i;
		nome = n;
		peso = p; 
		altura = a;
		cpf = c;
	}
	
	void calculaIMC() {
		
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
		else if(imc >= 40) {
			System.out.println("Obesidade II");
		}
		
	}

}
