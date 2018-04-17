package inter.aula89.formatandodatas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Aula89SimpleDateFormat {

	public static void main(String[] args) {
		
		// Classe que formata mais simples as datas
		// Instanciando um objeto tipo data formatador, com o formato da data como parametro
		// Vide docs na oracle
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss a z");
		
		// Crio um objeto tipo calendario gregoriano em que posso passar com exatidao o que desejo 
		// Para ser formatado pelo simpledate, mes comeca em 0 
		Calendar data = new GregorianCalendar(2010, 5, 4, 14, 32, 25);
		
		// Imprime a data formatada com parametro o retorno do get time pra classe calendar
		System.out.println(sdf.format(data.getTime()));
		
		// Formatando classe date
		Date hoje = new Date();
		// Imprime o objeto "formatador" formatando o hoje para uma string
		System.out.println(sdf.format(hoje));
		
		// Recebe os dados todos formatados ref a data de hoje para string
		String d = sdf.format(hoje);
		
		// Cria um novo objeto formatador simples
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		String minhaData = "20/02/2000";
		
		
		try {
			// Recebe um objeto formatado e convertido de formatacao simples para tipo data data
			Date minhaDataEmDate = sdf1.parse(minhaData);
			
			System.out.println(minhaDataEmDate);
			
			// Reutiliza o objeto formatador passando para string a data 
			System.out.println(sdf.format(minhaDataEmDate));
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
