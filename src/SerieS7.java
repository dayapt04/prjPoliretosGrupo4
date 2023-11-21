public class SerieS7 {

    public SerieS7() {
        System.out.println("\nSerie 7: ");
    }

    public void PoliCodeCraftersForS7(int pTermino) {

        int Serie = 1;

        for (int i = 1; i <= pTermino; i++) {
            System.out.print(Serie + " ");
            Serie = Serie + 3;
        }

        System.out.print("\n");
    }

    public void PoliCodeCraftersWhileS7(int pTermino) {

        int Serie = 1;
        int i = 1;

        while (i <= pTermino) {
            System.out.print(Serie + " ");
            Serie = Serie + 3;
            i++;
        }

        System.out.print("\n");
    }

    public void PoliCodeCraftersDoWhileS7(int pTermino) {

        int Serie = 1;
        int i = 1;
        do {
            System.out.print(Serie + " ");
            Serie = Serie + 3;
            i++;
        } while (i <= pTermino);

        System.out.println("\n");
    }
}
