package Atividade1;

public class Principal {
    
    public static void main(String[] args) {
        Produto pao = new Produto();
        pao.nome = "Bauduco";
        pao.preco = 6.50;
        pao.estoque = 20;

        Produto mortadela = new Produto();
        mortadela.nome = "Seara";
        mortadela.preco = 8.90;
        mortadela.estoque = 15;

        Produto queijo = new Produto();
        queijo.nome = "Lac Lelo";
        queijo.preco = 15.00;
        queijo.estoque = 10;

        pao.exibirInfo();
        mortadela.exibirInfo();
        queijo.exibirInfo();


        pao.vender(22);
    
    }    
}
