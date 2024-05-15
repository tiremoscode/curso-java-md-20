public class Excepciones {
    public static void main(String args[]) {
        try {

            // import java.lang.ArrayIndexOutOfBoundsException;
            int[] numeros = { 1, 2, 3, 4, 5 };
            int checarElemento = numeros[4];
            System.out.println(checarElemento);

            // NegativeArraySizeExcepcion
            System.out.println("Arreglo " + numeros[-1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: El indice al que deseas ingresar no existe.");
        }
    }
}
