import java.util.*;

public class att5 {
    public static void main(String[]args){
        Scanner dados = new Scanner(System.in);
        int cod,qua;

        System.out.println("Código do produto. ");
        cod = dados.nextInt();

        System.out.print("Quantidade. ");
        qua = dados.nextInt();

        double total;
        if (cod ==1){
            total = qua*4.0;
        } else if(cod==2){
            total = qua*4.5;
        } else if(cod==3){
            total = qua*5.0;
        }else if (cod==4){
            total = qua*2.0;
        }else {
            total = qua*1.5;
        }
        System.out.print("Você deve pagar R$"+total);
    }
}
