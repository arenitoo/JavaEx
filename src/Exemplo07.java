import java.util.Scanner;

public class Exemplo07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor1;
        int valor2;
        int valor3;

        System.out.println("Digite os 3 números: ");
        valor1 = sc.nextInt();
        valor2 = sc.nextInt();
        valor3 = sc.nextInt();

       if ( valor1%valor2 == 0 && valor2%valor3 == 0 && valor1%valor3 == 0) {
           System.out.println("São múltiplos");
       } else {
           System.out.println("Não são múltiplos");
       }

        sc.close();
    }
}
