package inter.aula80.string.modstring;

// Modificando string ou extraindo partes dela
// Met substring, concat, replace, trim
public class Aula80 {

	public static void main(String[] args) {
		
		// String referente para os testes
		String teste = "Isso é um teste.";
		
		System.out.println(teste);
		
		// Extrair/copiando pedacoes de uma string
		// Iniciando a partir do indice que eu passo, nesse caso 10 pra frente
		System.out.println(teste.substring(10));
		// Inicia e finaliza a partir de indices que eu passei 10 e 15
		System.out.println(teste.substring(10, 15));

		
		String ola = "olá";
		String mundo = " mundo";
		
		// Concatenacao de strings
		String olaMundo = ola.concat(mundo); //ola + mundo
		System.out.println(olaMundo);
		
		// Substituindo valores/caracteres na string
		String espacos = "i s p a ç o";
		// caracter que quero tirar, e o outro q quero colocar
		String semEspacos = espacos.replace('i', 'e');
		System.out.println(semEspacos);
		
		// Pra retirar espacos de uma vez
		// Pode passar uma expressao regular, nesse caso espacos por vazio  
		semEspacos = semEspacos.replaceAll(" ", "");
		System.out.println(semEspacos);
		
		// Normalmente em gravacoes no banco retira espacos antes ou depois das strings
		String nome = " meu nome é: ";
		System.out.println(nome);
		// Metodo trim tira os espacos
		System.out.println(nome.trim());
		
		//web services
		//XML
		
		// Alguns sistemas sao bem antigos ou n tem webservices ou APIs disponiveis
		// Nesse caso utilizam-se arquivos, por ex XML, CSV, txt, etc, chamados (flat files)
		// Informacoes vem com separadores como ; ou legendas de posicoes de digitos que significam algo
	}
}
