package inter.aula63.printf;

public class ExemploPrintf {
	
	// Forma de formatar saida de texto no java 
	
	public static void main(String[] args) {

		// Nesse caso passa o tipo da variavel dentro do texto impresso e o parametro 
		System.out.printf("%s", "Olá, Mundo!");
		System.out.println();
		
		// Todo o texto colocado adiante sera impresso em caixa alta pelo "%S"
		System.out.printf("%S", "Olá, Mundo!");
		System.out.println();

		// Caracteres minusculos e maiusculos
		System.out.printf("%c", 'c');
		System.out.println();
		System.out.printf("%C", 'c');

		// Nesse caso usando printf e melhor usar %n em vez de \n
		System.out.printf("%n");

		// Imprimindo valores inteiros
		int valor = 123456789;
		System.out.printf("%d", valor);
		System.out.println();
		
		// Imprimindo valores decimais com ponto flutuante 
		double pontoFlutuante = 3.1456789;
		System.out.printf("%f", pontoFlutuante);
		System.out.println();
		
		
		// Imprimindo string limitando a 20 caracteres, porem com alinhamento a direita
		String olaMundo = "Olá, Mundo!";
		System.out.printf("%20s", olaMundo);
		System.out.println();

		// Com alinhamento a esquerda de 20 caracteres no campo impresso
		System.out.printf("%-20s", olaMundo);
		System.out.println();

		// Imprime com positivo na frente
		System.out.printf("%+d", valor);
		System.out.println();

		// Colocando a quantidade de caracteres de 15 digitos porem completando com 0
		System.out.printf("%015d", valor);
		System.out.println();

		// Insere formatadores de milhagem a cada 3 casas/digitos
		System.out.printf("%,d", valor); //usem ,
		System.out.println();
		
		// Imprime o sinal negativo na frente do numero
		int valor2 = -123456789;
		System.out.printf("% d", valor2);
		System.out.println();
		
		// Nao imprime nada antes do valor apenas um espaco vazio
		System.out.printf("% d", valor);
		System.out.println();

		// 3 casas decimais depois do ponto na impressao com arredondamento
		System.out.printf("%.3f", pontoFlutuante);
		System.out.println();

		// Saida de numero monetario, com 10 digitos no total alinhados a direita e com 2 casas decimais de precisao 
		System.out.printf("R$%10.2f", pontoFlutuante);
		System.out.println();
		
		
		testeMaisCompleto();
	}
	
	private static void testeMaisCompleto(){
		
		// Exemplo de notinha de caixa com valores decimais
		double[] precos = {10000, 123.54, 7843.567, 1, 4.56789};
		
		for (int i=0; i<precos.length; i++){
			
			// Passando uma string, um inteiro com zeros a frente com no maximo 2 casas, preco de 10 digitos e duas casas de precisao e pula linha no final
			// Sao 3 argumentos, pra 3 valores inseridos no texto de impressao na console
			System.out.printf("%s %02d: total de R$%,10.2f%n", "Item", i+1, precos[i]);
		}
		
		//Java.util.Formater
	}
}
