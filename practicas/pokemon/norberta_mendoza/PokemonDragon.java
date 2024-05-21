package practicas.pokemon.norberta_mendoza;

class PokemonDragon extends Pokemon implements TipoPokemon {
    public PokemonDragon(String nombre, double estatura, double peso) {
        super(nombre, estatura, peso);
    }

    @Override
    public String getTipoPokemon() {
        return "Dragon";
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println("¡"+getNombre() + " Fuerza Mental!");
    }
}