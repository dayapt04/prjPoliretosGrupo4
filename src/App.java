import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el numero de terminos: ");
        int nroTerminos = sc.nextInt();

        SerieS7 oSerieS7 = new SerieS7();
        System.out.println("Usando For: ");
        oSerieS7.PoliCodeCraftersForS7(nroTerminos);
        System.out.println("Usando While: ");
        oSerieS7.PoliCodeCraftersWhileS7(nroTerminos);
        System.out.println("Usando DoWhile: ");
        oSerieS7.PoliCodeCraftersDoWhileS7(nroTerminos);

        SerieS8 oSerieS8 = new SerieS8();
        System.out.println("Usando For: ");
        oSerieS8.PoliCodeCraftersForS8(nroTerminos);
        System.out.println("Usando While: ");
        oSerieS8.PoliCodeCraftersWhileS8(nroTerminos);
        System.out.println("Usando DoWhile: ");
        oSerieS8.PoliCodeCraftersDoWhileS8(nroTerminos);

        sc.close();

    }
}
