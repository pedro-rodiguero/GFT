package desafioArrays;

import java.io.IOException;
import java.util.Scanner;

public class Notas {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        double A, B, media;

        A = sc.nextDouble();
        B = sc.nextDouble();

        media = (A*3.5 + B*7.5)/11;

        System.out.printf("MEDIA = %.5f\n",media);

        sc.close();
    }
}