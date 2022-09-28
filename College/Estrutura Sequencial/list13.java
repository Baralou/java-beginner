import java.util.*;

public class list13 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double a, p;
        System.out.println("Calculadora de peso ideal para mulheres!");
        System.out.println("Qual é a sua altura? ");
        a = read.nextDouble();
        p = ((62.1 * a) - 44.7);
        System.out.printf("Seu peso ideal é de %.1f Kg.", p);

    }
}
