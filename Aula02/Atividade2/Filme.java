package Atividade2;

public class Filme {
    String titulo;
    int duracao;
    Double nota;
    boolean assistido;

    void exibirFicha() {
        System.out.println("Nome Filme:" + titulo + "|Duração: " + duracao + "|Nota: " + nota);
    }
    
    void marcarAssistido() {
        assistido = true;
    }


    void avaliar(double novaNota) {
        if (novaNota >= 0 && novaNota <= 10) {
            nota = novaNota;
            System.out.println("Avaliação registrada com sucesso!");
        } else {
            System.out.println("Nota inválida. Informe um valor entre 0 e 10.");
        }
    }

}
