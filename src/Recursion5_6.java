public class Recursion5_6 {
    /*
     * <b>PoliCodeCraftersR5 </b> muestra la serie conteoProgresivoHasta(n)
     * 
     * @param nroTerminos : Numero de terminos para la serie
     */
    public void PoliCodeCraftersR5(int inicio, int nroTerminos) {
        if (inicio > nroTerminos)
            return;
        else
            System.out.print(inicio + " ");
        PoliCodeCraftersR5(inicio + 1, nroTerminos);
    }

    /*
     * <b>PoliCodeCraftersR6 </b> muestra la serie conteoRegresivo(n) hasta 0
     * 
     * @param nroTerminos : Numero de terminos para la serie
     */

    public void PoliCodeCraftersR6(int nroTerminos) {
        if (nroTerminos < 0)
            return;
        else
            System.out.print(nroTerminos + " ");
        PoliCodeCraftersR6(nroTerminos - 1);
    }
}