package basics;

public class MainPessoa {
	
	public static void main(String[] args) {
		
		char sexo = 'm';
		int idade = 18;
		String nome = "Samuel";
		double peso = 65.3;
		double altura = 1.70;
		String cpf = "10948029480";

		Pessoa p1 = new Pessoa(sexo, idade, nome, peso, altura, cpf);
		
		p1.calculaIMC();
	}

}
