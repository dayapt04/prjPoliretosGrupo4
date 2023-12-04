public class Loading9_10 {

    public void PoliCodeCraftersloading9_10() {
        animacionDibujo();
        animacionNombre("AlEXIS");
    }

    public static void animacionDibujo() {
        int posicion = 0;
        int direccion = 1;
        int limiteDerecho = 20;
        int ciclos = 0;
        int ciclosMaximos = 6;

        while (ciclos < ciclosMaximos) {
            imprimirDibujo(posicion);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            borrarDibujo(posicion);

            posicion += direccion;

            if (posicion >= limiteDerecho || posicion <= 0) {
                direccion *= -1;
                ciclos++;
            }
        }
    }

    public static void animacionNombre(String nombre) {
        int totalLetras = nombre.length();

        for (int i = 1; i <= totalLetras; i++) {
            double porcentaje = ((double) i / totalLetras) * 100;
            System.out.print("\r" + nombre.substring(0, i) + " " + String.format("%.2f", porcentaje) + "% completado");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println();
    }

    public static void imprimirDibujo(int posicion) {
        for (int i = 0; i < posicion; i++) {
            System.out.print(" ");
        }
        System.out.println("   \\|||/");
        for (int i = 0; i < posicion; i++) {
            System.out.print(" ");
        }
        System.out.println("  ( > < )");
        for (int i = 0; i < posicion; i++) {
            System.out.print(" ");
        }
        System.out.println("ooO-(_)-Ooo");
    }

    public static void borrarDibujo(int posicion) {
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }
}
