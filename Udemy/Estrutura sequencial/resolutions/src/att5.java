import java.util.*;

public class att5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1, b1;
        double din, din1,quan;

        System.out.println("Insira os nomes das peças respectivamente: ");
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println("Quantidade de peças respectivamente ");
        a1 = sc.nextInt();
        b1 = sc.nextInt();
        System.out.println("Preço das peças respectivamente:");
        din = sc.nextDouble();
        din1 = sc.nextDouble();

        quan = (din * a1) + (din1 * b1);

        System.out.printf("O preço de %s e %s saem por R$%.2f. ", a, b, quan);
    }
}
