import java.util.Scanner;

public class Recursion2 {

    public void PoliCodeCraftersRecursion2() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número (a): ");
        int a = scanner.nextInt();

        System.out.print("Ingrese el segundo número (b): ");
        int b = scanner.nextInt();

        int resultado = sumaRecursiva(a, b);
        System.out.println("La suma de " + a + " y " + b + " es: " + resultado);

        scanner.close();
    }

    public static int sumaRecursiva(int a, int b) {
        // Condición de terminación para la recursividad
        if (b == 0) {
            return a;
        } else {
            // Llamada recursiva reduciendo el problema
            return 1 + sumaRecursiva(a, b - 1);
        }
    }
}
