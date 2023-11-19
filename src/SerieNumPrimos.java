public class SerieNumPrimos {
    /* <b>showSerie </b> muestra la serie 2  3  5   7  11  13  17  19  23  29  31
     * @param NroTerminos : Numero de terminos para la serie
    */
    public void showSerieFor(int NroTerminos){
        int num1=2;
        for(int i=0; i<NroTerminos;){
            if(esPrimo(num1)){
                System.out.print(num1+" ");
                i++;
            }
            num1++;
        }
    }
    public void showSerieWhile(int NroTerminos){
        int num1=2;
        int i=0;
        while (i<NroTerminos) {
            if(esPrimo(num1)) {
                System.out.print(num1+" ");
                i++;
            }
            num1++;
        }
    }

    public void showSerieDoWhile(int NroTerminos){
        int num1 = 2;
        int i = 0;
        do{
            if(esPrimo(num1)){
                System.out.print(num1+" ");
                i++;
            }
            num1++;
        }while (i<NroTerminos);
    }

    static boolean esPrimo(int num2){
        if (num2 <= 1){
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
