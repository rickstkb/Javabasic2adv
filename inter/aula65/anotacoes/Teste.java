package inter.aula65.anotacoes;

// No caso para utilizar a anotacao
// Coloca se "@"

// Nesse caso vai requisitar a passagem de informacoes 
// Podemos definir tbm onde essas anotacoes serao utilizadas ex: classe, metodo, atributo

// Muitas vezes anotacoes sao apontamentos para uso com o codigo, sinalizando ao compilador, servidor, etc como lidar com aquele trecho da solucao escrita

@InformacaoAula(
		// Passando variaveis e valores
		autor = "Loiane",
		aulaNumero = 65,
		
		// Informacoes passadas anteriormente podem ser sobrescritas
		blog = "loiane.com"
	)
 
	public class Teste {

		@InformacaoAula(
				autor = "Loiane",
				aulaNumero = 65,
				blog = "loiane.com"
			)
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub

		}
}