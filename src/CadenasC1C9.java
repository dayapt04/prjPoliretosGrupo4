import java.util.Scanner;

public class CadenasC1C9 {

    public void imprimirFigura(int tamano) {
        String espacio = "   ";
        String linea1 = "|";
        String linea2 = "_";

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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CadenasC1C9 figura = new CadenasC1C9();

        System.out.print("Ingrese el tamaño de la figura: ");
        int tamano = scanner.nextInt();

        figura.imprimirFigura(tamano);

        scanner.close();
    }
}