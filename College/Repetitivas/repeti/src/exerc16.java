import java.util.*;
public class exerc16 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        double notaProva;
        double maior = Integer.MIN_VALUE;
        double menor = Integer.MAX_VALUE;

        for (int i = 0; i < 5; i++) {
            System.out.println("Insira sua nota na prova:");
            notaProva = dados.nextDouble();


        if (notaProva >= maior) {
            maior = notaProva;
        }if (notaProva <= menor) {
            menor= notaProva;
        }
    }
        System.out.println("Menor nota " +menor);
        System.out.println("Maior nota "+maior);
}
}