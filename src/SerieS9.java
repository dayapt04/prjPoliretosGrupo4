public class SerieS9 {
    /*
     * <b>PoliCodeCraftersS9 </b> muestra la serie 2, 4, 8, 16, 32, 64, 128, 256,...
     * 
     * @param nroTerminos : Numero de terminos para la serie
     */
    public void PoliCodeCraftersForS9(int nroTerminos) {
        int num = 2;
        for (int i = 0; i < nroTerminos; i++) {
            System.out.print(num + " ");
            int tempNum = num * 2;
            num = tempNum;
        }
        System.out.println();
    }

    public void PoliCodeCraftersWhileS9(int nroTerminos) {
        int i = 0;
        int num = 2;
        while (i < nroTerminos) {
            System.out.print(num + " ");
            int tempNum = num * 2;
            num = tempNum;
            i++;
        }
        System.out.println();
    }

    public void PoliCodeCraftersDoWhileS9(int nroTerminos) {
        int i = 0;
        int num = 2;
        do {
            System.out.print(num + " ");
            int tempNum = num * 2;
            num = tempNum;
            i++;
        } while (i < nroTerminos);
        System.out.println();
    }
}