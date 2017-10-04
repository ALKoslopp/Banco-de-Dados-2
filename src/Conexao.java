package AtividadeDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	private static Connection connection;
	
	private static final String URL = "jdbc:mysql://localhost:3306/atividadedao";
	
	private static final String USER = "root";
	
	private static final String PASSWORD = "adlan";
	
	private  static final String TPCONEXAO = "com.mysql.jdbc.Driver";
	
	public static Connection abrir() {
		try {
			Class.forName(TPCONEXAO);
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("Funcionou");
		} catch (ClassNotFoundException  | SQLException ex) {
			ex.printStackTrace();
		}
		return connection;
	}
	
	public void fechar() {
		if (connection != null) {
			try {
				connection.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
