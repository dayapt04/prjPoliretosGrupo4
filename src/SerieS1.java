public class SerieS1 {
    public void showSerieFor(int m) {
        /* <b>showSerie </b> muestra la serie de Fibonacci 0 1 1 2 3 5 8 13
        * @param m : Numero de terminos para la serie
       */
            int t1 = 0, t2 = 1;
            for (int i = 1; i <= m; ++i) {
                System.out.print(t1 + " ");
                int sum = t1 + t2;
                t1 = t2;
                t2 = sum;
            }
            System.out.println();
        }

       
        public void showSerieWhile(int m) {
            int t1 = 0, t2 = 1;
            int i = 1;
            while (i <= m) {
                System.out.print(t1 + " ");
                int sum = t1 + t2;
                t1 = t2;
                t2 = sum;
                i++;
            }
            System.out.println();
        }
       
        public void showSerieDoWhile(int m) {
            int t1 = 0, t2 = 1;
            int i = 1;
            do {
                System.out.print(t1 + " ");
                int sum = t1 + t2;
                t1 = t2;
                t2 = sum;
                i++;
            } while (i <= m);
            System.out.println();
        }
    
}
