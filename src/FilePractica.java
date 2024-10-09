import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FilePractica {
    public static void main(String[] args) throws IOException {

        File archivo = new File("resources\\Prueba Texto 1.txt");
        if (!archivo.exists()) {
            archivo.createNewFile();
        }

        System.out.println("Nombre del archivo: " + archivo.getName());

        //CREAR UN PRINTWRITER PARA ESCRIBIR:
        // Crear a partir de un FileWriter
        FileWriter fw = new FileWriter("resources/Prueba Texto 2.txt");
        PrintWriter pw = new PrintWriter(fw);

        //Crear a partir de un objeto File
        PrintWriter pw2 = new PrintWriter(archivo);

        //Crear a partir de una ruta (si no existe el fichero, se crea)
        PrintWriter pw3 = new PrintWriter("resources/Prueba Texto 3.txt");

    }
}
