import java.util.Scanner;

public class Figura9_12 {

    public void imprimirFigura(int tamano) {
        String espacio = "     ";
        String linea1 = "|_+_";
        String linea2 = "|_-_";

        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(espacio);
            }

            if (i % 2 == 0) {
                System.out.print(linea1);
            } else {
                System.out.print(linea2);
            }

            System.out.println();
        }
    }

    public static void PoliCodeCraftersFigura9_12() {
        Scanner scanner = new Scanner(System.in);
        Figura9_12 figura = new Figura9_12();

        System.out.print("Ingrese el tamaño de la figura: ");
        int tamano = scanner.nextInt();

        figura.imprimirFigura(tamano);

        scanner.close();
    }
}
