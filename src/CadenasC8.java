

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CadenasC8 {

    public void PoliCodeCraftersC8() {
        Set<String> conjunto = new HashSet<>();
        conjunto.add("delira");
        conjunto.add("lidera");
        conjunto.add("llenaba");
        conjunto.add("Alondra");
        conjunto.add("Ladrona");
        conjunto.add("España");
        conjunto.add("apañes");
        conjunto.add("Enrique");
        conjunto.add("quieren");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al juego de Anagramas!");

        Iterator<String> iterator = conjunto.iterator();
        if (iterator.hasNext()) {
            String palabra = iterator.next();

            // Muestra la palabra y solicita el anagrama
            System.out.println("Palabra: " + palabra);
            System.out.print("Ingrese el Anagrama: ");
            String anagrama = scanner.nextLine();

            // Compara el anagrama ingresado con la palabra
            if (esAnagrama(palabra, anagrama)) {
                System.out.println("¡Correcto! ¡Has acertado!");
            } else {
                System.out.println("Incorrecto. La respuesta correcta es: " + palabra);
            }
        } else {
            System.out.println("No hay más palabras en el conjunto.");
        }

        System.out.println("Fin del juego.");

        scanner.close();
    }

    // Método para verificar si dos palabras son anagramas
    private static boolean esAnagrama(String palabraOriginal, String posibleAnagrama) {
        // Convertir ambas palabras a minúsculas y ordenar sus letras
        char[] arregloOriginal = palabraOriginal.toLowerCase().toCharArray();
        char[] arregloAnagrama = posibleAnagrama.toLowerCase().toCharArray();

        // Ordenar los arreglos de caracteres
        java.util.Arrays.sort(arregloOriginal);
        java.util.Arrays.sort(arregloAnagrama);

        // Comparar los arreglos ordenados
        return java.util.Arrays.equals(arregloOriginal, arregloAnagrama);
    }
}
