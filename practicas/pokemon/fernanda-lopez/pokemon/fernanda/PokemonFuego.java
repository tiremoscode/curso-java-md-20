package pokemon.fernanda;

class PokemonFuego extends Pokemon implements TipoPokemon {
    public PokemonFuego(String nombre, double estatura, double peso) {
        super(nombre, estatura, peso);
    }

    @Override
    public String getTipoPokemon() {
        return "Fuego";
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println(getNombre() + " lanza una llamarada!");
    }
}