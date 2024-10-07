import java.util.Scanner;

public class Uber_main {
    public static void main(String[]args){

        Uber uber = new Uber();
        Scanner sc = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        String continuar = "";

        do {
            System.out.println("-----------CADASTRAR CORRIDA - DADOS ----------");
            System.out.print("Distância percorrida em KM: ");
            uber.distancia = sc.nextDouble();
            System.out.print("Tempo de espera em minutos: ");
            uber.tempoEspera = sc.nextInt();
            System.out.print("Tarifa base p/ cálculo: ");
            uber.tarifaBase = sc.nextDouble();
            System.out.print("Fator de demanda p/ cálculo: ");
            uber.fatorDemanda = sc.nextDouble();
            System.out.println("-----------------------------------------------");

            uber.calcularValorCorrida();
            uber.exibirDetalhesCorrida();

            System.out.println();
            System.out.print("Cadastrar outra corrida? SIM (S) ou NÃO (N): ");
            continuar = scanner.nextLine();
        }
        while (continuar.equalsIgnoreCase("S"));
        System.out.println("----------------------ENCERRADO--------------------");
    }
}
