public class Principal {

    public static void main(String[] args) {
        Autor autor1 = new Autor("JJ", "Brasileiro");
        Autor autor2 = new Autor("Fã do JJ", "Brasileiro");

        Livro livro1 = new Livro("Desgraça Cósmica", autor1, 2017, true);
        Livro livro2 = new Livro("Desgraça Cósmica: A revolta", autor1, 2018, false);
        Livro livro3 = new Livro("Desgraça Cósmica: A volta dos que não foram", autor2, 2019, false);

        livro2.emprestar();
        livro2.exibirFicha();
    }
}
