package pokemon.fernanda;

public class Pokedex {
    public static void main(String[] args) {
        PokemonFuego charmander = new PokemonFuego("Charmander", 0.6, 8.5);
        PokemonFuego ponyta = new PokemonFuego("Ponyta", 1, 30);
        PokemonAgua squirtle = new PokemonAgua("Squirtle", 0.5, 9.0);
        PokemonVenenoso arbok = new PokemonVenenoso("Arbok", 3.5, 65);
        PokemonPsiquico mew = new PokemonPsiquico("Mew", 0.4, 4);

        charmander.atacar();
        squirtle.atacar();
        ponyta.atacar();
        arbok.atacar();
        mew.atacar();

        // Mostrar la pokedex
        //Tipo fuego
        System.out.println("Fuego");
        System.out.println("Nombre: "+ charmander.getNombre());
        System.out.println("Estatura: " + charmander.getEstatura() + " metros");
        System.out.println("Peso: " + charmander.getPeso() + " kilos");
        System.out.println("=================================");
        System.out.println("Nombre: "+ ponyta.getNombre());
        System.out.println("Estatura: " + ponyta.getEstatura() + " metros");
        System.out.println("Peso: " + ponyta.getPeso() + " kilos");
        System.out.println("=================================");

        //tipo agua
        System.out.println("Agua");
        System.out.println("Nombre: "+ squirtle.getNombre());
        System.out.println("Estatura: " + squirtle.getEstatura() + " metros");
        System.out.println("Peso: " + squirtle.getPeso() + " kilos");
        System.out.println("=================================");

        //tipo veneno
        System.out.println("Veneno");
        System.out.println("Nombre: "+ arbok.getNombre());
        System.out.println("Estatura: " + arbok.getEstatura() + " metros");
        System.out.println("Peso: " + arbok.getPeso() + " kilos");
        System.out.println("=================================");

        //tipo psíquico
        System.out.println("Psíquico");
        System.out.println("Nombre: "+ mew.getNombre());
        System.out.println("Estatura: " + mew.getEstatura() + " metros");
        System.out.println("Peso: " + mew.getPeso() + " kilos");
        System.out.println("=================================");
    }
}