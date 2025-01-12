package biblioteca;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Editorial {
    @Id
    private int idEditorial;
    private String nombre;
    private String direccion;

    public Editorial(int idEditorial, String nombre, String direccion) {
        this.idEditorial = idEditorial;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public int getIdEditorial() {
        return idEditorial;
    }

    public void setIdEditorial(int idEditorial) {
        this.idEditorial = idEditorial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
