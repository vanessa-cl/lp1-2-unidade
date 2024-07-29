public class App {
    public static void main(String[] args) throws CCException {
        Repositorio bd = new Repositorio();
        Profissional p1 = new Profissional("Fulano", "123.456.789-00", 100.0, 40, "Sei la");
        Estudante e1 = new Estudante("Vanessa", "099.456.789-60", 100.0, 23, "IFBA");
        Profissional p2 = new Profissional("Fulana", "009.456.789-03", 100.0, 59, "Num sei");
        Estudante e2 = new Estudante("Ana", "009.456.789-03", 100.0, 20, "UFBA");

        p1.desconto();
        bd.inserir(p1);
        bd.inserir(e1);
        bd.inserir(p2);
        // exemplo de tratamento da exceção customizada
        try {
            bd.inserir(e2);
        } catch (CCException e) {
            System.out.println(e);
        }
        bd.remover(p2.cpf);
        bd.maisVelho().imprimir();
    }
}