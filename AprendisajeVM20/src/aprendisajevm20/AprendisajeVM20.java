/*
 * 20. 
        Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
        suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
        permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
        El programa deberá comprobar que los números introducidos son correctos, es decir,
        están entre el 1 y el 9.
 */
package aprendisajevm20;

import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class AprendisajeVM20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        int[][] matriz = new int[3][3]; // Declarando matriz 3x3;

        // Llenar matriz 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.println("Ingrese un número comprendido entre 1 y 9. Para la posición: " + i + "," + j);
                    num = leer.nextInt();
                } while (num > 9 || num < 1);
                matriz[i][j] = num;
            }
        }

        // Mostrar matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }

        int sumaF0 = 0; // declaro y le asigno valor a sumaF0 = ahi guardo la suma de los numeros de la fila 0.

        //sumar fila 0 para obtener su resultado y compararlos con las demas filas, columnas y diagonal.
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 3; j++) {
                sumaF0 = sumaF0 + matriz[i][j];
            }
            System.out.println("La suma de la Fila 0 es: " + sumaF0);
        }

        int sumaF1 = 0;
        //sumar filas desde 1, para obtener su resultado y compararlos con sumaF0.
        for (int i = 1; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumaF1 = sumaF1 + matriz[i][j];
            }
            System.out.println("La suma de la fila " + i + " es: " + sumaF1);
            if (sumaF1 != sumaF0) {
                System.out.println(">>>>>>>>>>>>>>>>>>>||<<<<<<<<<<<<<<<<<<<");
                System.out.println(">       NO ES UN CUADRADO MÁGICO       <");
                System.out.println(">        La suma de  la Fila " + i + "         <");
                System.out.println(">  no cohincide con la Suma de Fila 0  <");
                System.out.println(">>>>>>>>>>>>>>>>>>>||<<<<<<<<<<<<<<<<<<<");
                i = 3;
            }

            if (i != 2) {
                sumaF1 = 0;
            }
        }
        int sumaC0 = 0;
        if (sumaF1 == sumaF0) {
            for (int j = 0; j < 3; j++) {
                for (int i = 0; i < 3; i++) {
                    sumaC0 = sumaC0 + matriz[i][j];
                }
                System.out.println("La suma de la columna " + j + " es: " + sumaC0);
                if (j != 2) {
                    if (sumaC0 == sumaF0) {
                        sumaC0 = 0;
                    } else {
                        System.out.println("No es un cuadrado magico");
                        break;
                    }
                }
            }
            int sumaD = 0;
            if (sumaC0 == sumaF0) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (i == j) {
                            sumaD = sumaD + matriz[i][j];
                        }
                    }
                }
                System.out.println("La suma de la Diagonal es: " + sumaD);
                if (sumaD != sumaF0) {
                    System.out.println("No es un cuadrado magico");
                } else {
                    System.out.println("Felicitaciones es un cuadrado magico");
                }
            }
        }
    }
}