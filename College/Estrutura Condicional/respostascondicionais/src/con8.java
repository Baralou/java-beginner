import java.util.Scanner;

public class con8 {
    public con8() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira dois números: ");
        double x1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double a1 = x1 + x2;
        double a2 = x1 * x2;
        double a3 = x1 / x2;
        double a4;
        if (x1 > x2) {
            a4 = x1 - x2;
            System.out.println("Sub: " + a4);
        } else if (x2 > x1) {
            a4 = x2 - x1;
            System.out.println("Sub: " + a4);
        } else {
            System.out.println("0");
        }
        System.out.printf("Multi:%.1f\nAdi:%.1f\nDivi:%.1f", a2, a1,
                a3);
    }
}