import java.util.*;

public class att8 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        double n1,valor;
        System.out.println("Coloque seu salário para ver o imposto de renda: ");
        n1 = dados.nextDouble();

        if (n1>0 & n1<2000.00){
            System.out.println("Insento");
        }else if (n1>2000.00 & n1<3000.00){
            valor = (0.08*n1);
            System.out.printf("Você deve pagar R$%.2f de imposto.",valor);
        }else if (n1>3000.00 & n1<4500.00){
            valor = 0.18*n1;
            System.out.printf("Você deve pagar R$%.2f de imposto.",valor);
        }else if(n1<=0){
            System.out.println("Pobre");
        }else{
            valor = 0.28*n1;
            System.out.printf("Você deve pagar R$%.2f de imposto.",valor);
        }

    }
}
