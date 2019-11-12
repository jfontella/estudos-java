package entities;
import java.util.ArrayList;

public class Pedido {
	private double total;
	private double taxas;
	private boolean mesaAtiva = false;
	private ArrayList<Produto> produtosConsumidos = new ArrayList<>();
	
	
	public void adicionarProduto(String nome, String descricao, double preco, int id) {		
		produtosConsumidos.add(new Produto(nome, descricao, preco, id));
		mesaAtiva = true;
	}
	public void encerrarPedido() {
		for (Produto produto : produtosConsumidos) {
			total += produto.getPreco();
		}
		taxas = total / 10;
		total += taxas;
	}
	public double getTotal(){
		return total;
	}
	public double getTaxas() {
		return taxas;
	}
	public boolean getMesaAtiva() {
		return mesaAtiva;
	}
	public String exibirPedido() {
        String values = "";
        values += "------ Conta ------";
        values += "\n";
        for(Produto p: produtosConsumidos) {
            values += "Produto: " + p.getNome();
            values += "\n";
            values += "Preço: "+ p.getPreco();
            values += "\n";
        }
        values += "------------------";
        return values;
    } 

}
