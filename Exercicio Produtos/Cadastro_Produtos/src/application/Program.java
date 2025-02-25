package application;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		
		Produto produto1 = new Produto("Iphone", 5000.00, 15, "Celular");
		Produto produto2 = new Produto("Camisa", 35.94, 26, "Roupas");
		Produto produto3 = new Produto("PlayStation 5", 3499.99, 7, "Video Game");
		
		produto1.mostrarInformacoes();
		produto2.mostrarInformacoes();
		produto3.mostrarInformacoes();
		
		System.out.println("Depois da promoção:");
		
		produto1.atualizarPreco(3000.50);
		produto1.removerEstoque(4);
		produto2.atualizarPreco(22.33);
		produto2.removerEstoque(4);
		produto3.atualizarPreco(2175.00);
		produto3.removerEstoque(4);		
		
		produto1.mostrarInformacoes();		
		produto2.mostrarInformacoes();	
		produto3.mostrarInformacoes();
	
	}

}
