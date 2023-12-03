public class Figura13_16 {

    public void PoliCodeCraftersF13(int nTermino){

        for(int i=1; i <= nTermino; i++){

            for(int j = 1; j<=i; j++){

                System.out.print(j);
            }

            System.out.println();
        }





    }

    public void PoliCodeCraftersF14(int nTermino){

        for (int i = 0; i < nTermino; i++) {  
            int coeficiente = 1;  
            for (int j = 0; j < nTermino - i; j++) {  
                System.out.print("  ");  
            }  
            for (int j = 0; j <= i; j++) {  
                System.out.printf("%4d", coeficiente);  
                coeficiente = coeficiente * (i - j) / (j + 1);  
            }  
            System.out.println();  
        }
    }

    public void PoliCodeCraftersF15(int nTermino){
        for (int i = 0; i < nTermino; i++) {  
            int coeficiente = 1;   
            for (int j = 0; j <= i; j++) {  
                System.out.printf("%4d", coeficiente);  
                coeficiente = coeficiente * (i - j) / (j + 1);  
            }  
            System.out.println();  
        }




    }

    public void PoliCodeCraftersF16(int nTermino){

        for (int i = 0; i < nTermino; i++) {  
            for (int j = 0; j < nTermino; j++) {  
                if ((i == 0 || i == nTermino - 1) && (j == 0 || j == nTermino - 1) || i == nTermino / 2 && j == nTermino / 2) {  
                    System.out.print("+ ");  
                } else if (i == 2 && j == 2) {  
                    System.out.print("+ ");  
                } else if (j == 2) {  
                    System.out.print("+ ");  
                } else {  
                    System.out.print("- ");  
                }  
            }  
            System.out.println();  
        }  

    }
}