import java.util.Scanner;

public class CalculadoraSandra {

    public static int sumar(int num1, int num2) {
        return (num1 + num2);
    }

    public static int restar(int num1, int num2) {
        return (num1 - num2);
    }

    public static int multiplicar(int num1, int num2) {
        return (num1 * num2);
    }

    public static double dividir(int num1, int num2) {
        return (double) num1 / num2;
    }

    public static void main(String[] args) {
        Scanner leer_teclado = new Scanner(System.in);
        int opcion = 0;
        double resultado = 0;
        do {
            System.out.println("Bienvenido a la calculadora de Sandra");

            System.out.println("Elige una opción");
            System.out.println("1- Sumar. 2- Restar. 3-Multiplicar. 4-Dividir. 5-Salir.");
            opcion = leer_teclado.nextInt();

            if (opcion != 5) {
                System.out.println("Ingresa el primer número");
                int valor1 = leer_teclado.nextInt();
                System.out.println("Inresa el segundo número");
                int valor2 = leer_teclado.nextInt();

                switch (opcion) {
                    case 1:
                        resultado = CalculadoraSandra.sumar(valor1, valor2);
                        break;
                    case 2:
                        resultado = CalculadoraSandra.restar(valor1, valor2);
                        break;
                    case 3:
                        resultado = CalculadoraSandra.multiplicar(valor1, valor2);
                        break;
                    case 4:
                        resultado = CalculadoraSandra.dividir(valor1, valor2);
                        break;
                    default:
                        System.out.println("No existe esa opción");
                        resultado = 0;
                        break;
                }
                System.out.println("El resultado de tu operación es: " + resultado + "\n");
            } else
                System.out.println("Adiós");

        } while (opcion != 5);

    }
}
