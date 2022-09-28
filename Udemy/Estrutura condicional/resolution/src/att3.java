import java.util.*;

public class att3 {
    public static void main (String[]args){
        Scanner dados = new Scanner(System.in);
        int a,b;
        System.out.print("Digite um número inteiro: ");
        a = dados.nextInt();
        System.out.print("Digite um número inteiro: ");
        b = dados.nextInt();

        if (a % b ==0 | b % a ==0) {
            System.out.print("São Multiplos");
        }
        else
            System.out.print("Não São multiplos");
    }

}
