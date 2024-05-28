package practicas.pokemon.marlet_contreras;

public class Pokedex {
    public static void main(String[] args) {
        PokemonFuego charmander = new PokemonFuego("Charmander", 0.6, 8.5);
        PokemonAgua squirtle = new PokemonAgua("Squirtle", 0.5, 9.0);
        PokemonElectrico espeon = new PokemonElectrico("Espeon", 0.9, 26.5);
        PokemonPsiquico zapdos = new PokemonPsiquico("Zapdos", 1.6, 52.6);
        PokemonPlanta bulbasaur = new  PokemonPlanta("Bulbasaur", 0.7, 6.9);


        charmander.atacar();
        squirtle.atacar();
        espeon.atacar();
        zapdos.atacar();
        bulbasaur.atacar();

        // Devolver la información de un Pokemon.
        // Quiero saber el peso.

        System.out.println("El peso de charmander " + charmander.getPeso() + " kilos");

        System.out.println("El peso de squirtle " + squirtle.getPeso() + " kilos");
    
        System.out.println("El peso de espeon " + espeon.getPeso() + " kilos");
    
        System.out.println("El peso de zapdos " + zapdos.getPeso() + " kilos");
    
        System.out.println("El peso de bulbasaur " + bulbasaur.getPeso() + " kilos");
    

    }
}
