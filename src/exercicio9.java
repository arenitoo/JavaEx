public class exercicio9 {
    public static void main(String[] args){

        double divida = 1000.00;
        int[] parcelas = {1, 3, 6, 9, 12};
        double[] juros = {0, 0.10, 0.15, 0.20, 0.25};

        System.out.println("Valor da Dívida\tValor dos Juros\tQuantidade de Parcelas\tValor da Parcela");

        for (int i = 0; i < parcelas.length; i++) {
            double valorJuros = divida * juros[i];
            double valorTotal = divida + valorJuros;
            double valorParcela = valorTotal / parcelas[i];

            System.out.printf("R$ %.2f\t\tR$ %.2f\t\t%d\t\t\t\tR$ %.2f\n", valorTotal, valorJuros, parcelas[i], valorParcela);

        }

    }
}
