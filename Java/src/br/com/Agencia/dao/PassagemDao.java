package br.com.Agencia.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;


import agencia.Passagem;
import conector.Conection;


public class PassagemDao {

public void save (Passagem passagem) {
String sql = "INSERT INTO passagem(Codigo_Passagem,Promoção,Valor_Viagem,Codigo_Destino,cpf,dataViagem) VALUES (?,?,?,?,?,?)"; 
Connection conn = null;
PreparedStatement pstm = null;
try {
conn = Conection.createConectionToMySQL1();
pstm = (PreparedStatement) conn.prepareStatement(sql);
pstm.setInt(1, passagem.getcodigo_Passagem());
pstm.setDouble(2, passagem.getPromoção());
pstm.setDouble(3, passagem.getValor_Viagem());
pstm.setInt(4, passagem.getCodigo_Destino());
pstm.setInt(5, passagem.getcpf());
pstm.setDate(6, passagem.getdataViagem());
pstm.execute();
System.out.println("contato salvo com sucesso");
}
catch (Exception e) {
e.printStackTrace();
} finally {
try {
if (pstm != null) {
pstm.close();
}

if (conn!=null) {
	conn.close();
}
} catch (Exception e) {
e.printStackTrace();
}
}
}
}