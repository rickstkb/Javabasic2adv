package inter.aula69.criandothreads_met_isalive_join;

public class Test2 {

	public static void main(String[] args) {
		
		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 500);
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 500);
		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 500);
		
		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);
		
		t1.start();
		t2.start();
		t3.start();
		
		
		// Enquanto a t1, t2 ou t3 estiver viva, sendo executada, as threads vao "dormir" e esperar a finalizacao para mostrar a mensagem
		while(t1.isAlive() || t2.isAlive() || t3.isAlive()){
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Prog finalizado");
	}
}
