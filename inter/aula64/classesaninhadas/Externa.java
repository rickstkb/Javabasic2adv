package inter.aula64.classesaninhadas;

// A ideia aqui e trabalhar com duas classes aninhadas uma dentro da outra
// E possivel acessar os membros da classe mais alta de dentro da classe interna
public class Externa {
	private String texto = "texto externo";
	
	public class Interna{	
		private String texto = "texto interno";
		
		// Imprime texto a partir do atributo interno
		public void imprimeTexto(){
			System.out.println(texto);
			
			//consegue ver membros da classe externa
			System.out.println(Externa.this.texto); 
		}
	}
	
	// Interage com os metodos
	public static void main(String[] args){
		
		// Instancia a classe externa
		Externa externa = new Externa();
		
		// Instancia a interna a partir da externa, primeiro a externa pra funcionar
		// Se interna fosse estatica nao precisaria da externa pra depois rodar a interna
		Interna interna = externa.new Interna();
		
		// Imprime o metodo da interna
		interna.imprimeTexto();
	}
}
