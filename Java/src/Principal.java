import agencia.*;
import br.com.Agencia.dao.ClienteDao;


public class Principal {

	public static void main(String[] args) {

		ClienteDao clientedao = new ClienteDao();
     
		Cliente c1 = new Cliente ("kauan",2345678,987654321,"kauan",6,65432198,"Brasil","Rua do Progrmador","maracana","Pe",987,12121996);

		clientedao.save(c1);

		System.out.println("Nome: " + c1.getNome());
		System.out.println("cpf: " + c1.getCpf());
		System.out.println("telefone: " + c1.getTelefone());
		System.out.println("gmail: "+ c1.getEmail());
	}
}
