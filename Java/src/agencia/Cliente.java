package agencia;

public class Cliente{
	public String nome;
	private int cpf;
	public int telefone;
	private String email;
	public int idade;
	private int cep;
	public String pais;
	private String endereço;
	private String bairro;
	private String estado;
	private int numero;
	private double data_nascimento;

	//Construtores

	public Cliente(String nome, int cpf, int telefone, String email, int idade, int cep, String pais, String endereço,
			String bairro, String estado, int numero, double data_Nascimento) {

		
		super();
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
		this.email = email;
		this.cpf = cpf;
		this.data_nascimento = data_nascimento;
		this.numero = numero;
		this.cep = cep;
		this.bairro = bairro;
		this.estado = estado;
		this.pais = pais;
		this. endereço=endereço ;
	}


		// TODO Auto-generated constructor stub
	

	//Get e Set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getTelefone() {
		return numero;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getData_Nascimento() {
		return data_nascimento;
	}

	public void setData_Nascimento(double data_Nascimento) {
		this.data_nascimento = data_Nascimento;
	}


	
	//ToString
	
@Override
public String toString() {
	return "Cliente{nome=" + nome + ", cpf=" + cpf + ", telefone=" + telefone + ", email=" + email + ", idade=" + idade
			+ ", cep=" + cep + ", pais=" + pais + ", endereço=" + endereço + ", bairro=" + bairro + ", estado="
	+ estado + ", numero=" + numero + ", data_Nascimento=" + data_nascimento + "]";
	
	
	
}	
	
	
	}

	