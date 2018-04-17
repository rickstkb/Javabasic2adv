package inter.aula64.classesaninhadas;

// Trabalhando com classes locais
public class Externa2 {
	
	// Declarando uma classe dentro do metodo, so tem escopo aqui nao consegue ser chamada fora dele
	public void metodoQualquer(){
		
		// Declara classe local
		class ClasseLocal{

			// Declara atribuuto qualquer
			private String texto = "texto classe local";

			// Declara um metodo que use esse atributo
			public void imprimeTexto(){
				System.out.println(texto);
			}
		}
		
		// Instancia classe local
		ClasseLocal local = new ClasseLocal();
		
		// Invoca metodo local dentro da classe local
		local.imprimeTexto();
	}

	// Na main instancia o objeto da classe macro
	public static void main(String[] args){
		Externa2 externa = new Externa2();
		
		// Depois roda o unico metodo que ela tem
		externa.metodoQualquer();
	}
}
