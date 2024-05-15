import java.util.ArrayList;

public class ArraylistAlumnas {
    public static void main(String args[]) {
        // Crear una lista para almacenar los nombre s dde alumnasd del g20.

        ArrayList<String> estudiantesG20 = new ArrayList<>();

        // añadir nombres de alumnas al ArrayList
        estudiantesG20.add("Norberta");
        estudiantesG20.add("Daniela");
        estudiantesG20.add("Jeanette");
        estudiantesG20.add("Wendy");
        estudiantesG20.add("Luisa");

        // Imprimiendo todos los nombres de las alumnas en el Arraylist.
        System.out.println("Lista de estudiantes del G20");

        for (String nombre : estudiantesG20) {
            System.out.println(nombre);
        }

        // Conocer mi 3a estudiante de la lista.
        System.out.println("El tercer estudiante es " + estudiantesG20.get(2));

        // Cambiarle el nombre a un estudiante extistente.
        estudiantesG20.set(2, "Lupita");
        System.out.println("Jeanette fue modificada por Lupita");

        for (String nombre : estudiantesG20) {
            System.out.println(nombre);
        }

        // Eiminando el registro de una alumna.
        estudiantesG20.remove("Norberta");
        System.out.println("Norberta fue eliminada de la lista");
        for (String nombre : estudiantesG20) {
            System.out.println(nombre);
        }

        // Conocer el Tamaño de mi lista.
        System.out.println("El número total de estudiantes del G20: " + estudiantesG20.size());

    }
}
