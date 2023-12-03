import java.util.Scanner;

public class CadenasC4 {

    public void PoliCodeCraftersC4(){

        Scanner scanner = new Scanner(System.in);
        String Cadena4;


        System.out.print("Ingrese una frase: ");
        Cadena4 = scanner.nextLine();
        System.out.print("Letra a eliminar: ");
        char letraEliminar = scanner.next().charAt(0);

        String CambioCadena4 = Cadena4.replace(letraEliminar,' ');
        System.out.print(CambioCadena4);
        System.out.flush();

        scanner.close();
    }
}