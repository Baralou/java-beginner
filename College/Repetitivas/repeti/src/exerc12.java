import java.util.*;
public class exerc12 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        int a,b,c;
        System.out.println(" Insira seu número inteiro: ");
        a = dados.nextInt();
        b = a;
        for (int i=0; i<a ; i++){
            c= b % 2;
            b--;
            if (c==0){
                System.out.println("Número ímpar: "+b);
            }

        }


    }
}
