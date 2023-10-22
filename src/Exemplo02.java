import java.util.Scanner;

public class Exemplo02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        double horasTrabalhadas;
        double valorPorHora;

        System.out.println("Digite o número do funcionário, suas horas trabalhadas e o valor por hora : ");
        numero = sc.nextInt();
        horasTrabalhadas = sc.nextDouble();
        valorPorHora = sc.nextDouble();

        double salario = horasTrabalhadas * valorPorHora;

        System.out.println("NUMBER: " + numero);
        System.out.println("SALARY = U$" + salario);

        sc.close();
    }
}
