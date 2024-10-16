/*
 * TAREA 2
Elaborar un programa Java que cuente el número de palabras totales que tiene un fichero pasado
por los argumentos.
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FicherosTarea2 {
    public static void main(String[] args) throws IOException {
        File datosTxt = new File("resources\\datos.txt");

        Scanner sc = new Scanner(datosTxt);
        int numPalabras = 0;
        while (sc.hasNext()) {
            numPalabras++;
            sc.next();
        }
        
        System.out.println("El archivo tiene " + numPalabras + " palabras.");
        sc.close();
    }
}
