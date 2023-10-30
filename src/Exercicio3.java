import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double velocidade;
        double tamanho;
        System.out.println("Digite a velocidade em Mbps");
        velocidade = sc.nextDouble();
        System.out.println("Digite o tamanho em Mb");
        tamanho = sc.nextDouble();

        double tempo = (tamanho/(velocidade/8))/60;
        System.out.println("O tempo de download é de " + tempo + " minutos");

        sc.close();
    }
}