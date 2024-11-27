import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

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
        pw.checkError(); // Comprobar errores

        //Crear a partir de una ruta (si no existe el fichero, se crea)
        PrintWriter pw2 = new PrintWriter("resources/Prueba Texto 3.txt"); 

        //Crear a partir de un objeto File
        PrintWriter pw3 = new PrintWriter(archivo);
        pw3.close();       
        
        // Escribir con FileWriter:
        fw.write("Hola desde FileWriter. ");
        fw.write("Con el método write(), puedo escribir cadenas de texto y encadenar variables y expresiones en una misma línea. ");
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

        // LEER UN FICHERO CON SCANNER:
        File archivo2 = new File("resources\\Prueba Texto 3.txt"); // Se crea un objeto File con la ruta del archivo
        Scanner sc = null; // Se crea un Scanner fuera del try-catch para poder cerrarlo en el finally  
        // Se intenta abrir el archivo y leer su contenido con un try-catch, por si el archivo no existe
        try {
            sc = new Scanner(archivo2); // Se asocia el Scanner con el archivo
            System.out.println("Leyendo archivo con Scanner: ");
            while (sc.hasNextLine()) { // Mientras haya líneas en el archivo, se imprime la siguiente línea
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage()); // Si no se encuentra el archivo, se imprime el mensaje de error
        } finally {
            sc.close(); // Se cierra el Scanner se encuentre el archivo o no
        }

        // ESCRIBIR EN UN FICHERO CON BUFFEREDWRITER:
        // Hace falta crear un BufferedWriter con un FileWriter
        BufferedWriter bw = new BufferedWriter(new FileWriter("resources/Prueba Texto 4.txt"));
        bw.write("Hola desde BufferedWriter");
        bw.newLine();
        bw.write("Para cambiar de línea, se utiliza el método newLine()");
        bw.newLine();
        bw.write("Para escribir lo almacenado en el archivo usamos flush(), o bien close() para cerrarlo");
        bw.close(); // Cierra el BufferedWriter, haciendo flush() automáticamente

        // LEER UN FICHERO CON BUFFEREDREADER:
        // Hace falta crear un BufferedReader con un FileReader
        BufferedReader br = new BufferedReader(new FileReader("resources/Prueba Texto 4.txt"));
        try {
            System.out.println("Leyendo archivo con BufferedReader: ");
            String linea = br.readLine(); // Lee la primera línea del archivo
            while (linea != null) { // Si la línea es distinta de null:
                System.out.println(linea); // Se imprime la línea
                linea = br.readLine(); // Se lee la siguiente línea
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            br.close();
        }
    }
}
