import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        var numEntradas = 0;
        var alvo = 0;

        System.out.print("Informe o número de entradas: ");
        numEntradas = scanner.nextInt();

        var entradas = new Integer[numEntradas];

        System.out.print("Informe o número alvo: ");
        alvo = scanner.nextInt();

        for(int i = 0; i < entradas.length; i++) {
            System.out.printf("Informe a %d° entrada: ", (i + 1));
            entradas[i] = scanner.nextInt();
        }

        var pares = 0;

        for (int i = 0; i < entradas.length; i++) {

            for (int j = 0; j < entradas.length; j++) {

                if (i != j) {

                    if ((entradas[i] - entradas[j]) == alvo) {
                        pares++;
                    }
                }
            }
        }

        System.out.println(pares);
    }
}