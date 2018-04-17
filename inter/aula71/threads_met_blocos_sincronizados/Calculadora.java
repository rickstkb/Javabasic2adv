package inter.aula71.threads_met_blocos_sincronizados;

public class Calculadora {
	
	private int soma;
	
	// Adicionando a palavra chave para sincronizar permitindo apenas uma thread por vez acessar o metodo 
	// Nao deixando que duas threas alterem o valor da variavel juntas
	public synchronized int somaArray(int [] array){
		soma = 0; 
		
		for(int i=0; i<array.length; i++){
			soma += array[i];
			
			// Buscando nome da thread que esta acessando o metodo
			System.out.println("Executando a soma " + Thread.currentThread().getName() + " Somando o valor " + array[i] + " com total de " + soma);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		return soma;
	}

}
