import java.util.Scanner;

public class App {
        public static void main(String[] args) throws Exception {

                Inicio oInicio = new Inicio();
                oInicio.Nombres();

                Scanner sc = new Scanner(System.in);
                System.out.print("Ingrese el numero de términos: ");
                int nroTerminos = sc.nextInt();
                sc.nextLine();

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

                SerieS12 oSerieS12 = new SerieS12();
                oSerieS12.PoliCodeCraftersForS12(nroTerminos);
                oSerieS12.PoliCodeCraftersWhileS12(nroTerminos);
                oSerieS12.PoliCodeCraftersDoWhileS12(nroTerminos);
                System.out.println();

                System.out.println("Array 4");
                Array4 matriz = new Array4();
                matriz.PoliCodeCraftersA4();
                System.out.println();

                System.out.println("Cadenas");
                // CadenasC2C7 modificador = new CadenasC2C7();
                CadenasC2C7 oC2c7 = new CadenasC2C7();
                oC2c7.PoliCodeCraftersC2C7();

                System.out.println();

                System.out.println("Caracteres");
                CaracteresS2S8 serie2 = new CaracteresS2S8();
                serie2.inputNumberOfTerms();

                System.out.println("Figuras");
                System.out.println("Ingrese el valor de altura: ");
                int altura = Integer.parseInt(sc.nextLine());
                System.out.println();
                Figura1_4 Figura1_4 = new Figura1_4();
                Figura1_4.PoliCodeCraftersForF1(altura);
                System.out.println();
                Figura1_4.PoliCodeCraftersForF2(altura);
                System.out.println();
                Figura1_4.PoliCodeCraftersForF3(altura);
                System.out.println();
                Figura1_4.PoliCodeCraftersForF4(altura);
                System.out.println();

                System.out.println("Loading:");
                Loading7_8 oloading = new Loading7_8();
                oloading.PoliCodeCraftersForL7("=");
                System.out.println();

                System.out.println();
                Loading7_8 oloading2 = new Loading7_8();
                oloading2.PoliCodeCraftersForL8();
                System.out.println();

                System.out.println("Recursion");
                Recursion3 calcular = new Recursion3();
                calcular.inputValuesAndCalculate();

                System.out.println("Cadena de Caracteres 1: ");
                System.out.print("Ingrese una palabra: ");
                String palabraDig = sc.next();
                CadenasC1C9 oCadenasC1C9 = new CadenasC1C9();
                oCadenasC1C9.PoliCodeCraftersForC1(palabraDig);
                System.out.println();
                System.out.println("Cadena de Caracteres 9: ");
                System.out.print("Ingrese una frase: ");
                String fraseDig = sc.next();
                oCadenasC1C9.PoliCodeCraftersForC9(fraseDig);
                System.out.println();

                Array5 oArray5 = new Array5();
                oArray5.PoliCodeCraftersForA5();
                System.out.println();

                CaracteresS1S9 oCaracteresS1S9 = new CaracteresS1S9();
                oCaracteresS1S9.PoliCodeCraftersForS1(nroTerminos);
                System.out.println();
                oCaracteresS1S9.PoliCodeCraftersForS9(nroTerminos);
                System.out.println();

                System.out.println("Recursion 1: ");
                System.out.print("Ingrese un numero para sacar su factorial: ");
                int nDigit = sc.nextInt();

                System.out.println();
                Recursion1 oRecursion1 = new Recursion1();
                oRecursion1.PoliCodeCraftersR1(nDigit);
                System.out.println();

                System.out.print("Ingrese un numero para la altura de las piramides y escaleras: ");
                altura = sc.nextInt();

                System.out.println();
                Figura5_8 oFigura5_8 = new Figura5_8();
                oFigura5_8.PoliCodeCraftersForF5(altura);
                System.out.println();
                oFigura5_8.PoliCodeCraftersForF6(altura);
                System.out.println();
                oFigura5_8.PoliCodeCraftersForF7(altura);
                System.out.println();
                oFigura5_8.PoliCodeCraftersForF8(altura);

                System.out.println();
                System.out.println("Loading 3: ");
                System.out.print("Ingrese un caracter: ");
                String charDig = sc.next();
                Loading3_4 oLoading3_4 = new Loading3_4();
                oLoading3_4.PoliCodeCraftersForL3(charDig);
                System.out.println();
                oLoading3_4.PoliCodeCraftersForL4();

                CadenasC4 oCadenasC4 = new CadenasC4();
                oCadenasC4.PoliCodeCraftersC4(sc);

                Array1 oArray1 = new Array1();
                oArray1.PoliCodeCraftersA1(sc);

                Figura13_16 oFigura13_16 = new Figura13_16();
                oFigura13_16.PoliCodeCraftersF13(nroTerminos);
                oFigura13_16.PoliCodeCraftersF14(nroTerminos);
                oFigura13_16.PoliCodeCraftersF15(nroTerminos);
                oFigura13_16.PoliCodeCraftersF16(nroTerminos);

                Loading5_6 ofLoading5_6 = new Loading5_6();
                ofLoading5_6.PoliCodeCraftersL5();
                ofLoading5_6.PoliCodeCraftersL6();

                sc.close();

        }
}
