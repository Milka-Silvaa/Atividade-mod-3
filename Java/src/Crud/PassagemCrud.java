package Crud;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import agencia.Passagem;

public class PassagemCrud {

	public static void main(String[] args) {
		
		Passagem passagem = new Passagem();
		Scanner p = new Scanner(System.in);
		int opcao = 0;
		int posição = 0;
		
		int dataViagem= 0;
		int CodigoPassagem =0;
		double promoçao= 0;
		double valorViagem =0;
		int codigoDestino=0;
		int cpf=0;
		List<Passagem> Passagem = new ArrayList<Passagem>();
		
		do {
			System.out.println("*********BEM VINDA(E)(O)AO TEMVAGAS********** ");
		
			System.out.println("1 - CONSULTAR PROMOÇOES");
			System.out.println("2 - CONSULTAR VALORES DAS VIAGENS");
			System.out.println("0 - SAIR ");
				opcao = p.nextInt();
			// CREATE
			switch(opcao) {
			case 1: 
				System.out.println("**************CONSULTAR PROMOÇÕES***************");
				
			System.out.println("Lagoa Azul \n R$:550 \n inclusos : cafe da manha; \n Area de binquedoteca para as crianças");
			System.out.println("*************PROMOÇÃO 2*************");
			System.out.println("Parque Nacional do Piaui \n Cafe da manha; \n Descontos no almoço; \n Bags feitas com pneus reciclados; \n Sandalias feitas com garrafas pets.");
			CodigoPassagem = p.nextInt();
			break;
			// READ
			case 2:
				System.out.println("CONSULTAR VALORES DA VIAGEM");
				System.out.println("********PERNAMBUCO********* \n PORTO DE GALINHAS R$1200. \n Praia dos Carneiros R$: 1000.");
				System.out.println("*********ALAGOAS*********** \n MARAGOGI R$700. \n PRAIA DO TOQUE R$: 700.");
				System.out.println("*********SERGIPE*********** \n PRAIA DO SACO R$600. \n PRAIA DO JATOBA R$: 600.");
				System.out.println("*********CEARA*********** \n DUNAS DE GENIPAPAU R$900. \n LAGOA DO CARCARA R$: 800.");
				System.out.println("*********MARANHÃO*********** \n PLAGOA AZUL R$800. \n PRAIA DO ATINS R$: 800.");
				System.out.println("*********BAHIA*********** \n PRAIA DO FORTE R$600. \n PRAIA DO ESPELHO R$: 600.");
				System.out.println("*********PIAUÍ*********** \n PRAIA DO ARROMBADO R$800. \n PRAIA DE MACAPA R$: 800.");
				System.out.println("*********RIO GRANDE DO NORTE*********** \n PRAIA CANOA QUEBRADO R$700. \n PRAIA DO PARAISO R$: 700.");	
				CodigoPassagem = p.nextInt();
			break;
			
			default:
			System.out.println("Opção Invalida");
				break;
			}
		}while(opcao != 0); 
			
		



		
		
		
	}

}
