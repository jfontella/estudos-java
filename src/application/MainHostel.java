package application;

import java.util.ArrayList;
import java.util.Scanner;
import entities.Room;
import entities.Tenant;

public class MainHostel {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("[SISTEMA]Digite quantos quartos você quer registrar");
		ArrayList<Room> listaQuartos = new ArrayList<>();
		ArrayList<Tenant> listaClientes = new ArrayList<>();
		int quartos = scn.nextInt();
		for(int i = 0; i < quartos; i++) {
			int number = 0; double price = 0; boolean avaible = false;
			System.out.println("Digite o numero, preço "
					+ "e se esta disponivel para a temporada");
			number = scn.nextInt();
			price = scn.nextDouble();
			avaible = scn.nextBoolean();
			listaQuartos.add(new Room(number, price, avaible));		
		}
		System.out.println("Digite o numero de reservas a serem feitas");
		int reservas = scn.nextInt();
		for(int i = 0; i < reservas; i++) {
			String name, mail;
			System.out.println("Digite seu nome e email");
			name = scn.next();
			mail = scn.next();
			listaClientes.add(new Tenant(name, mail));
		}
		System.out.println("Quartos disponiveis");
		for (Room room : listaQuartos) {
			System.out.println("Numero: " + room.getNumber()
								+ "Preço: " + room.getPrice());
		}
		for (Tenant tenant : listaClientes) {
			int number = 0;
			System.out.println("Digite o numero do quarto que deseja se hospedar");
			number = scn.nextInt();
			for (Room room : listaQuartos) {
				if(number == room.getNumber()) {
					room.setTenant(tenant);
				}
			}
		}
		
		System.out.println("[SISTEMA]Hospedagens atuais");
		for (Room room : listaQuartos) {
			System.out.println(room.getRoomInfo());
		}
		
	}

}
