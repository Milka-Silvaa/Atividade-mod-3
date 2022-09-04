import agencia.Passagem;
import br.com.Agencia.dao.PassagemDao;

public class PassagemJava {

	public static void main(String[] args) {

		
		PassagemDao passagemdao = new PassagemDao();
		
		Passagem p1 = new Passagem(876509,54367,987,873,3464,345643256);
		passagemdao.save(p1);
		
		System.out.println("data: " + p1.getdata());
		System.out.println("CodigoPassagem: " + p1.getCodigoPassagem());
		System.out.println("Promçao: " + p1.getPromoçao());
		System.out.println("valor: " + p1.getValorViagem());
		System.out.println("codigoDestino: " + p1.getcodigoDestino());
		
		System.out.println("cpf: " + p1.getcpf());

}
}
