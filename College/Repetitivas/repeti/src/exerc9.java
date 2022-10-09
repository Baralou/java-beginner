import java.util.*;
public class exerc9 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;

        for (int i = 0; i < 10; i++) {
            System.out.println("Fala um número");
            int x = dados.nextInt();
            if (x <= menor) {
                menor = x;
            }
            if (x >= maior) {
                maior = x;
            }
        }
        System.out.println("O maior número é " + maior);
        System.out.println("O menor número é " + menor);
    }
}