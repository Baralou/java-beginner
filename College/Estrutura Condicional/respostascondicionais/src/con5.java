import java.util.Scanner;

public class con5 {
    public static void main(String[] args) {
        int planeta;
        double velocidade, tempo, velocidadef, altura, gravidade = 0;
        Scanner nasa = new Scanner(System.in);
        System.out.printf("Insira o número correspondente ao planeta: " +
                "1- Mercúrio %n" +
                "2- Vênus %n" +
                "3- Terra %n" +
                "4- Marte %n" +
                "5- Júpiter %n" +
                "6- Saturno %n" +
                "7- Urano %n" +
                "8- Netuno %n" +
                "9- Plutão %n");
        planeta = nasa.nextInt();
        System.out.println("Qual o valor de v°?");
        velocidade = nasa.nextDouble();
        System.out.println("Qual o valor de tempo");
        tempo = nasa.nextDouble();
        switch (planeta) {
            case 1:
                gravidade = 3.7;
                break;
            case 2:
                gravidade = 8.8;
                break;
            case 3:
                gravidade = 9.8;
                break;
            case 4:
                gravidade = 3.8;
                break;
            case 5:
                gravidade = 26.4;
                break;
            case 6:
                gravidade = 11.5;
                break;
            case 7:
                gravidade = 9.3;
                break;
            case 8:
                gravidade = 12.2;
                break;
            case 9:
                gravidade = 0.6;
                break;
            default:
                break;
        }
        velocidadef = velocidade - (gravidade * tempo);
        altura = velocidade * tempo - ((gravidade * Math.pow(tempo, 2)) / 2);
        System.out.printf("A velocidade da bola é %.2f e a altura %.2f",
                velocidadef, altura);
    }
}