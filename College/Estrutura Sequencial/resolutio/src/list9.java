import java.util.*;

public class list9 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double num, a, b, c, d;
        System.out.println("Insira um número: ");
        num = read.nextDouble();
        a = Math.pow(num, 2);
        b = Math.pow(num, 3);
        c = Math.sqrt(num);
        d = Math.cbrt(num);
        System.out.printf(" Número digitado ao quadrado é: %.1f.%n O número digitado ao cubo é: %.1f.%n" +
                " A raíz quadrada do número digitado é: %.1f.%n A raíz cubica do número digitado é: %.1f.   ", a, b, c, d);
    }

}