package inter.aula55.metvalueofevaluecomenum;

import inter.aula53.enumeradores.DiaSemana;

public class TesteEnum2 {

	public static void main(String[] args) {
		
		// E possivel obter o valor de um enum por uma string
		//.class pois enum tbm pode ser tratado como uma classe
		System.out.println(Enum.valueOf(DiaSemana.class, "DOM" ));
		
		// Tentando gravar o proprio valor do enum por exemplo em um banco
		DiaSemana dia = Enum.valueOf(DiaSemana.class, "DOM" );
		
		System.out.println(dia);
		
	}

}
