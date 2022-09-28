import java.util.*;

public class con10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Você é 1 ou 2? (1 = Mulher, 2 = Homem)\n");
        int sexo = sc.nextInt();
        System.out.println("Digite sua idade:\n ");
        int id = sc.nextInt();
        if (sexo == 1) {
            if (id < 18) {
                System.out.println("Mensalidade de R$60,00");
            } else if (id < 25) {
                System.out.println("Mensalidade de R$90");
            } else if (id < 40) {
                System.out.println("Mensalidade de R$85");
            } else {
                System.out.println("Mensalidade de R$80");
            }
        } else {
            if (id < 15) {
                System.out.println("Mensalidade de R$60");
            } else if (id < 18) {
                System.out.println("Mensalidade de R$75");
            } else if (id < 30) {
                System.out.println("Mensalidade de R$90");
            } else if (id < 40) {
                System.out.println("Mensalidade de R$85");
            } else {
                System.out.println("Mensalidade de R$80");
            }
        }
    }
}