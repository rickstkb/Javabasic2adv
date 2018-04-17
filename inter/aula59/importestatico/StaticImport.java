package inter.aula59.importestatico;

// Aqui importa tudo nesse caso outros pacotes comuns 
// import inter..

// Nesse caso para classe math, e fazer o import estatico acrescenta o modificador static apos o import
// E possivel tbm colocar o nome do metodo que deseja manter estatico
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

// Acesso a todos os metodos da classe, nao e mto utilizado
// Dificulta legibilidade do que esta sendo utilizado na aplicacao
// Utiliza o curinga "*"
import static java.lang.Math.*;

// E possivel tbm fazer isso com todos os pacotes do projeto
import basico.*;

public class StaticImport {

	public static void main(String[] args) {
		
		double a = 2;
		double b = 3;
		double c = 4;
		
		// Todos os metodos classe math sao estaticos, pois nao precisam ser instanciados
		// Em situacoes que utilizem mtos metodos estaticos e deseja reduzir a escrita sem perder a finalidade
		// Faz entao o import estatico
		System.out.println(Math.pow(a,b));
		System.out.println(Math.sqrt(c));
		System.out.println(pow(a, b));
		System.out.println(sqrt(c));
	}

}
