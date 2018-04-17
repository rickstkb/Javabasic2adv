package inter.aula66.garbagecolector;

import inter.aula61.pasparamvaloreref.Contato;

// Toda vez que instancia um objeto fica alocado na memoria heap, que tera uma referencia 
// Que fica na pilha do programa ou na pilha do metodo
// O tamanho da ref depende da quantidade de infos e atributos do obj
// Quando o metodo ou objeto deixa de ser executado/utilizado, a referencia de memoria e retirada
// Porem ainda continua ocupando espaco em memoria, entrando em cena o coletor do java

// Varre a memoria verificando quais objetos nao estao sendo mais utilizados e marca eles 
// Limpa os objetos, otimiza a memoria retirando espacos nao utilizados tornando a sequencia e melhor aproveitada

//jvisualvm no cmd para visualizar o comportamento das aplicacoes em relacao ao hardware
public class ColetorLixo {

	public static void obterMemoriaUsada(){
		
		// Transformando em mb
		final int MB = 1024 * 1024;
		
		// Obtendo a memoria utilizada em tempo de exec
		Runtime runtime = Runtime.getRuntime(); //singleton, padroes
		
		// Obtendo memoria utilizada
		System.out.println((runtime.totalMemory() - runtime.freeMemory())/MB);
	}

	public static void main(String[] args) {
		
		Contato[] contatos = new Contato[10000000];
		Contato contato;

		for (int i=0; i<contatos.length; i++){
			contato = new Contato("Contato"+i, "1234-56789"+i, "contato"+i+"@email.com");
			contatos[i] = contato;
		}
		
		System.out.println("Contatos criados");
		
		
		obterMemoriaUsada();
		
		contatos = null;
		
		// Forcando garbage colector 
		// Marcando objetos na memoria para ser coletados pelo coletor depois
		Runtime.getRuntime().runFinalization();
		
		// Pedindo o coletor de lixo de memoria
		Runtime.getRuntime().gc();
		
		System.out.println("Contatos removidos da memória");
		
		obterMemoriaUsada();
	}

}
