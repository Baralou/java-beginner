import java.util.*;
public class att2{
    public static void main(String[]args){
        Scanner dados = new Scanner(System.in);
        int a;
        System.out.print("Digite um número inteiro: ");
        a = dados.nextInt();

        if (a % 2 == 0) {
            System.out.print("par");
        }
        else
            System.out.print("impar");

    }

}