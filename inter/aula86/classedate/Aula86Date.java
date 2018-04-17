package inter.aula86.classedate;

import java.util.Date;

public class Aula86Date {

	public static void main(String[] args) {
		
		Date hoje = new Date();
		
		System.out.println(hoje);
		
		// Retorna a quantidade de ms desde 1970
		System.out.println("Milisegundos desde 1 Jan 1970 " + hoje.getTime());
		
		// Esta depreciado pela marcacao em amarelo, existe recursos mais novos pra isso em outra aula com calendar
		System.out.println(hoje.getDate());

	}

}
