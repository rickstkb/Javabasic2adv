package inter.aula74.threads_deadlock;

public class Deadlock {

	public static void main(String[] args) {
		
		// Criando threads
		// Criando dois obj que as threads querem usar
	
		final String RECURSO1 = "Recurso 1";
		final String RECURSO2 = "Recurso 2";
				
		Thread t1 = new Thread(){
			// Criando classe anonima, como sera utilizada somente uma vez n tem problema pois n tera reaproveitamento
			// Imp metodo run
			public void run(){
				// Acessando o primeiro recurso sincronizando  
				synchronized (RECURSO1){
					// Usando sync ira bloquear o recurso 1, assim somente essa thread podera usar esse rec
					System.out.println("Thread 1: bloq rec 1");
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					System.out.println("Thread 1: Tentando acesso ao rec 2 ");
					
					synchronized (RECURSO2) {
						System.out.println("Thread 1: bloqueando recurso 2");
					}
				}
			}
		};
		
		
		Thread t2 = new Thread(){
			// Criando classe anonima, como sera utilizada somente uma vez n tem problema pois n tera reaproveitamento
			// Imp metodo run
			public void run(){
				// Acessando o primeiro recurso sincronizando  
				synchronized (RECURSO2){
					// Usando sync ira bloquear o recurso 1, assim somente essa thread podera usar esse rec
					System.out.println("Thread 2: bloq rec 2");
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					System.out.println("Thread 2: Tentando acesso ao rec 1 ");
					
					synchronized (RECURSO1) {
						System.out.println("Thread 2: bloqueando recurso 1");
					}
				}
			}
		};
		
		t1.start();
		t2.start();
	}

}
