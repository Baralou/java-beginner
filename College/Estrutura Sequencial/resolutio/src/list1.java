import java.util.Scanner;

class list1 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        double n1 = dados.nextDouble();
        System.out.print("Digite um numero: ");
        double n2 = dados.nextDouble();
        System.out.print("Digite um numero: ");
        double n3 = dados.nextDouble();
        double resultado = (n1 + n2 + n3) / 3;
        System.out.printf("A média aritmética dos seus números é %.2f", resultado);
    }
}