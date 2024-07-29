public class Repositorio {
    private Socio[] BD;
    private int indice;

    public Repositorio() {
        BD = new Socio[5];
        indice = 0;
    }

    public void inserir(Socio s) throws CCException {
        for(int i = 0; i < indice; i++) {
            if (BD[i].cpf == s.cpf) {
                CCException e = new CCException();
                throw e;
            }
        }
        BD[indice] = s;
        indice++;
    }

    public void remover(String cpf) {
        for(int i = 0; i < indice; i++) {
            if (BD[i].cpf == cpf) {
                BD[i] = BD[indice - 1];
                BD[indice - 1] = null;
                indice--;
            }
        }
    }

    public Socio maisVelho() {
        Socio maisVelho = BD[0];
        Socio maisNovo;
        for(int i = 0; i < indice; i++) {
            if (BD[i].idade < maisVelho.idade) {
                maisNovo = BD[i];
            } else {
                maisVelho = BD[i];
            }
        }
        return maisVelho;
    }

}
