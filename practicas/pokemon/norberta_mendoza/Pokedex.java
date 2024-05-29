package practicas.pokemon.norberta_mendoza;

public class Pokedex {
    public static void main(String[] args) {

        System.out.println("Pokémon: ¡Yo te elijo!");

        PokemonFuego charmander = new PokemonFuego("Charmander", 0.6, 8.5);
        
        PokemonAgua squirtle = new PokemonAgua("Squirtle", 0.5, 9.0);

        PokemonSiniestro mightyena = new PokemonSiniestro("Mightyena", 1.0, 37.0);

        PokemonDragon dragonite = new PokemonDragon("Dragonite", 2.2, 210.0);

        PokemonElectrico pikachu = new PokemonElectrico("Pikachu", 0.4, 6.0);

        PokemonElectrico raichu = new PokemonElectrico("Raichu", 0.8, 30.0);

        charmander.atacar();
        squirtle.atacar();
        mightyena.atacar();
        dragonite.atacar();
        pikachu.atacar();
        raichu.atacar();

        System.out.println("Información de los Pokémon en combate:");
        System.out.println("El peso de Charmander: " + charmander.getPeso() + " kilos. Su estatura es: " + charmander.getEstatura() + " metros");
        System.out.println("El peso de Squirtle: " + squirtle.getPeso() + " kilos. Su estatura es: " + squirtle.getEstatura() + " metros");

        System.out.println("El peso de Mightyena: " + mightyena.getPeso() + " kilos. Su estatura es: " + mightyena.getEstatura() + " metro");
        System.out.println("El peso de Dragonite: " + dragonite.getPeso() + " kilos. Su estatura es: " + dragonite.getEstatura() + " metros");

        System.out.println("El peso de Pikachu: " + pikachu.getPeso() + " kilos. Su estatura es: " + pikachu.getEstatura() + " metro");
        System.out.println("El peso de Raichu: " + raichu.getPeso() + " kilos. Su estatura es: " + raichu.getEstatura() + " metros");
       
    }
}
