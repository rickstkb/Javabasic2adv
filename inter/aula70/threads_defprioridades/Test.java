package inter.aula70.threads_defprioridades;

import inter.aula69.criandothreads_met_isalive_join.MinhaThreadRunnable;

// Priorizando execucao de threads

public class Test {

	public static void main(String[] args) {
		
		MinhaThreadRunnable thread1 = new MinhaThreadRunnable(" #1 ", 500);
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable(" #2 ", 500);
		MinhaThreadRunnable thread3 = new MinhaThreadRunnable(" #3 ", 500);
		
		// Instanciando as threads passando a instancia da classe runnable
		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);
		
		// A ordem de execucao das threads em java e alternada 
		// Todas terao prioridade normal 
		
		// Para criar prioridade usa o metodo setPriority
		
		// A classe thread tem um atributo priority, variando de 1 a 10
		// Nesse caso t1 por ter prioridade maior sera executada primeiro
		// Nao e sempre que sera respeitada mas na maioria das vezes sim
		t1.setPriority(5);
		t2.setPriority(3);
		t3.setPriority(1);
		
		// Pode ser usadas constantes tbm 
		t1.setPriority(5);
		t2.setPriority(3);
		t3.setPriority(1);
		
		t1.setPriority(Thread.NORM_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}

}
