public class Aluno {

    private String nome;
    private int cpf;

    Aluno(String nome, int cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public int getCpf() {
        return cpf;
    }
    
}
