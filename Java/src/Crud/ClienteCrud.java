package Crud;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import agencia.Cliente;
import br.com.Agencia.dao.ClienteDao;

	public class ClienteCrud { 
	public static void main(String[] args) {
	
		new ClienteDao();
		Scanner s = new Scanner(System.in);
		int opcao = 0;
		new ArrayList<Cliente>();
Scanner scanner  = new Scanner(System.in);

do {
	System.out.println("*********BEM VINDA(E)(O)AO TEMVAGAS********** ");
	System.out.println("1 - CADASTRAR USUARIO");
	System.out.println("2 - CONSULTAR CADASTRO");
	System.out.println("3 - ATUALIZAR CADASTRO");
	System.out.println("4 - DELETAR CADASTRO");
	System.out.println("0 - SAIR ");
		opcao = s.nextInt();
		new Cliente();
	// CREATE
	switch(opcao) {
	case 1: 
		System.out.println("1 - ****CADASTRAR USUARIO****");
		System.out.println("Digite seu Nome : ");	
		String Nome=scanner.nextLine();
		System.out.println("infome seu CPF: ");
		String cpf=scanner.nextLine();
		System.out.println("infome seu Email: ");
		String email=scanner.nextLine();
		System.out.println("infome seu Telefone: ");
		int telefone=scanner.nextInt();
		System.out.println("infome sua idade: ");
		int idade=scanner.nextInt();
		System.out.println("infome seu Cep: ");
		int cep=scanner.nextInt();
		System.out.println("infome Numero da Casa: ");
		int ncasa=scanner.nextInt();
		System.out.println("Cadastro Realizado com sucesso");
		System.out.printf(" confiema o Cadastramento ? " + " Nome: " + Nome +  " cpf: " + cpf + " Email: " + email + " Telefone: " + telefone +" Idade: "+ idade +" Cep: "+ cep +" Numero da casa: "+ ncasa  );
		opcao = s.nextInt();
		
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
	
	

