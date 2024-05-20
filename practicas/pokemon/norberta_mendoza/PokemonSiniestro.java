package practicas.pokemon.norberta_mendoza;

public class PokemonSiniestro extends Pokemon implements TipoPokemon {
    public PokemonSiniestro(String nombre, double estatura, double peso) {
        super(nombre, estatura, peso);
    }

    @Override
    public String getTipoPokemon() {
        return "Siniestro";
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println("¡"+getNombre() + " Intimidación!");
    }
}
