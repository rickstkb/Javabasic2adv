package recursosIntAvanc;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

// Lendo propriedades de arquivos, nesse exemplo pra um arquivo txt
public class LendoArqProperties {

	public static void main(String[] args) throws IOException {
		
		// Aponta o caminho onde esta o arquivo que vai ser lido
		String path = "C:\\Users\\Dell\\workspace\\Java2Est\\src\\recursosIntAvanc\\test.properties";
		
		// Cria um objeto do tipo propriedades
		Properties prop = new Properties();
		
		// Cria se um objeto leitor de entrada passando o caminho como referencia
		FileInputStream fs = new FileInputStream(path);
		
		// O objeto properidades, invoca o metodo de carga passando o leitor de entrada com dados como argumento
		prop.load(fs);
		
		// Busca os dados no arquivo, especificamente as propriedades name e course e apresenta
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("course"));

	}
}