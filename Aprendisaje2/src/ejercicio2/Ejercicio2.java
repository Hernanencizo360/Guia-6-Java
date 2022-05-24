/*
 * 2. Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
 *    pantalla.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa tu nombre: ");
        // Almacenar en nombre el string ingresado
        String nombre = leer.nextLine();
        //Mostrar por pantalla.
        System.out.println("El nombre ingresado es: " + nombre);
    }
    
}
