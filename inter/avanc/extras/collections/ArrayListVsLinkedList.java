package inter.avanc.extras.collections;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// Apontando diferenças na pratica
public class ArrayListVsLinkedList {
	/***
	 * Array List - {0, 1, 2, 3, 4, 5, 6}
	 * Linked List - [0] > [1] > [2]
	 *                   <     < 
	 * Array List - When you have to add at the end and remove from the end and getting is fast
	 * Linked List - When you have add at the beginning and remove from the beginning
	 */
	public static void main(String[] args) {
		
		// 
		LinkedList<String> cars = new LinkedList<String>();

		// Adicionando elementos na listagem
		cars.add("BMW");
		cars.add("Honda");
		cars.add("Audi");
		
		// Obtendo tamanho da lista 
		int size = cars.size();
		System.out.println("The size of the list is: " + size);
		
		// Obtendo valor do objeto na posição um
		System.out.println("The item on index 1 is: " + cars.get(1));
		
		// Apresentando todos os objetos da listagem
		System.out.println("Iteration example");
		for (int i = 0; i < size; i++) {
			System.out.println("Item on index " + i + " is: " + cars.get(i));
		}
		
		System.out.println("\nNext for loop example");
		for (String car : cars) {
			System.out.println("The item is: " + car);
		}
		
		// Removendo elementos da listagem
		cars.remove(size - 1);
		
		System.out.println("\nNext for loop example after removing");
		for (String car : cars) {
			System.out.println("The item is: " + car);
		}
		
		// Criando diferentes tipos de objetos lista
		List<Integer> aList = new ArrayList<Integer>();
		List<Integer> lList = new LinkedList<Integer>();
		
		// Comparando tempo de execução entre ambos, com um metodo criado para fazer esse calculo e mostrar
		// Passado o nome do objeto e o tipo de lista para o metodo
		runDuration(aList, "Array List");
		runDuration(lList, "Linked List");
	}
	
	
	public static void runDuration(List<Integer> list, String listType) {
		
		// Apresentando a duração para o tipo de lista de objetos passado para o metodo
		System.out.println("\nBeginning of the duration method for " + listType);
		
		// laço para inserir elementos na lista de objetos até o maximo definindo em i
		for (int i=0; i<100000; i++) {
			list.add(i);
		}
		
		// Obtem o tamanho da lista de objetos 
		int size = list.size();
		
		// Recebe o tamanho da lista de objetos mais um valor fixo 
		int elementToAdd = size + 100000;
		
		// Recebe o horario atual em milesegundos e chama o metodo que mostra isso
		long startTime = System.currentTimeMillis();
		
		
		// Atribui o tamanho do vetor de objetos pro contador local, e ira rodar ate o tamanho local + 100 000
		for (int i = size; i < elementToAdd; i++) {
			// list.add(i);
			// Ira adicionar o valor 0 na lista de objetos em cada posição
			list.add(0, i);
		}
		
/*		for (int i=90000; i<92000; i++) {
			list.remove(i);
		}
		
		for (int i=0; i<100; i++) {
			list.remove(i);
		}*/
		
		
		// Obtem o tempo final em milesegundos
		long endTime = System.currentTimeMillis();
		
		// Calcula o tempo que demorou para efetuar todas essas operações
		long duration = endTime - startTime;
		
		// Apresenta para cada tipo de lista de objetos quanto tempo demorou esses procedimentos em milesegundos 
		System.out.println("Duration of the list " + listType + " is " + duration + " ms");
		
		
		// Os tempos se alteram de acordo com as instruçoes feitas no bloco
	}
}
