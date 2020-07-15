package aplication;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contrato;
import model.entities.Prestacao;
import model.services.ServicoContrato;
import model.services.ServicoPagamento;

public class Program {

	public static void main(String[] args) throws Exception {


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Entre Com um Contrato");
		System.out.print("Numero: ");
		int numero = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		Date data = sdf.parse(sc.next());
		System.out.print("Valor do Contrato: ");
		double total_valor = sc.nextDouble();
		
		Contrato contrato = new Contrato(numero,data,total_valor);
		
		System.out.print("Entre com o numero de parcelas: ");
		int parcelas = sc.nextInt();
		
		ServicoContrato servicoContrato = new ServicoContrato(new ServicoPagamento());
		
		servicoContrato.processaContrato(contrato, parcelas); // aqui faz todo o processamento do contrato.
		
		System.out.println("PRESTAÇOES A PAGA: ");
		for(Prestacao x : contrato.getPrestacoes()) {
			System.out.println(x);
		}
		sc.close();
	}
	

}
