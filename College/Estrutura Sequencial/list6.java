import java.util.*;
import java.lang.Math;

public class list6 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int a, b, c;
        double delta, x1, x2;
        System.out.println("Digite um valor para A,B e C respectivamente:");
        a = read.nextInt();
        b = read.nextInt();
        c = read.nextInt();
        delta = ((b * b) + (4 * (a * c)));
        x1 = (-(b) + Math.sqrt(delta)) / 2 * a;
        x2 = (-(b) - Math.sqrt(delta)) / 2 * a;
        System.out.println("Resultado do delta: " + delta);
        System.out.printf("Resultado do x1: %.2f%n", x1);
        System.out.printf("Resultado do x2: %.2f", x2);
    }
}