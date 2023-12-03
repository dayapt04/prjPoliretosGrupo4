import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Array5 {
    /*
     * <b>PoliCodeCraftersA5 </b> muestra un ciclo para imprimir una matriz 5x5 con el nombre completo de forma aleatoria
     * 
     * @param 
     */
    public void PoliCodeCraftersForA5() throws InterruptedException {
        System.out.println("Array 5: ");
        String nombre = "Liam Luis Zuniga Marin";
        char[][] matriz = new char[5][5];
        char[] chars = nombre.replaceAll("\\s", "").toCharArray();

        List<Character> lCaracts = new ArrayList<>();
        for (char c : chars) {
            lCaracts.add(c);
        }

        Collections.shuffle(lCaracts);

        int index = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (index < lCaracts.size()) {
                    char c = lCaracts.get(index);
                    if (i < chars.length && c == chars[i]) {
                        matriz[i][j] = '*';
                    } else {
                        matriz[i][j] = c;
                    }
                    index++;
                }
            }
            for (int k = 0; k < 5; k++) {
                System.out.print(matriz[i][k] + " ");
            }
            System.out.println();
            Thread.sleep(100);
        }
    }
}