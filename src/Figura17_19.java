public class Figura17_19 {
    /*
     * <b>PoliCodeCraftersF17 </b> muestra la figura:
     * /// 1//////// 1
     * ////////0///0
     * //////////1
     * ////////0///0
     * ////1//////////1
     * ....
     * 
     * @param nroTerminos : Numero de terminos para la serie
     */

    public void PoliCodeCraftersF17(int nroTerminos) {
        System.out.println("Figura 17: ");
        int fig17[][] = new int[nroTerminos][nroTerminos];
        int i, j;
        for (i = 0; i < nroTerminos; i++) {
            for (j = 0; j < nroTerminos; j++) {
                if (i == j || i + j == (nroTerminos - 1))
                    if (i % 2 == 0)
                        fig17[i][j] = 1;
                    else
                        fig17[i][j] = 0;
                else
                    fig17[i][j] = 2;
            }
        }

        for (int[] is : fig17) {
            for (int n : is) {
                if (n == 2)
                    System.out.print("   ");
                else
                    System.out.print("   " + n);
            }
            System.out.println("");
        }
    }

    /*
     * <b>PoliCodeCraftersF18 </b> muestra la figura:
     * F18:
     * 2
     * 1 2
     * 1 3 2
     * 1 4 5 2
     * 1 5 9 7 2
     * 1 6 14 16 9 2
     * ....
     * 
     * @param nroTerminos : Numero de terminos para la serie
     */

    public void PoliCodeCraftersF18(int nroTerminos) {
        System.out.println("Figura 18: ");

        int fig18[][] = new int[nroTerminos][nroTerminos];

        for (int i = 0; i < nroTerminos; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == j)
                    fig18[i][j] = 2;
                else if (j == 0)
                    fig18[i][j] = 1;
                else
                    fig18[i][j] = fig18[i - 1][j - 1] + fig18[i - 1][j];
            }
        }

        for (int[] is : fig18) {
            for (int n : is) {
                if (n == 0)
                    System.out.print(" ");
                else
                    System.out.print(" " + n);
            }
            System.out.println("");
        }
    }

    /*
     * <b>PoliCodeCraftersF18 </b> muestra la figura:
     * F19:
     * *
     * + *
     * + 3 *
     * + 4 5 *
     * + 5 9 7 *
     * + 6 14 16 9 *
     * ....
     * 
     * @param nroTerminos : Numero de terminos para la serie
     */

    public void PoliCodeCraftersF19(int nroTerminos) {
        System.out.println("Figura 19: ");

        int fig19[][] = new int[nroTerminos][nroTerminos];

        for (int i = 0; i < nroTerminos; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == j)
                    fig19[i][j] = 2;
                else if (j == 0)
                    fig19[i][j] = 1;
                else
                    fig19[i][j] = fig19[i - 1][j - 1] + fig19[i - 1][j];
            }
        }

        for (int[] is : fig19) {
            for (int n : is) {
                if (n == 0)
                    System.out.print(" ");
                else if (n == 2)
                    System.out.print("*");
                else if (n == 1)
                    System.out.print("+");
                else
                    System.out.print(" " + n);
            }
            System.out.println("");
        }
    }
}