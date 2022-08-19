public class Vendedor extends Empregado {

    double valorVendas;
    int qntdVendas;

    public Vendedor(String nome, int idade, String sexo, double salario, String matricula, double valorVendas, int qntdVendas) {
        super(nome, idade, sexo, salario, matricula);
        this.valorVendas = valorVendas;
        this.qntdVendas = qntdVendas;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public int getQntdVendas() {
        return qntdVendas;
    }

    public void setQntdVendas(int qntdVendas) {
        this.qntdVendas = qntdVendas;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "valorVendas=" + valorVendas +
                ", qntdVendas=" + qntdVendas +
                ", salario=" + salario +
                ", nome='" + nome + '\'' +
                '}';
    }

    public double getBonificacao(){
        return 0.1*salario + qntdVendas*2;
    }
}
