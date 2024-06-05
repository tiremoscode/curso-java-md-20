package ejerciciosClase.archivos;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Persona implements Serializable {
    private static final long serialUID = 1L;
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Person{nombre: " + nombre + ", edad: " + edad + "}";
    }

}

public class Output {
    public static void main(String args[]) {
        Persona persona = new Persona("Norberta", 23);

        try (FileOutputStream fos = new FileOutputStream("persona.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(persona);
            System.out.println("Objeto escrito en el archivo");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
