import java.util.Date;

import agencia.Passagem;
import br.com.Agencia.dao.PassagemDao;


public class PassagemJava {
public static void main(String[] args) {
PassagemDao passagemdao = new PassagemDao();
Passagem p1 = new Passagem(98987678,342.5,432,2345,6645356,null);
passagemdao.save(p1);


System.out.println("Codigo_Passagem: " + p1.getcodigo_Passagem());
System.out.println("Promoção: " + p1.getPromoção());
System.out.println("valorViagem: "+ p1.getValor_Viagem());
System.out.println("codigoDestino: " + p1.getCodigo_Destino());
System.out.println("cpf: "+ p1.getcpf());
System.out.println("dataViagem"+ p1.getdataViagem());
}
}
