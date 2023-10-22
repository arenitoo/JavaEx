import java.util.Scanner;

public class Exemplo01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a;
        int b;
        int c;
        int d;
        System.out.println("Digite os valores: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        double diferenca = (a * b - c * d);
        System.out.println("A diferença é igual a " + diferenca);


        sc.close();
    }

}
