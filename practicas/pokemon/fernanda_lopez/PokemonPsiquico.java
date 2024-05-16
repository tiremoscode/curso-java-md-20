package practicas.pokemon.fernanda_lopez;

public class PokemonPsiquico extends Pokemon implements TipoPokemon{
    public PokemonPsiquico(String nombre, double estatura, double peso) {
        super(nombre, estatura, peso);
    }

    @Override
    public String getTipoPokemon() {
        return "Psíquico";
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println(getNombre() + " lanza Onda Mental!");
    }
    
}
