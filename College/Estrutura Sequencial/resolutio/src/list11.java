import java.util.*;

public class list11 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double num, a, b, c, d;
        System.out.print("Informe um número inteiro: ");
        num = read.nextInt();
        a = num - 1;
        b = num + 1;
        c = num * 2;
        d = num / 2;
        System.out.printf("Antecessor: %.0f.%nSucesso: %.0f.%nDobro: %.0f.%nMetade: %.1f.", a, b, c, d);

    }
}
