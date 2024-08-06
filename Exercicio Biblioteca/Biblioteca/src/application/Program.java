package application;

import entities.Biblioteca;
import entities.Livro;

public class Program {

	public static void main(String[] args) {
		
		Livro livro1 = new Livro("1984", "George Orwell", 1949, 328);
		Livro livro2 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954, 1178);
		
		Biblioteca biblioteca = new Biblioteca("Biblioteca Central");
		biblioteca.adicionarLivro(livro1);
		biblioteca.adicionarLivro(livro2);
		
		System.out.println("Livros na biblioteca:");
        biblioteca.exibirLivros();
        
        biblioteca.removerLivro("1984");

        System.out.println("Livros na biblioteca após remoção:");
        biblioteca.exibirLivros();
        
	}

}
