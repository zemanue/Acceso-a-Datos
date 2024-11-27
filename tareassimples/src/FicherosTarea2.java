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
        // Creamos el objeto File con la ruta del archivo
        File datosTxt = new File("resources\\datos.txt");

        // Creamos un objeto Scanner para leer el archivo
        Scanner sc = new Scanner(datosTxt);
        int numPalabras = 0;
        while (sc.hasNext()) { // Si más hay palabras en el archivo...
            numPalabras++; // Se incrementa el contador
            sc.next(); // El método next() lee la siguiente palabra
        }

        System.out.println("El archivo tiene " + numPalabras + " palabras.");
        sc.close();
    }
}
