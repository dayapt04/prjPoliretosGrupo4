public class SerieS4 {
    /*
     * <b>PoliCodeCraftersS4 </b> muestra la serie 0/2 1/4 1/6 2/8 3/10 5/12 8/14
     * 13/16...
     * 
     * @param nroTerminos : Numero de terminos para la serie
     */

    public void PoliCodeCraftersForS4(int nroTerminos) {
        int i = 0;
        int denominador = 2;
        int numerador = 0;
        int suma = 1;

        for (; i < nroTerminos; i++) {
            System.out.print(numerador + "/" + denominador + " ");
            int tempNumerador = numerador + suma;
            numerador = suma;
            suma = tempNumerador;
            denominador += 2;
        }

        System.out.println();
    }

    public void PoliCodeCraftersWhileS4(int nroTerminos) {
        int i = 0;
        int denominador = 2;
        int numerador = 0;
        int suma = 1;
        while (i < nroTerminos) {
            System.out.print(numerador + "/" + denominador + " ");
            int tempNumerador = numerador + suma;
            numerador = suma;
            suma = tempNumerador;
            denominador += 2;
            i++;
        }

        System.out.println();
    }

    public void PoliCodeCraftersDoWhileS4(int nroTerminos) {
        int i = 0;
        int denominador = 2;
        int numerador = 0;
        int suma = 1;
        do {
            System.out.print(numerador + "/" + denominador + " ");
            int tempNumerador = numerador + suma;
            numerador = suma;
            suma = tempNumerador;
            denominador += 2;
            i++;
        } while (i < nroTerminos);
        System.out.println();
    }
}
