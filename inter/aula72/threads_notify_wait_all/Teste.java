package inter.aula72.threads_notify_wait_all;

public class Teste {

	// Aqui o tic executa uma vez, notifica que a outra thread pode ser executada 
	// E executa o taque, fazendo a mesma operacao e liberando o recurso para o uso de outra thread
	public static void main(String[] args) {
		TicTac tt = new TicTac();
		ThreadTicTac tique = new ThreadTicTac("Tique", tt);
		ThreadTicTac taque = new ThreadTicTac("Taque", tt);
		
		try {
			tique.t.join();
			taque.t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
