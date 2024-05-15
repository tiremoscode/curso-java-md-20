package ejerciciosClase.pokemon;

<<<<<<< HEAD
interface TipoPokemon{
=======
interface TipoPokemon {
>>>>>>> ce0970170bf18cf9f6bc5598d2237f8548377dab
    String getTipoPokemon();
}

class Pokemon {
<<<<<<< HEAD
=======
    // Herencia
    // Nombre
    // Estatura
    // Peso
    // Tipo de pokemon

>>>>>>> ce0970170bf18cf9f6bc5598d2237f8548377dab
    private String nombre;
    private double estatura;
    private double peso;

<<<<<<< HEAD
    public Pokemon(String nombre, double estatura, double peso){
        this.nombre= nombre;
        this.estatura= estatura;
        this.peso = peso;
    }

    public void atacar(){
        System.out.println(nombre + " inicia el combate.");
    }

    public String getNombre(){
        return nombre;
    }

    public double getEstatura(){
        return estatura;
    }

    public double getPeso(){
=======
    public Pokemon(String nombre, double estatura, double peso) {
        this.nombre = nombre;
        this.estatura = estatura;
        this.peso = peso;
    }

    public void atacar() {
        System.out.println(nombre + " inicia el combate");
    }

    public String getNombre() {
        return nombre;
    }

    public double getEstatura() {
        return estatura;
    }

    public double getPeso() {
>>>>>>> ce0970170bf18cf9f6bc5598d2237f8548377dab
        return peso;
    }

}