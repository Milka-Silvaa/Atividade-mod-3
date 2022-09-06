import agencia.*;
import br.com.Agencia.dao.ClienteDao;


public class Principal {

	public static void main(String[] args) {

		ClienteDao clientedao = new ClienteDao();
     
		Cliente c1 = new Cliente ("KAUAN",876587666,543454252,"KAUANZINHO@gmail.com",48,544564323,"PARIS","FRANÇA","COMO EU ERA ANTES DE VOCE","PA",6756754,657656789);
		clientedao.save(c1);

		System.out.println("Nome: " + c1.getNome());
		System.out.println("Cpf: " + c1.getCpf());
		System.out.println("Telefone: " + c1.getTelefone());
		System.out.println("Email: "+ c1.getEmail());
		System.out.println("Idade: " + c1.getIdade());
		System.out.println("Cep: " + c1.getCep());
		System.out.println("Pais: "+ c1.getPais());
		System.out.println("Endereço: " + c1.getEndereço());
		System.out.println("Bairro: " + c1.getBairro());
		System.out.println("Estado: "+ c1.getEstado());
	System.out.println("Numero: " + c1.getNumero());
	System.out.println("data_nascimento: "+ c1.getdata_nascimento());
	}
}
