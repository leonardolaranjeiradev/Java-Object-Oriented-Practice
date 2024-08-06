package entities; // Define o pacote onde a classe Biblioteca está localizada

import java.util.ArrayList; // Importa a classe ArrayList, que é uma implementação da interface List
import java.util.List; // Importa a interface List, que define a estrutura de uma lista

// Declaração da classe Biblioteca
public class Biblioteca {
    // Atributos da classe Biblioteca
    private String nome; // Armazena o nome da biblioteca
    private List<Livro> livros; // Armazena a lista de livros da biblioteca

    // Construtor da classe Biblioteca com lista de livros
    public Biblioteca(String nome, List<Livro> livros) {
        this.nome = nome; // Inicializa o atributo nome com o valor passado como parâmetro
        this.livros = new ArrayList<>(livros); // Inicializa a lista de livros com uma nova ArrayList baseada na lista passada como parâmetro
    }

    // Construtor da classe Biblioteca sem lista de livros
    public Biblioteca(String nome) {
        this(nome, new ArrayList<>()); // Chama o construtor que recebe a lista de livros, passando uma lista vazia como parâmetro
    }

    // Método para adicionar um livro à lista
    public void adicionarLivro(Livro livro) {
        livros.add(livro); // Adiciona o livro passado como parâmetro à lista de livros
    }

    // Método para remover um livro pelo título
    public void removerLivro(String titulo) {
        // Remove o livro cuja o título é igual ao parâmetro título
        livros.removeIf(livro -> livro.getTitulo().equals(titulo));
    }

    // Método para exibir todos os livros da biblioteca
    public void exibirLivros() {
        // Itera sobre cada livro na lista de livros
        for (Livro livro : livros) {
            livro.exibirDetalhes(); // Chama o método exibirDetalhes para exibir as informações do livro
            System.out.println(); // Adiciona uma linha em branco para separar os detalhes dos livros
        }
    }

    // Método para obter o nome da biblioteca
    public String getNome() {
        return nome; // Retorna o valor atual do atributo nome
    }

    // Método para definir o nome da biblioteca
    public void setNome(String nome) {
        this.nome = nome; // Atualiza o valor do atributo nome com o valor passado como parâmetro
    }

    // Método para obter a lista de livros
    public List<Livro> getLivros() {
        return new ArrayList<>(livros); // Retorna uma cópia da lista de livros para proteger o encapsulamento
    }

    // Método para definir a lista de livros
    public void setLivros(List<Livro> livros) {
        this.livros = new ArrayList<>(livros); // Atualiza a lista de livros com uma nova ArrayList baseada na lista passada como parâmetro
    }
}