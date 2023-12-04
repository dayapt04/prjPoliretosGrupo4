public class CaracteresS3S7 {

    /*
     * <b>PoliCodeCraftersCaracS3 </b> muestra la serie S3: ++ +++ +++++ +++++++
     * +++++++++++ +++++++++++++ ...
     * 
     * @param nroTerminos : Numero de terminos para la serie
     */

    public void PoliCodeCraftersCaracS3(int nroTerminos) {
        System.out.println("Caracteres S3: ");
        int num1 = 2;
        int i = 0;
        while (i < nroTerminos) {
            if (esPrimo(num1)) {
                System.out.print("+".repeat(num1) + " ");
                i++;
            }
            num1++;
        }
        System.out.println();
    }

    static boolean esPrimo(int k) {
        if (k <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(k); i++) {
            if (k % i == 0) {
                return false;
            }
        }
        return true;
    }

    /*
     * <b>PoliCodeCraftersCaracS7 </b> muestra la serie Caracteres S7: aa bbbb
     * cccccc dddddddd ...
     * 
     * @param nroTerminos : Numero de terminos para la serie
     */

    public void PoliCodeCraftersCaracS7(int nroTerminos) {
        System.out.println("Caracteres S7: ");
        int num = 0;
        for (int i = 1; i < nroTerminos; i++) {
            char letra = (char) ('a' + (i - 1));
            String strLetra = Character.toString(letra);

            System.out.print(strLetra.repeat(num += 2) + " ");
        }
        System.out.println();
    }
}
