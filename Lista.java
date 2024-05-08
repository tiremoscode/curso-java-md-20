
class Nodo {
    int dato;
    Nodo siguiente;

    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}

public class Lista {
    // Lista enlazada
    // Estructura de datos
    // Conjunto de datos de un solo tipo
    // Se pueden agregar o quitar elementos
    // Se pueden recorrer los elementos
    // Se pueden buscar elementos
    // Se pueden ordenar los elementos
    // Se pueden filtrar los elementos
    // Se pueden agrupar los elementos
    // Se pueden contar los elementos
    // Se pueden sumar los elementos
    // Se pueden promediar los elementos
    // Se pueden obtener el mayor y menor elemento
    // Se pueden obtener los elementos pares o impares
    // Se pueden obtener los elementos primos

    private Nodo cabeza = null;

    // Méotod para agregar elementos
    public void agregar(int dato) {
        Nodo nuevoNodo = new Nodo(dato);

        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo temporal = cabeza;
            while (temporal.siguiente != null) {
                temporal = temporal.siguiente;
            }
            temporal.siguiente = nuevoNodo;
        }

    }

    public void mostrar() {
        Nodo temporal = cabeza;
        while (temporal != null) {
            System.out.println(temporal.dato + " ");
            temporal = temporal.siguiente;
        }
    }

    public static void main(String[] args) {
        Lista lista = new Lista();
        // Visualizar que hay alinicio de la lista
        System.out.println("Lista enlazada tiene: ");
        lista.mostrar();

        // Añadir Elementos a la lista enlazada
        lista.agregar(1);
        // lista.agregar(2);
        // lista.agregar(3);
        // lista.agregar(4);

        // Mostramos todos los elementos que se
        // añadieron a mi lista enlazada
        lista.mostrar();
    }
}
