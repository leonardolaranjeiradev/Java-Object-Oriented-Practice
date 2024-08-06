package entities; // Define o pacote onde a classe Livro está localizada

// Declaração da classe Livro
public class Livro {
    // Atributos da classe Livro
    private String titulo; // Armazena o título do livro
    private String autor; // Armazena o autor do livro
    private int anoPublicacao; // Armazena o ano de publicação do livro
    private int numeroPaginas; // Armazena o número de páginas do livro

    // Construtor completo da classe Livro
    public Livro(String titulo, String autor, int anoPublicacao, int numeroPaginas) {
        this.titulo = titulo; // Inicializa o atributo titulo com o valor passado como parâmetro
        this.autor = autor; // Inicializa o atributo autor com o valor passado como parâmetro
        this.anoPublicacao = anoPublicacao; // Inicializa o atributo anoPublicacao com o valor passado como parâmetro
        this.numeroPaginas = numeroPaginas; // Inicializa o atributo numeroPaginas com o valor passado como parâmetro
    }

    // Construtor com valores padrão para anoPublicacao e numeroPaginas
    public Livro(String titulo, String autor) {
        this(titulo, autor, 0, 0); // Chama o construtor completo, passando valores padrão para anoPublicacao e numeroPaginas
    }

    // Método para obter o valor do atributo titulo
    public String getTitulo() {
        return titulo; // Retorna o valor atual do atributo titulo
    }

    // Método para definir o valor do atributo titulo
    public void setTitulo(String titulo) {
        this.titulo = titulo; // Atualiza o valor do atributo titulo com o valor passado como parâmetro
    }

    // Método para obter o valor do atributo autor
    public String getAutor() {
        return autor; // Retorna o valor atual do atributo autor
    }

    // Método para definir o valor do atributo autor
    public void setAutor(String autor) {
        this.autor = autor; // Atualiza o valor do atributo autor com o valor passado como parâmetro
    }

    // Método para obter o valor do atributo anoPublicacao
    public int getAnoPublicacao() {
        return anoPublicacao; // Retorna o valor atual do atributo anoPublicacao
    }

    // Método para definir o valor do atributo anoPublicacao
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao; // Atualiza o valor do atributo anoPublicacao com o valor passado como parâmetro
    }

    // Método para obter o valor do atributo numeroPaginas
    public int getNumeroPaginas() {
        return numeroPaginas; // Retorna o valor atual do atributo numeroPaginas
    }

    // Método para definir o valor do atributo numeroPaginas
    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas; // Atualiza o valor do atributo numeroPaginas com o valor passado como parâmetro
    }

    // Método para exibir detalhes do livro
    public void exibirDetalhes() {
        // Exibe o título do livro
        System.out.println("Título: " + titulo);
        // Exibe o autor do livro
        System.out.println("Autor: " + autor);
        // Exibe o ano de publicação do livro
        System.out.println("Ano de Publicação: " + anoPublicacao);
        // Exibe o número de páginas do livro
        System.out.println("Número de Páginas: " + numeroPaginas);
    }
}