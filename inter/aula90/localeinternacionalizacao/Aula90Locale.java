package inter.aula90.localeinternacionalizacao;

import java.text.NumberFormat;
import java.util.Locale;

// Como aplicar intercionalizacao de algumas classes utilizando a classe locale
// A classe locale ira representar diferentes formatos de informacoes dependendo de onde estiver
// 
public class Aula90Locale {

	public static void main(String[] args) {
		
		//dd/MM/yyyy / 02/01/2000
		//MM/dd/yyyy / fev-01/2000
		
		//1.000,02
		//1,000.02
		
		// Cria se um objeto tipo locale
		// Pra descobrir o local da maquina da um getdefault
		Locale locale = Locale.getDefault();
		
		// Imprimindo o padrao local
		System.out.println(locale);
		
		// Declarando um vetor de localidades disponiveis 
		Locale[] locales = Locale.getAvailableLocales();
		
		// Passando por todos os locais armazenados no vetor
		for (Locale loc: locales){
			// traz o nome do local
			System.out.println("Nome: " + loc.getDisplayName());
			// O codigo da lingua 
			System.out.println("Código da língua: " + loc.getLanguage());
			// Nome da lingua
			System.out.println("Língua: " + loc.getDisplayLanguage());
			// Codigo do pais
			System.out.println("Cod País: " + loc.getCountry());
			// Nome do pais
			System.out.println("País: " + loc.getDisplayCountry());
			
			System.out.println("*******************");
		}
		
		// Pode se criar um locale passando a lingua e o pais caso desejado
		Locale br = new Locale("pt", "Brazil");
		
		// Saida apenas da codigo da lingua
		System.out.println(br);
		
		
		// Setando o locale como se fosse o padrao do sistema, com br como locale padrao
		Locale.setDefault(br);
		// Imprimindo o locale do sistema atualmente no servidor que tem a solucao hospedada
		System.out.println(Locale.getDefault());
		
		// Objeto formatador de numero, para saida do numero formato no tipo que desejo, no caso o double
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		System.out.println(nf.format(5000000000d));
		
		// Formatando numero de acordo com a moeda por pais 
		NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(nf1.format(5000000000d));
		
		NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.ITALY);
		System.out.println(nf2.format(5000000000d));

	}

}