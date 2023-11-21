public class Serie4 {
    // S4: 0/2 1/4 1/6 2/8 3/10 5/12 8/14 13/16 ...
    public int nroTerminos;

    public Serie4(int nroTerminos) {
        this.nroTerminos = nroTerminos;
    }

    public void PoliCodeCraftersForS4() {
        int i = 0;
        int denominador = 2;
        int numerador = 0;
        int suma = 1;

        for (; i < this.nroTerminos; i++) {
            System.out.print(numerador + "/" + denominador + " ");
            int tempNumerador = numerador + suma;
            numerador = suma;
            suma = tempNumerador;
            denominador += 2;
        }

        System.out.println();
    }

    public void PoliCodeCraftersWhileS4() {
        int i = 0;
        int denominador = 2;
        int numerador = 0;
        int suma = 1;
        while (i < this.nroTerminos) {
            System.out.print(numerador + "/" + denominador + " ");
            int tempNumerador = numerador + suma;
            numerador = suma;
            suma = tempNumerador;
            denominador += 2;
            i++;
        }

        System.out.println();
    }

    public void PoliCodeCraftersdoWhileS4() {
        int i = 0;
        int denominador = 2;
        int numerador = 0;
        int suma = 1;
        do {
            System.out.print(numerador + "/" + denominador + " ");
            int tempNumerador = numerador + suma;
            numerador = suma;
            suma = tempNumerador;
            denominador += 2;
            i++;
        } while (i < this.nroTerminos);
    }
}
