public class Loading9_10 {

    public void PoliCodeCraftersloading9_10() {
        animacionDibujo();
        animacionNombre("AlEXIS");
    }

    public static void animacionDibujo() {
        int posicion = 0;
        int direccion = 1; // 1 para derecha, -1 para izquierda
        int limiteDerecho = 20; // Establece el límite derecho de la pantalla
        int ciclos = 0;
        int ciclosMaximos = 6; // Número máximo de ciclos izquierda-derecha

        while (ciclos < ciclosMaximos) {
            // Imprime el dibujo en la posición actual
            imprimirDibujo(posicion);

            // Introduce un retraso de 100 milisegundos
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Borra el dibujo actual para la próxima impresión
            borrarDibujo(posicion);

            // Actualiza la posición para el próximo ciclo
            posicion += direccion;

            // Verifica si ha alcanzado los límites
            if (posicion >= limiteDerecho || posicion <= 0) {
                // Cambia la dirección al llegar a los límites
                direccion *= -1;
                ciclos++; // Incrementa el contador de ciclos
            }
        }
    }

    public static void animacionNombre(String nombre) {
        int totalLetras = nombre.length();

        for (int i = 1; i <= totalLetras; i++) {
            double porcentaje = ((double) i / totalLetras) * 100;
            System.out.print("\r" + nombre.substring(0, i) + " " + String.format("%.2f", porcentaje) + "% completado");
            try {
                Thread.sleep(500); // Añadir un pequeño retraso para una mejor visualización
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println();
    }

    public static void imprimirDibujo(int posicion) {
        // Imprime el dibujo en la posición actual
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
        // Borra el dibujo actual (imprimiendo líneas en blanco)
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }
}
