public class exercicio4 {
    public static void main(String[] args) {

        double populacaoA = 80000;
        double populacaoB = 200000;
        double taxaA = 0.03;
        double taxaB = 0.015;
        int anos = 0;
        while (populacaoA < populacaoB) {
            populacaoA = populacaoA + populacaoA * taxaA;
            populacaoB = populacaoB + populacaoB * taxaB;
            anos += 1;
            System.out.println(populacaoA);
        }
        System.out.println("Foram necessários " + anos + " anos");
    }

}
