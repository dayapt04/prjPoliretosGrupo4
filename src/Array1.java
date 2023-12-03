import java.util.Scanner;

public class Array1 {

    public void PoliCodeCraftersA1(){

        Scanner scanner1 = new Scanner(System.in);
        try{
            System.out.println();
            String Nombre;

            System.out.print("Ingrese su nombre completo: ");
            Nombre = scanner1.nextLine();
            String[ ] nombreSeparado = Nombre.split(" ") ;
            
            System.out.print("Ingrese el porcentaje de cada palabra: ");
            String Porcentaje = scanner1.nextLine();
            String[] porcentajeSeparados = Porcentaje.split(" ");

            int cantidadNombres = nombreSeparado.length;
            int cantidadPorcentaje = porcentajeSeparados.length;

            if (cantidadNombres != cantidadPorcentaje) {
                System.out.println("La cantidad de nombres no es igual a la cantidad de porcentajes");
                return;
            }

            int [] NumeroPorcentaje = new int[cantidadPorcentaje];

            for (int i = 0; i < cantidadPorcentaje; i++) {  
                try {  
                    NumeroPorcentaje[i] = Integer.parseInt(porcentajeSeparados[i]);  
                } catch (NumberFormatException e) {  
                    System.out.println("El porcentaje " + porcentajeSeparados[i] + " no es un número válido");  
                    return;  
                }  
            }

            String indicadores = "==========";

            for (int i = 0; i < cantidadNombres; i++){
                int longitudNombreActual = nombreSeparado[i].length();
                //necesito conocer la cantidad de caracteres que debo imprimir en base al porcentaje y la longitud del nombre acutal.
                int cantidadCaracteres = (int) Math.round(longitudNombreActual * NumeroPorcentaje[i] / 100);
                int cantidadCaracteresIndicador = (int) Math.round(10 * NumeroPorcentaje[i] / 100);
                System.out.print("[");
                //System.out.print(indicadores.substring(0, cantidadCaracteresIndicador-2) + ">");
                //String resultadoIndicador = indicadores.substring(0, cantidadCaracteresIndicador-1) + ">" + indicadores.substring(cantidadCaracteresIndicador-1).replace("="," ");
                String resultadoIndicador = "";
                for (int j=0;j<10;j++){
                    if (j == cantidadCaracteresIndicador - 1) {
                         
                        resultadoIndicador = resultadoIndicador + ">";

                    }else if (j > cantidadCaracteresIndicador - 1) {
                        resultadoIndicador = resultadoIndicador + " ";
                    } 
                    else {
                        resultadoIndicador = resultadoIndicador + "=";
                    }
                   
                }

                System.out.print(resultadoIndicador + "] ");
                System.out.print(porcentajeSeparados[i] + "% ");
                System.out.println(nombreSeparado[i].substring(0,cantidadCaracteres));
            }
               

            }
         finally {
            scanner1.close();
        }
    }
}