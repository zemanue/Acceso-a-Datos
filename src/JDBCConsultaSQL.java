
// Escribe un programa en Java que realice las siguientes acciones:
// a) Conéctate a una base de datos MySQL utilizando JDBC.
// b) Consulta todos los registros de una tabla llamada "usuarios".
// La creación de la tabla:
// CREATE TABLE usuarios (
// id INT PRIMARY KEY AUTO_INCREMENT,
// nombre VARCHAR(50) NOT NULL,
// apellido VARCHAR(50) NOT NULL,
// edad INT,
// correo VARCHAR(100) UNIQUE NOT NULL
// );
// c) Muestra por consola los resultados obtenidos.

import java.sql.*; // Importar las clases de la API de JDBC

public class JDBCConsultaSQL {
    public static void main(String[] args) {

        try { // Siempre se debe utilizar un try/catch para atrapar un posible SQLException
            // 1. ESTABLECER CONEXIÓN CON BD (Objeto Connection)
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/usuarios", "root", "");
            System.out.println("Conexión realizada con éxito.");

            // 2. CREAR UNA SENTENCIA (Objeto Statement)
            Statement st = con.createStatement();

            // 3. EJECUTAR INSTRUCCIÓN SQL (Guardar resultado en un objeto ResultSet)
            ResultSet rs = st.executeQuery("SELECT * FROM usuarios");
            System.out.println("Consulta correcta. Se han obtenido los datos de la tabla 'usuarios'.");

            // 4. LEER EL RESULTADO (Objeto ResultSet)
            System.out.println("Leyendo los datos: ");
            while (rs.next()) { // El método next() recorre cada registro de la consulta
                System.out.println(
                    "- ID: " + rs.getInt("id") + ". " +
                    "Nombre y apellidos/s: " + rs.getString("nombre") + " " + rs.getString("apellido") +
                    ". Edad: " + rs.getInt("edad") + " años. " +
                    "Email: " + rs.getString("correo") + "."
                );
            }
            System.out.println("Fin de la lectura.");

        } catch (SQLException e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }

    }
}
