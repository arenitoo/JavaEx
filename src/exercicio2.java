public class exercicio2 {

    public static void main(String[] args) {

        double[] notas = {8.6, 7, 3.5, 6, 3, 2.9, 10, 1, 8};
        double soma = 0;
        double maior = 0;
        double menor = 11;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
            if (notas[i] < menor) {
                menor = notas[i];
            }
            if (notas[i] > maior) {
                maior = notas[i];
            }

        }

        double media = soma / notas.length;

        System.out.println("A média da turma é " + media);
        System.out.println("A menor média da turma é " + menor);
        System.out.println("A maior média da turma é " + maior);
    }
}
