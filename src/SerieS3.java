public class SerieS3 {
    // S3: 0/1 1/3 1/5 2/7 3/9 5/11 8/13 13/15 ...
    public int nroTerminos;

    public SerieS3(int nroTerminos) {
        this.nroTerminos = nroTerminos;
    }

    public void PoliCodeCraftersForS3() {
        int numerador = 0;
        int suma = 1;
        int denominador = 1;
        int i = 0;

        for (; i < this.nroTerminos; i++) {
            System.out.print(numerador + "/" + denominador + " ");
            int tempNumerador = numerador + suma;
            numerador = suma;
            suma = tempNumerador;
            denominador += 2;
        }

        System.out.println();
    }

    public void PoliCodeCraftersWhileS3() {
        int numerador = 0;
        int suma = 1;
        int denominador = 1;
        int i = 0;

        while (i < nroTerminos) {
            System.out.print(numerador + "/" + denominador + " ");
            int tempNumerador = numerador + suma;
            numerador = suma;
            suma = tempNumerador;
            denominador += 2;
            i++;
        }

        System.out.println();
    }

    public void PoliCodeCraftersDoWhileS3() {
        int numerador = 0;
        int suma = 1;
        int denominador = 1;
        int i = 0;

        do {
            System.out.print(numerador + "/" + denominador + " ");
            int tempNumerador = numerador + suma;
            numerador = suma;
            suma = tempNumerador;
            denominador += 2;
            i++;
        } while (i < nroTerminos);
        System.out.println();
    }
}
