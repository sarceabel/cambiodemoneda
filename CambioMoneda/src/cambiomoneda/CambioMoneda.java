package cambiomoneda;

import java.io.*;
public class CambioMoneda {

   
    public static void main(String[] args) throws IOException {
     
        int Opcion;
        float Money;
        BufferedReader Leer = new BufferedReader (new InputStreamReader(System.in ));
        System.out.println(":::TIPO DE CAMBIO:::");
        
            System.out.println("    1. Dolar a Nuevo Sol");
            System.out.println("    2. Nuevo Sol a Dolar");
            System.out.println("    3. Dolar a Euro");
            System.out.println("    4. Euro a Dolar");
            System.out.println("    5. Franco a Nuevo Sol");
            System.out.println("    6. Nuevo Sol a Franco");
            System.out.println("    7. Salir");

        System.out.println("INGRESE TIPO DE CAMBIO: ");
        Opcion = Integer.parseInt(Leer.readLine());
        for (int opcion = 0; opcion < 10; opcion++) {
            
        }
    }
    
}
