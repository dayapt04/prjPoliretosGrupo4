import java.util.Scanner;

public class Loading1_2 {

    /*
     * <b>PoliCodeCraftersL1 </b> muestra Indicador de carga desde 0 a 100% usar los
     * signos \|/-| para simular un movimiento rotacional de carga 0% hasta 100%
     * 
     */

    Scanner sc = new Scanner(System.in);

    public void PoliCodeCraftersL1() {
        System.out.println("Loading 1: ");
        String bar[] = { "\\", "|", "/", "-", "|" };

        for (int i = 0; i <= 100; i++) {
            String c = bar[i % 5];
            System.out.print("\r" + c + " " + i + " %");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
        System.out.println();
    }

    /*
     * <b>PoliCodeCraftersL2 </b> Pedir un caracter para la simular la carga y la
     * logitud de la barra es de 20 caracteres
     * [### ] 20%
     * 
     */

    public void PoliCodeCraftersL2() {
        System.out.println("Loading 2: ");
        String c;

        System.out.print("Ingrese un caracter para la barra de carga: ");
        c = sc.nextLine();

        for (int i = 1; i <= 20; i++) {
            System.out.print("[");

            for (int j = 0; j <= 20; j++) {
                if (i == j)
                    System.out.print(c);
                else if (j <= i)
                    System.out.print(c);
                else
                    System.out.print(" ");
            }
            System.out.print("]" + (i * 5) + "% \r");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
        System.out.println();
    }
}
