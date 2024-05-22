package pokemon.fernanda;

class PokemonPsiquico extends Pokemon implements TipoPokemon {
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
        System.out.println(getNombre() + " utiliza Onda psíquica!");
    }
}