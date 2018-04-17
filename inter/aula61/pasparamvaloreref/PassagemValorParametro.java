package inter.aula61.pasparamvaloreref;

public class PassagemValorParametro {
	
	public static void main(String[] args) {
		
		// Instanciando um objeto contato passando seus valores no construtor
		Contato contato = new Contato("Contato 1", "1234-4567", "contato1@email.com");
		
		// Criando uma variavel primitiva e atribuindo valor 10
		int valor = 10;

		// Imprime mensagem
		System.out.println("***** Valores originais");
		
		// Imprime o objeto criado com todos seus atributos passados pra saida e a variavel criada
		// Enquanto nao tenho o metodo toString nesse objeto vai apresentar um codigo 
		// Esse codigo e apenas do espaco em memoria em que o objeto esta armazenado
		// Apos declarar o metodo quando e passado pra impressao, mostra na console o retorno programado pra ele
		
		// Mas sempre e guardada referencia do objeto em memoria na pilha de execucao da aplicacao 
		// Que aponta para a memoria heap onde armazena os valores do objeto pela pilha do programa 
		System.out.println(contato);
		System.out.println(valor);
	
		System.out.println();
		System.out.println("***** Exemplo 1");

		
		// Chama o metodo estatico e passa dois argumentos um primitivo e um objeto como ref
		testePassagemValorReferencia(valor, contato);

		System.out.println(contato);
		System.out.println(valor);
		
		System.out.println("***** Exemplo 2");

		testePassagemValorReferencia2(valor, contato);

		System.out.println(contato);
		System.out.println(valor);
	}

	// Cria um metodo estatico recebendo uma variavel primitiva e um objeto como referencia
	// Nesse caso passa o objeto criado como argumento, porem continua valendo o anterior
	private static void testePassagemValorReferencia(int valor, Contato contato){

		// Cria uma variavel local e interage com o parametro primitivo recebido
		int novoValor = valor + 10;
		valor = novoValor;
		
		// Cria um novo objeto dentro do metodo passando os valores no construtor
		// Aponta para um novo endereco de memoria com a referencia pra um novo objeto desconsiderando o anterior
		contato = new Contato("Contato 2", "2345-6789", "contato2@email.com");
	}

	// Cria outro metodo estatico, apenas setando o valor de um atributo do objeto criado concatenado ao valor
	// Nesse caso tbm cria se uma pilha local para o metodo, com uma copia dos valores do objeto criado anteriormente
	
	// Nesse caso tipos primitivos tem passagem por valor
	// E objetos, enums, vetores a passagem e por referencia, ou seja feita uma copia da referencia de onde esta o objeto, se modifica a referencia nao altera o objeto, se apontando para uma mesma referencia modifica o valor ai sim influencia
	private static void testePassagemValorReferencia2(int valor, Contato contato){

		int novoValor = valor + 10;
		valor = novoValor;

		contato.setNome("Contato"+novoValor);
	}
}
