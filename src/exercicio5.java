public class exercicio5 {
    public static void main(String[] args) {

        String[] provas = {"não", "sim", "não", "sim", "não"};
        int sim = 0;
        int nao = 0;
        String classificacao;
        for (int i = 0; i < provas.length; i++) {
            if (provas[i] == "sim") {
                sim += 1;
            } else {
                nao += 1;
            }
        }

        if (sim <= 2 && sim < 0) {
            classificacao = "Suspeito";
        } else if (sim > 2 && sim < 5){
            classificacao = "Cúmplice";
        } else if (sim == 5){
            classificacao = "Assassino";
        } else {
            classificacao = "Inocente";
        }
        System.out.println("O informante é " + classificacao);

    }
}
