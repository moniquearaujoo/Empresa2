public class Diretor extends Funcionario {

    int acoes;

    public int getAcoes() {
        return acoes;
    }

    public void setAcoes(int acoes) {
        this.acoes = acoes;
    }

    public void exibirDiretor () {

        System.out.println("Nome: " + nome + "\n" +
                "Salário: " + salario + "\n" +
                "Ações: " + acoes);
    }

}
