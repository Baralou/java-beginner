import java.util.Scanner;

public class con7 {
    public con7() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira os três pontos de um possível triangulo:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = b + c;
        double t = a + c;
        double y = a + b;
        if (a < d && b < t && c < y) {
            System.out.println("É um triângulo existente.");
        } else {
            System.out.println("Não existe");
        }
    }
}