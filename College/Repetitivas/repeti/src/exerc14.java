import java.util.*;
public class exerc14 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        int sexo;
        int peso, b = 0, v = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Qual é o seu sexo? (1 para homem, 2 para mulher: )");
            sexo = dados.nextInt();
            System.out.println("Seu peso:");
            peso = dados.nextInt();
            if (sexo == 2 && peso >= 50 && peso <= 60) {
                b++;}
            if (sexo == 1 && peso >= 60 && peso <= 80) {
                v++;}
        }
        System.out.println("Tem "+v+" homens que pesam entre 60kg e 80kg");
        System.out.println("Tem "+b+" mulheres que pesam entre 50kg e 60kg");
    }
}