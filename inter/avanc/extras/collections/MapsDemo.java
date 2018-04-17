package inter.avanc.extras.collections;
import java.util.HashMap;
import java.util.Map;

// Trabalhando com maps 
public class MapsDemo {

	public static void main(String[] args) {
		
		// Armazena em pares, chave e valor - Stores in pair, key -> value : Entry
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		// Inserindo no hashmap
		// Endereço do tipo definido como inteiro e o valor
		map.put(1, "BMW");
		map.put(6, "Audi");
		map.put(4, "Honda");
		
		// Obtem o valor da posição 1 do hashmap
		String value1 = map.get(1);
		
		// Apresenta esse valor
		System.out.println(value1);
		
		// Chaves são unicas, e valores podem ser duplicados 
		map.put(2, "BMW");
		
		// Tenta inserir um valor, porem somente altera-o
		map.put(4, "Merc");
		
		// Apresenta o valor na posiçao 4 do hashmap
		String value2 = map.get(4);
		System.out.println(value2);
	}
}