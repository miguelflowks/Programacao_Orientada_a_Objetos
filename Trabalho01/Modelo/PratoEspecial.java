package modelo;

public class PratoEspecial extends Prato {
    private double custoIngredientePremium;

    public PratoEspecial(String nome, double precoBase, int tempoPreparo, double custoIngredientePremium) {
        super(nome, precoBase, tempoPreparo);
        if (custoIngredientePremium < 0) {
            throw new IllegalArgumentException("O custo do ingrediente premium não pode ser negativo.");
        }
        this.custoIngredientePremium = custoIngredientePremium;
    }

    @Override
    public double calcularPreco() {
        return getPrecoBase() + custoIngredientePremium;
    }

    public double getCustoIngredientePremium() {
        return custoIngredientePremium;
    }
}