package inter.avanc.extras.collections;

public class L2_StaticExampleClass {
//	private static int wheelsCount = 4;
	private String make;
	private static int instanceNum = 0;
	
	// Ao manter a variavel instanceNum estatica ela nao reinicia sempre para depois contar
	// Nesse caso mantem sempre ativa em memoria e incrementa a cada instancia que for feita do construtor
	public L2_StaticExampleClass(String make) {
		this.make = make;
		instanceNum++;
	}
	
	public String getMake() {
		return make;
	}
	
	public static int getInstanceNum() {
		return instanceNum;
	}
}
