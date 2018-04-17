package inter.aula54.enumsconstrutoremetodos;

public class TesteEnum {

	public static void main(String[] args) {
		
		DiaSemana dia = DiaSemana.SEG;
		
		System.out.println(dia.toString() +  " - " + dia.getValor());

		// Nesse caso foi declarada uma outra classe instanciada
		// E parte dela tem um atributo composto por enum que e passado no construtor que foi declarado como tipo em outro lugar
		Data data = new Data(1, 4, 2016, DiaSemana.SEX);
		
	}

}
