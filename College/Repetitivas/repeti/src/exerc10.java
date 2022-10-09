import java.util.*;
public class exerc10 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        System.out.println("Digite o seu número: ");
        double n = dados.nextDouble();
        double x = n;
        double f = x;

        if (x<0){
            System.out.println("Não existe fatorial para números negativos ");
        }else if (x == 0){
            System.out.println("1");
        }

        while (x>1){
            f = f*(x-1); x--;
        }
        System.out.printf("O fatorial de %.0f é %.0f ",n,f);


    }
}
