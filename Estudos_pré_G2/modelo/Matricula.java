package modelo;

public class Matricula {
    
    private Aluno aluno;
    private Plano plano;
    
    public Matricula(Aluno aluno, Plano plano) {
        if (aluno == null || plano == null) {
            throw new IllegalArgumentException("A matrícula precisa de um aluno e um plano!");
        }
        this.aluno = aluno;
        this.plano = plano;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Plano getPlano() {
        return plano;
    }

    public double calcularValor() {
        return plano.calcularMensalidade();
    }

}
