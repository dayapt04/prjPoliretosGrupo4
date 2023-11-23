public class SerieS8 {

    public SerieS8() {
        System.out.println("\nSerie 8: ");
    }

    public void PoliCodeCraftersForS8(int pTermino) {

        int Serie = 3;

        for (int i = 1; i <= pTermino; i++) {
            System.out.print(Serie + " ");
            Serie = Serie + 5;
        }

        System.out.print("\n");
    }

    public void PoliCodeCraftersWhileS8(int pTermino) {

        int Serie = 3;
        int i = 1;

        while (i <= pTermino) {
            System.out.print(Serie + " ");
            Serie = Serie + 5;
            i++;
        }

        System.out.print("\n");
    }

    public void PoliCodeCraftersDoWhileS8(int pTermino) {

        int Serie = 3;
        int i = 1;
        do {
            System.out.print(Serie + " ");
            Serie = Serie + 5;
            i++;
        } while (i <= pTermino);
        System.out.println();
    }

}
