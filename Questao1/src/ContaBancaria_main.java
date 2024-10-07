import java.util.Scanner;

public class ContaBancaria_main {
    public static void main(String[] args) {

        ContaBancaria contaBancaria = new ContaBancaria();
        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        String continuar = "";

        System.out.println("----Dados do cliente----");
        System.out.print("Nome do Titular: ");
        contaBancaria.nomeTitular = scanner.nextLine();

        do {
            System.out.print("Qual conta gostaria de acessar?" +
                    "\n1- Conta corrente" +
                    "\n2- Conta Poupança" +
                    "\nOpção: ");
            contaBancaria.opcaoConta = sc.nextInt();
            switch (contaBancaria.opcaoConta) {
                case 1:
                    do {
                        System.out.println();
                        System.out.println("------CONTA CORRENTE-------");
                        System.out.print("----Menu de Opções----"+
                                "\n1- Depositar" +
                                "\n2- Sacar" +
                                "\n3- Usar cheque especial" +
                                "\n4- Exibir dados da conta" +
                                "\nDigite o número da opção desejada: ");
                        contaBancaria.opcaoOperacao = sc.nextInt();

                        switch (contaBancaria.opcaoOperacao) {
                            case 1:
                                System.out.print("Valor a depositar: R$ ");
                                contaBancaria.deposito = sc.nextInt();
                                break;
                            case 2:
                                System.out.print("Valor a sacar (saldo disponível: R$ " + contaBancaria.saldo + ")" + ": R$ ");
                                contaBancaria.saque = sc.nextInt();
                                break;
                            case 3:
                                System.out.print("Cheque especial disponível: R$ " + contaBancaria.chequeEspecial +
                                        "\nValor a utilizar: R$ ");
                                contaBancaria.saqueChequeEspecial = sc.nextInt();
                                break;
                            case 4:
                                break;
                            default:
                                break;
                        } contaBancaria.acessoContaCorrente();
                        System.out.print("Deseja continuar na Conta Corrente? Sim (S) ou não (N)? ");
                        continuar = scanner.nextLine();
                    } while (continuar.equalsIgnoreCase("S"));
                    break;

                case 2:
                    do {
                        System.out.println();
                        System.out.println("------CONTA POUPANÇA-------");
                        System.out.print("----Menu de Opções----"+
                                "\n1- Depositar" +
                                "\n2- Sacar" +
                                "\n3- Calcular rendimento" +
                                "\n4- Exibir dados da conta" +
                                "\nDigite o número da opção desejada: ");
                        contaBancaria.opcaoOperacao = sc.nextInt();

                        switch (contaBancaria.opcaoOperacao) {
                            case 1:
                                System.out.print("Valor a depositar: R$ ");
                                contaBancaria.deposito = sc.nextInt();
                                break;
                            case 2:
                                System.out.print("Valor a sacar (saldo disponível: R$ " + contaBancaria.saldo + ")" + ": R$ ");
                                contaBancaria.saque = sc.nextInt();
                                break;
                            case 3:
                                System.out.print("Qual a taxa Selic atual? ");
                                contaBancaria.taxaSelic = sc.nextDouble();
                                break;
                            case 4:
                                break;
                            default:
                                break;
                        } contaBancaria.acessoContaPoupanca();
                        System.out.print("Deseja continuar na Conta Corrente? Sim (S) ou não (N)? ");
                        continuar = scanner.nextLine();
                    } while (continuar.equalsIgnoreCase("S"));
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (!continuar.equalsIgnoreCase("N"));
        System.out.println();
        System.out.println("----------ENCERRADO!-------------");
    }
}