package inter.avanc.extras.collections;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// Trabalhando com listas ligadas
public class LinkedListDemo {
	/***
	 * Array List - {0, 1, 2, 3, 4, 5, 6}			// Todos os elementos sao sequenciais apontando para um mesmo conjunto espaço de memoria
	 * Linked List - [0] > [1] > [2]   				// Cada elemento da lista aponta e referencia para o proximo 
	 *                   <     < 
	 * Array List - Normalmente usado, quando tem que adicionar e remover do final da listagem e fazer isso rapidamente
	 * Linked List - Normalmente usado, quando tem que adicionar e remover do inicio da listagem 
	 */
	public static void main(String[] args) {
		
		// Criando uma lista ligada de strings de nome cars
		LinkedList<String> cars = new LinkedList<String>();
		
		// Adicionando elementos na lista ligada, semelhante a tudo que foi feito com a lista/matriz de objetos
		cars.add("BMW");
		cars.add("Honda");
		cars.add("Audi");
		
		// Guardando o tamanho da lista de objetos no momento e apresentando-a
		int size = cars.size();
		System.out.println("The size of the list is: " + size);
		
		// Buscando o valor do atributo do objeto na posição 1 da lista e apresentando-a
		System.out.println("The item on index 1 is: " + cars.get(1));
		
		// Apresentando todos os elementos da lista de objetos 
		System.out.println("Iteration example");
		for (int i = 0; i < size; i++) {
			System.out.println("Item on index " + i + " is: " + cars.get(i));
		}
		
		System.out.println("\nNext for loop example");
		for (String car : cars) {
			System.out.println("The item is: " + car);
		}
		
		// Removendo objetos/posições da lista
		cars.remove(size - 1);
		
		// Apresentando os objetos restantes apos remover
		System.out.println("\nNext for loop example after removing");
		
		// Apresentando todos os elementos dentro da lista de objetos 
		for (String car : cars) {
			System.out.println("The item is: " + car);
		}
		
		// Criando novos objetos, nesse caso de forma generica denomina a variavel de lista, 
		// Porem quando instancia o objeto referencia para qual tipo deseja, arraylist ou linkedlist e atribui a essa variavel criada
		List<Integer> aList = new ArrayList<Integer>();
		List<Integer> lList = new LinkedList<Integer>();
		
		// aList.add(10);
		// lList.add(30);
		
		// System.out.println(aList.get(1));
		// System.out.println(lList.get(1));
	}
	
}
