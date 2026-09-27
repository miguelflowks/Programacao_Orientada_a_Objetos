package Atividade1;

public class Produto {
    String nome;
    double preco;
    int estoque;


    void exibirInfo() {
        System.out.println("Nome Produto:" + nome + "|Preço: " + preco + "|Estoque atual: " + estoque);
    }

    void vender(int quant) {
        if (estoque - quant < 0) {
            System.out.println("Estoque insuficiente!");
        } else {
            estoque = estoque - quant;
            System.out.println("Foi reduzido " + quant + " do estoque" +
            " | O estoque atual é: " + estoque);
        }
        
    }

}
