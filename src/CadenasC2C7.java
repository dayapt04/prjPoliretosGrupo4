import java.util.Scanner;

public class CadenasC2C7 {

    /*
     * <b>PoliCodeCraftersC2  </b> muestra un programa que pide unafrase y conta las consonates .
     * 
     * @param frase: frase Ingresada
     */

 public String frase;
 public String frase2;
 public int numeroDePalabras;
 public String fraseModificada;

 public CadenasC2C7() {
   Scanner sc = new Scanner(System.in);
   System.out.println("Ingresa una frase:");
   this.frase = sc.nextLine();
   this.numeroDePalabras = PoliCodeCraftersC2(frase);
   System.out.println("El número de consonantes en la frase es: " + this.numeroDePalabras);
   System.out.println("Ingresa una frase en minusculas:");
   this.frase2 = sc.nextLine();
   this.fraseModificada = PoliCodeCraftersC7(frase2);
   System.out.println("Frase modificada en mayusculas: " + this.fraseModificada);
 }

 public static int PoliCodeCraftersC2(String frase) {
   String soloLetras = frase.replaceAll("[^a-zA-Z]", "");
   String sinVocales = soloLetras.replaceAll("[AEIOUaeiou]", "");
   return sinVocales.length();
 }

 /*
     * <b>PoliCodeCraftersC7  </b> muestra un programa que pide una frase en minusculas y lo trasforma en mayusculas.
     * 
     * @param frase2: frase Ingresada
     */
 public String PoliCodeCraftersC7(String frase2) {
   String fraseMayusculas = frase2.toUpperCase();
   String fraseSinJ = fraseMayusculas.replace("J", "");
   return fraseSinJ;
 }
}
