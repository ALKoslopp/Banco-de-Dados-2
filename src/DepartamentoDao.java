package AtividadeDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DepartamentoDao {
	
	private Connection connection;
	private Conexao conexao;
	
	public DepartamentoDao(Conexao conexao) {
		this.conexao = conexao;
		connection = conexao.abrir();
	}

	public void save(Departamento departamento) {
		String sql = ("INSERT INTO departamento(nome) VALUES(?)");
		PreparedStatement pstmt;
		
		try {
			pstmt = connection.prepareStatement(sql);
			
			pstmt.setString(1, departamento.getNome());
			
			pstmt.executeUpdate();
		} catch(SQLException ex) {
			ex.printStackTrace();
		} finally {
			conexao.fechar();
		}
		
	}
	public Departamento search(String nome) {
		Departamento d = null;
		try {
			java.sql.Statement sta;
			sta = connection.createStatement();
			ResultSet instrucao = sta.executeQuery("select * from departamento where Nome like " + "'%" + nome + "'");
			
			while(instrucao.next()) {
				d = new Departamento(				
						instrucao.getInt("id"),
						instrucao.getString("Nome"));
				System.out.println(d);
				
			}
			
		} catch(SQLException ex) {
			ex.printStackTrace();
		} finally {
			conexao.fechar();
		}
		return d;		
	}
	
	
	

}
