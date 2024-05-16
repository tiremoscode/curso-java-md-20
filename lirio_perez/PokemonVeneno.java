package lirio_perez;

class PokemonVeneno extends Pokemon implements TipoPokemon {
    public PokemonVeneno(String nombre, double estatura, double peso) {
        super(nombre, estatura, peso);
    }

    @Override
    public String getTipoPokemon() {
        return "Veneno";
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println(getNombre() + " despliega polvo escudo!");
    }
}