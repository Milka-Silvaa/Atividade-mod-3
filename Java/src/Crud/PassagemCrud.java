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
		
		int data= 0;
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
				System.out.println("**************CONSULTAR PROMOÇOES***************");
				CodigoPassagem = p.nextInt();
				

			break;
			// READ
			case 2:
				System.out.println("CONSULTAR VALORES DA VIAGEM");
			break;
			
			default:
			System.out.println("Opção Invalida");
				break;
			}
		}while(opcao != 0); 
			
		



		
		
		
	}

}
