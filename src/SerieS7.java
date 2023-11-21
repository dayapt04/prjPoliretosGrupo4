public class SerieS7 {
    
    public SerieS7 (){
        System.out.println("\nSe ejecuta el constructor de la clase 07");
    }

    public void showSerieFor(int pTermino){

        int Serie=1;
        
        for(int i=1;i<=pTermino;i++){
            System.out.print(Serie + " ");
            Serie=Serie+3;
        }

        System.out.print("\n");
    }

    public void showSerieWhile(int pTermino){

        int Serie=1;
        int i=1;

        while (i <= pTermino) {
           System.out.print(Serie + " ");
           Serie = Serie + 3;
           i++;
        }

        System.out.print("\n");
    }

    public void showSerieDoWhile(int pTermino){
        
        int Serie=1;
        int i=1;
        do{
            System.out.println(Serie + " ");
            Serie = Serie + 3;
            i++;
        }
        while(i <= pTermino);

    }
}
