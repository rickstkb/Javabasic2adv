package inter.aula68.thread_interfacerunnable;

public class Teste {

	public static void main(String[] args) {
		
		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 500);
		// Nao acontece nada nesse momento porque nao e uma thread de verdade apenas implementa interface runnable
		
		// Pra ser uma thread de verdade, precisa passar a classe runnable pra thread
		// Vai passar como parametro uma classe que implementa a classe runnable que temos
		// Thread t1 = new Thread(thread1);
		
		// Ao executar ainda nao vai acontecer nada pois nao tem a chamada ao metodo start
		// t1.start();
		
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 600);
		
		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 800);
		
		// Isso seria um processo/programa com 3 tarefas/threads em execucao simultanea
		// Ambas abordagens de criacao de threads valem, dependem do projeto/necessidade
		// Se nao for sobrepor metodos da classe thread e melhor usar a classe runnable
	}

}
