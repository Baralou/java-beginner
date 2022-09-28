import java.util.Scanner;
public class att3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,d,di;
        System.out.println("Insira quatro números:\n ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();


        di = (a*b)-(c*d);
        System.out.println("Diferença: "+di);


    }
}
