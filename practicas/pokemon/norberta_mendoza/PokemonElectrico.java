package practicas.pokemon.norberta_mendoza;

class PokemonElectrico extends Pokemon implements TipoPokemon {
    public PokemonElectrico(String nombre, double estatura, double peso) {
        super(nombre, estatura, peso);
    }

    @Override
    public String getTipoPokemon() {
        return "Electrico";
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println("¡"+getNombre() + " Electricidad Estática!");
    }
}

