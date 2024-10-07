public class ContaBancaria {
    String nomeTitular;
    double saldo = 0;
    int chequeEspecial = 1000;
    int saqueChequeEspecial;
    double rendimento;
    double taxaSelic;
    int deposito;
    int saque;
    int opcaoConta;
    int opcaoOperacao;

    public void acessoContaCorrente(){    //menu conta corrente
        switch (opcaoOperacao) {
            case 1:
                saldo += deposito;
                System.out.println("Depósito realizado!");
                break;
            case 2:
                if (saldo >= saque) {
                    saldo -= saque;
                    System.out.println("Saque realizado!");
                } else {
                    System.out.println("Erro! Saldo disponível para saque: R$ "+ saldo);
                }
                break;
            case 3:
                if (chequeEspecial >= saqueChequeEspecial) {
                    chequeEspecial -= saqueChequeEspecial;
                    saldo += saqueChequeEspecial;
                    System.out.println("Saque cheque especial realizado." +
                            "\nSaque depositado em conta corrente.");
                } else {
                    System.out.println("Erro! Saldo em cheque especial indisponível!" +
                            "\nValor disponível: R$ "+ chequeEspecial);
                }
                break;
            case 4:
                System.out.println("------DADOS CONTA CORRENTE-------");
                System.out.println("Nome Titular: " + nomeTitular +
                        "\nSaldo conta corrente: R$ " + saldo +
                        "\nValor disponível cheque especial: R$ " + chequeEspecial +
                        "\n----------------------------------------------");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }

    public void acessoContaPoupanca() {
        switch (opcaoOperacao) {
            case 1:
                saldo += deposito;
                System.out.println("Depósito realizado!");
                break;
            case 2:
                if (saldo >= saque) {
                    saldo -= saque;
                    System.out.println("Saque realizado!");
                } else {
                    System.out.println("Erro! Saldo disponível para saque: R$ "+saldo);
                }
                break;
            case 3:
                double saldoAnterior = saldo;
                if (taxaSelic > 8.5) {
                    rendimento = 0.005 * saldo;
                    saldo += rendimento;
                    System.out.println("Saldo base de cálculo: R$" + saldoAnterior +
                            "\nRendimento mensal: " + rendimento +
                            "\nSaldo atual: R$ " + saldo);
                } else {
                    rendimento = 0.007 * taxaSelic * saldo;
                    saldo += rendimento;
                    System.out.println("Saldo base de cálculo: R$" + saldoAnterior +
                            "\nRendimento mensal: " + rendimento +
                            "\nSaldo atual: R$ " + saldo);
                }
                break;
            case 4:
                System.out.println("------DADOS CONTA POUPANÇA-------");
                System.out.println("Nome Titular: " + nomeTitular +
                        "\nSaldo conta poupança: R$ " + saldo +
                        "\nÚltimo rendimento: R$ " + rendimento +
                        "\n----------------------------------------------");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }
}

