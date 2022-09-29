import java.io.PrintStream;
import java.util.Scanner;

public class list8 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        System.out.println("Insira seu número: ");
        double x = dados.nextDouble();
        double um = x * 1;
        double dois = x * 2;
        double tres = x * 3;
        double quatro = x * 4;
        double cinco = x * 5;
        double seis = x * 6;
        double sete = x * 7;
        double oito = x * 8;
        double nove = x * 9;
        double dez = x * 10;
        PrintStream printf = System.out.printf("Os múltiplos do número %.0f são:%.0f,%.0f,%.0f,%.0f,%.0f,%.0f,%.0f,%.0f,%.0f,%.0f.", x, um, dois, tres, quatro,
                cinco, seis, sete, oito, nove, dez);
    }
}
