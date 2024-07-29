public class Estudante extends Socio {
    private String universidade;

    public Estudante(String n, String c, double v, int i, String u) {
        super(n, c, v, i);
        universidade = u;
    }

    public void imprimir() {
        System.out.println("Estudante: " +
                "\nNome: " + super.nome +
                "\nCPF: " + super.cpf +
                "\nValor da Anuidade: " + super.valor_anuidade +
                "\nIdade: " + super.idade +
                "\nUniversidade: " + universidade);
    }
}
