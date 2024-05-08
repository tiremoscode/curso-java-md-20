public class Ciclos {
    public static void main(String[] args) {
        // Ciclos
        // Estructura de control para
        // recorrer un cojunto de datos
        // Arreglo
        // Esturctrua númerica.

        // For
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + ".- No debo hablar en clase");
        }

        // While
        int numeroWhile = 0;
        while (numeroWhile <= 50) {
            System.out.println(numeroWhile + ".- No debo hablar en clase con while ");
            numeroWhile++;
        }

        // Do While
        int numeroDoWhile = 0;
        do {
            System.out.println(numeroDoWhile + ".- No debo hablar en clase con do while ");
            numeroDoWhile++;
        } while (numeroDoWhile <= 50);
    }
}
