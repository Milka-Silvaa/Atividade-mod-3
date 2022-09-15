package agencia;

import java.util.List;

public class Destino {

public double codigo_Destino;
public String estado;
public String cidade;

	// Construtores
	public Destino() {}
	

	public Destino(double codigo_Destino, String cidade, String estado) {
		super();
		this.codigo_Destino = codigo_Destino;
		this.cidade = cidade;
		this.estado = estado;}
	
	
	// Get e Set
	public double getcodigo_Destino() {
		return codigo_Destino;
		}
	
	public void setcodigo_Destino( double codigo_Destino) {
   this.codigo_Destino = codigo_Destino; 
   }
	
	public String getestado() {
		return estado;
		}
		public void setestado( String estado) {
	this.estado = estado;
		}
		public String getcidade() {
			return cidade;
			}
			public void setcidade( String cidade) {
		this.cidade = cidade;
			}
	//ToString
		
		@Override
		public String toString() {
			return "Destino [codigo_Destino=" + codigo_Destino + ", estado=" + estado + ", cidade=" + cidade +  "]";
		}


		public static void addAll(List<Destino> asList) {
			// TODO Auto-generated method stub
			
		}

		
}
