package inter.aula72.threads_notify_wait_all;

public class TicTac {
	boolean tique;
	
	// Necessario um bloco de codigo sincronizado
	// A thread sempre ira passar um booleano se esta ou nao executando
	synchronized void tique(boolean estaExecutando){
		
		// Enquanto tique estiver executando, nao vai rodar o bloco de instrucoes
		if(!estaExecutando){
			tique = true;
			notify();
			return;
		}
		
		// Imprime essas instrucoes e o tique vai ser true	
		System.out.println("Tique ");
		tique = true;
		
		// Nesse momento notifica a thread do taque que ela pode ser executada
		notify();
		
		// Enquanto tique for true ira esperar pela execucao
		try{
			while(tique){
				wait();
				} 
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
	
	synchronized void taque(boolean estaExecutando){
		
		// Enquanto tique estiver executando, nao vai rodar o bloco de instrucoes
		if(!estaExecutando){
			tique = false;
			notify();
			return;
		}
		
		// Imprime essas instrucoes e o tique vai ser true	
		System.out.println("Taque ");
		tique = false;
		
		// Nesse momento notifica a thread do taque que ela pode ser executada
		notify();
		
		// Enquanto tique for true ira esperar pela execucao
		try{
			while(!tique){
				wait();
				} 
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
}
	
