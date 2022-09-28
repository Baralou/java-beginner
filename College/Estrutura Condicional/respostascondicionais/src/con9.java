import java.util.*;
public class con9 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int dias;
System.out.println("Digite a quantidade de dias permanecidos: ");
dias = sc.nextInt();
if (dias < 15) {
double valor = dias * 15 + 500;
System.out.printf("O valor a ser pago será: R$%.2f", valor);
} else if (dias == 15) {
double valor = dias * 10 + 500;
System.out.printf("O valor a ser pago será: R$%.2f", valor);
} else {
double valor = dias * 5 + 500;
System.out.printf("O valor a ser pago será: R$%.2f ", valor);
}
}
}