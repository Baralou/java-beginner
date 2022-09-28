import java.util.*;

public class att7 {
    public static void main(String[] args) {
        Scanner dados = new Scanner (System.in);
        Double x,y;
        System.out.println("Insira um número para o plano cartesiano");
        x = dados.nextDouble();
        y = dados.nextDouble();

        if (x<0 & y<0){
            System.out.println("Q3");
        }else if (x>0 & y>0){
            System.out.println("Q1");
        }else if (x<0 & y>0) {
            System.out.println("Q2");
        }else{
            System.out.println("Q4");
        }

    }
}
