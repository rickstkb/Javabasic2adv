package inter.aula60.escopovariaveis;

public class EscopoVariaveis {
	
	// Atributo da classe
	private int valor;

	// Metodos getters e setters
	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	// Metodo para determinada tarefa
	// Recebe um parametro porem por mais que tenha o mesmo nome de variavel que o atributo da classe
	// Possui escopo local 
	public int calculaValor(int valor){

		valor = valor + 10;
		
		//this.valor = valor;

		return valor;
	}

	public int teste(){

		int valor = 5;

		if (true){

			valor--;
		}

		//this.valor = valor; //referencial valor global/atributo da classe

		return valor;
	}

	public void outroTeste(){

		for (int i=0; i<10; i++){
			System.out.println(i);
		}
		
		//i++; //erro de compilação, pertence apenas ao bloco for

		int j;
		for (j=0; j<10; j++){
			System.out.println(j);
		}

		System.out.println(j); //j tem valor 10
	}

	public void maiUmTeste(){

		boolean flag = true;
		
		if (flag){

			int umaVariavel = 10;

			umaVariavel++;

			System.out.println(umaVariavel);
		}

		//System.out.println(umaVariavel); //erro de compilação, nao e alcancado pelo bloco if do metodo
	}

	public void maiUmOutroTeste(int num){

		int total = 0;

		try {
			int outroNum = 0;

			total = num/outroNum;

		} catch (Exception e){
			e.printStackTrace();
		} finally {

			total++;
			//outroNum++; //erro de compilação, declarado dentro do bloco try 
			//e.printStackTrace(); //erro de compilação
		}

		num++;

		//outroNum++; //erro de compilação, declarado dentro do bloco try
		//e.printStackTrace(); //erro de compilação
	}
}
