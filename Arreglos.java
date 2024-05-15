public class Arreglos {
    public static void main(String[] args) {
        // Arreglos - Tipo Unidimensional
        // Una sola dimension
        // conjunto de datos de un solo tipo.

        int[] numeros = new int[5];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;

        // for (int i = 0; i < 5; i++) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posicion " + i + " tiene el valor: " + numeros[i]);
        }
    }
}
