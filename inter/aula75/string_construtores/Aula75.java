package inter.aula75.string_construtores;

// Criando strings
public class Aula75 {

	public static void main(String[] args) {
		
		// String e um objeto/classe, construtor padrao
		String vazia = new String(); // mesmo que ""
		System.out.println(vazia);
		
		// Pode passar uma string para o construtor da string 
		String java = new String("JAVA");
		System.out.println(java);
		
		// Criando string a partir de outra, ref outra variavel do tipo string
		String java1 = new String(java);
		System.out.println(java1);
		
		// Utilizando um array de chars
		char [] charsJava = {'J', 'A', 'V', 'A'};
		String java2 = new String(charsJava);
		System.out.println(java2);
		
		// Quer somente as 3 primeiras posicoes do vet, partes do array atraves de indices
		char [] abcdef = {'A', 'B', 'C', 'D', 'E', 'F'};
		String abc = new String(abcdef, 0, 3);	// passando tbm o offset pra isso, primeira e ultima do array
		System.out.println(abc);
		
		// Trabalhando com array de byte utilizando codigos da tabela asci
		byte [] ascii = {65, 66, 67, 68, 69};		// Representa letras A, B, C, D, E,
		String abcde = new String(ascii);
		System.out.println(abcde);
		
		// Trab com offset em arrays de byte
		String bcd = new String (ascii, 1, 3);
		System.out.println(bcd);
		
		String java3 = "JAVA";
		String java4 = "JAVA";
		
		System.out.println(java3);
		System.out.println(java4);
		
	}

}
