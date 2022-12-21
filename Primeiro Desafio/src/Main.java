import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        var numEntradas = 0;
        var entradas = new ArrayList<Integer>();
        var scanner = new Scanner(System.in);

        System.out.print("Informe o número de entradas: ");
        numEntradas = scanner.nextInt();

        for(int i = 0; i < numEntradas; i++) {
            System.out.printf("Informe a %d° entrada: ", (i + 1));
            entradas.add(scanner.nextInt());
        }

        var pares = entradas.stream()
                .filter(x -> (x % 2 == 0))
                .sorted(Comparator.naturalOrder())
                .toList();

        var impares = entradas.stream()
                .filter(x -> (x % 2 != 0))
                .sorted(Comparator.reverseOrder())
                .toList();

        pares.forEach(System.out::println);
        impares.forEach(System.out::println);
    }
}