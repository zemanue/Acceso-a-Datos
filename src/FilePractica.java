import java.io.File;
import java.io.IOException;

public class FilePractica {
    public static void main(String[] args) throws IOException {

        File archivo = new File("PracticaAccesoADatos\\resources/Prueba Texto");
        if (!archivo.exists()) {
            archivo.createNewFile();
        }

        System.out.println("Nombre del archivo: " + archivo.getName());

    }
}
