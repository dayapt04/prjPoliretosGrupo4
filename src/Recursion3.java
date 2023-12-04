import java.util.Scanner;

public class Recursion3 {
    /*
     * <b>PoliCodeCraftersR3 </b> muestra un metodo recursivo para obtener la
     * multiplicacion(a,b).
     * 
     * @param a,b : numeros ingresados para obtener la multiplicacion de (a,b)
     */

    Scanner sc = new Scanner(System.in);

    public void inputValuesAndCalculate() {
        System.out.println("Ingrese el valor de a: ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese el valor de b: ");
        int b = Integer.parseInt(sc.nextLine());
        int resultado = this.multiplicacion(a, b);
        System.out.println("La multiplicacion de (a,b) es: " + resultado);
        System.out.println();
    }

    public int multiplicacion(int a, int b) {
        if (b == 0) {
            return 0;
        } else {
            return (a + multiplicacion(a, b - 1));
        }
    }
}
