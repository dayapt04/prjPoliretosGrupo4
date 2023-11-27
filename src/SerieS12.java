public class SerieS12 {
    /*
     * <b>PoliCodeCraftersS12 </b> muestra la serie 2 6 12 20 30 42 56 72 ...
     * 
     * @param nroTerminos : Numero de terminos para la serie
     */
    public void PoliCodeCraftersForS12(int nroTerminos) {
        int[] resultado = new int[nroTerminos];
        resultado[0] = 2; // El primer término es siempre 2

        // Generar la serie S12 utilizando el patrón identificado
        for (int i = 1; i < nroTerminos; i++) {
            resultado[i] = resultado[i - 1] + (2 * i + 2);
        }

        System.out.println("\nSerie 12: ");
        for (int j = 0; j < nroTerminos; j++) {
            System.out.print(resultado[j]);
            if (j < nroTerminos - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public void PoliCodeCraftersWhileS12(int nroTerminos) {
        int[] resultado = new int[nroTerminos];
        resultado[0] = 2; // El primer término es siempre 2
        int i = 1;

        // Generar la serie S12 utilizando el patrón identificado con while
        while (i < nroTerminos) {
            resultado[i] = resultado[i - 1] + (2 * i + 2);
            i++;
        }

        // Imprimir la serie
        int j = 0;
        while (j < nroTerminos) {
            System.out.print(resultado[j]);
            if (j < nroTerminos - 1) {
                System.out.print(" ");
            }
            j++;
        }
        System.out.println();
    }

    public void PoliCodeCraftersDoWhileS12(int nroTerminos) {
        int[] resultado = new int[nroTerminos];
        resultado[0] = 2; // El primer término es siempre 2
        int i = 1;

        do {
            resultado[i] = resultado[i - 1] + (2 * i + 2);
            i++;
        } while (i < nroTerminos);

        int j = 0;
        while (j < nroTerminos) {
            System.out.print(resultado[j]);
            if (j < nroTerminos - 1) {
                System.out.print(" ");
            }
            j++;
        }
        System.out.println();
    }
}