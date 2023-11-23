public class SerieS10 {
    
    public SerieS10() {
        System.out.println("\nSerie 10: ");
    }

    public void PoliCodeCraftersForS10(int pTermino) {

        int Serie = 3;

        for (int i = 1; i <= pTermino; i++) {
            System.out.print(Serie + " ");
            Serie = Serie * 3 ;
        }

        System.out.print("\n");
    }

    public void PoliCodeCraftersWhileS10(int pTermino) {

        int Serie = 3;
        int i = 1;

        while (i <= pTermino) {
            System.out.print(Serie + " ");
            Serie = Serie * 3;
            i++;
        }

        System.out.print("\n");
    }

    public void PoliCodeCraftersDoWhileS10(int pTermino) {

        int Serie = 3;
        int i = 1;
        do {
            System.out.print(Serie + " ");
            Serie = Serie * 3;
            i++;
        } while (i <= pTermino);

    }
}
