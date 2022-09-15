package agencia;

import java.sql.Date;
public class Passagem {
	
	private int codigo_Passagem;
	private double Promoção;
	private double Valor_Viagem;
	private int Codigo_Destino;
	private int cpf;
	private Date dataViagem;
	
	// construtores
	public Passagem () {}
	
	public Passagem( int codigo_Passagem, double Promoção, double Valor_Viagem,int Codigo_Destino, int cpf,Date dataViagem) {
		super();
		this.codigo_Passagem = codigo_Passagem;
		this.Promoção = Promoção;
		this.Valor_Viagem = Valor_Viagem;
		this.Codigo_Destino = Codigo_Destino;
		this.cpf = cpf;
		this.dataViagem = dataViagem;
	}


	// Getteres e Seterss
	
	public int getcodigo_Passagem() {
		return codigo_Passagem;
	}
	public  void setcodigo_Passagem(int codigo_Passagem) {
		this.codigo_Passagem = codigo_Passagem;
	}
	public double getPromoção() {
		return Promoção;
	}
	public void setPromoção(double Promoção) {
		this.Promoção = Promoção;
	}
	public double getValor_Viagem() {
		return Valor_Viagem;
	}
	public void setValor_Viagem(double Valor_Viagem) {
		this.Valor_Viagem = Valor_Viagem;
	}
	public int getCodigo_Destino() {
		return Codigo_Destino;
	}
		public void setCodigo_Destino (int Codigo_Destino) {
			this.Codigo_Destino = Codigo_Destino;
	}
	public int getcpf() {
		return cpf;
	}
	public void setcpf (int cpf) {
	this.cpf = cpf;
	}
	
	
	public Date getdataViagem() {
		return dataViagem;
	}
	public void setdataViagem (Date dataViagem) {
	this.dataViagem = dataViagem;
	}
	

	//Tostring

	@Override
	public String toString() {
		return "Passagem [codigo_Passagem=" + codigo_Passagem + ", Promoção=" + Promoção + ", Valor_Viagem=" + Valor_Viagem +", Codigo_Destino="+ Codigo_Destino +",cpf=" + cpf +", dataViagem=" + dataViagem + "]";
	}
	
	

}
	
