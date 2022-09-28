import java.util.*;

public class con1 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        double n1, n2, med;
        System.out.println("Nota de português: ");
        n1 = dados.nextDouble();
        System.out.println("Nota de Mat: ");
        n2 = dados.nextDouble();
        med = (n1 + n2) / 2;
        if (med >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
