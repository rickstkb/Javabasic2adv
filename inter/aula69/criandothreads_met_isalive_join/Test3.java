package inter.aula69.criandothreads_met_isalive_join;

public class Test3 {

	public static void main(String[] args) {
		
		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 500);
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 700);
		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 800);
		
		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);
		
		t1.start();	
		
		// Enquanto a t1, t2 ou t3 estiver viva, sendo executada, as threads vao "dormir" e esperar a finalizacao para mostrar a mensagem
		// Agora a ideia e sem utilizar o while para minimizar a quantidade de codigo mas sim usar o join
		
		// O join espera a execucao da thread para depois continuar o codigo
		// Tambem pode disparar excecao de interrupcao, entao precisa de um try catch pra tratativa
		
//		try {
//			t1.join(200);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		t2.start();
		
//		try {
//			t2.join(200);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		t3.start();
		
//		try {
//			t3.join(200);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		// Nesse caso somente quando uma thread finalizar execucao ira iniciar a outra thread
		
		
		// Porem pra forcar que somente apresente a mensagem apos todas as threads executadas
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Prog finalizado");
	}
}
