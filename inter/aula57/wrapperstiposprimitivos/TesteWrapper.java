package inter.aula57.wrapperstiposprimitivos;

public class TesteWrapper {

	public static void main(String[] args) {
		
		// Declarando variaveis dos tipos primitivos do java
		short num1 = 1;
		byte num2 = 10;
		int num3 = 100;
		long num4 = 10000l;
		float num5 = 3.5f;
		double num6 = 3.5555;
		boolean flag = true;
		char a = 'a';
		
		
		// Classes que representam os tipos primitivos do java - Wrappers 
		// Semelhante ao que ocorre no ruby que e totalmente orientada a objetos ate as variaveis
		// Nesse caso empacota um tipo primitivo
		Short num7 = new Short((short) 1);
		Byte num8 = new Byte((byte) 10);
		Integer num9 = new Integer(100);
		Long num10 = new Long(10000l);
		Float num11 = new Float(3.5f);
		Double num12 = new Double(3.5555);
		Boolean flag2 = new Boolean(true);
		Character b = new Character('b');
		
		
		// Pode passar variavel ou valor normalmente
		// Pode passar tbm valores diferente do tipo primitivo, nesse caso recebe uma string em um objeto inteiro
		Integer num13 = new Integer("10000");
		
		// Em tempo de compilacao se caso acrescentar o valor do argumento com letras nao dara erro
		// Porem em execucao da uma excecao de formatacao de numero 
		
		Double num14 = new Double("3.5");	// Para pc portugues brasil 3,5
		
		
		// Essas classes tbm possuem metodos que podem retornar valores, e converter de um tipo pro outro
		System.out.println(num13.intValue());
		
		Long num15 = num13.longValue(); 
		
		
		// Fazendo parse de valores quando por exemplo utiliza a interface graf pra receber valores
		int num16 = Integer.parseInt("100000");
		
		double num17 = Double.parseDouble("3.5555");
		System.out.println(num17);
		
		// Transf num primitivo na instancia de um objeto
		Integer num18 = Integer.valueOf(1343);
		System.out.println(num18);
		
		// Nesse caso nao se compara o operador == pois nao e um tipo primitivo e sim um objeto
		System.out.println(num9.equals(num13));
	}

}
