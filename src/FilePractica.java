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

        //Crear a partir de una ruta (si no existe el fichero, se crea)
        PrintWriter pw2 = new PrintWriter("resources/Prueba Texto 3.txt"); 

        //Crear a partir de un objeto File
        PrintWriter pw3 = new PrintWriter(archivo);
        pw3.close();       
        
        // Escribir con FileWriter:
        
        fw.write("Hola desde FileWriter. ");
        fw.write("Con el método write(), puedo escribir cadenas de texto y encadenar variables y expresiones. ");
        String nombre = "Usuario";
        fw.write("Por ejemplo, puedo escribir 'Hola, Mundo' encadenando este String con el String 'nombre' así: hola, " + nombre + ".");
        fw.close(); // Siempre cerrar el FileWriter

        // Escribir con PrintWriter:
        pw2.println("Hola desde PrintWriter. ");
        pw2.println("Con el método println(), puedo escribir cadenas de texto, variables y expresiones por líneas.");
        pw2.println("También se pueden utilizar para escribir los métodos print() y printf().");
        pw2.println("Con el método flush(), se escribe en el archivo las líneas que haya almacenado en el buffer.");
        pw2.flush(); // Escribir lo que hay almacenado en el buffer
        pw2.close(); // Siempre cerrar el PrintWriter
    }
}
