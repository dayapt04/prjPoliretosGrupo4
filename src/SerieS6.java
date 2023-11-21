public class SerieS6 {
    /*
     * <b>showSerie </b> muestra la serie 1 4 9 16 25 36 49 64
     * 
     * @param nroTerminos : Numero de terminos para la serie
     */
    public void PoliCodeCraftersForS6(int nroTerminos) {
        // int resul=0;
        for (int i = 1; i <= nroTerminos; i++) {
            System.out.print((i * i) + " ");
            // resul=i*i;
            // // System.out.print(resul+" ");
        }
        System.out.println();
    }

    public void PoliCodeCraftersWhileS6(int nroTerminos) {
        int i = 1;
        // int resul=0;
        while (i <= nroTerminos) {
            System.out.print((i * i) + " ");
            // resul=i*i;
            // System.out.print(resul+" ");
            i++;
        }
        System.out.println();
    }

    public void PoliCodeCraftersDoWhileS6(int nroTerminos) {
        int i = 1;
        // int resul=0;
        do {
            System.out.print((i * i) + " ");
            // resul=i*i;
            // System.out.print(resul+" ");
            i++;
        } while (i <= nroTerminos);
        System.out.println();
    }
}
