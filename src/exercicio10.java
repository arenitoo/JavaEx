public class exercicio10 {
    public static void main(String[] args) {
        int[] numeros = {127, 67, 35, 69};

        System.out.print("Vetor Original: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();
        
        System.out.print("Reverso dos Números: ");
        for (int numero : numeros) {
            int numeroReverso = 0;
            int temp = numero;
            while (temp > 0) {
                int digito = temp % 10;
                numeroReverso = numeroReverso * 10 + digito;
                temp /= 10;
            }
            System.out.print(numeroReverso + " ");
        }
    }


}
