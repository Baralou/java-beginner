import java.util.*;
public class exerc11 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        double a, b, c;
        System.out.println("Insira um número inteiro: ");
        a = dados.nextDouble();
        System.out.println("Insira sua potência");
        b = dados.nextDouble();
        c = a;

        for (int i = 1; i < b ; i++){
           c = a * c;
        }
        System.out.println("O resultado é " + c);

    }

}
