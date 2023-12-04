public class Array3 {
    /*
     * <b>PoliCodeCraftersA3 </b> Dibuja un plano de coordenadas positivo y grafica
     * f(x) = 2x
     * usando como caracteres las letras de su nombre
     * 
     * @param nroTerminos : Numero de terminos para la serie
     */

    public void PoliCodeCraftersA3(int tam) {
        System.out.println("Array 3: ");
        char plano[][] = new char[tam][tam];

        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                plano[i][j] = ' ';
            }
        }

        String nombre = "Dayana";

        for (int x = 0; x <= tam && x < nombre.length(); x++) {
            char c = nombre.charAt(x);
            int y = (int) (2 * x);
            if (y < tam) {
                plano[x][y] = c;
            }
        }

        for (int i = 6; i >= 0; i--) {
            System.out.print(i + "|");
            for (int j = 0; j < tam; j++) {
                System.out.print(plano[i][j]);
            }
            System.out.println();
        }

        System.out.print("  ");
        for (int i = 0; i < tam; i++) {
            System.out.print("--");
        }
        System.out.println();

    }
}