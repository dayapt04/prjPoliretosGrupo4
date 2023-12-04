public class CaracteresS4S6 {

    public void PoliCodeCraftersSC4(int nTermino){

        String SC4 = "+-*/";
        int indice = 0;
        for(int i=0; i < nTermino; i++){
            
            System.out.print(SC4.substring(indice, indice+1) + " ");
            indice++;

            if (indice == 4) {
                indice = 0;
            }
        }

    }

    public void PoliCodeCraftersSC6(int nTermino){

        String SC6 = "a+c-e+g-i+k-m+o-q+s-u+w-y+";
        int indice = 0;
        for(int i=0; i < nTermino; i++){
            
            System.out.print(SC6.substring(indice, indice+1) + " ");
            indice++;

            if (indice == 26) {
                indice = 0;
            }
        }
    }

}