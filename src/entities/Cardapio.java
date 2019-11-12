package entities;
import java.util.ArrayList;

public class Cardapio {
	
	private ArrayList<Produto> cardapio = new ArrayList<>();
	
	
	public void registrarProduto(String nome, String descricao, double preco, int id) {		
		cardapio.add(new Produto(nome, descricao, preco, id));
	}
	public ArrayList<Produto> getCardapio() {
		return cardapio;
	}

    public String exibirCardapio() {
        String values = "";
        values += "------ CARDAPIO ------";
        values += "\n";
        for(Produto p: cardapio) {
        	values += "ID: "+ p.getId();
            values += "\n";
            values += "Produto: " + p.getNome();
            values += "\n";
            values += "Desc: " + p.getDescricao();
            values += "\n";
            values += "Preço: "+ p.getPreco();
            values += "\n";     
        }
        values += "------------------";
        return values;
    } 
	
	
	
	
}
