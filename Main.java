import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //para numeros
        Scanner sc2 = new Scanner(System.in); // para nomes
        Funcionario f = new Funcionario();
        Gerente g = new Gerente();
        Diretor d = new Diretor();
        String r;

        do {
            System.out.println("-----CADASTRO-----\n" +
                    "1- Funcionário \n" +
                    "2- Gerente \n" +
                    "3- Diretor\n" +
                    "4- Visualizar cadastro");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Digite o seu nome completo: ");
                    f.setNome(sc2.nextLine());
                    System.out.println("Digite o seu salário: ");
                    f.setSalario(sc.nextDouble());
                    System.out.println("Cadastro realizado com sucesso!");
                    f.exibirFuncionario();
                    break;
                case 2:
                    System.out.println("Digite o seu nome completo: ");
                    g.setNome(sc2.nextLine());
                    System.out.println("Digite o seu departamento: ");
                    g.setDepartamento(sc2.nextLine());
                    System.out.println("Digite o seu salário: ");
                    g.setSalario(sc.nextDouble());
                    System.out.println("Cadastro realizado com sucesso!");
                    g.exibirGerente();
                    break;
                case 3:
                    System.out.println("Digite o seu nome completo: ");
                    d.setNome(sc2.nextLine());
                    System.out.println("Digite o seu salário: ");
                    d.setSalario(sc.nextDouble());
                    System.out.println("Digite a quantidade de ações que você tem na empresa: ");
                    d.setAcoes(sc2.nextInt());
                    System.out.println("Cadastro realizado com sucesso!");
                    d.exibirDiretor();
                    break;

                default:
                    System.out.println("Opção Inválida");
                    break;
            }
            System.out.println("Para retornar digite S");
            r = sc2.nextLine();
        } while (r.equalsIgnoreCase("S"));


    }
}