public class Loading5_6 {

    public void PoliCodeCraftersL5() throws InterruptedException{

        int progress = 0;
        int barLength = 20;
        long delay = 100; // en milisegundos
        
        while (progress <= 100) {
            // Calcular la cantidad de caracteres que representan el progreso actual
            int completedChars = (int) Math.ceil((double) progress / 100 * barLength);
            
            // Construir la barra de progreso
            StringBuilder bar = new StringBuilder("[");
            for (int i = 0; i < barLength; i++) {
                if (i < completedChars) {
                    bar.append("=");
                } else if (i == completedChars) {
                    bar.append(">");
                } else {
                    bar.append(" ");
                }
            }
            bar.append("]");
            
            // Imprimir la barra de progreso y el porcentaje actual
            System.out.print("\r" + bar.toString() + " " + progress + "%");
            System.out.flush();
            
            // Actualizar el progreso y esperar un tiempo antes de volver a iterar
            progress += 5;
            Thread.sleep(delay);
        }
        
        // Imprimir una línea en blanco para separar la barra de progreso del siguiente texto
        System.out.println();
    }

    public void PoliCodeCraftersL6() throws InterruptedException{

        int porcentaje = 0;
        while (porcentaje <= 100) {
            String barra = "                    ";
            if (porcentaje == 100) {
                barra = "                 <=>";
            }else if(porcentaje <=15)
            {
                barra = "<=>                 ";
            } 
            else {
                int posicion = (porcentaje / 5) - 3;
                barra = barra.substring(0, posicion) + "<=>" + barra.substring(posicion + 3);
            }
            System.out.print("\r" + "[" + barra + "]" + " " + porcentaje + "%");
            Thread.sleep(100);
            porcentaje += 5;
        }





    }



}