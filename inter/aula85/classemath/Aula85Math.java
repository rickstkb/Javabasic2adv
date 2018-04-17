package inter.aula85.classemath;

// Funcoes trigonometricas, exponenciais, arredondamento, conversao de radius para graus, etc
public class Aula85Math {

	public static void main(String[] args) {
		
		// Dois elevado a tres
		System.out.println(Math.pow(2, 3));
		
		// Arredondamento pra cima
		System.out.println(Math.round(4.7));
		// Pra baixo
		System.out.println(Math.round(4.4));
		
		// Arredonda pra cima
		System.out.println(Math.ceil(4.4));
		
		System.out.println(Math.ceil(4.7));
		
		// Pra baixo
		System.out.println(Math.floor(4.4));
		
		System.out.println(Math.floor(4.7));
		
		// Gera numero randomico o multiplicador serve como limite de quantos numeros desejados 0 - 100
		System.out.println(Math.round(Math.random() * 100));
		
		
		// Funcoes trigonometricas, pode passar o angulo em graus a partir do toRadians
		System.out.println(Math.sin(Math.toRadians(30)));
		
		System.out.println(Math.cos(Math.toRadians(1)));
		
		System.out.println(Math.tan(Math.toRadians(45)));

		// Nao e uma linguagem totalmente segura pra trabalhar com numeros por problemas em precisao decimal,
		// Pra isso usa o bignumer e decimal pra evitar isso
	}
}
