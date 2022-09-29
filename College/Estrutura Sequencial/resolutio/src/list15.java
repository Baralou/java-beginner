import java.util.*;

public class list15 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        double el, bozo, lulo, nulo, per1, per2, per3;

        System.out.print("Total de eleitores: ");
        el = dados.nextDouble();

        System.out.print("Total de votos no Bozo:");
        bozo = dados.nextDouble();

        System.out.print("Total de votos no Lulo:");
        lulo = dados.nextDouble();

//Porcentagem = (valor obtido x 100) / Valor total

        nulo = el - (bozo + lulo);
        per1 = (bozo * 100) / el;
        per2 = (lulo * 100) / el;
        per3 = (nulo * 100) / el;

        System.out.print(per1 + "% votaram no Bozo \n");
        System.out.print(per2 + "% votaram no Lule\n");
        System.out.print(per3 + "% votaram Nulo");

    }
}
