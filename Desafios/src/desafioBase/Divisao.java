package desafioBase;

import java.io.IOException;
import java.util.Scanner;

public class Divisao {

    public static void main(String[] args) throws IOException {
        //complete os espaços com sua solução
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        double X, Y;
        for (int i = 0; i < N; i++) {
            X = leitor.nextInt();
            Y = leitor.nextInt();
            double result = X / Y;
            if (Y == 0) System.out.println("divisao impossivel");
            else System.out.printf("%.1f%n", result);
        }
    }

}
