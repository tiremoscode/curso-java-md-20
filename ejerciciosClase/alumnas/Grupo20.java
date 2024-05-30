package ejerciciosClase.alumnas;

import java.sql.*;

public class Grupo20 {
    // Parámetros de conexión
    // JDBC - Java Database Connectivity

    private static String url = "jdbc:mysql://localhost:3306/grupo20";
    private static String usuario = "root";
    private static String password = "buttons";

    public void obtenerAlumnas() {
        String query = "SELECT * FROM alumnas";

        try (Connection connection = DriverManager.getConnection(url, usuario, password);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query)) {

            // Visualizar los resultados en consola.

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                int edad = resultSet.getInt("edad");

                System.out.println("ID: " + id + " Nombre: " + nombre + " Edad: " + edad);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        Grupo20 grupo20 = new Grupo20();
        grupo20.obtenerAlumnas();
    }

}
