public class ControleDeFolha {

    public static void main(String[] args) {

        Empregado empregados[] = new Empregado[10];


        empregados[0] = new Empregado(
                "Joao",
                40,
                "M",
                2000,
                "123");
        empregados[1] = new Empregado(
                "José",
                40,
                "M",
                2000,
                "123");

        empregados[2] = new Empregado(
                "Maria",
                40,
                "F",
                2000,
                "123");

        empregados[3] = new Empregado(
                "Joana",
                40,
                "F",
                2000,
                "123");

        empregados[4] = new Vendedor(
                "Pedro",
                40,
                "M",
                2000,
                "123",
                10000,
                1);

        empregados[5] = new Vendedor(
                "Paulo",
                40,
                "M",
                2000,
                "123",
                10000,
                1);


        empregados[6] = new Vendedor(
                "Pietro",
                40,
                "M",
                2000,
                "123",
                10000,
                1);

        empregados[7] = new Vendedor(
                "Pamela",
                40,
                "F",
                2000,
                "123",
                10000,
                1);

        empregados[8] = new Gerente(
                "Carla",
                40,
                "F",
                2000,
                "123",
                "Financeiro");

        empregados[9] = new Gerente(
                "Cecilia",
                40,
                "F",
                2000,
                "123",
                "Vendas");

        double total = 0;
        for (Empregado e: empregados) {
            total += e.getSalario() + e.getBonificacao();
        }
        System.out.println(total);
    }
}
