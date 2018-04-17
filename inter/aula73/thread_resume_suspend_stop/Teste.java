package inter.aula73.thread_resume_suspend_stop;

public class Teste {

	public static void main (String [] args){
		
		MinhaThread t1 = new MinhaThread("#1");
		MinhaThread t2 = new MinhaThread("#2");
		
		System.out.println("Pausando thread 1");
		
		// Comecar e suspender a thread temporariamente
		t1.suspend();
		
		// Aguarda
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Pausando thread 2");
		
		// Suspende a exec da thread 2
		t2.suspend();
		
		System.out.println("Resumindo thread 1");
		
		// Retorna exec thread 1
		t1.resume();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Resumindo thread 2");
		
		// Retornar a execucao da segunda thread que foi interrompida para finalizar o prog
		t2.resume();
		
		System.out.println("Terminando thread 2");
		
		t2.stop();
	}
}
