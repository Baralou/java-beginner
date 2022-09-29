import java.util.*;
public class list12 {
    public static void main(String[]args){
        Scanner read = new Scanner(System.in);
        double a,p;
        System.out.println("Calculadora de peso ideal para homens!");
        System.out.println("Qual é a sua altura? ");
        a = read.nextDouble();
        p = ((72.7 * a) - 58);
        System.out.printf("Seu peso ideal é de %.1f Kg.",p);

    }
}
