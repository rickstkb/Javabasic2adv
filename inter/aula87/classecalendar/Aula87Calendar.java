package inter.aula87.classecalendar;

import java.util.Calendar;

public class Aula87Calendar {

	public static void main(String[] args) {
		
		// Nao e possivel instanciar objetos calendar
		// Obtem o calendario do java como se fosse instanciado
		Calendar hoje = Calendar.getInstance(); //singleton, padrao de projeto para nao deixar instanciar
		
		System.out.println(hoje);
		
		// Passa uma constante para obter a info desejada
		// No java mes comeca com 0, ou pode ser colocado o mes diretamente
		int ano = hoje.get(Calendar.YEAR);
		int mes = hoje.get(Calendar.MONTH);
		int dia = hoje.get(Calendar.DAY_OF_MONTH);
		int hora = hoje.get(Calendar.HOUR_OF_DAY);
		int minutos = hoje.get(Calendar.MINUTE);
		int segundos = hoje.get(Calendar.SECOND);
		
		// Formatando a data e hora com o printf
		System.out.printf("Hoje é : %02d/%02d/%d %02d:%02d:%02d", 
				dia, (mes+1), ano, hora, minutos, segundos);
		
		// Adiciona ou subtrai um dia na data atual 
		hoje.add(Calendar.DAY_OF_MONTH, -1);
		
		hoje.add(Calendar.DAY_OF_MONTH, 6);
		
		System.out.println();
		
		System.out.println(hoje.get(Calendar.DAY_OF_MONTH));
	
	}
}
