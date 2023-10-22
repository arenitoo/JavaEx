import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double pi = 3.1416;
        double raio;
        System.out.println("Digite o valor do raio: ");
        raio = sc.nextDouble();

        double area = pi * Math.pow(raio, 2.0);
        System.out.println("A área do circulo é " + area);


        sc.close();
    }
}