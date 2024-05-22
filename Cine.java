public class Cine {
    public static void main(String[] args) {
        // Vamos a ir al cine.

        // Condiciones para ello
        // Vivir cerca de Alberto - CDMX
        // // Disponibilidad de tiempo
        // Tener dinerito

        // que pelicula veremos
        // que la pelicula que queremos ver este dosponible.

        // Dany vive en Veracruz
        boolean vivirCerca = true;
        boolean tenemosTiempo = true;
        boolean tenerDinerito = true;
        boolean peliculaDisponible = true;

        if (vivirCerca) {
            if (tenemosTiempo) {
                if (tenerDinerito) {
                    if (peliculaDisponible) {
                        System.out.println(
                                "Vamos a ver la película porque tenemos tiempo, hay dinerito y vivimos cerca.");
                    } else {
                        System.out.println("Buscar otra película");
                    }
                } else {
                    System.out.println("Metemos hamburguesas de contrabando");
                }
            } else {
                System.out.println("Buscar por ejemplo vernos el sábado");
            }
        } else {
            System.out.println("Suerte para la próxima");
        }

    }
}
