// Clase Base
class Animal {
    void seComunica() {
        System.out.println("Ambos animales hacen un sonido");
    }
}

// Sub clase para Perro.
class Perro extends Animal {
    @Override
    void seComunica() {
        System.out.println("El perro ladra");
    }

    void seDivierte() {
        System.out.println("Corrre detras de una pelota");
    }
}

// SubClase para el gatito.
class Gato extends Animal {
    @Override
    void seComunica() {
        System.out.println("El gato maulla");
    }

    void seEntretiene() {
        System.out.println("Juega con una bola de estambre");
    }
}

public class Casting {
    public static void main(String[] args) {
        // Crear las instancias de mis animales

        Animal miPerro = new Perro();
        Animal miGato = new Gato();

        // Llamar a los métodos comunes.
        miPerro.seComunica();
        miGato.seComunica();

        // Casting para acceder a los métodos especificos del perro.

        if (miPerro instanceof Perro) {
            Perro p = (Perro) miPerro;
            p.seDivierte();
        }

        if (miGato instanceof Gato) {
            Gato g = (Gato) miGato;
            g.seEntretiene();
        }
    }
}
