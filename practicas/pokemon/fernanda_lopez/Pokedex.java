package ejerciciosClase.pokemon;

import ejerciciosClase.pokemon.PokemonFuego;

public class Pokedex {
    public static void main(String[] args) {
        PokemonFuego charmander = new PokemonFuego("Charmander", 0.6, 8.5);
        PokemonAgua squirtle = new PokemonAgua("Squirtle", 0.5, 9.0);
        PokemonPsiquico bulbasaur = new PokemonPsiquico("Bulbasaur", 0.7, 6.9);
        PokemonVenenoso arbok = new PokemonVenenoso("Arbok", 3.5, 65);
        PokemonFuego ponyta = new PokemonFuego("Ponyta", 1, 30);



        charmander.atacar();
        squirtle.atacar();
        bulbasaur.atacar();
        arbok.atacar();
        ponyta.atacar();


        //Muestra la información de cada pokemon existente
        public mostrarPokedex(){
            System.out.println("Pokemon: "+ charmander.getNombre());
            System.out.println("Tipo: " + charmander.getTipoPokemon());
            System.out.println("Peso: "+ charmander.getPeso() + " kilos");
            System.out.println("Estatura: "+ charmander.getEstatura() + " metros\n");

            System.out.print("Pokemon: "+ squirtle.getNombre());
            System.out.println("Tipo: " + squirtle.getTipoPokemon());
            System.out.println("Peso: "+ squirtle.getPeso() + " kilos");
            System.out.println("Estatura: "+ squirtle.getEstatura() + " metros\n");

            System.out.print("Pokemon: "+ bulbasaur.getNombre());
            System.out.println("Tipo: " + bulbasaur.getTipoPokemon());
            System.out.println("Peso: "+ bulbasaur.getPeso() + " kilos");
            System.out.println("Estatura: "+ bulbasaur.getEstatura() + " metros\n");

            System.out.print("Pokemon: "+ arbok.getNombre());
            System.out.println("Tipo: " + arbok.getTipoPokemon());
            System.out.println("Peso: "+ arbok.getPeso() + " kilos");
            System.out.println("Estatura: "+ arbok.getEstatura() + " metros\n");

            System.out.print("Pokemon: "+ ponyta.getNombre());
            System.out.println("Tipo: " + ponyta.getTipoPokemon());
            System.out.println("Peso: "+ ponyta.getPeso() + " kilos");
            System.out.println("Estatura: "+ ponyta.getEstatura() + " metros\n");
        }
        mostrarPokedex();
    }
}
