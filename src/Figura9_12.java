import java.util.Scanner;

public class Figura9_12 {

    public void imprimirFigura9_12(int tamano) {
        String espacio9_12 = "     ";
        String linea1_9_12 = "|_+_";
        String linea2_9_12 = "|_-_";

        System.out.println("Figura 10:");
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(espacio9_12);
            }

            if (i % 2 == 0) {
                System.out.print(linea1_9_12);
            } else {
                System.out.print(linea2_9_12);
            }

            System.out.println();
        }
        System.out.println();
    }

    public void imprimirFigura13_16(int tamano) {
        String espacio13_16 = "       ";
        String linea1_13_16 = "|";
        String linea2_13_16 = "_";

        System.out.println("Figura 11:");
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(espacio13_16);
            }

            if (i % 2 == 0) {
                System.out.print(linea1_13_16);
            } else {
                for (int k = 0; k < (i / 2) + 1; k++) {
                    System.out.print(linea2_13_16);
                }
            }

            System.out.println();
        }
        System.out.println();
    }

    public void imprimirNumerosDecrecientes(int tamano) {
        System.out.println("Figura 12:");
        for (int i = tamano; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void imprimirPiramideConPeldanos(int tamano) {
        System.out.println("Pirámide con Peldaños:");
        for (int i = 1; i <= tamano; i++) {
            // Imprime espacios en blanco
            for (int j = tamano - i; j > 0; j--) {
                System.out.print(" ");
            }
            // Imprime los bordes de la pirámide con signos "|"
            System.out.print("|");
            // Imprime los bordes de la pirámide con signos "_"
            System.out.print("¯");
            for (int k = 2; k <= 2 * i - 2; k++) {
                System.out.print(" ");
            }
            // Imprime los bordes de la pirámide con signos "_"
            if (i > 1) {
                System.out.print("¯");
            }
            System.out.println("|");
        }
        System.out.println();
    }
   

    public void PoliCodeCraftersFigura9_12() {
        Scanner scanner = new Scanner(System.in);
        Figura9_12 figurasCombinadas = new Figura9_12();

        System.out.print("Ingrese el tamaño para todas las figuras: ");
        int tamano = scanner.nextInt();

        figurasCombinadas.imprimirFigura9_12(tamano);
        figurasCombinadas.imprimirFigura13_16(tamano);
        figurasCombinadas.imprimirNumerosDecrecientes(tamano);
        figurasCombinadas.imprimirPiramideConPeldanos(tamano);

        scanner.close();
    }
}
