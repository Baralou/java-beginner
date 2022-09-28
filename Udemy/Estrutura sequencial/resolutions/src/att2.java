import java.util.Scanner;
public class att2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        System.out.println("Insira o raio do cirulo");
        a = sc.nextDouble();

        b = Math.pow(a,2) * 3.14159;
        System.out.println("Resultado com quatro decimais acima: "+ b);
    }
}
