import java.util.Scanner;

class list4 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        System.out.println("Calcule a área de um losango! ");
        System.out.println("Valor da diagonal maior: ");
        double n1 = dados.nextDouble();
        System.out.println("Valor da diagonal menor: ");
        double n2 = dados.nextDouble();
        double area = n1 * n2 / 3;
        System.out.printf("O valor da área no losango é %.2fcm²");
    }
}

