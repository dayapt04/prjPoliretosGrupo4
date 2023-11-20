public class SerieS2 {
    public  void showSerieFor(int m) {
        /* <b>showSerie </b> muestra la serie de Fibonacci 0 1 1 2 3 5 8 13
        * @param m : Numero de terminos para la serie
       */
            for (int i = 1; i <= m; ++i) {
                if (i % 2 == 0) {
                  System.out.print("0 ");
                } else {
                  System.out.print((i) + " ");
                }
            }
            System.out.println();
        }
       
        public void showSerieWhile(int m) {
            /*<b>showSerie </b> muestra la una serie de números impares alternados con ceros :  1 0 3 0 5 0 7 0 9 ...
             * @param m : Numero de terminos para la serie
             */
    
            int i = 1;
            while (i <= m) {
                if (i % 2 == 0) {
                  System.out.print("0 ");
                } else {
                  System.out.print((i) + " ");
                }
                i++;
            }
            System.out.println();
        }
       
        public void showSerieDoWhile(int m) {
            int i = 1;
            do {
                if (i % 2 == 0) {
                  System.out.print("0 ");
                } else {
                  System.out.print((i) + " ");
                }
                i++;
            } while (i <= m);
            System.out.println();
        }
    
}
