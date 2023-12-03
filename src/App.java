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

                SerieS12 oSerieS12 = new SerieS12();
                oSerieS12.PoliCodeCraftersForS12(nroTerminos);
                oSerieS12.PoliCodeCraftersWhileS12(nroTerminos);
                oSerieS12.PoliCodeCraftersDoWhileS12(nroTerminos);
                System.out.println();

                Array2 oArray2 = new Array2();
                System.out.print("Ingrese el tamaño de las letras: ");
                int tamano = sc.nextInt();
                System.out.print("Ingrese el carácter para formar las letras: ");
                char caracter = sc.next().charAt(0);              
                oArray2.PoliCodeCraftersForA2(tamano, caracter);


                CadenasC5C6 oCadenasC5C6 = new CadenasC5C6();
                oCadenasC5C6.PoliCodeCraftersC5C6();

                Recursion2 oRecursion2 = new Recursion2();
                oRecursion2.PoliCodeCraftersRecursion2();

                //Loading9_10 oLoading9_10 = new Loading9_10();
                //oLoading9_10.PoliCodeCraftersloading9_10();
                
                //CaracteresS5 oCaracteresS5 = new CaracteresS5();
                //oCaracteresS5.PoliCodeCraftersS5();

                //CadenasC8 oCadenasC8 = new CadenasC8();
                //oCadenasC8.PoliCodeCraftersC8();
                
               // Figura9_12 oFigura9_12 = new Figura9_12();
                //oFigura9_12.PoliCodeCraftersFigura9_12();
                
                

                sc.close();
        }
}
