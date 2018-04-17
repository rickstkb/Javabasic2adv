package inter.aula91.formatdatascomdateformatelocale;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

// Utilizando date format com locale
// Date format abstrata nao pode ser instanciada
// E possivel trabalhar com locale da aplicacao/servidor via date format
public class Aula91DateFormat {

	public static void main(String[] args) {
		
		// A ideia aqui e obter as configuracoes do servidor em que hospeda a aplicacao e repassar as configs
		Date hoje = new Date();
		System.out.println(Locale.getDefault());
		
		// Formatando a data de acordo com o locale da aplicacao
		// Obtendo uma instancia do dateformat com as configuracoes de formatacao do locale
		// Formatando tbm a data de hoje, mostrando a saida na console
		String hojeFormatado = DateFormat.getInstance().format(hoje);
		System.out.println(hojeFormatado);
		
		// Antes no padrao do servidor, apos isso o formato que colocamos
		
		// Mudando locale do computador/servidor
		Locale.setDefault(new Locale("pt", "Brazil"));
		
		// getinstante pega a data completa e formata 
		hojeFormatado = DateFormat.getInstance().format(hoje);
		System.out.println(hojeFormatado);
		
		// So pega o horario e formata na data de hoje 
		hojeFormatado = DateFormat.getTimeInstance().format(hoje);
		System.out.println(hojeFormatado);
		
		// Formatando apenas a data do objeto date
		hojeFormatado = DateFormat.getDateInstance().format(hoje);
		System.out.println(hojeFormatado); //dd/MMM/yyyy
		
		// Aqui traz data e hora formatada
		hojeFormatado = DateFormat.getDateTimeInstance().format(hoje);
		System.out.println(hojeFormatado);
		
		// Outras formas de formatacao de data e hora, pode ser utilizado constantes, formato curto nesse caso
		hojeFormatado = DateFormat.getTimeInstance(DateFormat.SHORT).format(hoje);
		System.out.println(hojeFormatado);
		
		// Passando formato medio da data, hora minuto e segundo
		hojeFormatado = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(hoje);
		System.out.println(hojeFormatado);
		
		// Aqui passa o fuso horario junto com td isso
		hojeFormatado = DateFormat.getTimeInstance(DateFormat.LONG).format(hoje);
		System.out.println(hojeFormatado);
		
		// Nesse caso pode misturar os formatos de data e de hora da forma desejada
		hojeFormatado = DateFormat.getDateTimeInstance(
				DateFormat.SHORT, DateFormat.SHORT).format(hoje);
		System.out.println(hojeFormatado);
		
		
		// Pode ser feito o contrario tbm, ter uma string e transformar em um tipo data
		String data = "12-02-2017 14:25";
		
		// Precisa prestar atencao no formato da string passada 
		try {
			
			// Declaro um objeto do tipo que espero ter, recebendo a conversao para o formato que desejo de informacoes passando a string que quero converter
			// Como o metodo parse pode lancar uma excecao a ide avisa e solicita uma tratativa nesse caso try catch
			Date dataDate = DateFormat.getInstance().parse(data);
			System.out.println(dataDate);		// valor convertido
			
			// Transformando agora o objeto do tipo date criado a partir de uma string, em um tipo calendar
			// Declaro um objeto calendario, que obtem uma instancia do calendario
			Calendar calendario = Calendar.getInstance();
			calendario.setTime(dataDate);
			System.out.println(calendario);
			
			// E possivel entao transformar de string pra date com date format ou simple date format
			// E de date pra calendar, pelo metodo setTime
			
			// Date format mais util quando estiver trabalhando com locale
			// Simple date format quando quer especificar o formato da data
			
			// Caso existe algum problema na conversao a excecao e tratada
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}