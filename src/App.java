import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("Nombre del grupo: ");
        System.out.println("............");
        System.out.println("Integrantes del grupo:");
        System.out.println("Pereira Dayana, Salazar Janeth, Alexis Vasco, Torres Jorge, Zuñiga Liam");
   
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------------------------------------------------------------------------------- ");
        System.out.println("Ingrese el número de términos en la serie:");
        int m = scanner.nextInt();
        System.out.println("---------------------------------------------------------------------------------------- ");
   

        SerieS1 serieS1 = new SerieS1();
        SerieS2 serieS2 = new SerieS2();
   
        // Generar serie S1
        System.out.println("S1: Serie de Fibonacci ");
        System.out.println("Usando For: ");
        serieS1.showSerieFor(m);
        System.out.println("Usando While ");
        serieS1.showSerieWhile(m);
        System.out.println("Usando DoWhile");
        serieS1.showSerieDoWhile(m);
   
        // Generar serie S2
        System.out.println("---------------------------------------------------------------------------------------- ");
        System.out.println("S2: Esta serie es una variación de la serie de números impares");
        System.out.println("Usando For: ");
        serieS2.showSerieFor(m);
        System.out.println("Usando While: ");
        serieS2.showSerieWhile(m);
        System.out.println("Usando DoWhile: ");
        serieS2.showSerieDoWhile(m);

        SerieNumPrimos oSerieNumPrimos = new SerieNumPrimos();
        SerieCuadNum oSerieCuadNum = new SerieCuadNum();

        System.out.println("Serie 5:");
        oSerieNumPrimos.showSerieFor(5);
        System.out.println("");
        oSerieNumPrimos.showSerieWhile(5);
        System.out.println("");
        oSerieNumPrimos.showSerieDoWhile(5);
        System.out.println("");

        System.out.println("Serie 6:");
        oSerieCuadNum.showSerieFor(5);
        System.out.println("");
        oSerieCuadNum.showSerieWhile(5);
        System.out.println("");
        oSerieCuadNum.showSerieDoWhile(5);

    }
}
