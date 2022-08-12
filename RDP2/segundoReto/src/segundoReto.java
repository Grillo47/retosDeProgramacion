import java.util.Arrays;

/*
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */

public class segundoReto {

    public static boolean anagramas(String s1, String s2) {

        char[] array1 = s1.toLowerCase().toCharArray();
        char[] array2 = s2.toLowerCase().toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        boolean esAnagrama = new String(array1).equals(new String(array2));

        return esAnagrama;
    }

    public static void main(String[] args) throws Exception {

        System.out.println(anagramas("Zep", "Pez"));
    }
}
