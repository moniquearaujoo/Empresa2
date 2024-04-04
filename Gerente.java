public class Gerente extends Funcionario {

    String departamento;

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }


    public double calcularBonus (double salario) {

        return 0.1*salario + salario;
    }
    public void exibirGerente () {

        System.out.println("Nome: " + nome + "\n" +
                "Salário: " + calcularBonus(salario) + "\n" +
                "Departamento: " + departamento);
    }



}
