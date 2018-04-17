package inter.aula62.varargs;

public class ExemploVarargs {
	
	// O varargs e um recurso da linguagem java, que permite passar inumeros parametros 
	// Pra um metodo, sem ter que declarar todos os parametros
	
	public static void main(String[] args) {

		System.out.println(soma(1, 2));
		System.out.println(soma(1, 2, 3));

		// Declarando um vetor e inicializando ele com valores
		// Depois imprimindo ele passando como referencia ao metodo chamado
		int[] vetor = {1, 2, 3, 4, 5};
		System.out.println(soma(vetor));
		
		// Nesse caso utilizando o varags chamo o metodo ja passando quantos parametros valores eu desejo
		System.out.println(soma(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

	}
	
	// Metodos de soma, respectivos parametros e retornos
	// Efetuando sobrecarga
	static int soma(int a, int b){
		return a + b;
	}

	static int soma(int a, int b, int c){
		return a + b + c;
	}

	// Nesse caso passando um vetor
	static int soma(int[] vetor){

		int total = 0;

		for (int i=0; i<vetor.length; i++){
			total += vetor[i];
		}

		return total;
	}

	// E possivel passar os valores como se fosse um vetor sem precisar declarar ele, passa direto para o metodo
	// Usando varargs costuma acontecer em situacoes que nao se sabe quantos valores o usuario vai passar
	// Cada tipo primitivo possui um equivalente em objeto java
	// Entao declara o tipo do Objeto "Integer" nesse caso... nomeVariavel que recebe os valores localmente
	
	// No caso do metodo receber mais parametros passa-os antes do varargs pra evitar de da erro de n saber o limite dele
	static int soma(int a, int b, Integer... vetor){

		int total = 0;

		for (int i=0; i<vetor.length; i++){
			total += vetor[i];
		}

		return total;
	}
}
