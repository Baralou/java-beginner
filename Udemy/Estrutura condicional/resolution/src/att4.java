import java.util.*;

public class att4 {
    public static void main(String[]args){
        Scanner dad = new Scanner(System.in);
        int a,b,duracao;
        System.out.print("Inicio do jogo:");
        a = dad.nextInt();
        System.out.print("Fim do jogo: ");
        b = dad.nextInt();

        if (a < b ){
            duracao = b-a;
        } else{
            duracao = 24-a+b;
        }
        System.out.print("O jogo duroub "+duracao+" horas");

    }
}
