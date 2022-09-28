import java.util.Scanner;

public class con2 {
    public static void main(String[] args) {
        Scanner aluno = new Scanner(System.in);
        System.out.println("Insira a nota das 3 provas");
        double nota1 = aluno.nextDouble();
        double nota2 = aluno.nextDouble();
        double nota3 = aluno.nextDouble();
        double total = (nota1 + nota2 + nota3) / 3;
        if (total >= 0 && total < 3) {
            System.out.println("Reprovado");
        } else if (total >= 3 && total < 7) {
            System.out.println("Exame");
        } else if (total >= 7 && total <= 10) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Insira as notas corretamente");
        }
    }
}