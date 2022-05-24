/*
 8. Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
    usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
    pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
  Nota: investigar la función Lenght() en Java
 */
package aprendisaje8;

import java.util.Scanner;
/*
 *  @author Hernan
*/
public class Aprendisaje8 {

    public static void main(String[] args) {
        // pedir una frase por pantalla
        System.out.println("Ingrese una frase o palabra de 8 de largo: ");
        //  crear un el scanner 
        Scanner leer = new Scanner(System.in);
        // leer la frase ingresada por el usuario.
        String frase = leer.nextLine();
        // contar los caracteres con la funcion Lenght y almacenarlo en una variable de tipo entero.
        int n = frase.length();
        // una vez que tengo el largo pongo la sentencia 
        System.out.println("El largo es: " + n );
        if (n == 8) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
}
