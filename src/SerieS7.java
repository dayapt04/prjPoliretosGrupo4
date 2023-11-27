public class SerieS7 {
    /*
     * <b>PoliCodeCraftersS7 </b> muestra la serie 1 4 7 10 13 16 19 22 25...
     * 
     * @param nroTerminos : Numero de terminos para la serie
     */
    public SerieS7() {
        System.out.println("\nSerie 7: ");
    }

    public void PoliCodeCraftersForS7(int nroTerminos) {

        int Serie = 1;

        for (int i = 1; i <= nroTerminos; i++) {
            System.out.print(Serie + " ");
            Serie = Serie + 3;
        }

        System.out.print("\n");
    }

    public void PoliCodeCraftersWhileS7(int nroTerminos) {

        int Serie = 1;
        int i = 1;

        while (i <= nroTerminos) {
            System.out.print(Serie + " ");
            Serie = Serie + 3;
            i++;
        }

        System.out.print("\n");
    }

    public void PoliCodeCraftersDoWhileS7(int nroTerminos) {

        int Serie = 1;
        int i = 1;
        do {
            System.out.print(Serie + " ");
            Serie = Serie + 3;
            i++;
        } while (i <= nroTerminos);

    }
}
