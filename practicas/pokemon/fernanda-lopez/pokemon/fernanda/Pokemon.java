package pokemon.fernanda;

interface TipoPokemon {
    String getTipoPokemon();
}

class Pokemon {
    // Herencia
    // Nombre
    // Estatura
    // Peso
    // Tipo de pokemon

    private String nombre;
    private double estatura;
    private double peso;

    public Pokemon(String nombre, double estatura, double peso) {
        this.nombre = nombre;
        this.estatura = estatura;
        this.peso = peso;
    }

    public void atacar() {
        System.out.println(nombre + " inicia el combate.");
    }

    public String getNombre() {
        return nombre;
    }

    public double getEstatura() {
        return estatura;
    }

    public double getPeso() {
        return peso;
    }

}