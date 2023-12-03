public class Loading3_4 {
    /*
     * <b>PoliCodeCraftersL3 </b> muestra un caracter que se desplaza de izquierda a derecha en una barra es de 20 caracteres
     * 
     * @param charDig: Caracter ingresado
     */
    public void PoliCodeCraftersForL3(String charDig)throws InterruptedException{
        System.out.print("[");
            for(int i = 1; i<21; i++){
                System.out.print(" ");
            }
            System.out.print("]\r");
        for(int j = 1; j<21; j++){
            System.out.print("[");
            for(int k = 1; k<21; k++){
                if(k==j){
                    System.out.print(charDig);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("] "+(j*5)+"%\r");
            Thread.sleep(100);
        }
        for(int l = 20; l>=1; --l){
            System.out.print("[");
            for(int m = 1; m<21; m++){
                if(m==l){
                    System.out.print(charDig);
                }else{
                    System.out.print(" ");
                }
            }
            if(l*5==100){
                System.out.print("] "+(l*5)+"%\r");
            } else if(l*5>=10 && l*5<=95){
                System.out.print("]  "+(l*5)+"%\r");
            } else{
                System.out.print("]   "+(l*5)+"%\r");
            }
            Thread.sleep(100);
        }
    }

    /*
     * <b>PoliCodeCraftersL4 </b> muestra un waiting que inicia en 0  a 100% usar los signos o0o para simular un movimiento de ida y vuelta en el mismo puesto
     * 
     * @param 
     */
    public void PoliCodeCraftersForL4() throws InterruptedException{
        System.out.println("Loading 4: ");
        for (int i=0; i<=100; i++){
            int nSpacios = 2-(i%3);
            String bStatus = "";
            for (int j = 0; j<nSpacios; j++){
                bStatus += "o";
            }
            bStatus += "0";
            for (int j = 0; j<2-nSpacios; j++){
                bStatus += "o";
            }
            System.out.print(bStatus+" "+i+"%\r");
            Thread.sleep(200);
        }
    }

}