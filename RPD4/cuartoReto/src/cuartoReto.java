import java.util.Scanner;

/*
 * Escribe un programa que se encargue de comprobar si un número es o no primo.
 */

public class cuartoReto {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce un número para comprobar si es primo: ");

        int numero = scan.nextInt();

        scan.close();

        boolean numPrimo = false;

        if (numero != 4 && numero != 1) {

            for (int i = 2; i < numero / 2; i++) {
                if (numero % i == 0) {
                    numPrimo = false;
                }
            }

            if (numPrimo == false) {
                System.out.println("El número " + numero + " es primo");
            } else {
                System.out.println("El número " + numero + " NO es primo");
            }

        }

        if (numero != 4 && numero != 1) {

        } else {
            System.out.println("El número " + numero + " NO es primo");
        }
    }
}
