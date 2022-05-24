/*
 * 6. Crear un programa que dado un numero determine si es par o impar
 */
package aprendisaje6;

import java.util.Scanner;

/**
 * @author Hernan
 */
public class Aprendisaje6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el número a evaluar: ");
        int num = leer.nextInt();
        
        if (num % 2 == 0 ){
            System.out.println(num + " es un número par.");
        } else {
            System.out.println(num + " es un número impar.");
        }
    }
}
