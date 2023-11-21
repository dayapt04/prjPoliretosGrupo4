import java.util.Scanner;

public class SerieS12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el número de términos
        System.out.print("Ingrese el número de términos para la serie S12: ");
        int n = scanner.nextInt();

        // Validar que el número de términos sea positivo
        if (n <= 0) {
            System.out.println("Por favor, ingrese un número positivo.");
            // Salir del programa si el número de términos no es positivo
            System.exit(0);
        }

        // Crear una instancia de la clase SerieS12
        SerieS12 serie = new SerieS12();

        // Generar la serie S12 utilizando el método generarSerie()
        int[] resultado = serie.generarSerie(n);

        // Imprimir la serie
        System.out.print("Serie S12: ");
        for (int j = 0; j < n; j++) {
            System.out.print(resultado[j]);
            if (j < n - 1) {
                System.out.print(", ");
            }
        }

        // Cerrar el scanner
        scanner.close();
    }

    // Método para generar la serie S12
    public int[] generarSerie(int n) {
        int[] resultado = new int[n];
        resultado[0] = 2; // El primer término es siempre 2
        int i = 1;

        // Generar la serie S12 utilizando el patrón identificado con do-while
        do {
            resultado[i] = resultado[i - 1] + (2 * i + 2);
            i++;
        } while (i < n);

        return resultado;
    }
}

class ForSerie12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el número de términos
        System.out.print("Ingrese el número de términos para la serie S12: ");
        int n = scanner.nextInt();

        // Validar que el número de términos sea positivo
        if (n <= 0) {
            System.out.println("Por favor, ingrese un número positivo.");
            // Salir del programa si el número de términos no es positivo
            System.exit(0);
        }

        int[] resultado = new int[n];
        resultado[0] = 2; // El primer término es siempre 2

        // Generar la serie S12 utilizando el patrón identificado
        for (int i = 1; i < n; i++) {
            resultado[i] = resultado[i - 1] + (2 * i + 2);
        }

        // Imprimir la serie
        System.out.print("Serie S12: ");
        for (int i = 0; i < n; i++) {
            System.out.print(resultado[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }

        // Cerrar el scanner
        scanner.close();
    }
}

class WhileSerie12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el número de términos
        System.out.print("Ingrese el número de términos para la serie S12: ");
        int n = scanner.nextInt();

        // Validar que el número de términos sea positivo
        if (n <= 0) {
            System.out.println("Por favor, ingrese un número positivo.");
            // Salir del programa si el número de términos no es positivo
            System.exit(0);
        }

        int[] resultado = new int[n];
        resultado[0] = 2; // El primer término es siempre 2
        int i = 1;

        // Generar la serie S12 utilizando el patrón identificado con while
        while (i < n) {
            resultado[i] = resultado[i - 1] + (2 * i + 2);
            i++;
        }

        // Imprimir la serie
        System.out.print("Serie S12: ");
        int j = 0;
        while (j < n) {
            System.out.print(resultado[j]);
            if (j < n - 1) {
                System.out.print(", ");
            }
            j++;
        }

        // Cerrar el scanner
        scanner.close();
    }
}
