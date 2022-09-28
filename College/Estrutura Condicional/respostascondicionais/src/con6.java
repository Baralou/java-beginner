import java.util.Scanner;
public class con6 {
public con6() {
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Insira um numero:");
double x1 = sc.nextDouble();
if (x1 < -2.0) {
double x2 = 2.0 * x1 + 2.0;
System.out.println(x2);
} else if (-2.0 <= x1 & x1 < 3.0) {
System.out.println("3");
} else if (3.0 <= x1) {
System.out.println(-x1);
} else {
System.out.println("none");
}
}
}
