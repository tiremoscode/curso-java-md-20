package lirio_perez;

class PokemonPlanta extends Pokemon implements TipoPokemon {
    public PokemonPlanta(String nombre, double estatura, double peso) {
        super(nombre, estatura, peso);
    }

    @Override
    public String getTipoPokemon() {
        return "Planta";
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println(getNombre() + " escupe veneno!");
    }
}