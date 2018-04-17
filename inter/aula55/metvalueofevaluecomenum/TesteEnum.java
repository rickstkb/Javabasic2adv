package inter.aula55.metvalueofevaluecomenum;

import inter.aula54.enumsconstrutoremetodos.DiaSemana;

public class TesteEnum {

	public static void main(String[] args) {
		
		// Enums tbm possuem dois metodos que podem ser utilizados
		// Todo metodo values de um enum retorna um vetor de todos os valores que contem no enumerador
		// Podendo iterar pelos valores
		DiaSemana[] dias = DiaSemana.values();
		
		for(int i=0; i<dias.length; i++){
			System.out.println(dias[i]);
		}
		
		for(DiaSemana dia : DiaSemana.values()){
			System.out.println(dia);
		}
	}

}
