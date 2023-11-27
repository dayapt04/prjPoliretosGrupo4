public class SerieS2 {
  public void PoliCodeCraftersForS2(int nroTerminos) {
    /*
     * <b PoliCodeCraftersS2 </b> muestra la serie de Fibonacci 1 0 3 0 5 0 7 0 9...
     * 
     * @param m : Numero de terminos para la serie
     */
    for (int i = 1; i <= nroTerminos; ++i) {
      if (i % 2 == 0) {
        System.out.print("0 ");
      } else {
        System.out.print((i) + " ");
      }
    }
    System.out.println();
  }

  public void PoliCodeCraftersWhileS2(int nroTerminos) {

    int i = 1;
    while (i <= nroTerminos) {
      if (i % 2 == 0) {
        System.out.print("0 ");
      } else {
        System.out.print((i) + " ");
      }
      i++;
    }
    System.out.println();
  }

  public void PoliCodeCraftersDoWhileS2(int nroTerminos) {
    int i = 1;
    do {
      if (i % 2 == 0) {
        System.out.print("0 ");
      } else {
        System.out.print((i) + " ");
      }
      i++;
    } while (i <= nroTerminos);
    System.out.println();
  }

}
