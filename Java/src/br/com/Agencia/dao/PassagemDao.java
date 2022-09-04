package br.com.Agencia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import agencia.Passagem;
import conector.Conection;


public class PassagemDao {

	public void save (Passagem passagem) {
		String sql = "INSERT INTO passagem(data,CodigoPassagem,promoçao,valorViagem,codigoDestino,cpf) VALUES (?,?,?,?)"; 
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = Conection.createConectionToSQL();
			
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			pstm.setDouble(1, passagem.getdata());
			pstm.setInt(2, passagem.getCodigoPassagem());
			pstm.setDouble(3,passagem.getPromoçao());
			pstm.setDouble(4,passagem.getValorViagem());
			pstm.setDouble(5,passagem.getcodigoDestino());
			pstm.setDouble(6,passagem.getcpf());
			pstm.execute();
		}
			
			catch (Exception e) {
				e.printStackTrace();
			} finally {

				try {
					if (pstm != null) {
					}
				} catch (Exception e) {
					e.printStackTrace();
		}
			}
	}
}
