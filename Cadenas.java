public class Cadenas {
    public static void main(String args[]) {
        String cadena1 = "hola";
        String cadena2 = "HOLA";

        String cadena3 = "HELLO";
        String cadena4 = "Hola";

        String cadena5 = "HELLO";
        String cadena6 = "hello";

        boolean resultadoComparacion = cadena1.equalsIgnoreCase(cadena2);

        boolean resultadoDiferentes = cadena3.equalsIgnoreCase(cadena4);

        System.out.println("Resultado 1: " + resultadoComparacion);
        System.out.println("Resultado 2: " + resultadoDiferentes);

        boolean resultadoDany = cadena5.equalsIgnoreCase(cadena6);
        System.out.println("Resultado 3: " + resultadoDany);

        // Agregando Comentarios
        // Probando si puedo usar comillas
        // "Aquí muestro que si es posible"

    }
}