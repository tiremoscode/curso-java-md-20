public class Encapsulamiento {
    // public
    // private
    // protected

    // public

    // Seguridad en datos
    // Control de acceso

    // getters
    // setters

    // ejemplo con una persona.
    // Atributos privados.
    private String nombre;
    private int edad;

    // Método constructor
    public Encapsulamiento(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método para establecer el nombre - setter
    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase();
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método para obtener la información - getter
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public static void main(String args[]) {
        Encapsulamiento persona = new Encapsulamiento("Dani Castro", 22);

        // Acceder a los datos de este objketo.
        System.out.println("Nombre: " + persona.getNombre() + " y edad: " + persona.getEdad());

        // Utilizamos el método setNombre
        // Cambiamos el nombre
        persona.setNombre("Danii Castro");
        System.out.println("Nombre: " + persona.getNombre() + " y edad: " + persona.getEdad());
    }

}
