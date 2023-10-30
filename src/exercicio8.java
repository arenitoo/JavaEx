public class exercicio8 {

    public static void main(String[] args) {

        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        double[] temperaturas = {25, 28, 22, 30, 27, 23, 26, 29, 24, 31, 20, 33};
        double soma = 0;
        for (int i = 0; i < 12; i++) {
            soma += temperaturas[i];
        }

        double media = soma/12;
        System.out.println("A média anual é de " + media + "°C");

        for (int i = 0; i < 12; i++) {
            if (temperaturas[i] > media) {
                System.out.println(temperaturas[i]+ "°C " + " - " + meses[i]);
            }
        }
    }
}
