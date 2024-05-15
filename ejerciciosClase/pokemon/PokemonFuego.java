package ejerciciosClase.pokemon;

<<<<<<< HEAD
public class PokemonFuego extends Pokemon implements TipoPokemon{
    public PokemonFuego(String nombre, double estatura, double peso){
=======
class PokemonFuego extends Pokemon implements TipoPokemon {
    public PokemonFuego(String nombre, double estatura, double peso) {
>>>>>>> ce0970170bf18cf9f6bc5598d2237f8548377dab
        super(nombre, estatura, peso);
    }

    @Override
<<<<<<< HEAD
    public String getTipoPokemon(){
=======
    public String getTipoPokemon() {
>>>>>>> ce0970170bf18cf9f6bc5598d2237f8548377dab
        return "Fuego";
    }

    @Override
<<<<<<< HEAD
    public void atacar(){
        super.atacar();
        System.out.println(getNombre()+ " lanza una llamarada!");
=======
    public void atacar() {
        super.atacar();
        System.out.println(getNombre() + " lanza una llamarada!");
>>>>>>> ce0970170bf18cf9f6bc5598d2237f8548377dab
    }
}
