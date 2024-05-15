package ejerciciosClase.pokemon;

public class Pokedex {
    public static void main(String[] args) {
        PokemonFuego charmander = new PokemonFuego("Charmander", 0.6, 8.5);
        PokemonAgua squirtle = new PokemonAgua("Squirtle", 0.5, 9.0);

        charmander.atacar();
        squirtle.atacar();
<<<<<<< HEAD
=======

        // Devolver la información de un Pokemon.
        // Quiero saber el peso de squirtle.

        System.out.println("El peso de squirtle " + squirtle.getPeso() + " kilos");
>>>>>>> ce0970170bf18cf9f6bc5598d2237f8548377dab
    }
}
