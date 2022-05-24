/*
 * 1. Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
 * dos. El programa deberá después mostrar el resultado de la suma
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // necesito scanner para leer los datos que ingrese el usuario
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número Entero: ");
        int num1 = leer.nextInt();
        System.out.println("Ingrese otro número Entero: ");
        int num2 = leer.nextInt();
        //una vez obtenido los dos numeros realizo la operacion suma.
        int suma = num1 + num2;
        
        System.out.println("El resultado de la suma de "+ num1 + " y " + num2 + " es: "+ suma);
        
    }
    
}
