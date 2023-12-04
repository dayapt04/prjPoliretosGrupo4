public class Figura13_16 {

    public void PoliCodeCraftersF13(int nTermino) {
        System.out.println("Figura 13: ");

        for (int i = 1; i <= nTermino; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(j);
            }

            System.out.println();
        }

    }

    public void PoliCodeCraftersF14(int nTermino) {
        System.out.println("Figura 14: ");

        for (int i = 0; i < nTermino; i++) {
            int coeficiente = 1;
            for (int j = 0; j < nTermino - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", coeficiente);
                coeficiente = coeficiente * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

    public void PoliCodeCraftersF15(int nTermino) {
        System.out.println("Figura 15: ");

        for (int i = 0; i < nTermino; i++) {
            int coeficiente = 1;
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", coeficiente);
                coeficiente = coeficiente * (i - j) / (j + 1);
            }
            System.out.println();
        }

    }

    public void PoliCodeCraftersF16(int nTermino) {
        System.out.println("Figura 16: ");

        int dimension = nTermino;
        String caracterImprimible = "+";
        // Ciclo para recorrer las filas del cuadrado
        for (int i = 0; i < dimension; i++) {
            // si la fila es impar se imprime + y si es par -
            if (i % 2 == 0) {
                caracterImprimible = "+";
            } else {
                caracterImprimible = "-";
            }
            // Ciclo para recorrer las columnas del cuadrado
            for (int j = 0; j < dimension; j++) {

                // Imprimir el símbolo "+" en las diagonales
                if (i == j || i == dimension - 1 - j) {
                    System.out.print(caracterImprimible);
                }
                // Imprimir espacios en blanco en las demás posiciones
                else {
                    System.out.print(" ");
                }
            }

            // Cambiar de línea después de imprimir una fila
            System.out.println();

        }

    }
}