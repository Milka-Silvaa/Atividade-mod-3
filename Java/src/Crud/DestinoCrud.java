package Crud;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import agencia.Destino;
import br.com.Agencia.dao.DestinoDao;


public class DestinoCrud {

	public static void main(String[] args) {

		
	DestinoDao destinodao = new DestinoDao();
	Scanner s = new Scanner(System.in);
	int opcao = 0;
	int posicao = 0 ;
		
		double codigo_Destino=0;
		String estado="";
		String cidade="";
		List<Destino> destino = new ArrayList<Destino>();
		do {
			System.out.println("*********BEM VINDA(E)(O)AO TEMVAGAS********** ");
			System.out.println("1 - CODIGO DA VIAGEM");
			System.out.println("2 - CONSULTAR DESTINOS DISPONIVEIS");
			System.out.println("3 - ALTERAR DESTINOS ");
			System.out.println("4 - DELETAR CADASTRO");
			System.out.println("0 - SAIR ");
				opcao = s.nextInt();
			// CREATE
			switch(opcao) {
			case 1: 
				System.out.println("INFOME O CODIGO DO DESTINO");
				codigo_Destino = s.nextDouble();
				Destino d1 = new Destino(codigo_Destino, estado,cidade);
				Destino.addAll(Arrays.asList(d1));
				codigo_Destino++;
				System.out.println("\n*** Cadastrou ***\n");
			break;
			// READ
			case 2:
				System.out.println("CONSULTAR DESTINO");
				System.out.println(" Pernambuco \n, Bahia \n, Rio grande do Norte");
			break;
				// UPDATE	
			case 3:
				System.out.println("ALTERAR  Realizada com Sucesso");
			break;
			// DELETE
			case 4:
				System.out.println("DELETAR CADASTRO ? ");
				System.out.println("INFORME O CODIGO A SER DELETADO");
				posicao = nextDouble();
				destino.remove(posicao);
				System.out.println("Codigo deletado com sucesso" + getcodigoDestino());
			break;
			
			default:
			System.out.println("OPÇÃO INVALIDA");
				break;
			}
		}while(opcao != 0); 
			
			
	}

	private static String getcidade() {
		// TODO Auto-generated method stub
		return null;
	}

	private static String getcodigoDestino() {
		// TODO Auto-generated method stub
		return null;
	}

	private static int nextDouble() {
		// TODO Auto-generated method stub
		return 0;
	}	
	}


