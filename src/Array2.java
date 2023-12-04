

public class Array2 {
    public void PoliCodeCraftersForA2(int tamano, char caracter) {

        char[][] letraA = formarLetraA(tamano, caracter);
        char[][] letraV = formarLetraV(tamano, caracter);

        // Imprimir ambas letras juntas
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < 2 * tamano - 1; j++) {
                System.out.print(letraA[i][j]);
            }
            System.out.print("  ");
            for (int j = 0; j < 2 * tamano - 1; j++) {
                System.out.print(letraV[i][j]);
            }
            System.out.println();
        }

       
    }

    public static char[][] formarLetraA(int tamano, char caracter) {
        char[][] matriz = new char[tamano][2 * tamano - 1];

        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < 2 * tamano - 1; j++) {
                if (j == tamano - i - 1 || j == tamano + i - 1 || i == tamano / 2) {
                    matriz[i][j] = caracter;
                } else {
                    matriz[i][j] = ' ';
                }
            }
        }

        return matriz;
    }

    public static char[][] formarLetraV(int tamano, char caracter) {
        char[][] matriz = new char[tamano][2 * tamano - 1];

        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < 2 * tamano - 1; j++) {
                if (j == i || j == 2 * tamano - i - 2) {
                    matriz[i][j] = caracter;
                } else {
                    matriz[i][j] = ' ';
                }
            }
        }

        return matriz;
    }
}
