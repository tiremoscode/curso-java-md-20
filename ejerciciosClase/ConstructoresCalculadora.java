package ejerciciosClase;

public class ConstructoresCalculadora {
    public static void main(String args[]) {
        Operaciones operacion = new Operaciones();
        int variable1 = 50;
        int variable2 = 51;

        // 1a opción
        // Si es generado un espacio en memoria para la variable suma.
        int suma = operacion.sumar(variable1, variable2);
        System.out.println("Suma forma1: " + suma);

        // 2a opción - Más eficiente.
        // No se genera un espacio en memoria para la variable de suma
        System.out.println("Suma forma2: " + operacion.sumar(variable1, variable2));
    }
}