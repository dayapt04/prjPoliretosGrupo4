public class Figura5_8 {
    /*
     * <b>PoliCodeCraftersF5 </b> muestra un ciclo para imprimir una piramide invertida
     * 
     * @param altura: Numero ingresado para la altura
     */
    public void PoliCodeCraftersForF5(int altura){
        System.out.println("Figuras 5: ");
        for (int i = altura; i >= 1; i--) {
            for (int j = altura-i; j>0; j--){
                System.out.print(" ");
            }
            for (int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }   
    }
    /*
     * <b>PoliCodeCraftersF6 </b> muestra un ciclo para imprimir una piramide
     * 
     * @param altura: Numero ingresado para la altura
     */
    public void PoliCodeCraftersForF6(int altura){
        System.out.println("Figuras 6: ");
        for (int i = 1; i <= altura; i++) {
            for (int j = altura-i; j>0; j--){
                System.out.print(" ");
            }
            for (int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }   
    }
    /*
     * <b>PoliCodeCraftersF7 </b> muestra un ciclo para imprimir una escalera descendente
     * 
     * @param altura: Numero ingresado para la altura
     */
    public void PoliCodeCraftersForF7(int altura){
        System.out.println("Figuras 7: ");
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j<i; j++){
                System.out.print("    ");
            }
            if (i==1) {
                System.out.println("___");
            }else{
                System.out.println("|___");
            }
            
        }   
    }
    /*
     * <b>PoliCodeCraftersF8 </b> muestra un ciclo para imprimir una escalera ascendente
     * 
     * @param altura: Numero ingresado para la altura
     */
    public void PoliCodeCraftersForF8(int altura){
        System.out.println("Figuras 8: ");
        for (int i = 1; i <= altura; i++) {
            for (int j = altura-i; j>0; j--){
                System.out.print("    ");
            }
            if (i==1) {
                System.out.println("___");
            }else{
                System.out.println("___|");
            }
            
        }   
    }
}