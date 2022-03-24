package desafioBase;

import java.util.Scanner;

public class Encaixa {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int count = scan.nextInt();

        for (int i = 0; i < count; i++) {
            //complete a resolução do problema com sua solução
            String a = scan.next();
            String b = scan.next();

            Boolean verifyLenght = ( a.length() >= b.length());
            var fimString =  verifyLenght ? a.substring((a.length() - b.length()), a.length()) : "";

            if (fimString.equals(b)) System.out.println("encaixa");
            else System.out.println("nao encaixa");
        }

    }
}