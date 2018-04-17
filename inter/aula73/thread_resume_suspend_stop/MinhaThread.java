package inter.aula73.thread_resume_suspend_stop;

public class MinhaThread implements Runnable{

	// Copiando comportamentos dos metodos retirados
	
	private String nome;
	private boolean estaSuspensa; // Flag para notificar demais threads da situacao da anterior
	private boolean foiTerminada; // Flag para parar
	
	public MinhaThread(String nome ) {
		this.nome = nome;
		this.estaSuspensa = false;
		new Thread(this, nome).start();
	}
	
	@Override
	public void run() {
		System.out.println("Executando " + this.nome);
		
		try {
			for(int i=0; i<10; i++){
				System.out.println("Thread " + nome + " , " + i);
				Thread.sleep(300);
				
				// Vai chamar o metodo wait enquanto a thread tiver suspendida
				// Para tanto o uso dos metodos notify e all e necessario o uso de um bloco syncronized 
				// Diferente do metodo syncronized
				
				// Suspendendo e resumindo a exec da propria thread, passando a propria classe como recurso
				// Todos os atributos da classe estarao sincronizados tbm
				synchronized(this){
					while(estaSuspensa){
						wait();
					}
					if(this.foiTerminada){
						// Caso foi terminada execucao sai do while e for, fechando execucao da thread
						break;
					}
				}
				
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Thread " + this.nome + " Terminada ");	
	}
	
	void suspend(){
		this.estaSuspensa = true;
	}
	
	synchronized void resume(){
		this.estaSuspensa = false;
		notify(); 
	}
	
	// Criando metodo stop
	synchronized void stop(){
		this.foiTerminada = true;
		notify();
	}

}
