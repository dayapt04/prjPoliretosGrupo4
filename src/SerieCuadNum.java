public class SerieCuadNum {
    /* <b>showSerie </b> muestra la serie   1  4   9   16  25  36  49  64
     * @param NroTerminos : Numero de terminos para la serie
    */
    public void showSerieFor(int NroTerminos){
        // int resul=0;
        for(int i=1; i<=NroTerminos; i++){
            System.out.print((i*i)+" ");
            // resul=i*i;
            // // System.out.print(resul+" ");
        }
    }

    public void showSerieWhile(int NroTerminos){
        int i=1;
        // int resul=0;
        while (i<=NroTerminos) {
            System.out.print((i*i)+" ");
            // resul=i*i;
            // System.out.print(resul+" ");
            i++;
        }
    }

    public void showSerieDoWhile(int NroTerminos){
        int i=1;
        // int resul=0;
        do{
            System.out.print((i*i)+" ");
            // resul=i*i;
            // System.out.print(resul+" ");
            i++;
        }while(i <= NroTerminos);
    }
}
