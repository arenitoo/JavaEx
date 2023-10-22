import java.util.Scanner;

public class Exemplo05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        numero = sc.nextInt();
        String y = "Número inválido";
        if (numero == 0) {
            y = "PAR";
        } else {
            if (numero % 2 == 0) {
                y = "PAR";
            } else if (numero % 2 == 1 || numero % 2 == -1) {
                y = "IMPAR";
            }
        }
        System.out.println(y);
        sc.close();
    }
}

