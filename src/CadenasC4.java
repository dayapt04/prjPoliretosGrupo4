import java.util.Scanner;

public class CadenasC4 {

    public void PoliCodeCraftersC4(Scanner scanner){
        
        
        String Cadena4;

        scanner.nextLine();
        System.out.print("Ingrese una frase: ");
        Cadena4 = scanner.nextLine();
        System.out.print("Letra a eliminar: ");
        char letraEliminar = scanner.nextLine().charAt(0);
        
        String CambioCadena4 = Cadena4.replace(letraEliminar,' ');
        System.out.println(CambioCadena4);
        
        

       
    }
}