import java.util.Scanner;

public class Distancia {

    public static void main(String[] args) {
        int minutos;
        Scanner input = new Scanner(System.in);
        minutos = input.nextInt();
        int K = (minutos * 2) / 1; // Digite aqui o calculo dos minutos
        System.out.printf("%d minutos\n",K);
    }
}