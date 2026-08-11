package Atividade2;

public class Principal {
    
    public static void main(String[] args) {
        Filme filme1 = new Filme();
        filme1.titulo = "Godzilla";
        filme1.duracao = 230;
        filme1.nota = 8.8;
        filme1.assistido = false;

        Filme filme2 = new Filme();
        filme2.titulo = "Circulo de Fogo";
        filme2.duracao = 210;
        filme2.nota = 9.7;
        filme2.assistido = false;

        Filme filme3 = new Filme();
        filme3.titulo = "Circulo de Fogo: A Revolta";
        filme3.duracao = 220;
        filme3.nota = 6.5;
        filme3.assistido = false;

        filme1.avaliar(9.2);
        filme2.marcarAssistido();

    }
}
