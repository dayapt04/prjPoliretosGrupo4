import java.util.Scanner;

public class Array4 {

  /*
   * <b>PoliCodeCraftersA4 </b> muestra una matriz donde forme una X con su nombre
   * y apellido
   * 
   * @param
   */

  Scanner sc = new Scanner(System.in);
  public char[][] matriz;

  public void ArrayNombre4() {
    System.out.println("Ingrese su nombre:");
    String nombre = sc.nextLine();
    System.out.println("Ingrese su apellido:");
    String apellido = sc.nextLine();
    int longitud = Math.max(nombre.length(), apellido.length());
    this.matriz = new char[longitud][longitud];

    for (int i = 0; i < longitud; i++) {
      for (int j = 0; j < longitud; j++) {
        if (i == j) {
          matriz[i][j] = (i < nombre.length() ? nombre.charAt(i) : ' ');
        } else if (i == longitud - j - 1) {
          matriz[i][j] = (i < apellido.length() ? apellido.charAt(i) : ' ');
        } else {
          matriz[i][j] = ' ';
        }
      }
    }
  }

  public void PoliCodeCraftersA4() {
    ArrayNombre4();
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        System.out.print(matriz[i][j] + " ");
      }
      System.out.println();
    }
  }
}
