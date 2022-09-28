import java.util.*;

public class att6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.println("Insira três valores:");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        double tri, cir, tra, qua, ret;
        tri = a * c;
        cir = c * 3.14;
        tra = ((a + b) * c) / 2;
        qua = Math.pow(b, 2);
        ret = a * b;
        System.out.printf("Triangulo: %.2f\nCirculo: %.2f\nTrapezio: %.2f\nQuadrado: %.2f\nRetangulo: %.2f.", tri, cir, tra, qua, ret);

    }
}
