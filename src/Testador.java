package AtividadeDao;

public class Testador {

	public static void main(String[] args) {
		Conexao conexao = new Conexao();
		
		ColaboradorDao dao = new ColaboradorDao(conexao);
		//dao.save(new Colaborador("88888", "Ebi amargo", "Rua do beco", "8886-98977", "amargo@gmail.com", 0));
		
		DepartamentoDao dDao = new DepartamentoDao(conexao);
		//dDao.save(new Departamento("Comercial"));
		
		dDao.search("cial");
		

	}

}
