import java.util.*;

public class con11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Você está na 1 ou na 2? (1 = Apt simples, 2 =Apto duplo.) ");
        int apt = sc.nextInt();
        System.out.println("Quantos dias você ficou?: ");
        int dia = sc.nextInt();
        if (apt == 1) {
            int valor;
            if (dia < 10) {
                valor = dia * 100;
                System.out.printf("Deve pagar: R$%d", valor);
            } else if (dia < 15) {
                valor = dia * 90;
                System.out.printf("Deve pagar: R$%d", valor);
            } else {
                valor = dia * 80;
                System.out.printf("Deve pagar: R$%d", valor);
            }
        } else {
            int valor;
            if (dia < 10) {
                valor = dia * 140;
                System.out.printf("Deve pagar: R$%d", valor);
            } else if (dia < 15) {
                valor = dia * 120;
                System.out.printf("Deve pagar: R$%d", valor);
            } else {
                valor = dia * 100;
                System.out.printf("Deve pagar: R$%d", valor);
            }
        }
    }
}