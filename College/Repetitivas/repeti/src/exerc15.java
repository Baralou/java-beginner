import java.util.*;
public class exerc15 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        double notaProvao,notaProva,media;
        for(int i=0 ; i<3 ; i++ ){
            System.out.println("Insira sua nota no provão:" );
            notaProvao = dados.nextDouble();
            System.out.println("Insira sua nota na prova:" );
            notaProva = dados.nextDouble();

            media = (notaProvao + notaProva) / 2;
            System.out.println("A sua média é de "+media);
        }
    }
}
