import java.util.Scanner;

public class App {
        public static void main(String[] args) throws Exception {

                Inicio oInicio = new Inicio();
                oInicio.Nombres();

                Scanner sc = new Scanner(System.in);

                int opcion;
                do {
                        System.out.println("Menú de Series");
                        System.out.println("1. Series Numéricas");
                        System.out.println("2. Series Caracteres");
                        System.out.println("3. Series Figuras");
                        System.out.println("4. Series Cadenas de Caracteres");
                        System.out.println("5. Series Arrays");
                        System.out.println("6. Series Loading");
                        System.out.println("7. Series por Recursión");
                        System.out.println("8. Salir del Programa");

                        System.out.print("Elija una opción: ");
                        opcion = sc.nextInt();

                        switch (opcion) {
                                case 1:
                                        System.out.println("Series Numéricas: ");
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

                                        System.out.println("Serie 3: ");
                                        SerieS3 oSerie3 = new SerieS3();
                                        oSerie3.PoliCodeCraftersForS3(nroTerminos);
                                        oSerie3.PoliCodeCraftersWhileS3(nroTerminos);
                                        oSerie3.PoliCodeCraftersDoWhileS3(nroTerminos);
                                        System.out.println();

                                        SerieS4 oSerie4 = new SerieS4();
                                        System.out.println("Serie 4: ");
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
                                        break;
                                case 2:
                                        System.out.println("Series Caracteres: ");
                                        System.out.print("Ingrese el número de términos: ");
                                        nroTerminos = sc.nextInt();
                                        CaracteresS1S9 oS1S9 = new CaracteresS1S9();
                                        CaracteresS2S8 oS2S8 = new CaracteresS2S8();
                                        CaracteresS3S7 oS3S7 = new CaracteresS3S7();
                                        CaracteresS4S6 oS4s6 = new CaracteresS4S6();
                                        CaracteresS6V2 oS6v2 = new CaracteresS6V2();
                                        CaracteresS5 oS5 = new CaracteresS5();

                                        oS1S9.PoliCodeCraftersForS1(nroTerminos);
                                        System.out.println();
                                        System.out.println("Caracteres S2: ");
                                        oS2S8.PoliCodeCraftersS2(nroTerminos);
                                        System.out.println();
                                        oS3S7.PoliCodeCraftersCaracS3(nroTerminos);
                                        System.out.println();
                                        System.out.println("Caracteres S4: ");
                                        oS4s6.PoliCodeCraftersSC4(nroTerminos);
                                        System.out.println("\n");
                                        System.out.println("Caracteres S5: ");
                                        oS5.PoliCodeCraftersS5();
                                        System.out.println("\n");
                                        System.out.println("Caracteres S6: ");
                                        oS4s6.PoliCodeCraftersSC6(nroTerminos);
                                        System.out.println("\n");
                                        oS6v2.PoliCodeCraftersS6V2(nroTerminos);
                                        System.out.println("\n");
                                        oS3S7.PoliCodeCraftersCaracS7(nroTerminos);
                                        System.out.println();
                                        System.out.println("Caracteres S8: ");
                                        oS2S8.PoliCodeCraftersS8(nroTerminos);
                                        System.out.println();
                                        oS1S9.PoliCodeCraftersForS9(nroTerminos);
                                        break;
                                case 3:
                                        System.out.println("Series Figuras: ");
                                        System.out.print("Ingrese el número de términos: ");
                                        nroTerminos = sc.nextInt();
                                        Figura1_4 oFigura1_4 = new Figura1_4();
                                        Figura5_8 oFigura5_8 = new Figura5_8();
                                        Figura9_12 oFigura9_12 = new Figura9_12();
                                        Figura13_16 oFigura13_16 = new Figura13_16();
                                        Figura17_19 oFigura17_19 = new Figura17_19();
                                        oFigura1_4.PoliCodeCraftersForF1(nroTerminos);
                                        oFigura1_4.PoliCodeCraftersForF2(nroTerminos);
                                        oFigura1_4.PoliCodeCraftersForF3(nroTerminos);
                                        oFigura1_4.PoliCodeCraftersForF4(nroTerminos);
                                        oFigura5_8.PoliCodeCraftersForF5(nroTerminos);
                                        oFigura5_8.PoliCodeCraftersForF6(nroTerminos);
                                        oFigura5_8.PoliCodeCraftersForF7(nroTerminos);
                                        oFigura5_8.PoliCodeCraftersForF8(nroTerminos);
                                        oFigura9_12.PoliCodeCraftersFigura9_12(nroTerminos);
                                        oFigura13_16.PoliCodeCraftersF13(nroTerminos);
                                        oFigura13_16.PoliCodeCraftersF14(nroTerminos);
                                        oFigura13_16.PoliCodeCraftersF15(nroTerminos);
                                        oFigura13_16.PoliCodeCraftersF16(nroTerminos);
                                        oFigura17_19.PoliCodeCraftersF17(nroTerminos);
                                        oFigura17_19.PoliCodeCraftersF18(nroTerminos);
                                        oFigura17_19.PoliCodeCraftersF19(nroTerminos);

                                        System.out.println();
                                        break;
                                case 4:
                                        System.out.println("Series Cadenas: ");

                                        CadenasC1C9 oC1c9 = new CadenasC1C9();
                                        CadenasC2C7 oC2c7 = new CadenasC2C7();
                                        CadenasC3 oC3 = new CadenasC3();
                                        CadenasC4 oC4 = new CadenasC4();
                                        CadenasC5C6 oC5c6 = new CadenasC5C6();
                                        CadenasC8 oC8 = new CadenasC8();

                                        System.out.println("Cadena de Caracteres 1: ");
                                        System.out.print("Ingrese una palabra: ");
                                        String palabraDig = sc.next();
                                        System.out.println();
                                        oC1c9.PoliCodeCraftersForC1(palabraDig);

                                        System.out.println();
                                        oC2c7.PoliCodeCraftersC2C7();
                                        System.out.println();
                                        System.out.println("Cadena de Caracteres 3: ");
                                        oC3.PoliCodeCraftersCadC3();
                                        System.out.println();
                                        System.out.println("Cadena de Caracteres 4: ");
                                        oC4.PoliCodeCraftersC4(sc);
                                        System.out.println();
                                        oC5c6.PoliCodeCraftersC5C6();
                                        System.out.println("Cadena de Caracteres 8: ");
                                        oC8.PoliCodeCraftersC8();
                                        System.out.println();

                                        System.out.println("Cadena de Caracteres 9: ");
                                        System.out.print("Ingrese una frase: ");
                                        String fraseDig = sc.next();

                                        oC1c9.PoliCodeCraftersForC9(fraseDig);

                                        break;
                                case 5:
                                        System.out.println("Series Arrays");

                                        Array1 oArray1 = new Array1();
                                        Array2 oArray2 = new Array2();
                                        Array3 oArray3 = new Array3();
                                        Array4 oArray4 = new Array4();
                                        Array5 oArray5 = new Array5();

                                        oArray1.PoliCodeCraftersA1();

                                        System.out.println("Array 2: ");
                                        System.out.print("Ingrese el tamaño de las letras: ");
                                        int tamano = sc.nextInt();
                                        System.out.print("Ingrese el carácter para formar las letras: ");
                                        char caracter = sc.next().charAt(0);
                                        System.out.println("\n");
                                        oArray2.PoliCodeCraftersForA2(tamano, caracter);
                                        System.out.println("\n");

                                        oArray3.PoliCodeCraftersA3();
                                        System.out.println("\n");
                                        System.out.println("Array 4: ");
                                        oArray4.PoliCodeCraftersA4();
                                        System.out.println("\n");
                                        oArray5.PoliCodeCraftersForA5();
                                        System.out.println();
                                        break;
                                case 6:
                                        System.out.println("Series Loading: ");

                                        Loading1_2 oLoading1_2 = new Loading1_2();
                                        Loading3_4 oLoading3_4 = new Loading3_4();
                                        Loading5_6 oLoading5_6 = new Loading5_6();
                                        Loading7_8 oLoading7_8 = new Loading7_8();
                                        Loading9_10 oLoading9_10 = new Loading9_10();

                                        oLoading1_2.PoliCodeCraftersL1();
                                        oLoading1_2.PoliCodeCraftersL2();

                                        System.out.println("Loading 3: ");
                                        oLoading3_4.PoliCodeCraftersForL3("x");
                                        System.out.println();

                                        oLoading3_4.PoliCodeCraftersForL4();
                                        System.out.println();

                                        System.out.println("Loading 5: ");
                                        oLoading5_6.PoliCodeCraftersL5();
                                        System.out.println();

                                        System.out.println("Loading 6: ");
                                        oLoading5_6.PoliCodeCraftersL6();
                                        System.out.println();

                                        System.out.println("Loading 7: ");
                                        oLoading7_8.PoliCodeCraftersForL7("=");
                                        System.out.println();

                                        System.out.println("Loading 8: ");
                                        oLoading7_8.PoliCodeCraftersForL8();
                                        System.out.println();
                                        oLoading9_10.PoliCodeCraftersloading9_10();
                                        System.out.println();

                                        break;
                                case 7:
                                        System.out.println("Series por Recursión: ");
                                        System.out.print("Ingrese el número de términos: ");
                                        nroTerminos = sc.nextInt();

                                        Recursion1 oRecursion1 = new Recursion1();
                                        Recursion2 oRecursion2 = new Recursion2();
                                        Recursion3 oRecursion3 = new Recursion3();
                                        Recursion4 oRecursion4 = new Recursion4();
                                        Recursion5_6 oRecursion5_6 = new Recursion5_6();

                                        System.out.println("Recursión 1: ");
                                        oRecursion1.PoliCodeCraftersR1(nroTerminos);
                                        System.out.println();
                                        System.out.println("Recursión 2: ");
                                        oRecursion2.PoliCodeCraftersR2();
                                        System.out.println();
                                        System.out.println("Recursión 3: ");
                                        oRecursion3.PoliCodeCraftersR3();
                                        System.out.println();
                                        System.out.println("Recursión 4: ");
                                        oRecursion4.PoliCodeCraftersR4();
                                        System.out.println();
                                        System.out.println("Recursión 5: ");
                                        System.out.println("Conteo progresivo hasta " + nroTerminos + ":");
                                        oRecursion5_6.PoliCodeCraftersR5(0, nroTerminos);
                                        System.out.println();
                                        System.out.println("Recursión 6: ");
                                        System.out.println("Conteo regresivo desde " + nroTerminos + ":");
                                        oRecursion5_6.PoliCodeCraftersR6(nroTerminos);
                                        System.out.println();
                                        break;
                                case 8:
                                        System.out.println("Ha salido del programa.");
                                default:
                                        System.out.println("Opción no valida.");
                                        System.out.println();
                                        break;
                        }

                } while (opcion != 8);

                sc.close();

        }
}
