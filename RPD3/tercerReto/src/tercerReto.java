/*
 * Escribe un programa que imprima los 50 primeros números de la sucesión
 * de Fibonacci empezando en 0.
 * - La serie Fibonacci se compone por una sucesión de números en
 *   la que el siguiente siempre es la suma de los dos anteriores.
 *   0, 1, 1, 2, 3, 5, 8, 13...
 */

public class tercerReto {
    public static void main(String[] args) throws Exception {

        int a = 0;
        int b = 1;
        int c;

        for (int i = 0; i <= 50; i++) {

            System.out.print(a + ", ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
