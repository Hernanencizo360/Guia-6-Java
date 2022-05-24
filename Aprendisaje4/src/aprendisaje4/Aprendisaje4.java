/*
 * 4. Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
 * Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package aprendisaje4;

import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class Aprendisaje4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los grados Centigrados que desea convertir a Fahrenheit:");
        float centigrados = leer.nextFloat();
        float f = 32 + (9 * centigrados / 5);
        System.out.println(centigrados + "°C equivalen a: "+ f + "°F" );
    }
}
