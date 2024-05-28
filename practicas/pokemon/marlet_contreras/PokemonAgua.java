package practicas.pokemon.marlet_contreras;

class PokemonAgua extends Pokemon implements TipoPokemon {
    public PokemonAgua(String nombre, double estatura, double peso) {
        super(nombre, estatura, peso);
    }

    @Override
    public String getTipoPokemon() {
        return "Agua";
    }

    @Override
    public void atacar(){
        super.atacar();
        System.out.println(getNombre()+ " lanza un chorro de agua!");
    }
}
