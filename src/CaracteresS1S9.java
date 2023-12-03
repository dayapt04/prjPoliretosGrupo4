public class CaracteresS1S9 {
    /*
     * <b>PoliCodeCraftersS1 </b> muestra un ciclo para imprimir una serie de caracteres: + - + - + - +
     * 
     * @param nroTerminos : Numero de terminos para la serie
     */
    public void PoliCodeCraftersForS1(int nroTerminos){
        System.out.println("Serie de caracteres 1: ");
        for (int i = 0; i <= nroTerminos ; i++) {
            if(i%2==0){
                System.out.print("+ ");
            }else{
                System.out.print("- ");
            }
        }
        System.out.println();
    }
    /*
     * <b>PoliCodeCraftersS1 </b> muestra un ciclo para imprimir una serie de caracteres: a  b  c  dd  eee  fffff  gggggggg
     * 
     * @param nroTerminos : Numero de terminos para la serie
     */
    public void PoliCodeCraftersForS9(int nroTerminos){
        int t1 = 0, t2 = 1;
        System.out.println("Serie de caracteres 9: ");
        System.out.print('a'+"  ");
        for (int i = 0; i < nroTerminos; i++) {
            char letra = (char) ('b' + i);
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
            for (int j = 0; j < t1; j++) {
                System.out.print(letra);
            }
            if (i < nroTerminos - 1) {
                System.out.print("  ");
            }
        }
        System.out.println();
    }
}