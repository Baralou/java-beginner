import java.util.*;
public class exerc17 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        int peso, idade;
        int x = 0;
        int b = 0;
        for (int i = 0; i < 7; i++) {
            System.out.println("Insira a idade: ");
            idade = dados.nextInt();
            System.out.println("Informe o peso em KG: ");
            peso = dados.nextInt();
            if (peso > 90) {
                x++;
            }
            if (idade != 0) {
                b = b + idade;
            }
        }
        b = b / 7;
        System.out.println("Pessoas com o peso superior a 90KG:" + x + "\nA média das idades é: " + b);
    }
}