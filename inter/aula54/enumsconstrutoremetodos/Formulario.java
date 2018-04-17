package inter.aula54.enumsconstrutoremetodos;

public class Formulario {
	
	// Caso nao for fazer o reuso do enum em outras classes pode ser declarado dentro dela mesma e utilizada 
	enum Genero {
		FEMININO('F'), MASCULINO('M');
		
		private char valor;
		
		// Criando construtor dentro de um enum declarado dentro de uma outra classe
		Genero(char valor){
			this.valor = valor;
		}
	}
	
	private String nome;
	private Genero genero;
	
}
