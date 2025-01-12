package biblioteca;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Libro {
    @Id
    private String isbn;
    private String titulo;
    private int fechaPublicacion;

    @ManyToOne
    private Autor autor;

    @ManyToOne
    private Editorial editorial;


    public Libro(String ISBN, String titulo, int anioPublicacion, Autor autor, Editorial editorial) {
        this.isbn = ISBN;
        this.titulo = titulo;
        this.fechaPublicacion = anioPublicacion;
        this.autor = autor;
        this.editorial = editorial;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String ISBN) {
        this.isbn = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(int anioPublicacion) {
        this.fechaPublicacion = anioPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }
}
