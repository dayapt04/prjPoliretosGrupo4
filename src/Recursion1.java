public class Recursion1 {
    /*
     * <b>PoliCodeCraftersR1 </b> muestra un metodo recursivo para obtener factorial(n)
     * 
     * @param nDigit : Numero ingresado para sacar su factorial
     */
    public void PoliCodeCraftersR1(int nDigit){
        System.out.println("El factorial del numero "+nDigit+" es: "+FactorialN(nDigit));
        System.out.println();
    }
    public int FactorialN(int num){
        if (num == 0 || num == 1){
            return 1;
        }else{
            return num*FactorialN(num-1);
    }
    }   
}
