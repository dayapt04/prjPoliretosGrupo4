public class SerieS1 {
    public void PoliCodeCraftersForS1(int nroTerminos) {
        /*
         * <b PoliCodeCraftersS1 </b> muestra la serie de Fibonacci 0 1 1 2 3 5 8 13...
         * 
         * @param nroTerminos : Numero de terminos para la serie
         */
        int t1 = 0, t2 = 1;
        for (int i = 1; i <= nroTerminos; ++i) {
            System.out.print(t1 + " ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
        System.out.println();
    }

    public void PoliCodeCraftersWhileS1(int nroTerminos) {
        int t1 = 0, t2 = 1;
        int i = 1;
        while (i <= nroTerminos) {
            System.out.print(t1 + " ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
            i++;
        }
        System.out.println();
    }

    public void PoliCodeCraftersDoWhileS1(int nroTerminos) {
        int t1 = 0, t2 = 1;
        int i = 1;
        do {
            System.out.print(t1 + " ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
            i++;
        } while (i <= nroTerminos);
        System.out.println();
    }
}
