package agencia;

public class Passagem {
	public int data;
	private int CodigoPassagem;
	public double promoçao;
	public double valorViagem;
	public int codigo_Destino;
	public int cpf;
	
	// construtores
	public Passagem () {}
	
	public Passagem(int data, int CodigoPassagem, double promoçao, double valorViagem,int codigo_Destino, int cpf) {
		super();
		this.data = data;
		this.CodigoPassagem = CodigoPassagem;
		this.promoçao = promoçao;
		this.valorViagem = valorViagem;
		this.codigo_Destino = codigo_Destino;
		this.cpf = cpf;
	}


	// Getteres e Seterss
	
	public int getdata() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public int getCodigoPassagem() {
		return CodigoPassagem;
	}
	public void setCodigoPassagem(int codigoPassagem) {
		this.CodigoPassagem = codigoPassagem;
	}
	public double getPromoçao() {
		return promoçao;
	}
	public void setPromoçao(double promoçao) {
		this.promoçao = promoçao;
	}
	public double getValorViagem() {
		return valorViagem;
	}
	public void setValorViagem(double valorViagem) {
		this.valorViagem = valorViagem;
	}
	public int getcodigoDestino() {
		return codigo_Destino;
	}
		public void setcodigoDestino (int codigo_Destino) {
			this.codigo_Destino = codigo_Destino;
	}
	public int getcpf() {
		return cpf;
	}
	public void setcpf (int cpf) {
	this.cpf = cpf;
	}
	
	

	//Tostring

	@Override
	public String toString() {
		return "Passagem [codigoPassagem=" + CodigoPassagem + ", promoçao=" + promoçao + ", valorViagem=" + valorViagem +", codigo_Destino="+ codigo_Destino +",cpf=" + cpf +"]";
	}
	
	

}
	
