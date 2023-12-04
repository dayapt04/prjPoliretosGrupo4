public class Figura1_4{
    /*
     * <b>PoliCodeCraftersF1 </b> muestra un ciclo para imprimir un cuadrado  formado sus vordes por el signo *.
     * 
     * @param altura: Numero ingresado para la altura
     */
    
    public void PoliCodeCraftersForF1(int altura){
        System.out.println("Figura 1: ");
        System.out.println();
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura; j++){
                if (i == 1 || i == altura || j == 1 || j == altura) {
                  System.out.print(" * ");
                } else {
                  System.out.print("   ");
                }
            }
            System.out.println();
        } 
    }

    /*
     * <b>PoliCodeCraftersF1 </b> muestra un ciclo para imprimir un cuadrado  formado sus vordes por los signos *+.
     * 
     * @param altura: Numero ingresado para la altura
     */
    

      public void PoliCodeCraftersForF2(int altura){
        System.out.println("Figura 2: ");
        System.out.println();
   for (int i = 1; i <= altura; i++) {
       for (int j = 1; j <= altura; j++){
           char currentChar = (i + j) % 2 == 0 ? '*' : '+';
           if (i == 1 || i == altura || j == 1 || j == altura) {
               System.out.print(currentChar + "  ");
           } else {
               System.out.print("   ");
           }
       }
       System.out.println();
   } 
}
/*
     * <b>PoliCodeCraftersF1 </b> muestra un ciclo para imprimir una  pirámide con una base rectangular.
     * 
     * @param altura: Numero ingresado para la altura
     */
    
     
     public void PoliCodeCraftersForF3(int altura){
        System.out.println("Figura 3: ");
        System.out.println();
        for (int i = 1; i <= altura; i++) {
          for (int j = 1; j <= i; j++) {
              System.out.print(" * ");
          }
          for (int k = 1; k <= altura - i; k++) {
              System.out.print("   ");
          }
          System.out.println();
        }
    }
    /*
     * <b>PoliCodeCraftersF1 </b> muestra un ciclo para imprimir una  pirámide con una base rectangular de lado izquierdo.
     * 
     * @param altura: Numero ingresado para la altura
     */
        
     public void PoliCodeCraftersForF4(int altura){
        System.out.println("Figura 4: ");
        System.out.println();
        for (int i = 1; i <= altura; i++) {
         for (int j = 1; j <= altura - i; j++) {
             System.out.print("   ");
         }
         for (int k = 1; k <= i; k++) {
             System.out.print(" * ");
         }
         System.out.println();
        }
    }
}
