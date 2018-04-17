package inter.aula58.autoboxingeunboxing;

// Existe um processo automatico no java
// Transforma um tipo primitivo em um tipo objeto e vice versa
public class TesteAutoboxing {

	public static void main(String[] args) {
		// Autoboxing, atribuido valor ao objeto que representa o tipo primitivo sem precisar instanciar 
		Short num7 = 1;
		Byte num8 = 10;
		Integer num9 = 100;
		Long n10 = 100l;
		Float n11 = 3.5f;
		Double n12 = 2.55;
		Boolean flag2 = true;
		Character b = 'b';
		
		// Fazendo o processo inverso unboxing, transformando um tipo classe em um tipo primitivo novamente
		int num13 = num9;  // Mesmo que -> num9.intValue()
		
		// Nesse caso mesmo sem converter pode ser utilizado operadores
		// Entao e feito autoboxing em expressoes
		num9++;
		System.out.println(num9);
		
		// Auto unboxing num 9 e depois autoboxing no objeto num14
		Integer num14 = num13/num9;
		
		// Se for fazer operacoes matematicas e de conversao objeto/tipo primitivo constantemente
		// Compensa utilizar um tipo so por um tempo e em outras finalidades focar no uso do tipo objeto
		// Caso contrario torna um mal uso e polui codigo gastando mais tempo em codificacao
	}

}
