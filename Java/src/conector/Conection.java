package conector;
import java.sql.Connection;
import java.sql.DriverManager;



public class Conection {
	
	
	//Entrada
	private static final String USERNAME = "root";
	
	//Ssenha
	
	private static final String PASSWORD = "983414187";
	
	
	//CAMINHO DO BANCO 
	private static final String DATABASE_URL =  "jdbc:mysql://localhost:3306/temvagaa";
	
	// CLASSE CARREGADA PELO JVM
	public static Connection createConectionToSQL() throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	// CRIANDO A CONEXAO BANCO 
	Connection conection =  DriverManager.getConnection(DATABASE_URL,USERNAME,PASSWORD);
	return conection;
	
	}

	public static void main(String[] args) throws Exception {	
		
		Connection con = createConectionToSQL();
		// testar se a conexão é nula
		
		if(con != null) {
			System.out.println("conexão obtida com sucesso");
			con.close();
}
}
}