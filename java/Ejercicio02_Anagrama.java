/*
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */

import java.util.Arrays;

public class Ejercicio02_Anagrama {

    static boolean esAnagrama(String palabra1, String palabra2) {
        if (palabra1.equals(palabra2)) {
            return false; // palabras iguales no son anagrama
        }

        char[] letras1 = palabra1.toCharArray();
        char[] letras2 = palabra2.toCharArray();

        Arrays.sort(letras1);
        Arrays.sort(letras2);

        return new String(letras1).equals(new String(letras2));
    }

    public static void main(String[] args) {
        String palabra1 = "amor";
        String palabra2 = "roma";

        System.out.println(esAnagrama(palabra1, palabra2));
        System.out.println(esAnagrama("amor", "casa"));
    }
}