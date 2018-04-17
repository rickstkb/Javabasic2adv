package inter.aula54.enumsconstrutoremetodos;

// Utilizando enums como se fosse uma classe qualquer usando construtores e metodos
// Precisa ter atributos, construtor e metodos desde os getters setters 
// Enums estendem a classe java.lang.Enum
// Podem ser comparados usando o operador == , sendo que classes/objetos precisam ser comparados com "equals"
// Nao podem ser instanciados com o new, e passado o valor e automaticamente ja instanciado
// Podem implementar interfaces por poderem ser utilizado semelhantes classes
// Tambem podem ser declarados dentro de uma propria classe

public enum DiaSemana {
	
	// Nesse caso queremos ter um enumerador que pareca bastante com a classe com constantes utilizando final
	// variavel = valor
	// Cada um desses tera um valor para o construtor, que sera chamado no momento que e passado o valor
	// Declarei apenas uma variavel/atributo de nome valor para armazenar o valor de todos enumeradores
	// No get ira pegar quem e o enum e seu respectivo valor declarado no construtor
	SEG (1), TER(2), QUA(3), QUI(4), SEX(5), SAB(6), DOM(7);
	
	private int valor;

	// Nesse caso o construtor nao tera modificador de acesso
	DiaSemana(int valor) {
		this.valor = valor;
	}
	
	public int getValor(){
		return this.valor;
	}
	
}
