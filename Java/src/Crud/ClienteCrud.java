package Crud;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import agencia.Cliente;
import br.com.Agencia.dao.ClienteDao;

	public class ClienteCrud { 
	public static void main(String[] args) {
	
		ClienteDao clientedao = new ClienteDao();
				
		Scanner s = new Scanner(System.in);
		int opcao = 0;
		int posicao = 0 ;
				
		 int id=0;
		 String nome= "";
		 String cpf="";
		 int numero=0;
		 String email="";
		 int idade=0;
		 int cep=0;
		 String pais="";
		 String endereço="";
		 String bairro="";
		 String estado="";
		 int numeroCasa=0;
		 double dataNascimento=0 ;
List<Cliente> cliente = new ArrayList<Cliente>();

do {
	System.out.println("*********BEM VINDA(E)(O)AO TEMVAGAS********** ");
	System.out.println("1 - CADASTRAR");
	System.out.println("2 - CONSULTAR CADASTRO");
	System.out.println("3 - ATUALIZAR CADASTRO");
	System.out.println("4 - DELETAR CADASTRO");
	System.out.println("0 - SAIR ");
		opcao = s.nextInt();
	// CREATE
	switch(opcao) {
	case 1: 
		System.out.println("Digite seu Nome");
		nome = s.nextLine();
		

	break;
	// READ
	case 2:
		System.out.println("Consulta");
	break;
		// UPDATE	
	case 3:
		System.out.println("Alteração Realizada com Sucesso");
	break;
	// DELETE
	case 4:
		System.out.println("Cadastro Deletado com Sucesso");
	break;
	
	default:
	System.out.println("Opção Invalida");
		break;
	}
}while(opcao != 0); 
	
	
	}	
	}
	
	

