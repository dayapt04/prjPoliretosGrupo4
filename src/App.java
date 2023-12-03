import java.util.Scanner;

public class App {
        public static void main(String[] args) throws Exception {

                Inicio oInicio = new Inicio();
                oInicio.Nombres();

                Scanner sc = new Scanner(System.in);
                System.out.print("Ingrese el numero de términos: ");
                int nroTerminos = sc.nextInt();

                System.out.println("\nSerie 1: ");
                SerieS1 oSerieS1 = new SerieS1();
                oSerieS1.PoliCodeCraftersForS1(nroTerminos);
                oSerieS1.PoliCodeCraftersWhileS1(nroTerminos);
                oSerieS1.PoliCodeCraftersDoWhileS1(nroTerminos);
                System.out.println();

                System.out.println("Serie 2: ");
                SerieS2 oSerieS2 = new SerieS2();
                oSerieS2.PoliCodeCraftersForS2(nroTerminos);
                oSerieS2.PoliCodeCraftersWhileS2(nroTerminos);
                oSerieS2.PoliCodeCraftersDoWhileS2(nroTerminos);
                System.out.println();

                SerieS3 oSerie3 = new SerieS3();
                System.out.println("Serie 3: ");
                oSerie3.PoliCodeCraftersForS3(nroTerminos);
                oSerie3.PoliCodeCraftersWhileS3(nroTerminos);
                oSerie3.PoliCodeCraftersDoWhileS3(nroTerminos);
                System.out.println();

                System.out.println("Serie 4: ");
                SerieS4 oSerie4 = new SerieS4();
                oSerie4.PoliCodeCraftersForS4(nroTerminos);
                oSerie4.PoliCodeCraftersWhileS4(nroTerminos);
                oSerie4.PoliCodeCraftersDoWhileS4(nroTerminos);
                System.out.println();

                System.out.println("Serie 5: ");
                SerieS5 oSerie5 = new SerieS5();
                oSerie5.PoliCodeCraftersForS5(nroTerminos);
                oSerie5.PoliCodeCraftersWhileS5(nroTerminos);
                oSerie5.PoliCodeCraftersDoWhileS5(nroTerminos);
                System.out.println();

                System.out.println("Serie 6: ");
                SerieS6 oSerie6 = new SerieS6();
                oSerie6.PoliCodeCraftersForS6(nroTerminos);
                oSerie6.PoliCodeCraftersWhileS6(nroTerminos);
                oSerie6.PoliCodeCraftersDoWhileS6(nroTerminos);
                System.out.println();

                SerieS7 oSerieS7 = new SerieS7();
                oSerieS7.PoliCodeCraftersForS7(nroTerminos);
                oSerieS7.PoliCodeCraftersWhileS7(nroTerminos);
                oSerieS7.PoliCodeCraftersDoWhileS7(nroTerminos);
                System.out.println();

                SerieS8 oSerieS8 = new SerieS8();
                oSerieS8.PoliCodeCraftersForS8(nroTerminos);
                oSerieS8.PoliCodeCraftersWhileS8(nroTerminos);
                oSerieS8.PoliCodeCraftersDoWhileS8(nroTerminos);
                System.out.println();

                System.out.println("Serie 9: ");
                SerieS9 oSerieS9 = new SerieS9();
                oSerieS9.PoliCodeCraftersForS9(nroTerminos);
                oSerieS9.PoliCodeCraftersWhileS9(nroTerminos);
                oSerieS9.PoliCodeCraftersDoWhileS9(nroTerminos);
                System.out.println();

                SerieS10 oSerieS10 = new SerieS10();
                oSerieS10.PoliCodeCraftersForS10(nroTerminos);
                oSerieS10.PoliCodeCraftersWhileS10(nroTerminos);
                oSerieS10.PoliCodeCraftersDoWhileS10(nroTerminos);
                System.out.println();

                /*SerieS12 oSerieS12 = new SerieS12();
                oSerieS12.PoliCodeCraftersForS12(nroTerminos);
                oSerieS12.PoliCodeCraftersWhileS12(nroTerminos);
                oSerieS12.PoliCodeCraftersDoWhileS12(nroTerminos);
                System.out.println();*/

                Recursion4 oRecursion4 = new Recursion4();
                System.out.println("Calcular el resultado de un número elevado a un exponente");
                System.out.print("Ingrese la base: ");
                int base = sc.nextInt();
                System.out.print("Ingrese el exponente: ");
                int exponente = sc.nextInt();
                int resultadoR4 = oRecursion4.PoliCodeCraftersR4(base, exponente);
                System.out.println("Resultado: " + resultadoR4);
                System.out.println();
                
                CaracteresS4S6 oCaracteresS4S6 = new CaracteresS4S6();
                oCaracteresS4S6.PoliCodeCraftersSC4(nroTerminos);
                System.out.println();
                oCaracteresS4S6.PoliCodeCraftersSC6(nroTerminos);
                System.out.println();

                CadenasC4 oCadenasC4 = new CadenasC4();
                oCadenasC4.PoliCodeCraftersC4(sc);

                Array1 oArray1 = new Array1();
                oArray1.PoliCodeCraftersA1(sc);

                Figura13_16 oFigura13_16 = new Figura13_16();
                System.out.println("Figura13");
                oFigura13_16.PoliCodeCraftersF13(nroTerminos);
                System.out.println("Figura14");
                oFigura13_16.PoliCodeCraftersF14(nroTerminos);
                System.out.println("Figura15");
                oFigura13_16.PoliCodeCraftersF15(nroTerminos);
                System.out.println("Figura16");
                oFigura13_16.PoliCodeCraftersF16(nroTerminos);

                Loading5_6 ofLoading5_6 = new Loading5_6();
                ofLoading5_6.PoliCodeCraftersL5();
                ofLoading5_6.PoliCodeCraftersL6();
                sc.close();
              
        }
}
