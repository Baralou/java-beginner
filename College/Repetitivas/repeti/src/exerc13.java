import java.util.*;
public class exerc13 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        int sexo;
        int idade,b=0;
        for (int i=0;i<10;i++) {
            System.out.println("Qual é o seu sexo? (1 para homem, 2 para mulher: )");
            sexo = dados.nextInt();

            System.out.println("Sua idade:");
            idade = dados.nextInt();
            if (sexo == 2 && idade >= 20 && idade <= 40) {
                b++;
            }
        }
        System.out.println("Existem "+b+" mulheres entre 20 e 40 anos");
    }
}
