import java.util.Scanner;
public class att4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,n2;
        double din;
        System.out.println("Insira seu número,as horas trabalhadas e o salário: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        din = sc.nextInt();
        System.out.printf("Seu número é %d e você recebe %.2f reais.",n1,din);


    }
}
