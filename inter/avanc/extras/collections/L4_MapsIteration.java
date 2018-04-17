package inter.avanc.extras.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class L4_MapsIteration {

	public static void main(String[] args) {
		// HashMap - Nao mantem a ordem/posicao em que os pares de elementos sao inseridos no hashmap
		// Declarando uma variavel do tipo map e nome hashmap, que recebe um inteiro e uma string e instanciando um objeto hashmap
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		
		// Inserindo valores no hashmap recebendo como parametro um valor do tipo inteiro e string
		hashMap.put(6, "Audi");
		hashMap.put(4, "Honda");
		hashMap.put(1, "BMW");
		
		System.out.println("Iteracao 1");
		
		// Declarando um objeto hashmap do mesmo tipo para interação com o objeto criado anteriormente dentro do laço
		// Nesse caso e declarado acesso ao hashmap atraves da palavra "entry" e "entrySet" do objeto
		for (Map.Entry<Integer, String> entry: hashMap.entrySet()) {
			
			// Guardando localmente em uma variavel a chave de determinada posição do hashmap 
			// Nesse caso a palavra reservada "entry" e utilizada para acessar e manipular o conteudo do objeto hashmap
			int chave = entry.getKey();
			
			// Obtem o valor de uma posição do hashmap
			String valor = entry.getValue();
			// Obtendo a chave e o valor e apresentando
			System.out.println("Chave: " + chave + ", Valor: " + valor);
		}
		
		//=====================================================================================
		
		System.out.println("Iteracao 2");
		
		// Cria se um objeto do tipo inteiro como chave que passa por todas as posicoes do hashmap utilizando o metodo "keySet"
		for (Integer chave: hashMap.keySet()) {
			String valor = hashMap.get(chave);
			System.out.println("Chave: " + chave + ", Valor: " + valor);
		}
		
		//=========================================================================================
		
		// Nesse caso mantem-se em ordem crescente a insercao de pares de acordo com o valor da chave
		// Declara-se uma variavel do tipo map de nome "linkedMap" que recebe um objeto do tipo "LinkedHashMap"
		// Como parametros esse objeto recebe argumentos do tipo inteiro e string como par chave/valor 
		Map<Integer, String> linkedMap = new LinkedHashMap<Integer, String>();
		
		// Inserindo valores no objeto linkedMap, no formato chave/valor (inteiro/string)
		// Cada entrada recebe uma posicao do map a ser organizada automaticamente de acordo com o valor da chave
		linkedMap.put(6, "Audi");
		linkedMap.put(4, "Honda");
		linkedMap.put(1, "BMW");
		
		System.out.println("Iteracao 3");
		for (Integer chave: linkedMap.keySet()) {
			String valor = linkedMap.get(chave);
			System.out.println("Chave: " + valor + ", Valor: " + valor);
		}
		
		//===============================================================================================
		
		// Mantem organizacao natural
		// Declara uma variavel "treeMap" do tipo map, que recebe um objeto do tipo "TreeMap" com parametros do tipo inteiro e string
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		// Inserindo pares chave/valor no TreeMap
		treeMap.put(1, "BMW");
		treeMap.put(6, "Audi");
		treeMap.put(4, "Honda");
		
		// Importante observar que a forma de interagir com cada um dos tipos de objetos e muito semelhante pois a variavel declarada e da mesma interface/tipo collections
		// Todas mapeiam, e possuem operacoes de obter e inserir valor por chave e valor unico
		// Cada um dos objetos abaixo implementam a interface map, funcionando a sua maneira:
		
		// No HashMap: Ira mudar completamente quando novos elementos forem adicionados, as saidas sao aleatorias frente as insercoes
		// No TreeMap: 
		// No LinkedHashMap: Ira apresentar saidas na ordem que as entradas forem inseridas
		// HashTable: Ficou obsoleto por questoes de performance e redundancia em seus metodos
		// ConcurrentHashMap: E sua evolucao
		
		// Na pratica:
		// HashMap: Mais util em questao de desempenho, permite chave e valores como null, sem ordenacao/classificao nem duplicacao de registros
		// TreeMap: Mais util quando deseja classificar e iterar sobre as chaves em uma ordem determinada que nos definimos
		// LinkedHashMap: Combina vantagens de ambas, preserva a ordem de insercao, rapido como hashMap com menor custo computacional, preciso como o TreeMap e pode servir de cache sem expirar dados  
	
		//	https://www.devmedia.com.br/conheca-a-api-java-collections/31995
		//	http://www.guj.com.br/t/qual-a-diferenca-entre-map-e-hashmap/74736
		//	http://www.guj.com.br/t/hashmap-e-treemap/55365
		//  https://www.programcreek.com/2013/03/hashmap-vs-treemap-vs-hashtable-vs-linkedhashmap/
		//	https://stackoverflow.com/questions/2889777/difference-between-hashmap-linkedhashmap-and-treemap
		// 	https://git-scm.com/book/pt-br/v1/Ramifica%C3%A7%C3%A3o-Branching-no-Git-Rebasing
		// 	https://git-scm.com/book/pt-br/v1/Ramifica%C3%A7%C3%A3o-Branching-no-Git-Branches-Remotos
		// 	https://git-scm.com/book/pt-br/v1/Ramifica%C3%A7%C3%A3o-Branching-no-Git-Fluxos-de-Trabalho-com-Branches
		//	como fazer merge git
		// 	como usar o rebase git
		//	https://www.caelum.com.br/apostila-ruby-on-rails/metaprogramacao/#5-2-para-saber-mais-singleton-classes
		
		
	
	}
}