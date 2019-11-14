package application;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class WorkerMain  {

	public static void main(String[] args) throws ParseException {
		Scanner scn = new Scanner(System.in);
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Entre com o nome");
		String nome = scn.next();
		System.out.println("Entre com o rank");
		String rank = scn.next();
		System.out.println("Entre com o departamento");
		String department = scn.next();
		Worker worker = new Worker(nome, WorkerLevel.valueOf(rank), department);
		
		System.out.println("Quantos contratos serão registrador");
		int contratos = scn.nextInt();
		
		for(int i = 0; i < contratos; i++) {
			System.out.println("Entre com os dados do contrato " + (i + 1));
			System.out.println("Data (DD/MM/AAAA)");
			Date data = formatter.parse(scn.next());
			System.out.println("Valor por hora");
			double valuePerHour = scn.nextDouble();
			System.out.println("Quantas horas foram trabalhadas");
			int horas = scn.nextInt();
			HourContract contrato = new HourContract(data, valuePerHour, horas);
			worker.addContract(contrato);
		}
		System.out.println("Entre com o mes");
		int mes = scn.nextInt(); 
		System.out.println("Entre com o ano");
		int ano = scn.nextInt();
		System.out.println("Mes: " + mes + " ano: " + ano);
		System.out.println("Saldo: " + worker.incomePayment(ano, mes));
			
		
	}

}
