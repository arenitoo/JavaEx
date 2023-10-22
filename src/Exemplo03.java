import java.util.Scanner;

public class Exemplo03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a;
        double b;
        double c;
        System.out.println("Digite os 3 valores: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        double triangulo = a*c/2;
        double circulo = 3.1416*Math.pow(c, 2.0);
        double trapezio = (a+b)*c/2;
        double quadrado = b*b;
        double retangulo = a*b;


        System.out.println("TRIANGULO: " + triangulo);
        System.out.println("CIRCULO: " + circulo);
        System.out.println("TRAPEZIO: " + trapezio);
        System.out.println("QUADRADO: " + quadrado);
        System.out.println("RETANGULO: " + retangulo);
        sc.close();
    }
}
