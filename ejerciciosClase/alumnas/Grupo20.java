package ejerciciosClase.alumnas;

import java.sql.*;
import java.util.Scanner;

public class Grupo20 {
    // Parámetros de conexión
    // JDBC - Java Database Connectivity

    // CRUD
    // C - Create - Crear un nuevo Registro
    // R - Read - Leer un solo registro
    // U - Update - Actualiza un registro existente
    // D - Delete - Elimina un registro existente

    private static String url = "jdbc:mysql://localhost:3306/grupo20";
    private static String usuario = "root";
    private static String password = "buttons";

    public void guardarAlumna(String nombre, int edad) {
        String queryInsertar = "INSERT INTO alumnas (nombre, edad) VALUES (?, ?)";

        try (Connection connection = DriverManager.getConnection(url, usuario, password);
                PreparedStatement preparedStatement = connection.prepareStatement(queryInsertar)) {
            preparedStatement.setString(1, nombre);
            preparedStatement.setInt(2, edad);

            int registrosInsertados = preparedStatement.executeUpdate();
            System.out.println("Registros insertados: " + registrosInsertados);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void actualizarAlumna(int id, String nombre, int edad) {
        String queryActualizarAlumna = "UPDATE alumnas SET nombre = ?, edad = ? WHERE id = ?";

        try (Connection connection = DriverManager.getConnection(url, usuario, password);
                PreparedStatement preparedStatement = connection.prepareStatement(queryActualizarAlumna)) {
            preparedStatement.setString(1, nombre);
            preparedStatement.setInt(2, edad);
            preparedStatement.setInt(3, id);

            int registrosActualizados = preparedStatement.executeUpdate();
            System.out.println("Registros actualizados: " + registrosActualizados);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void eliminarAlumna(int id) {
        String queryEliminarAlumnas = "DELETE FROM alumnas WHERE id = ?";

        try (Connection connection = DriverManager.getConnection(url, usuario, password);
                PreparedStatement preparedStatement = connection.prepareStatement(queryEliminarAlumnas)) {
            preparedStatement.setInt(1, id);
            int registrosEliminados = preparedStatement.executeUpdate();
            System.out.println("Registros eliminados: " + registrosEliminados);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

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
        Grupo20 operacionesBD = new Grupo20();

        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Ingresa el Número de la acción deseada.\n1.- Obtener todos los alumnos.\n2.- Insertar un nuevo alumno. \n3.- Actualizar un alumno existente.\n4.- Eliminar un alumno");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Obteniendo alumnas...");
                operacionesBD.obtenerAlumnas();
                break;
            case 2:
                System.out.println("Insertando nueva alumna...");
                scanner.nextLine();
                System.out.println("Ingresa el nombre de la alumna:");
                String nombreAlumna = scanner.nextLine();
                System.out.println("Ingresa la edad de la alumna:");
                int edadAlumna = scanner.nextInt();
                operacionesBD.guardarAlumna(nombreAlumna, edadAlumna);
                break;
            case 3:
                System.out.println("Actualizando alumna...");
                System.out.println("Ingresa el ID de la alumna a actualizar:");
                int idAlumnaActualizar = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Ingresa el nuevo nombre de la alumna:");
                String nombreAlumnaActualizar = scanner.nextLine();
                System.out.println("Ingresa la nueva edad de la alumna:");
                int edadAlumnaActualizar = scanner.nextInt();

                operacionesBD.actualizarAlumna(idAlumnaActualizar, nombreAlumnaActualizar, edadAlumnaActualizar);

                break;
            case 4:
                System.out.println("Eliminando alumna...");
                System.out.println("Ingresa el ID de la alumna a eliminar:");
                int idAlumnaEliminar = scanner.nextInt();
                operacionesBD.eliminarAlumna(idAlumnaEliminar);
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }

    }

}
