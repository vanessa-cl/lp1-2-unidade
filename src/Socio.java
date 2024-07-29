public abstract class Socio {
    protected String nome;
    protected String cpf;
    protected double valor_anuidade;
    protected int idade;

    public Socio(String n, String c, double v, int i) {
        nome = n;
        cpf = c;
        valor_anuidade = v;
        idade = i;
    }

    public abstract void imprimir();
}
