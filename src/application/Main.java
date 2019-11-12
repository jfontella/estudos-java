package application;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Conta;
import entities.CurrencyConverter;
import entities.Employee;
import entities.Pedido;
import entities.Product;
import entities.Produto;
import entities.Room;
import entities.Tenant;
import entities.Cardapio;
// List <String> lista = fila.stream().filter(x -> x.charAt(0) == letra).collect(Collectors.toList());



public class Main {
    public static void main(String[] args) {
    	
        Scanner scn = new Scanner(System.in);  
        scn.useLocale(Locale.US);
        Cardapio cardapio = new Cardapio();
        Pedido pedido = new Pedido();
        int totalCardapio = 0;
        System.out.println("[SISTEMA]Quantos produtos você deseja registrar no cardapio hoje?");
        totalCardapio = scn.nextInt();
        for (int i = 0; i < totalCardapio; i++) {			

        	System.out.println("Digite o nome do produto " + (i + 1));
			String nome = scn.next();
			System.out.println("Digite a descrição");
			String desc = scn.next();
			System.out.println("Digite o preço");
			double preco = scn.nextDouble();
			scn.nextLine();
			cardapio.registrarProduto(nome, desc, preco, (i + 1));
			
		}
        int operador = -1;
        while(operador != 0) {
        	System.out.println("Digite 1 para cardapio, 2 para fazer pedido e 3 para fechar a conta");
        	operador = scn.nextInt();
        	if(operador == 0) {
        		if(pedido.getMesaAtiva() == false) {
        			System.out.println("Obrigado por utilizar o restaurante!");
            		System.exit(0);
        		}
        		else {
        			System.out.println("Digite 3 para encerrar a conta");
        			operador = -1;
        		}
        	}
        	if(operador == 1) {
        		System.out.println(cardapio.exibirCardapio());
        	}
        	if(operador == 2) {
        		int pid = -1;
        		ArrayList<Produto> lCardapio = new ArrayList<>();
        		lCardapio = cardapio.getCardapio();
        		System.out.println("Digite o id do produto que deseja pedir");
        		pid = scn.nextInt();
        		for (Produto produto : lCardapio) {
					if(pid == produto.getId()) {
						pedido.adicionarProduto(produto.getNome(), produto.getDescricao(), produto.getPreco(), pid);
					}
				}  	
        	}
        	if(operador == 3) {
        		pedido.encerrarPedido();
        		System.out.println(pedido.exibirPedido());
        		System.out.println("Total: " + pedido.getTotal());
        		System.out.println("Serviços: " + pedido.getTaxas());
        		System.out.println("Total + serviços: " + (pedido.getTotal() - pedido.getTaxas()));
        		System.out.println("-------------");
        		System.out.println("Obrigado por usar o restaurante");
        		operador = 0;
        	}
        	
        }
         
       
        

    	}
}