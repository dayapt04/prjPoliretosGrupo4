import java.util.Scanner;

public class CaracteresS2S8 {
    Scanner sc = new Scanner(System.in);

    public void inputNumberOfTerms() {
        System.out.print("Ingrese el número de términos de las series: ");
        int nTerminos = Integer.parseInt(sc.nextLine());
        System.out.println("Serie de caracteres 2: ");
        this.PoliCodeCraftersS2(nTerminos);
        System.out.println();
        System.out.println("Serie de caracteres 8:");
        System.out.println();
        this.PoliCodeCraftersS8(nTerminos);
        System.out.println();
    }

    /*
     * <b>PoliCodeCraftersS2 </b> muestra un ciclo para imprimir una serie de
     * caracteres: + + ++ +++ +++++ ++++++++ +++++++++++++ ...
     * 
     * @param nTerminos : Numero de terminos para la serie
     */
    public void PoliCodeCraftersS2(int nTerminos) {
        String t1 = "+", t2 = "+";
        for (int i = 1; i <= nTerminos; ++i) {
            System.out.print(t1 + " ");
            String sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
        System.out.println();
    }
    /*
     * <b>PoliCodeCraftersS8 </b> muestra un ciclo para imprimir una serie de
     * caracteres: a bbb ccccc ddddddd eeeeeeeee...
     * 
     * @param nTerminos : Numero de terminos para la serie
     */

    public void PoliCodeCraftersS8(int nTerminos) {
        for (int i = 1; i <= nTerminos; i++) {
            char letra = (char) ('a' + i - 1);
            String strLetra = Character.toString(letra);
            int nLetras = i * 2 - 1;
            System.out.print(strLetra.repeat(nLetras));
            if (i != nTerminos) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
