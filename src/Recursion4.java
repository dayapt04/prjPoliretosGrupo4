import java.util.Scanner;

public class Recursion4 {
    Scanner sc = new Scanner(System.in);

    public void PoliCodeCraftersR4() {
        System.out.println("Calcular el resultado de un número elevado a un exponente");
        System.out.print("Ingrese la base: ");
        int base = sc.nextInt();
        System.out.print("Ingrese el exponente: ");
        int exponente = sc.nextInt();
        System.out.println("Resultado: " + PoliCodeCraftersR4R(base, exponente));

    }

    public int PoliCodeCraftersR4R(int base, int exponente) {
        if (exponente == 1) {
            return base;
        } else {
            return base * PoliCodeCraftersR4R(base, exponente - 1);
        }

    }

}