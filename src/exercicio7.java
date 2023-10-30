public class exercicio7 {

    public static void main(String[] args) {
        int[] numeros = {6, 12, 28, 9, 8, 8128, 13};

        for (int numero : numeros) {
            if (ehNumeroPerfeito(numero)) {
                System.out.println(numero + " é um número perfeito.");
            }
        }
    }
    public static boolean ehNumeroPerfeito(int numero) {
        int somaDivisores = 1;

        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                somaDivisores += i;
            }
        }

        return somaDivisores == numero;
    }
}

