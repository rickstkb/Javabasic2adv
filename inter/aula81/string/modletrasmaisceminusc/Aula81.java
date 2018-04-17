package inter.aula81.string.modletrasmaisceminusc;

// Transformando caracteres de uma string em maiusculas ou minusculas
public class Aula81 {

	public static void main(String[] args) {
		
		// String utilizado como referencia
		String teste = "Teste";
		
		// Transformando todos os caracteres da string em minusculas
		String testeMinusc = teste.toLowerCase();
		
		// Transformando todos em maiusculos
		String testeMaisc = teste.toUpperCase();

		System.out.println(testeMinusc);
		System.out.println(testeMaisc);

		// Para comparar strings, equals ou equals ignore case
		// Comparando duas strings 
		//if (teste.toLowerCase().equals(teste.toLowerCase()))
	}
}
