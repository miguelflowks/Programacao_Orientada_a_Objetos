public class Titular {

    private String nome;
    private String cpf;
    private String data_nasc;

    Titular(String nome, String cpf, String data_nasc) {
        this.nome = nome;
        this.cpf = cpf;
        this.data_nasc = data_nasc;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            System.out.println("Nome inválido...");
            return;
        }
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

}
