package recursosIntAvanc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

// Sequel Pro - for Database
// Driver Download - https://dev.mysql.com/downloads/connector/odbc/
//Forma de testar dentro de um banco de dados, pra tanto vou precisar de um banco instalado, com tabelas criadas e dados inseridos

public class JDBC_TesteBancoMySql {
	
	// Cria um objeto do tipo conexão com banco de dados
	static Connection conn = null;
	// Cria um objeto do tipo estado 
	private static Statement stmt;
	// Cria uma variavel do tipo resultado 
	private static ResultSet results = null;
	// Cria uma variavel para string de conexão com o banco mysql e oracle
	public static String DB_URL = "jdbc:mysql://localhost:3306/users"; // Oracle "jdbc:oracle:thin:@localhost:1521/sid"

	// Cria uma variavel username com valor inicial root
	public static String DB_USER = "root";

	// Cria uma variavel senha para acesso ao banco com valor inicial null
	public static String DB_PASSWORD = null;
	
	// Driver para conexão com o banco
	public static String driver = "com.mysql.jdbc.Driver"; // "oracle.jdbc.driver.OracleDriver"
	
	// WebDriver
	// public static WebDriver dv;

	@BeforeClass
	public void beforeClass() {
		// Intialize WebDriver
		// dv = new FirefoxDriver();
		
		// Criando objeto do tipo propriedades para conexão ao banco
		Properties props = new Properties();
		props.setProperty("user", "root");
		props.setProperty("password", "");
	    
		try {
			// STEP 1: Register JDBC driver
			Class.forName(driver).newInstance();
			
			// STEP 2: Conectando com o banco de dados
			System.out.println("Connecting to a selected database...");
			
			// Construindo a string de conexão, passando ao objeto gerenciador de conexão e o metodo conecta os parametros string de conexão, usuario do banco e senha 
			conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			// conn = DriverManager.getConnection(DB_URL, props);		// Segunda forma para conectar ao banco 
			System.out.println("Connected database successfully...");
			
			// STEP 3: Criando objeto para o envio de instruções ao banco
			System.out.println("Creating statement...");
			stmt = conn.createStatement();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Caso de teste
	@Test
	public void test() throws SQLException {
		// Query para consulta no banco
        String query = "select * from user_info";
        
        try {
        	// STEP 4: Extraindo dados da variavel resultados que recebe o retorno da query executada no banco
        	results = stmt.executeQuery(query);
        	
        	// Enquanto a variavel resultado enxergar novos registros continua trazendo novos dados e apresentando-os
        	while (results.next()) {
        		// Variaveis locais utilizadas para mostrar os registros resultado do banco para a query executada
        		int id = results.getInt("user_id");
        		String last = results.getString("last_name");
        		String first = results.getString("first_name");
        		String city = results.getString("city");
        		
        		// Apresentando todos os valores do registro obtido durante a consulta para cada coluna
        		System.out.println("ID: " + id);
        		System.out.println("Last Name: " + last);
        		System.out.println("First Name: " + first);
        		System.out.println("City: " + city);
        		
        		// Validando via interface grafica
//        		WebElement element = dv.findElement(By.id("uname"));
//        		String actualUserName = element.getText();
//        		Assert.assertEquals(actualUserName, first);
            }
        	// Fechando conexões com o banco
        	results.close();
		} catch (SQLException se) {
			// Tratando erros do conector JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Tratando erros de Class.forName
			e.printStackTrace();
		}
	}

	@AfterClass
	public void afterClass() {
		try {
			// Confirmando e fechando todas as conexões com o banco de dados para evitar consumo de memoria desnecessário entre outros problemas
			if (results != null)
				results.close();
			if (stmt != null)
				conn.close();
			if (conn != null)
				conn.close();
		} catch (SQLException se) {
			se.printStackTrace();
		}
	}
}
