import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        var numEntradas = 0;

        System.out.print("Informe a quantidade de entradas: ");
        numEntradas = scanner.nextInt();
        scanner.nextLine();

        var entradas = new ArrayList<String>();

        for (int i = 0; i < numEntradas; i++) {
            System.out.print("Informe a " + (i + 1) + "° entrada: ");
            entradas.add(scanner.nextLine());
        }

        System.out.println();

        for (String entrada : entradas) {

            var builder = new StringBuilder();
            builder.append(entrada.substring((entrada.length() / 2)));
            builder.append(entrada.substring(0, (entrada.length() / 2)));
            System.out.println(builder.reverse());
        }
    }
}