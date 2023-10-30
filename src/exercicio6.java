import java.util.ArrayList;

public class exercicio6 {
    public static void main(String[] args) {
        int[] valoresPrimarios = {1, 6, 8, 4, 24, 2, 90, 2678, 635, 1253, 12, 13, 19, 998};
        ArrayList<Integer> valoresPares = new ArrayList<>();
        ArrayList<Integer> valoresImpares = new ArrayList<>();

        for (int i = 0; i < valoresPrimarios.length; i++) {
            if (valoresPrimarios[i] % 2 == 0) {
                valoresPares.add(valoresPrimarios[i]);
            } else {
                valoresImpares.add(valoresPrimarios[i]);
            }
        }

        System.out.println("Valores Pares: " + valoresPares);
        System.out.println("Valores Ímpares: " + valoresImpares);
    }
}
