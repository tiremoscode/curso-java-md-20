class Animal {
    void seComunica() {
        System.out.println("Todos los animales hacen un sonido");
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

public class UpDownCasting {
    public static void main(String[] args) {
        // UpCasting
        // Convertir una subclase en su superclase.

        // DownCasting.
        // Convertimos una superclase a una subclase específica.

        // Upcasting de Perro a Animal.
        Animal miPerro = new Perro(); // Upcasting implicito
        Animal miGato = new Gato(); // Upcasting implicito

        /// llamadas aacciones comúnes del animalito.
        miPerro.seComunica();
        miGato.seComunica();

        // Realizando el Downcasting. De Animal a Perro
        if (miPerro instanceof Perro) {
            Perro p = (Perro) miPerro; // DownCasting explicito
            p.seDivierte(); // Obtener el método o actividad úinica de esta clase.
        }

        // Realizando el Downcasring. De Animal a Gato
        if (miGato instanceof Gato) {
            Gato g = (Gato) miGato; // DownCasting explicito
            g.seEntretiene(); // Obtener el método o actividad única de esta clase.
        }

    }
}
