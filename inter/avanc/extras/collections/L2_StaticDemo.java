package inter.avanc.extras.collections;

// Utilizando a classe estatica criada como exemplo
public class L2_StaticDemo {
	public static void main(String[] args) {
		
		// Criando uma nova instancia do objeto estatico
		L2_StaticExampleClass s1 = new L2_StaticExampleClass("bmw");
		System.out.println("Make of Car is: " + s1.getMake());
		System.out.println("This is intance no: " + L2_StaticExampleClass.getInstanceNum());
		
		L2_StaticExampleClass s2 = new L2_StaticExampleClass("benz");
		System.out.println("Make of Car is: " + s2.getMake());
		System.out.println("This is intance no: " + L2_StaticExampleClass.getInstanceNum());
	}
}
