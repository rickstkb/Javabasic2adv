package inter.aula68.thread_interfacerunnable;


public class MinhaThreadRunnable implements Runnable {
	private String nome;
	private int tempo;

	public MinhaThreadRunnable(String nome, int tempo){
		this.nome = nome;
		this.tempo = tempo;
		Thread t = new Thread(this);	// Fazendo referencia a propria classe no construtor
		t.start();
	}
	
	// Metodo obrigatorio
	// Responsavel por executar a tarefa que a thread tem que executar
	@Override
	public void run() {
		try{
			for(int i=0; i<6; i++){
				System.out.println(nome + " contador " + i);

				Thread.sleep(tempo);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(nome + " terminou execucao ");
	}

}
