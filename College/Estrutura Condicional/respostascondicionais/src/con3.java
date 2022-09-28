import java.util.Scanner;

public class con3 {
    public con3() {
    }

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Insira o a,b,c da equação:");
        double a = src.nextDouble();
        double b = src.nextDouble();
        double c = src.nextDouble();
        double delta = b * b - 4.0 * a * c;
        double x1 = (-b + Math.sqrt(delta)) / 2.0 * a;
        double x2 = (-b - Math.sqrt(delta)) / 2.0 * a;
        if (delta < 0.0) {
            System.out.println("As raízes não são reais");
        } else if (delta == 0.0) {
            System.out.printf("A única raíz da equação é %.2f", x1);
        } else if (delta > 0.0) {
            System.out.printf("As raízes da equação são x1:%.2f e x2:%.2f % n ", x1, x2);
        }
    }
}