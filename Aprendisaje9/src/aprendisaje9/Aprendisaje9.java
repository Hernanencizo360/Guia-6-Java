/*
 * 9. Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
      es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
      diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
      la función Substring y equals() de Java.
 */
package aprendisaje9;

import java.util.Scanner;

/**
 *
 * @author Hernan Encizo
 */
public class Aprendisaje9 {

    public static void main(String[] args) {
        String letra = "A"; // inicializo letra como tipo string y almaceno A
        
        Scanner leer = new Scanner(System.in); // creo el scanner
        
        System.out.println("Ingrese una frase o palabra."); // solicito por pantalla la frase
        
        String palabra = leer.nextLine(); // almaceno en palabra la frase introducida por el usuario
        
        palabra = palabra.toUpperCase(); //convertir a mayusculas
       
        if (palabra.substring(0,1).equals(letra)){ // saco la primera letra de la frase con substring
               System.out.println("CORRECTO");     // con equals la comparo con letra. si es verdadero se ejecuta 
        }else {
            System.out.println("INCORRECTO");     // sino pasa al else.
        }
    }  
}
