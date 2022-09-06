package br.com.Agencia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import agencia.Destino;
import conector.Conection;

public class DestinoDao {

	
	public void save (Destino destino) {
		String sql = "INSERT INTO destino(codigo_Destino,cidade,estado) VALUES (?,?,?)"; 
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = Conection.createConectionToMySQL1();
			
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			pstm.setDouble(1, destino.getcodigo_Destino());
			pstm.setString(2, destino.getcidade());
			pstm.setString(3, destino.getestado());
			pstm.execute();
			System.out.println("Contato salvo com sucesso");
		}
			catch (Exception e) {
				e.printStackTrace();
			} finally {

				try {
					if (pstm != null) {
						pstm.close();
					}
				} catch (Exception e) {
					e.printStackTrace();
		}
	
	
	
	
			}
	
	}
}
