public class Gerente extends Empregado{

    String nomeGerencia;

    public Gerente(String nome, int idade, String sexo, double salario, String matricula, String nomeGerencia) {
        super(nome, idade, sexo, salario, matricula);
        this.nomeGerencia = nomeGerencia;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nomeGerencia='" + nomeGerencia + '\'' +
                ", matricula='" + matricula + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                "valor do Inss" + this.valorInss() +
                '}';
    }

    public String getNomeGerencia() {
        return nomeGerencia;
    }

    public void setNomeGerencia(String nomeGerencia) {
        this.nomeGerencia = nomeGerencia;
    }

    public double getBonificacao(){
        return 0.1*salario + 1000;
    }
}
