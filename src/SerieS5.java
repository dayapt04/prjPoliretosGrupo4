public class SerieS5 {
    /*
     * <b>PoliCodeCrafters </S5b> muestra la serie 2 3 5 7 11 13 17 19 23 29 31
     * 
     * @param nroTerminos : Numero de terminos para la serie
     */
    public void PoliCodeCraftersForS5(int nroTerminos) {
        int num1 = 2;
        for (int i = 0; i < nroTerminos;) {
            if (esPrimo(num1)) {
                System.out.print(num1 + " ");
                i++;
            }
            num1++;
        }
        System.out.println();
    }

    public void PoliCodeCraftersWhileS5(int nroTerminos) {
        int num1 = 2;
        int i = 0;
        while (i < nroTerminos) {
            if (esPrimo(num1)) {
                System.out.print(num1 + " ");
                i++;
            }
            num1++;
        }
        System.out.println();
    }

    public void PoliCodeCraftersDoWhileS5(int nroTerminos) {
        int num1 = 2;
        int i = 0;
        do {
            if (esPrimo(num1)) {
                System.out.print(num1 + " ");
                i++;
            }
            num1++;
        } while (i < nroTerminos);
        System.out.println();
    }

    static boolean esPrimo(int num2) {
        if (num2 <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num2); i++) {
            if (num2 % i == 0) {
                return false;
            }
        }
        return true;
    }
}
