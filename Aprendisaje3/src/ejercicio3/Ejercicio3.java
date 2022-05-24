/*
 * 3. Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
 *    en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String palabra = leer.nextLine();
        // tomo la palabra y con toUpperCase la transformo en mayuscula.
        String mayuscula = palabra.toUpperCase();
        // tomo la mayuscula y la transformo en minuscula.
        String minuscula = mayuscula.toLowerCase();
        // imprimo en pantalla ambos resultados
        System.out.println("La palabra en mayúsculas es: " + mayuscula);
        System.out.println("La palabra en minúsculas es: " + minuscula);
    }
    
}
