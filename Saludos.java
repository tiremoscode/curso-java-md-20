public class Saludos {

    // Método que reciba un par´maetro de tipo String
    // Y este sea utilizado para imprimir un saludo.

    public static void imprimeSaludo(String nombre) {
        System.out.println("Hola, " + nombre + "! Bienvenido al programa");
    }

    public static void main(String args[]) {
        imprimeSaludo("María");
        imprimeSaludo("Magaly");
        imprimeSaludo("Norberta");
    }
}
