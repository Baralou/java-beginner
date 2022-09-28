import java.util.*;
public class att1{
    public static void main(String[]args){
        Scanner dados = new Scanner(System.in);
        int a;
        System.out.print("Digite um número inteiro: ");
        a = dados.nextInt();

        if (a >0) {
            System.out.print("Seu número é positivo");
        }
        else
            System.out.print("Seu número é negativo.");

    }

}