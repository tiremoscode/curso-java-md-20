package practicas.pokemon.militsa_aguirre;

public class PokemonBicho  extends Pokemon implements TipoPokemon {
    public PokemonBicho(String nombre, double estatura, double peso) {
        super(nombre, estatura, peso);
    }

    @Override
    public String getTipoPokemon() {
        return "Bicho";
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println(getNombre() + " lanza polvo!");
    }
}
  
    


