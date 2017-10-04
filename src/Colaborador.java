package AtividadeDao;

public class Colaborador {
	
	private int id;
	private String cpf;
	private String nome;
	private String endereco;
	private String telefone;
	private String email; 
	private int quantidadeFilhos;
	
	public Colaborador() {}

	public Colaborador(String cpf, String nome, String endereco, String telefone, String email, int quantidadeFilhos) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
		this.quantidadeFilhos = quantidadeFilhos;
	}

	public Colaborador(int id, String cpf, String nome, String endereco, String telefone, String email,
			int quantidadeFilhos) {
		super();
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
		this.quantidadeFilhos = quantidadeFilhos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getQuantidadeFilhos() {
		return quantidadeFilhos;
	}

	public void setQuantidadeFilhos(int quantidadeFilhos) {
		this.quantidadeFilhos = quantidadeFilhos;
	}

	@Override
	public String toString() {
		return "Colaborador [id=" + id + ", cpf=" + cpf + ", nome=" + nome + ", endereco=" + endereco + ", telefone="
				+ telefone + ", email=" + email + ", quantidadeFilhos=" + quantidadeFilhos + "]";
	}

}