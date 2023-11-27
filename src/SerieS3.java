public class SerieS3 {
    /*
     * <b>PoliCodeCraftersS3 </b> muestra la serie 0/1 1/3 1/5 2/7 3/9 5/11 8/13
     * 13/15...
     * 
     * @param nroTerminos : Numero de terminos para la serie
     */

    public void PoliCodeCraftersForS3(int nroTerminos) {
        int numerador = 0;
        int suma = 1;
        int denominador = 1;
        int i = 0;

        for (; i < nroTerminos; i++) {
            System.out.print(numerador + "/" + denominador + " ");
            int tempNumerador = numerador + suma;
            numerador = suma;
            suma = tempNumerador;
            denominador += 2;
        }

        System.out.println();
    }

    public void PoliCodeCraftersWhileS3(int nroTerminos) {
        int numerador = 0;
        int suma = 1;
        int denominador = 1;
        int i = 0;

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

    public void PoliCodeCraftersDoWhileS3(int nroTerminos) {
        int numerador = 0;
        int suma = 1;
        int denominador = 1;
        int i = 0;

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
