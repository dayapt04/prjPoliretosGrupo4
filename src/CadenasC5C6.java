import java.util.Scanner;

public class CadenasC5C6 {

    public void PoliCodeCraftersC5C6() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una frase:");
        String input = scanner.nextLine();

        String resultadoVocales = invertirConVocalesMayusculas(input);
        String resultadoLetras = invertirConLetrasMayusculasExceptoVocales(input);

        System.out.println("Frase invertida con vocales en mayúsculas: " + resultadoVocales);
        System.out.println("Frase invertida con letras en mayúsculas excepto vocales: " + resultadoLetras);

        scanner.close();
    }

    public static String invertirConVocalesMayusculas(String frase) {
        StringBuilder fraseInvertida = new StringBuilder(frase).reverse();
        StringBuilder resultado = new StringBuilder();

        for (char letra : fraseInvertida.toString().toCharArray()) {
            if ("aeiouAEIOU".indexOf(letra) != -1) {
                resultado.append(Character.toUpperCase(letra));
            } else {
                resultado.append(letra);
            }
        }

        return resultado.toString();
    }

    public static String invertirConLetrasMayusculasExceptoVocales(String frase) {
        StringBuilder resultado = new StringBuilder();

        for (char letra : frase.toCharArray()) {
            if (Character.isLetter(letra)) {
                if ("aeiouAEIOU".indexOf(letra) == -1) {
                    resultado.insert(0, Character.toUpperCase(letra));
                } else {
                    resultado.insert(0, letra);
                }
            } else {
                resultado.insert(0, letra);
            }
        }

        return resultado.toString();
    }
}
