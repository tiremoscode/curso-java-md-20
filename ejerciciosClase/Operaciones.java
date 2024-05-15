package ejerciciosClase;

public class Operaciones {
    // Constructor por default
    // Si el desarrollador no lo declara, en autómatico
    // es declarado por la JVM
    // _Java Virtual Machine - Maquina Virtual de Java
    public Operaciones() {
        System.out.println("Constructor por default");
    }

    public int sumar(int valor1, int valor2) {
        return valor1 + valor2;
    }
}
