package inter.aula79.stringfazendobuscas;

// Fazendo buscas dentro de uma string, utilizando 3 metodos
// indexof, lastindexof, contains
public class Aula79 {

	public static void main(String[] args) {
		
		// Strings criadas de ref
		String banana = "banana";
		String ana = "ana";

		// Procurar dentro da string banana, um caracter ou outra string e receber de volta o indice do caracter
		// Ou o inicio de onde essa string se encontra
		// Caso nao encontra o resultado e -1
		// Nesse caso retorna pq n existe
		System.out.println(banana.indexOf('x'));
		
		// Ja no b ou a, mostra indice 0, e 1
		System.out.println(banana.indexOf('b'));
		System.out.println(banana.indexOf('a'));
		
		// Passando string toda, apresenta indice 1, onde primeira vez foi encontrado na lista de caracteres
		System.out.println(banana.indexOf(ana));
		
		// Ultima vez que o 'a' existe, no indice 5 do vetor banana
		System.out.println(banana.lastIndexOf('a'));
		// Com string, indice 3 ultimo local encontrado
		System.out.println(banana.lastIndexOf(ana));
		
		// Se contem algum valor de uma string em outra
		System.out.println(banana.contains(ana));
		System.out.println(banana.contains("ceu"));
	}
}
