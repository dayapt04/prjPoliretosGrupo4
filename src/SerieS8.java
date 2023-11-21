public class SerieS8 {

    public SerieS8(){
        System.out.println("\nSe ejecuta el constructor de la clase 08");
    }

    public void showSerieFor(int pTermino){

        int Serie=3;
        
        for(int i=1;i<=pTermino;i++){
            System.out.print(Serie + " ");
            Serie=Serie+5;
        }

        System.out.print("\n");
    }

    public void showSerieWhile(int pTermino){

        int Serie=3;
        int i=1;

        while (i <= pTermino) {
           System.out.print(Serie + " ");
           Serie = Serie + 5;
           i++;
        }

        System.out.print("\n");
    }

    public void showSerieDoWhile(int pTermino){
        
        int Serie=3;
        int i=1;
        do{
            System.out.println(Serie + " ");
            Serie = Serie + 5;
            i++;
        }
        while(i <= pTermino);

    }
    
}
