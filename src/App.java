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
                                        CaracteresS3S7 oS3S7 = new CaracteresS3S7();
                                        oS3S7.PoliCodeCraftersCaracS3(nroTerminos);
                                        oS3S7.PoliCodeCraftersCaracS7(nroTerminos);
                                        break;
                                case 3:
                                        System.out.println("Series Figuras: ");
                                        System.out.print("Ingrese el número de términos: ");
                                        nroTerminos = sc.nextInt();
                                        Figura17_19 oFigura17_19 = new Figura17_19();
                                        oFigura17_19.PoliCodeCraftersF17(nroTerminos);
                                        System.out.println();
                                        break;
                                case 4:
                                        System.out.println("Series Cadenas: ");
                                        System.out.print("Ingrese el número de términos: ");
                                        nroTerminos = sc.nextInt();
                                        CadenasC3 oC3 = new CadenasC3();
                                        oC3.PoliCodeCraftersCadC3();
                                        break;
                                case 5:
                                        System.out.println("Series Arrays");
                                        // System.out.print("Ingrese el numero de terminos: ");
                                        // nroTerminos = sc.nextInt();
                                        Array3 oArray3 = new Array3();
                                        oArray3.PoliCodeCraftersA3(12);
                                        System.out.println();
                                        break;
                                case 6:
                                        System.out.println("Series Loading: ");

                                        Loading1_2 oLoading1_2 = new Loading1_2();
                                        oLoading1_2.PoliCodeCraftersL1();
                                        oLoading1_2.PoliCodeCraftersL2();
                                        break;
                                case 7:
                                        System.out.println("Series por Recursión: ");
                                        System.out.print("Ingrese el número de términos: ");
                                        nroTerminos = sc.nextInt();
                                        Recursion5_6 oRecursion5_6 = new Recursion5_6();
                                        oRecursion5_6.PoliCodeCraftersR5(0, nroTerminos);
                                        System.out.println();
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
