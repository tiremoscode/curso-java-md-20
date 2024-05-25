package practicas.pokemon.militsa_aguirre;

public class Pokedex {
    public static void main(String[] args) {
        PokemonFuego charmander = new PokemonFuego("Charmander", 0.6, 8.5);
        PokemonAgua squirtle = new PokemonAgua("Squirtle", 0.5, 9.0);
        PokemonElectrico pikachu = new PokemonElectrico("Pikachu", 0.4, 6.0);
        PokemonBicho caterpie = new PokemonBicho("Caterpie", 0.3, 2.9);
PokemonAgua blastoise = new PokemonAgua("Blastoise", 1.6, 85.5);

        charmander.atacar();
        squirtle.atacar();
        pikachu.atacar();
        caterpie.atacar();
        blastoise.atacar();


        // Devolver la información de un Pokemon.
        // Quiero saber el peso de squirtle.

        System.out.println("El peso de  charmander " +  charmander.getPeso() + " kilos");
        System.out.println("El peso de squirtle " + squirtle.getPeso() + " kilos");
        System.out.println("El peso de pikachu " + pikachu.getPeso() + " kilos");
        System.out.println("El peso de caterpie " + caterpie.getPeso() + " kilos");
        System.out.println("El peso de  blastoise " +  blastoise.getPeso() + " kilos");
    }
}
