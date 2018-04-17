package inter.aula67.threads_criacao_start_run_sleep;

public class MinhaThread extends Thread {
	// Ja tem uma thread por esta extendendo a classe
	private String nome; // da thread
	private int tempo;
	
	// Construtor dela
	public MinhaThread(String nome, int tempo){
		this.nome = nome;
		this.tempo = tempo;
		start();
	}
	
	public void run(){
		
		try {
			
		for(int i=0; i<6; i++){
			System.out.println(" Executando " + nome + " contador " + i);
			// Colocando pra dormir, como pode dar uma excecao verificada vai exigir o try catch ou throws
			// Pois a thread pode ser interrompida
			Thread.sleep(tempo);
			}
		} catch(InterruptedException e){
			e.printStackTrace();
		}
		
		System.out.println(nome + " Terminou a execucao ");
	}
	
}
