package inter.aula72.threads_notify_wait_all;

public class ThreadTicTac implements Runnable{
	
	TicTac tt;
	Thread t;
	final int NUM = 5;
	
	// Recebe o nome da thread e uma instancia da classe ticTac
	public ThreadTicTac(String nome, TicTac tt ){
		this.tt = tt;
		t = new Thread(this,nome); 
		t.start();
	}

	@Override
	public void run() {
		if(t.getName().equalsIgnoreCase("Tique")){
			for(int i=0; i<NUM; i++){
				tt.tique(true);
			}
			tt.tique(false);
			
		} else {
			for(int i=0; i<NUM; i++){
				tt.taque(true);
			}
			tt.taque(false);
		}
		
	}
}
