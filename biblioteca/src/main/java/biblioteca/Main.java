package biblioteca;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bibliotecaPersistenceUnit");
        EntityManager em = emf.createEntityManager();

        try {
            // Iniciar transacción
            em.getTransaction().begin();

            // Nuevo autor
            Autor autor1 = new Autor(1, "Stephen King", "Estados Unidos");
            em.persist(autor1); 

            // Nueva editorial
            Editorial editorial1 = new Editorial(1, "Editorial DeBolsillo", "Calle 123, Ciudad");
            em.persist(editorial1); 

            // Nuevo libro
            Libro libro1 = new Libro("8490328722", "El Resplandor", 1977, autor1, editorial1);
            em.persist(libro1);

            // Nuevo préstamo
            Prestamo prestamo1 = new Prestamo(1, libro1, "Usuario123", new Date(), 30);
            em.persist(prestamo1);

            // Hacer commit de la transacción
            em.getTransaction().commit();
            
            System.out.println("Transacción realizada con éxito: ");
            System.out.println("- Autor: " + autor1.getNombre());
            System.out.println("- Editorial: " + editorial1.getNombre());
            System.out.println("- Libro: " + libro1.getTitulo());
            System.out.println("- Préstamo: " + prestamo1.getIdPrestamo());
            
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }
    }
}