public class CaracteresS5 {

    public void PoliCodeCraftersS5() {
        imprimirSucesion(10);
    }

    public static void imprimirSucesion(int repeticiones) {
        for (int i = 0; i < repeticiones; i++) {
            for (char c : new char[] { '\\', '|', '/' }) {
                System.out.print(c + "   ");
            }
        }
    }
}
