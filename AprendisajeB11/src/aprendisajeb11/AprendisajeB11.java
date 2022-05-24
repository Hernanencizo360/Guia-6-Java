/*
 * Realizar un programa que pida dos números enteros positivos por teclado y muestre por
   pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
   El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
   y luego volver al menú.
 */
package aprendisajeb11;

import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class AprendisajeB11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        double suma, resta, producto, division;
        char eleccion;

        System.out.println("Ingrese un número Entero positivo.");
        int num1 = leer.nextInt();
        System.out.println("Ingrese otro número Entero positivo.");
        int num2 = leer.nextInt();

        while(!salir) {
            System.out.println("MENU:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    suma = num1 + num2;
                    System.out.println("El resultado de la suma es: " + suma);
                    break;
                case 2:
                    resta = num1 - num2;
                    System.out.println("El resultado de la resta es: " + resta);
                    break;
                case 3:
                    producto = num1 * num2;
                    System.out.println("El resultado de la multiplicación es: " + producto);
                    break;
                case 4:
                    division = num1 / num2;
                    System.out.println("El resultado de la division es: " + division);
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    eleccion = leer.next().charAt(0); // almaceno la letra
                    eleccion = Character.toUpperCase(eleccion); // convierto el caracter en mayuscula.
                    if (eleccion == 'S'){                  // la comparo 
                        salir = true;
                        break;
                    } else { // se puede mejorar 
                       continue;
                    }
                default: 
                    System.out.println("Las opciones son entre 1 y 5");
            } 
        } 
    }
}
