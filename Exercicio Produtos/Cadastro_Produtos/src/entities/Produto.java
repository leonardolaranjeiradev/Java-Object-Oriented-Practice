package entities;

public class Produto {
	
	private String nome;
	private double preco;
	private int quantidade;
	private String categoria;
	
	public Produto() {	
	}

	public Produto(String nome, double preco, int quantidade, String categoria) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.categoria = categoria;
	}
	
	public void atualizarPreco(double novoPreco) {
		if (novoPreco > 0) {
	        preco = novoPreco;
	    } else {
	        System.out.println("Não é permitido colocar valores negativos ou zero!");
	    }	    			
	}
	
	public void adicionarEstoque(int quantidadeAdicional) {
		if (quantidadeAdicional > 0) {
			quantidade += quantidadeAdicional;
		} else {
			System.out.println("Coloque uma quantidade positiva!");
		}		
	}
	
	public void removerEstoque(int quantidadeRemovida) {
		if (quantidadeRemovida > 0 && quantidadeRemovida <= quantidade) {
			quantidade -= quantidadeRemovida;
		} else {
			System.out.println("Valor não permitido!");
		}		
	}
	
	public void mostrarInformacoes() {
		System.out.println("Nome: " + nome);
		System.out.printf("Preço: R$%.2f%n", preco);
		System.out.println("Quantidade: " + quantidade);
		System.out.println("Categoria: " + categoria);
		System.out.println();
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
	
	
	
	

}
