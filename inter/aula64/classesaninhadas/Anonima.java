package inter.aula64.classesaninhadas;

// Classes anonimas podem implementar interfaces
public class Anonima {

	public void imprimeTexto(){
		System.out.println("qualquer texto");
	}
	
	public static void main(String[] args){
		
		Anonima anonima = new Anonima(){
			
			// Sobrescrevendo metodo imprimeTexto
			// Mudando o comportamento da classe em tempo de execucao
			public void imprimeTexto(){
				System.out.println("qualquer texto que foi sobrescrito");
			}
		};
		
		anonima.imprimeTexto();
		
		// Instanciando e usando interface como anonima 
		Texto texto = new Texto() {
			
			// Implementando o comportamento da interface em tempo de instanciacao
			@Override
			public void imprimeTexto() {
				System.out.println("qualquer texto - interface");
			}
		};
		
		texto.imprimeTexto();
	} 
}
