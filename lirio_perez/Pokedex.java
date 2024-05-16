package lirio_perez;

public class Pokedex {
    public static void main(String[] args) {
        PokemonFuego charmander = new PokemonFuego("Charmander", 0.6, 8.5);
        PokemonAgua squirtle = new PokemonAgua("Squirtle", 0.5, 9.0);
        PokemonPlanta bulbasaur = new PokemonPlanta("Bulbasaur", 0.7, 6.9);
        PokemonVeneno weedle = new PokemonVeneno("Weedle", 0.3, 3.2);
        PokemonAgua cloyster = new PokemonAgua("Cloyster", 1.5, 132.5);

        charmander.atacar();
        squirtle.atacar();
        bulbasaur.atacar();
        weedle.atacar();
        cloyster.atacar();


        // Devolver la información de un Pokemon.
        // Quiero saber el peso de charmander.
        System.out.println("El peso de charmander es" + "" + charmander.getPeso() + "" + "kilos");

        //Quiero saber la estatura de charmander.
        System.out.println("La altura de charmander es" + "" + charmander.getEstatura() + "" + "metros");
        
        // Quiero saber el peso de squirtle.
        System.out.println("El peso de squirtle es" + "" + squirtle.getPeso() + "" + "kilos");
        
        //Quiero saber la estatura de squirtle.
        System.out.println("La altura de squirtle es" + "" + squirtle.getEstatura() + "" + "metros");
        
        // Quiero saber el peso de bulbasaur.
        System.out.println("El peso de bulbasaur es" + "" + bulbasaur.getPeso() + "" + "kilos");
        
        //Quiero saber la estatura de bulbasaur.
        System.out.println("La altura de bulbasaur es" + "" + bulbasaur.getEstatura() + "" + "metros");
        
        // Quiero saber el peso de weedle
        System.out.println("El peso de weedle es" + "" + weedle.getPeso() + "" + "kilos");
        
        //Quiero saber la estatura de weedle.
        System.out.println("La altura de weedle es" + "" + weedle.getEstatura() + "" + "metros");
        
        // Quiero saber el peso de cloyster
        System.out.println("El peso de cloyster es" + "" + cloyster.getPeso() + "" + "kilos");
        
        //Quiero saber la estatura de cloyster.
        System.out.println("La altura de cloyster es" + "" + cloyster.getEstatura() + "" + "metros");

    }
}

// ¿Cómo hago espacios entre lo que contiene mi sout? 
