/*
 19. 
    Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
    matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
    signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
    denota por AT y se obtiene cambiando sus filas por columnas (o viceversa)
 */
package aprendisajevm19;

import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class AprendisajeVM19 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);      //Se crea el scanner   

        System.out.println("Ingrese el tamaño de la Matriz: ");
        int n = leer.nextInt();                                 //Se lee el tamaño de la matriz

        int[][] A = new int[n][n];          //Se crean la matrices
        int[][] AT = new int[n][n];

        boolean band = true;	//Se crea una variable logica

        // Se llena la matriz A
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Ingrese un número para la posición: "+ i + "," + j + ".");
                A[i][j] = leer.nextInt();
            }
        }

        //Imprimir la matriz A
        System.out.println("La matriz A es:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" " + A[i][j] + " ");
            }
            System.out.println();
        }
        // llenar matriz AT
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                AT[i][j] = A[j][i];
            }
        }
        //Imprimir la matriz AT
        System.out.println("La matriz AT es:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" " + AT[i][j] + " ");
            }
            System.out.println();
        }

        //Determinar si es antisimetrica
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                
                if (AT[i][j] != (A[i][j]* -1)) {
                    band = false;
                    i = n;
                    break;
                }
            }
        }

        //Mostrar si es antisimetrica o no
        if (band) {
            System.out.println("La matriz SI es Antisimetrica");
        } else {
            System.out.println("La matriz NO es Antisimetrica");
        }
    }
}
