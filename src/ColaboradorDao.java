package AtividadeDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.omg.Messaging.SyncScopeHelper;

public class ColaboradorDao {
	
	private Connection connection;
	private Conexao conexao;
	
	
	public ColaboradorDao(Conexao conexao) {
		this.conexao = conexao;
		connection = conexao.abrir();
	}

	public void save(Colaborador colaborador) {
		String sql = ("INSERT INTO colaborador(CPF, Nome, Endereco, Telefone, Email, quantidadeFilhos)VALUES(?,?,?,?,?,?)");
		PreparedStatement pstmt;
		
		try {
			pstmt = connection.prepareStatement(sql);
			
			pstmt.setString(1, colaborador.getCpf());
			pstmt.setString(2, colaborador.getNome());
			pstmt.setString(3, colaborador.getEndereco());
			pstmt.setString(4, colaborador.getTelefone());
			pstmt.setString(5, colaborador.getEmail());
			pstmt.setInt(6, colaborador.getQuantidadeFilhos());
			
			pstmt.executeUpdate();
			
		} catch(SQLException ex) {
			ex.printStackTrace();
			
		  } finally {
			  conexao.fechar();
		  	}
		
	}

	public Colaborador search(String nome) {
		Colaborador c = null;
		try {
			java.sql.Statement sta;
			sta = connection.createStatement();
			ResultSet instrucao = sta.executeQuery("select * from colaborador where Nome like " + "'%" + nome + "'");
			
			while(instrucao.next()) {
				c = new Colaborador(				
						instrucao.getInt("id"),
						instrucao.getString("CPF"),
						instrucao.getString("Nome"),
						instrucao.getString("Endereco"),
						instrucao.getString("Telefone"),
						instrucao.getString("Email"),
						instrucao.getInt("quantidadeFilhos"));
				
				System.out.println(c);
				
			}
			
			//System.out.println(lista);
			
		} catch(SQLException ex) {
			ex.printStackTrace();
		} finally {
			conexao.fechar();
		}
		return c;		
	}

}
