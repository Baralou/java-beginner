import javax.swing.JOptionPane;
import java.util.Scanner;

class list2 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        System.out.print("Digite o ano q você nasceu: ");
        int n1 = dados.nextInt();
        System.out.print("Em que ano estamos? ");
        int n2 = dados.nextInt();
        int resultado = (n2 - n1);
        System.out.printf("Neste ano você completará %d anos.%n", resultado);
        int alo = (2050 - n1);
        System.out.printf("Em 2050 você completará %d anos.", alo);
    }
}