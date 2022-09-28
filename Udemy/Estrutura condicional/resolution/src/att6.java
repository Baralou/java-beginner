import java.util.*;

public class att6 {
    public static void main(String[]args){
        Scanner dados = new Scanner(System.in);
        int x;
        System.out.println("Escolha um número.");
        x = dados.nextInt();

        if (x >=0 & x<=25){
            System.out.println("Intervalo de [0,25]");
        } else if (x>25 & x<=50){
            System.out.println("Intervalo de [25,50]");
        }else if (x>50 & x<=100){
            System.out.println("Intervalo de [50,100]");
        }else{
            System.out.println("Fora de intervalo");
        }
    }
}
