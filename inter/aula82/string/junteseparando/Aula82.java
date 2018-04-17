package inter.aula82.string.junteseparando;

// Como juntar strings com join, separando atraves do split
public class Aula82 {

	public static void main(String[] args) {
		
		// Passando uma seq de caracteres ou strings, juntando tods atraves de uma virgula, e os parametros desejados, varargs, infinitos param
		String alfabeto = String.join(", ", "A", "B", "C", "D");
		System.out.println(alfabeto);
		
		// Separando letras em um vetor, split separando com uma virgula, nesse caso utilizando tbm exp regular
		String[] letras = alfabeto.split(", ");
		
		// Imprimindo todas as letras do vetor que armazenou a string quebrada
		// Muito utilizados em arquivos flat file, integ sistemas legados
		for (String letra : letras){
			System.out.println(letra);
		}
	 
		String doArquivo = "1;Antônio;30;";
		
		// Vetor que ira armazenar os caracteres, separando com ponto virgula
		String[] infos = doArquivo.split(";");
		
		// Criando uma classe pessoa pra apoiar nessa questao
		// Ex: integ com outros sistema, passando o vetor e transformando de string para variaveis de uma classe e com conversao pra inteiro quando precisa
		// Nesse caso usa o separador ; pra mudar a posicao do vetor e passar as informacoes recortadas pras resp variaveis
		Pessoa pessoa = new Pessoa(Integer.parseInt(infos[0]),infos[1], Integer.parseInt(infos[2]));
		System.out.println(pessoa);
	}
	
}
