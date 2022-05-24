/*
 7. Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
    pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
    la función equals() en Java.
 */
package aprendisaje7;

import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class Aprendisaje7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase1 = "eureka";
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase: ");
        String frase2 = leer.nextLine();
        // equals sirve para comparar cadenas. El signo == sirve para comparar objetos
        if (frase1.equals(frase2)){ 
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }  
}
