package desafioBase;

import java.io.IOException;
import java.util.Scanner;

public class Multiplicidade{

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        //continue a solucao
        int a  = leitor.nextInt();
        int b = leitor.nextInt();

        if (b % a == 0 || a % b == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
    }

}