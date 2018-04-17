package inter.aula84.stringtokenizer;

import java.util.StringTokenizer;

// Extraindo info de strings, porem sem separar em um vetor
// Ira extrair tokens
public class Aula84 {

	public static void main(String[] args) {
		
		String doArquivo = "1;Antônio;30;";
		
		// Objeto tokenizer, string desejado extrair informacoes e o delimitador/separador ; 
		StringTokenizer st = new StringTokenizer(doArquivo, ";");
		
		// Enquanto tokenizer tem mais tokens, iremos extraindo tokens
		// Mais utilizado em leitura de arquivos
		while (st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}

	}
}
