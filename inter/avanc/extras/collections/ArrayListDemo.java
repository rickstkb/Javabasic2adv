package inter.avanc.extras.collections;
import java.util.ArrayList;

// Trabalhando com arraylists, para em seguida possibilitar o trabalho com lista de objetos, facilitando a criação de uma matriz, sendo que um objeto compoe n atributos dentro que serao acessados atraves de alguns principais metodos da linguagem a seguir
// Nesse caso facilita muito pois atraves dos metodos da biblioteca arraylist, reduz a quantia de codigo pra fazer tarefas mais simples e costumeiras, não preciso codificar por exemplo como percorrer os objetos e validar seus dados, e sim chamar apenas o metodo/comando que desejo e o valor

// http://www.guj.com.br/t/array-list-de-objetos-resolvido/57655/13
// http://www.javaprogressivo.net/2012/09/como-usar-arraylist-em-java.html

// https://www.google.com/search?q=arraylist+de+objetos+java&sa=X&ved=0ahUKEwifx4nx7evUAhXDjpAKHacsA2cQ1QIIcygB
// https://www.google.com/search?q=arraylist+em+java&oq=array+list+em+j&aqs=chrome.1.69i57j0l5.3053j0j7&sourceid=chrome&ie=UTF-8
public class ArrayListDemo {

	// Nesse caso apenas tem uma main para teste aqui na console
	public static void main(String[] args) {
		
		// Criando um array do tipo string denominado cars que recebe o mesmo sem argumento
		// Se eu quiser criar com uma quantidade especifica de objetos coloco dentro do parenteses
		ArrayList<String> cars = new ArrayList<String>();
		
		// Adicionando objetos, nesse caso apenas o atributo marca a cada objeto carro
		cars.add("BMW");
		cars.add("Honda");
		cars.add("Audi");
		
		// Validando o tamanho da lista de objetos
		int size = cars.size();
		System.out.println("The size of the list is: " + size);
		
		// Devolvendo o valor do atributo marca do objeto da lista na posição 1
		System.out.println("The item on index 1 is: " + cars.get(1));
		
		
		// Percorrendo os vetores de duas formas
		// Na primeira padrão apenas para buscar e apresentar um elemento da lista de objetos em cada posição do laço 
		
		System.out.println("Iteraton example");
		for (int i = 0; i < size; i++) {
			System.out.println("Item on index " + i + " is: " + cars.get(i));
		}
		
		// Na segunda forma apresentando o proximo elemento existente na lista de objetos
		System.out.println("\nNext for loop example");
		
		// Define uma variavel local car, que percorre toda a lista de objetos cars, apresentando o objeto todo em cada posição do laço
		for (String car : cars) {
			System.out.println("The item is: " + car);
		}
		
		// Removendo o objeto da ultima posição do vetor
		cars.remove(size - 1);
		
		// Removendo um objeto pelo nome
		cars.remove("Honda");
		
		// Depois de remover mais elementos da listagem
		System.out.println("\nNext for loop example after removing");
		for (String car : cars) {
			System.out.println("The item is: " + car);
		}
	}

}