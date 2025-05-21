//Escribe un programa que pida 10 números por teclado y que luego muestre los
//números introducidos junto con las palabras “máximo” y “mínimo” al lado del
//máximo y del mínimo respectivamente.
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        // Agregar directamente los números del 1 al 10
        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }

        int maximo = Collections.max(numeros);
        int minimo = Collections.min(numeros);

        System.out.println("Números introducidos:");
        for (int numero : numeros) {
            if (numero == maximo) {
                System.out.println(numero + " (máximo)");
            } else if (numero == minimo) {
                System.out.println(numero + " (mínimo)");
            } else {
                System.out.println(numero);
            }
        }
    }
}
