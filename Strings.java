public class Strings {
    public static void main(String[] args) {
        char data[] = {'a', 'b', 'c'};
        String str = new String(data);
        System.out.println("str "+str);

        // Ejemplo
        char[] letras = {'a', '%', 'b', '#', 'c', 'd', '@', 'e', '!'};
        
        int letrasValidas = 0;
        for (char c: letras){
            if (Character.isLetter(c)){
                letrasValidas++;
            }
        }

        // Crear un nuevo arreglo solo con las letras deseadasa
        char[] letrasDeseadas = new char[letrasValidas];
        int index = 0;
        for (char c: letras){
            if(Character.isLetter(c)){
                letrasDeseadas[index++] = c;
            }
        }

        String cadenaFinal = new String(letrasDeseadas);

        // Imprimo el arreglo resultante de las letras sin caracteres no deseados.
        System.out.println(" "+cadenaFinal);


    }
}
