import java.text.DecimalFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        var entrada = 0.0f;
        var scanner = new Scanner(System.in);
        var format = new DecimalFormat("#.00");

        System.out.print("Informe a entrada: ");
        entrada = Float.valueOf(scanner.next().replace(",", "."));

        var listNotas = List.of(100f, 50f, 20f, 10f, 5f, 2f).stream().sorted(Comparator.reverseOrder()).toList();
        var mapNotas = new HashMap<Float, Integer>();

        var index = 0;
        var looping = true;

        while (looping) {

            if (entrada >= listNotas.get(index)) {

                var value = mapNotas.get(listNotas.get(index)) != null ? mapNotas.get(listNotas.get(index)) : 0;

                mapNotas.put(listNotas.get(index), ++value);
                entrada = Float.valueOf(format.format((entrada - listNotas.get(index))));
            }

            else if (entrada < listNotas.get(index) && (index != (listNotas.size() - 1))) {
                index++;
            }

            else {
                looping = false;
            }
        }

        var listMoedas = List.of(1f, 0.5f, 0.25f, 0.1f, 0.05f, 0.01f).stream().sorted(Comparator.reverseOrder()).toList();
        var mapMoedas = new HashMap<Float, Integer>();

        index = 0;
        looping = true;

        while (looping) {

            if (entrada >= listMoedas.get(index)) {

                var value = mapMoedas.get(listMoedas.get(index)) != null ? mapMoedas.get(listMoedas.get(index)) : 0;

                mapMoedas.put(listMoedas.get(index), ++value);
                entrada = Float.valueOf(format.format(entrada - listMoedas.get(index)));
            }

            else if (entrada < listMoedas.get(index) && (index != (listMoedas.size() - 1))) {
                index++;
            }

            else {
                looping = false;
            }
        }

        System.out.println("NOTAS: ");
        mapNotas.entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByKey())
                    .forEach(x -> System.out.printf("%d nota(s) de R$ %.2f\n", x.getValue(), x.getKey()));

        System.out.println("MOEDAS: ");
        mapMoedas.entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByKey())
                    .forEach(x -> System.out.printf("%d moeda(s) de R$ %.2f\n", x.getValue(), x.getKey()));
    }
}