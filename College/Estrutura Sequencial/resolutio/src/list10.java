import java.util.*;

public class list10 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double a, b;
        System.out.printf("Quanto você pagou pela refeição?%nR$:");
        a = read.nextDouble();
        b = 0.1 * a;

        System.out.printf("Você pode pagar R$%.2f de gorjeta.", b);

    }
}
