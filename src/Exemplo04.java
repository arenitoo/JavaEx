import java.util.Scanner;
public class Exemplo04 {

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int x;
    x = sc.nextInt();
    String y = (x < 0) ? "NEGATIVO" : "POSITIVO";

    System.out.println(y);
    sc.close();
    }
}
