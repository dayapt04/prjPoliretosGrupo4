import java.util.Scanner;

public class Figura13_16 {

    public void imprimirFigura(int tamano) {
        String espacio = "       ";
        String linea1 = "|";
        String linea2 = "_";

        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(espacio);
            }

            if (i % 2 == 0) {
                System.out.print(linea1);
            } else {
                // Aumentar la cantidad de '_' en cada segunda línea
                for (int k = 0; k < (i / 2) + 1; k++) {
                    System.out.print(linea2);
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Figura13_16 figura = new Figura13_16();

        System.out.print("Ingrese el tamaño de la figura: ");
        int tamano = scanner.nextInt();

        figura.imprimirFigura(tamano);

        scanner.close();
    }
}
