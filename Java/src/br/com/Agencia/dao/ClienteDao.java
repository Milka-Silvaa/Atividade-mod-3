package br.com.Agencia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;

import agencia.Cliente;
import conector.Conection;


public class ClienteDao {

	public void save(Cliente cliente) {

		String sql = " INSERT INTO cliente(nome, cpf, telefone, email, idade,cep,pais, endereço,bairro, estado,numero,data_nascimento) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			conn = Conection.createConectionToSQL();

			pstm = (PreparedStatement) conn.prepareStatement(sql);
			pstm.setString(1, cliente.getNome());
			pstm.setInt(2, cliente.getCpf());
			pstm.setInt(3, cliente.getTelefone());
			pstm.setString(4, cliente.getEmail());
			pstm.setInt(5, cliente.getIdade());
			pstm.setInt(6, cliente.getCep());
			pstm.setString(7, cliente.getPais());
			pstm.setString(8, cliente.getEndereço());
			pstm.setString(9, cliente.getBairro());
			pstm.setString(10, cliente.getEstado());
			pstm.setInt(11, cliente.getNumero());
			pstm.setDouble(12, cliente.getData_Nascimento());

			pstm.execute();
			System.out.println("contato salvo com sucesso");
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
