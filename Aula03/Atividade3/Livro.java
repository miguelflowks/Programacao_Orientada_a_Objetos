public class Livro {
    String titulo;
    Autor autor;
    int ano;
    boolean emprestado;

    Livro(String titulo, Autor autor, int ano, boolean emprestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.emprestado = false;
    }

    void exibirFicha() {
        System.out.println("Titulo -> " + titulo);
        System.out.println("Nome do Autor -> " + autor.nome);
        System.out.println("Ano de publicação -> " + ano);
    }

    void emprestar() {
        if (emprestado == false) {
            emprestado = true;
        } else { 
            System.out.println("O livro já está sendo utilizado...");
        }
    }
}
