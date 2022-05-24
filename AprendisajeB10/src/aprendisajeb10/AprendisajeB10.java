/*
 10. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
     números al usuario hasta que la suma de los números introducidos supere el límite inicial. 
 */
package aprendisajeb10;

import java.util.Scanner;

/**
 *
 * @author Hernan Encizo
 */
public class AprendisajeB10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un valor limite positivo"); // solicito el numero limite
        double limite = leer.nextDouble(); // la almaceno en la variable limite.

        while (limite < 0) {     // coloco un while para controlar que el limite sea positivo.
            System.out.println("Ingrese un valor limite positivo ");
            limite = leer.nextDouble();
        }

        double suma = 0; //inicializo una variable suma para alojar los numeros ingresados

        while (suma <= limite) {
            System.out.println("Ingrese un número para sumar: ");
            double num = leer.nextDouble();
            suma = suma + num;
            if (suma <= limite) {
                System.out.println("El resultado de la suma es: " + suma);
            } else {
                System.out.println("Ha superado el limite " + limite);
                System.out.println("El resultado Total de la suma es: " + suma);
            }
        }
    }
}
