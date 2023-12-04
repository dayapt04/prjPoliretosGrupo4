import java.util.Scanner;

public class CadenasC3 {
    /*
     * <b>PoliCodeCraftersCadC3 </b>: Pedir una frase y una vocal, eliminar la vocal
     * ingresada de la frase.
     * Ejemplo, frase: ballena azul
     * vocal : a; salida: b ll n z l
     * 
     * @param cadena : El usuario ingresa la frase
     * 
     */
    Scanner sc = new Scanner(System.in);

    public String cadena, vocal;

    public void PoliCodeCraftersCadC3() {
        System.out.print("Ingrese una frase: ");
        cadena = sc.nextLine().toLowerCase();
        System.out.print("Ingrese una vocal para eliminarla: ");
        vocal = sc.next().toLowerCase();

        if (vocal.equals("a") || vocal.equals("e") || vocal.equals("i")
                || vocal.equals("o") || vocal.equals("u")) {
            String cadSplit[] = cadena.split(vocal);
            for (String subC : cadSplit) {
                System.out.print(subC + " ");
            }
        } else {
            System.out.println("La vocal ingresada no es correcta.");
        }
        System.out.println();
    }
}