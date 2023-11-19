import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
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
