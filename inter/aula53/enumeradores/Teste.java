package inter.aula53.enumeradores;

public class Teste {

	public static void main(String[] args) {
		
		usandoConst();
		
		System.out.println();
		
		usandoEnum();
	}
	
	private static void usandoConst(){
		int segunda = DiaSemanaConstantes.SEG;
		int terca = DiaSemanaConstantes.TER;
		int quarta = DiaSemanaConstantes.QUA;
		int quinta = DiaSemanaConstantes.QUI;
		int sexta = DiaSemanaConstantes.SEX;
		int sabado = DiaSemanaConstantes.SAB;
		int domingo = DiaSemanaConstantes.DOM;
		
		System.out.println("Teste utilizando constantes no java");
		impDiaSemana(segunda);
		impDiaSemana(terca);
		impDiaSemana(quarta);
		impDiaSemana(quinta);
		impDiaSemana(sexta);
		impDiaSemana(sabado);
		impDiaSemana(domingo);
	}
	
	// Por ser declaro fora do metodo main e necessario utilizar ele sera static
	private static void impDiaSemana(int dia){
		switch (dia) {
		case 1:
			System.out.println("Segunda feira");
			break;

		case 2:
			System.out.println("Terca feira");
			break;
			
		case 3:
			System.out.println("Quarta feira");
			break;
			
		case 4:
			System.out.println("Quinta feira");
			break;
			
		case 5:
			System.out.println("Sexta feira");
			break;
			
		case 6:
			System.out.println("Sabado");
			break;	
			
		case 7:
			System.out.println("Domingo");
			break;
			
		}
	}
	
	// Testando o uso de enums
	private static void usandoEnum(){
		DiaSemana seg = DiaSemana.SEG;
		DiaSemana ter = DiaSemana.TER;
		DiaSemana qua = DiaSemana.QUA;
		DiaSemana qui = DiaSemana.QUI;
		DiaSemana sex = DiaSemana.SEX;
		DiaSemana sab = DiaSemana.SAB;
		DiaSemana dom = DiaSemana.DOM;
		
		System.out.println("Teste utilizando enumeradores no java");
		
		impDiaSemana(seg);
		impDiaSemana(ter);
		impDiaSemana(qua);
		impDiaSemana(qui);
		impDiaSemana(sex);
		impDiaSemana(sab);
		impDiaSemana(dom);
		
	}
	
	private static void impDiaSemana(DiaSemana dia){
		switch (dia) {
		case SEG:
			System.out.println("Segunda feira");
			break;

		case TER:
			System.out.println("Terca feira");
			break;
			
		case QUA:
			System.out.println("Quarta feira");
			break;
			
		case QUI:
			System.out.println("Quinta feira");
			break;
			
		case SEX:
			System.out.println("Sexta feira");
			break;
			
		case SAB:
			System.out.println("Sabado");
			break;	
			
		case DOM:
			System.out.println("Domingo");
			break;
			
		}

	}
}
