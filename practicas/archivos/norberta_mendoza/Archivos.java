package practicas.archivos.norberta_mendoza;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

import ejerciciosClase.alumnas.Grupo20;

public class Archivos {

    public String archivo = "archivo.txt";

    public void guardarInfoArchivos() {
        // String contenido = "Hoy es el cumpleaños de Inés";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el contenido del archivo: ");
        String nuevoDato = scanner.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
            writer.write(nuevoDato);
            System.out.println("Archivo escrito eitosamente");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void leerInformacionArchivo() {
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea = reader.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        Archivos archivos = new Archivos();

        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Ingresa el Número de la acción deseada.\n1.- Crear archivos.\n2.- Leer información del archivo.");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
            archivos.guardarInfoArchivos();
                break;
            case 2:
            archivos.leerInformacionArchivo();
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }

    }

}


