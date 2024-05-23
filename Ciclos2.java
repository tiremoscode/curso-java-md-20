public class Ciclos2 {
    public static void main(String[] args) {
        // ciclos
        // imprimir el mensaje hola mundo mientras el valor sea menor a 5.

        for (int x = 0; x < 5; x++) {
            System.out.println(x + ".- Hola mundo");
        }

        // imprimir el mensaje hola mundo mientras el valor sea menor o igual a 5.
        System.out.println("*************");
        for (int j = 0; j <= 5; j++) {
            System.out.println(j + ".- Hola Mundo");
        }

        System.out.println("*************");
        // Imprimir el mensaje hola mundo de 0 a 30 pero haciendo brincos cada 5.
        for (int m = 0; m <= 30; m += 5) {
            System.out.println(m + ".- Hola mundo");
        }
    }
}
