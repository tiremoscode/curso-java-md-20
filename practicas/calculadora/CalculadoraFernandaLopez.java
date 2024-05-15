public class CalculadoraFernandaLopez {
    public static void main(String[] args) {
     //Las variables de valor que calcularemos
     int valor1=20, valor2=30;
 
     //suma
     int suma = valor1 + valor2;
     System.out.println("El valor de la suma es "+ suma);
     //resta
     int resta = valor1 - valor2;
     System.out.println("El valor de la resta es "+ resta);
     //multiplicación
     int multiplicacion = valor1 * valor2;
     System.out.println("El valor de la multiplicación es "+ multiplicacion);
     //división, cambio los valores para que no dé 0
     valor2=5;
     double division = valor1 / valor2;
     System.out.println("El valor de la división es "+ division);
    } 
 }