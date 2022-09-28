import java.util.Scanner;

public class con4 {
    public con4() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira sua altura:");
        double x1 = sc.nextDouble();
        System.out.println("Insira seu peso: ");
        double x2 = sc.nextDouble();
        double x3 = x2 / Math.pow(x1, 2.0);
        if (x3 < 20.0) {
            System.out.println("Abaixo do peso");
        } else if (x3 >= 20.0 & x3 < 25.0) {
            System.out.println("Peso normal");
        } else if (x3 >= 25.0 & x3 < 30.0) {
            System.out.println("Sobre peso");
        } else if (x3 >= 30.0 & x3 < 40.0) {
            System.out.println("Obeso");
        } else {
            System.out.println("Obeso Mórbido");
        }
    }
}