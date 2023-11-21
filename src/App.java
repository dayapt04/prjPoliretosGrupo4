import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el numero de terminos: ");
        int nroTerminos = sc.nextInt();

        Serie3 oSerie3 = new Serie3(nroTerminos);
        System.out.println("Serie 3: ");
        oSerie3.PoliCodeCraftersForS3();
        oSerie3.PoliCodeCraftersWhileS3();
        oSerie3.PoliCodeCraftersdoWhileS3();
        System.out.println();

        System.out.println("Serie 4: ");
        Serie4 oSerie4 = new Serie4(nroTerminos);
        oSerie4.PoliCodeCraftersForS4();
        oSerie4.PoliCodeCraftersWhileS4();
        oSerie4.PoliCodeCraftersdoWhileS4();
        System.out.println();

        sc.close();
    }
}
