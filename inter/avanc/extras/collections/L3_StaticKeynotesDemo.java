package inter.avanc.extras.collections;

public class L3_StaticKeynotesDemo {
	// Static method cannot use the non-static variable or method directly
	// This and super cannot be used in static context
	
	public int addNum = 10;
	public static int addNumStatic = 10;

	public static void main(String[] args) {
		L3_StaticKeynotesDemo s1 = new L3_StaticKeynotesDemo();
		int output = s1.sum(20);
		
		// Metodos estaticos podem ser chamados diretamente sem precisar de instancia
		int staticOutput = sumStatic(10);
		
		System.out.println("The output is: " + output);
		System.out.println("The output is: " + staticOutput);
	}
	
	public int sum(int num) {
		return num + addNum;
	}
	
	// Parametro passado para metodo estatico que for instanciado localmente comporta-se como estatica tbm
	// Variavel global comum nao consegue interagir no metodo estatico e da erro
	public static int sumStatic(int num) {
		return num + addNumStatic; //+ addNum;
	}
}
