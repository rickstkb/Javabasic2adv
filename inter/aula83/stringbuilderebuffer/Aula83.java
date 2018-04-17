package inter.aula83.stringbuilderebuffer;

// Fazendo concatenacoes elegantes de strings no java
public class Aula83 {

	public static void main(String[] args) {

		// Vetor de strings ou caracteres
		String[] letras = {"B", "C", "D", "E", "F"};
		
		// Uma string vazia
		String alfabeto = "";
		
		// Maneira simples e ir concatenando em um laco/estrutura rept, prob de performance
		for (String letra : letras){
			alfabeto += letra;
		}

		System.out.println(alfabeto);
		
		
		// Juncao de varias strings com o objeto stringBuffer, pode passar um param inicial, etc
		StringBuffer sb = new StringBuffer();
		
		// Iterar o vetor que armazenada e da um append em cada letra, string do vetor
		for (String letra : letras){
			sb.append(letra);
		}
		
		// No final armazena na variavel 
		alfabeto = sb.toString();
		System.out.println(alfabeto);
		
		
		// Nesse caso a variavel aceita uma variavel como parametro
		alfabeto = new String(sb);
		System.out.println(alfabeto);
		
		// Invertendo caracteres da string concatenada
		System.out.println(sb.reverse());
		
		// Com o stringbuffer e possivel efetuar uma serie de manipulacoes na string
		
		
		// Nesse caso do builder, a diferenca e que o builder nao tem apoio no uso com threads podendo perder as manipulacoes 
		StringBuilder sb_ = new StringBuilder();
		for (String letra : letras){
			sb_.append(letra);
		}
		alfabeto = sb_.toString();
		
		System.out.println(alfabeto);
		
		// Suponha que tenha um vetor com mil elementos e precisa concatenar todos em uma string
		// Concatenando utilizando o string buffer ou builder
		// Um e thread safe e o outro nao
	}

}
