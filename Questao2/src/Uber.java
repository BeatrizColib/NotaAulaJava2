public class Uber {
    double distancia;
    int tempoEspera;
    double tarifaBase;
    double fatorDemanda;
    double valorFinal;

    public void calcularValorCorrida() {
        valorFinal = (distancia * 2) + (tempoEspera * 0.5) + (tarifaBase * fatorDemanda);
    }
    public void exibirDetalhesCorrida() {
        System.out.println();
        System.out.println("--------------RESUMO CORRIDA------------------------");
        System.out.println("Distância percorrida em KM: " + distancia +
                "\nTempo de espera do motorista em minutos: " + tempoEspera +
                "\nTarifa base p/ cálculo: " + tarifaBase +
                "\nFator de demanda p/ cálculo: " + fatorDemanda +
                "\n---> Valor final cobrado pela corrida: R$ " + valorFinal + "<---");
        System.out.println("-----------------------------------------------------");
    }
}
