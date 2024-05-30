package practicas.calculadora_clases.beto_luebbert;

public class Calculadora {
    public static void main(String args[]) {
        // Asignar 2 variables
        // para poder realizar
        // nuestra calculadora.

        double valor1 = 50;
        double valor2 = 15;

        int valor1Entero = 50;
        int valor2Entero = 15;

        Operaciones calculo = new Operaciones();
        System.out.println("Suma: " + calculo.sumar(valor1, valor2));
        System.out.println("Rsta: " + calculo.restar(valor1, valor2));
        System.out.println("Multiplicación: " + calculo.multiplicar(valor1, valor2));
        System.out.println("División: " + calculo.dividir(valor1, valor2));
        System.out.println("División de enteros: " + calculo.dividirEnteros(valor1Entero, valor2Entero));

        // Convertir de Double a Entero.
        double division = calculo.dividir(valor1, valor2);
        int convertirValor = (int) division;
        System.out.println("Conversion de double a entero: " + convertirValor);
    }
}
