import java.util.*;

public class list7 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double a, b, c, d;
        System.out.println("Quanto você ganha por mês? ");
        a = read.nextDouble();
        d = a * 12;
        System.out.println("Qual é o salário mínimo atual?");
        b = read.nextDouble();
        c = a / b;
        System.out.printf("Você ganha %.2f por ano, que equivale a %.1f salários mínimos.", d, c);
    }
}