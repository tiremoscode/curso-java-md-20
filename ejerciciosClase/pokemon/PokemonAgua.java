package ejerciciosClase.pokemon;

<<<<<<< HEAD
public class PokemonAgua extends Pokemon implements TipoPokemon{
    public PokemonAgua(String nombre, double estatura, double peso){
=======
class PokemonAgua extends Pokemon implements TipoPokemon {
    public PokemonAgua(String nombre, double estatura, double peso) {
>>>>>>> ce0970170bf18cf9f6bc5598d2237f8548377dab
        super(nombre, estatura, peso);
    }

    @Override
<<<<<<< HEAD
    public String getTipoPokemon(){
=======
    public String getTipoPokemon() {
>>>>>>> ce0970170bf18cf9f6bc5598d2237f8548377dab
        return "Agua";
    }

    @Override
<<<<<<< HEAD
    public void atacar(){
        super.atacar();
        System.out.println(getNombre()+ " lanza un chorro de agua!");
=======
    public void atacar() {
        super.atacar();
        System.out.println(getNombre() + " lanza un chorro de agua!");
>>>>>>> ce0970170bf18cf9f6bc5598d2237f8548377dab
    }
}
