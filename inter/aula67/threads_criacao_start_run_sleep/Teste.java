package inter.aula67.threads_criacao_start_run_sleep;

public class Teste {

	public static void main(String[] args) {
		MinhaThread thread = new MinhaThread("Thread 1", 600);
		
		// Executando agora nada acontece, pois precisa sobrescrever o metodo run
		// Rodando agora ainda nao vai acontecer nada pois precisa inicializar a thread
		
		// Chama o metodo run, para nao ficar chamando ele toda hora, pode ser colocado no proprio construtor
		// thread.start();

		// Trabalhando com mult threads
		MinhaThread thread2 = new MinhaThread("Thread 2", 900);
		
		// Para deixar ambas do delay entre elas, e possivel passar o tempo no construtor
		
		MinhaThread thread3 = new MinhaThread("Thread 3", 500);
		
		// Cada tarefa tem o seu tempo 
	}

}
