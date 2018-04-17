package inter.aula78.stringcomparacao;

public class Aula78 {

	public static void main(String[] args) {
		
		// Comparando strings com met equals e equalsignorecase
		String ola = "Olá";
		String ola2 = "OLÁ";
		String ola3 = "Olá";
		String ola4 = new String(ola);	// Operador new sempre aponta nova ref de memoria independente do conteudo ser igual ou nao, diferente na atrib simples
		
		// Comparando conteudo de variaveis 
		System.out.println("ola equals ola2 = " + ola.equals(ola2)); //false
		System.out.println("ola equals ola3 = " + ola.equals(ola3)); //true
		
		// Comparando case sensitive
		System.out.println("ola equals ola2 = " + ola.equalsIgnoreCase(ola2)); //true
		
		// Nesse caso ta comparando referencia em memoria, por ser a mesma string
		System.out.println("ola == ola1 " + (ola == ola2)); //false
		System.out.println("ola == ola3 " + (ola == ola3)); //true
		
		// Dif ref em memoria e conteudo e case sensitive
		System.out.println("ola == ola4 " + (ola == ola4)); //false
		System.out.println("ola equals ola4 = " + ola.equals(ola4)); //true
		System.out.println("ola equalsIgnoreCase ola4 = " + ola.equalsIgnoreCase(ola4)); //true
		
		
		
		String banana = "banana";
		String ana = "ana";
		String ban = "ban";
		
		// Comparar se existe conjunto de caracteres em outras variaveis/caracteres
		// Nesse caso aponta o indice/vetor para validar busca, quem e a string q sera comparada
		// O ponto inicial q sera buscado na outra string procurada, a quantidade de caracteres que existem
		System.out.println(banana.regionMatches(1, ana, 0, 3));
		System.out.println(banana.regionMatches(2, ana, 1, 2));
		
		// Com ignoreCase sensitive, a partir do b (caracter 0), nova string que irei usar pra comparacao, de onde quero iniciar a comparacao, e quantos caracteres procuro
		System.out.println(banana.regionMatches(true, 0, ban, 0, 3));
		
		// Termina com, comparo o fim de uma outra string q passo
		System.out.println(banana.endsWith(ana));
		// Inicio com determinado conjuntos de caract passados?
		System.out.println(banana.startsWith(ban));
		
		
		String a = "a";
		String b = "b";
		String aMaiusculo = "A";
		
		// Compara objetos com base na tabela ascii, com saidas:
		// -1 quando a > b
		// 0 a == b
		// 1 ou > 1 , quando a>b
		System.out.println(a.compareTo(b));
		System.out.println(b.compareTo(a));
		System.out.println(a.compareTo("a"));
		System.out.println(a.compareTo(aMaiusculo));
		
		// Muito utilizado em ordenacao de collections, arraylist, etc
	}

}
