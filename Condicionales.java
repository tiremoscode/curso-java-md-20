public class Condicionales {
    public static void main(String[] args) {
        // Operadores lógicos
        // Valores Booleanos - true false

        // AND
        // Todas y cada una de las condiciones que se aadan
        // deben ser siempre verdaderas (true).
        // Ejemplo: votaciones
        // Ser mayor de 18 años
        // Tene rine actualizada
        // Estar en México
        // además de ser mexicano
        int edad = 18;
        boolean ineActualizada = false;
        boolean radicaEnMexico = false;
        boolean esMexicano = true;

        if (edad >= 18 && ineActualizada && radicaEnMexico && esMexicano) {
            System.out.println("Puede votar en AND");
        } else {
            System.out.println("No puede votar en AND");
        }

        // OR
        // Al menos una de las condiciones que se añadan
        // debe ser verdadera (true).

        if (edad >= 18 || ineActualizada || radicaEnMexico || esMexicano) {
            System.out.println("Puede votar en OR");
        } else {
            System.out.println("No puede votar en OR");
        }

        // NOT
        // Invierte el valor de la condición
        // Si es verdadero lo convierte en falso
        // Si es falso lo convierte en verdadero
        if (!esMexicano) {
            System.out.println("No es mexicano en NOT");
        } else {
            System.out.println("Es mexicano en NOT");
        }
    }
}