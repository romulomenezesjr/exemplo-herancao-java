public class Cliente extends Pessoa {

    double valorDivida;
    int anoNascimento;

    public Cliente(String nome, int idade, String sexo, double valorDivida, int anoNascimento){
        super(nome, idade, sexo);
        this.valorDivida = valorDivida;
        this.anoNascimento = anoNascimento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "valorDivida=" + valorDivida +
                ", anoNascimento=" + anoNascimento +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
