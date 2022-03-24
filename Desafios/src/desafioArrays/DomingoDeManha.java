package desafioArrays;

import java.io.IOException;
import java.util.Scanner;

public class DomingoDeManha {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        while (true) {
            String[] relogio = leitor.nextLine().split(":");
            int hora = Integer.parseInt(relogio[0]);
            int min = Integer.parseInt(relogio[1]);
            switch (hora) {
                case(7): System.out.println("Atraso maximo: " + min);
                case(8): System.out.println("Atraso maximo: " + (min + 60));
                case(9): System.out.println("Atraso maximo: " + (min + 120)); break;
                default: System.out.println("Atraso maximo: 0");
            }
        }
    }
}