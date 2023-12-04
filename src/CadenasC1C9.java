public class CadenasC1C9 {
    /*
     * <b>PoliCodeCraftersC1 </b> muestra un programa que pide una palabra y cuenta
     * las vocales.
     * 
     * @param palabraDig: Palabra Ingresada
     */
    public void PoliCodeCraftersForC1(String palabraDig) {
        // contador de vocales en una frase ingresada por terminal
        int contVocales = 0;
        for (int i = 0; i < palabraDig.length(); i++) {
            char letra = palabraDig.charAt(i);
            if ((letra == 'a') || (letra == 'e') || (letra == 'i') || (letra == 'o') || (letra == 'u')) {
                contVocales++;
            } else if ((letra == 'A') || (letra == 'E') || (letra == 'I') || (letra == 'O') || (letra == 'U')) {
                contVocales++;
            }
        }
        System.out.println("La cantidad de vocales es " + contVocales + " ");
    }

    /*
     * <b>PoliCodeCraftersC9 </b> muestra un programa que pide una frase y convierte
     * cada letra a mayuscula y minuscula.
     * 
     * @param fraseDig: Frase ingresada
     */

    public void PoliCodeCraftersForC9(String fraseDig) {
        char[] letras = fraseDig.toCharArray();
        boolean mayuscula = true;
        for (int i = 0; i < letras.length; i++) {
            char c = letras[i];
            if (Character.isLetter(c)) {
                if (mayuscula) {
                    letras[i] = Character.toUpperCase(c);
                } else {
                    letras[i] = Character.toLowerCase(c);
                }
                mayuscula = !mayuscula;
            }
        }
        System.out.println("Frase intercalada: " + String.valueOf(letras));
    }
}