import java.util.Scanner;

class list3 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        double dolar = 5.09;
        System.out.println("Quantos dolares você tem? ");
        double din = dados.nextDouble();
        double con = dolar * din;
        System.out.printf("Você tem R$%.2f na cotação atual.%n", con);
    }
}
