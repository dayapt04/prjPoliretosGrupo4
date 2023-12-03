public class Recursion4 {

    public int PoliCodeCraftersR4 (int base, int exponente){

        if (exponente == 1) {
            return base;
        }
        else{
            return base * PoliCodeCraftersR4(base, exponente - 1);
        }

    }

}