// Clase abstracta
abstract class Animal {
    // método abstracto.
    abstract void seComunica();

    // Método concreto.
    void dormir() {
        System.out.println("Zzz...");
    }
}

// Subclase Perro
class Perro extends Animal {
    // Implementamos la sobreescritura
    // Sobre el método abstract
    @Override
    void seComunica() {
        System.out.println("Guau guau");
    }
}

class Gato extends Animal {
    @Override
    void seComunica() {
        System.out.println("Miau Miau");
    }
}

public class Polimorfismo {
    public static void main(String[] args) {
        // Polimorfismo.
        Animal miPerro = new Perro();
        Animal miGato = new Gato();

        // llamar a metods anstractos implementados por cada de las subclases.
        miPerro.seComunica();
        miGato.seComunica();

        // Llamada a m+étodo concreto.
        miPerro.dormir();
        miGato.dormir();
    }
}
