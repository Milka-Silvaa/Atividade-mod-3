import agencia.*;

import br.com.Agencia.dao.DestinoDao;

public class DestinoJava {

	public static void main(String[] args)
	
	
	{
		DestinoDao destinodao = new DestinoDao();
		Destino d1 = new Destino (8765432,"Lagoa Azul", "Maranhão");
		destinodao.save(d1);
		
		System.out.println("Codigo_Destino: " + d1.getcodigo_Destino());
		System.out.println("Estado: " + d1.getestado());
		System.out.println("Cidade: " + d1.getcidade());
	
	}

}
