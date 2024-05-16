package practicas.pokemon.fernanda_lopez;

public class PokemonVenenoso extends Pokemon implements TipoPokemon {
    public PokemonVenenoso(String nombre, double estatura, double peso) {
        super(nombre, estatura, peso);
    }

    @Override
    public String getTipoPokemon() {
        return "Veneno";
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println(getNombre() + " lanza Gas Corrosivo!");
    }
    
}
