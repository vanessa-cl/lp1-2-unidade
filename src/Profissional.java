public class Profissional extends Socio implements Professor_EBTT {
    private String empresa;

    public Profissional(String n, String c, double v, int i, String e) {
        super(n, c, v, i);
        empresa = e;
    }

    public void imprimir() {
        System.out.println("Profissional: " +
                "\nNome: " + super.nome +
                "\nCPF: " + super.cpf +
                "\nValor da Anuidade: " + super.valor_anuidade +
                "\nIdade: " + super.idade +
                "\nEmpresa: " + empresa);
    }

    public void desconto() {
        double valorComDesconto = valor_anuidade - (valor_anuidade * 0.2);
        super.valor_anuidade = valorComDesconto;
    }
}
