import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FicherosTarea1 {
    public static void main(String[] args) throws IOException {
        // Creamos el archivo
        File datosTxt = new File("resources\\datos.txt");

        // Escribir en dicho archivo usando la clase PrintWriter
        PrintWriter pw = new PrintWriter(datosTxt);
        pw.println("Nombre de la asignatura: Acceso a Datos");
        pw.println("Nombre del estudiante: José Manuel Redondo Conde");
        pw.close(); 

        // Leemos el contenido del archivo usando la clase BufferedReader
        BufferedReader br = new BufferedReader(new FileReader(datosTxt));
        System.out.println("Leyendo datos.txt:");
        String linea = br.readLine();
        while (linea != null) {
            System.out.println(linea);
            linea = br.readLine();
        }
        br.close();

    }
}
