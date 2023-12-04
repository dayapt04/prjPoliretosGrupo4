import java.util.Scanner;

public class Loading7_8 {
    /*
     * <b>PoliCodeCraftersL7 </b> muestra una barra de 20 caracteres, la barra
     * avanza cambiando la punta con movimiento rotacional de signos \|/-|
     * 
     * @param charDig: Caracter ingresado
     */
    Scanner sc = new Scanner(System.in);

    public void PoliCodeCraftersForL7(String charDig) {
        String[] rotationSigns = { "\\", "|", "/", "-", };
        int currentSignIndex = 0;
        for (int j = 1; j <= 20; j++) {
            System.out.print("[");
            for (int k = 1; k <= 20; k++) {
                if (k == j) {
                    System.out.print(rotationSigns[currentSignIndex]);
                } else if (k <= j) {
                    System.out.print(charDig);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("] " + (j * 5) + "%\r");
            currentSignIndex = (currentSignIndex + 1) % rotationSigns.length;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /*
     * <b>PoliCodeCraftersL8 </b> muestra la carga mostrando letra a letra de su
     * nombre y apellido hasta el 100%
     * 
     * @param nombre2, apellido2: se utilizan para visualizar la carga del nombre y
     * apellido letra por letra hasta el 100%.
     */
    public void PoliCodeCraftersForL8() {
        System.out.println("Ingrese su nombre:");
        String nombre2 = sc.nextLine();
        System.out.println();
        System.out.println("Ingrese su apellido:");
        String apellido2 = sc.nextLine();

        String[] signosRotacion = { "\\", "|", "/", "-", };
        int indiceSignoActual = 0;
        int totalLength = nombre2.length() + apellido2.length();
        for (int j = 0; j <= totalLength; j++) {
            System.out.print("[");
            for (int k = 0; k <= totalLength; k++) {
                if (k == j) {
                    System.out.print(signosRotacion[indiceSignoActual]);
                } else if (k < j) {
                    if (k < nombre2.length()) {
                        System.out.print(nombre2.charAt(k));
                    } else {
                        System.out.print(apellido2.charAt(k - nombre2.length()));
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("] " + (j * 100 / totalLength) + "%\r");
            indiceSignoActual = (indiceSignoActual + 1) % signosRotacion.length;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println();
    }
}
