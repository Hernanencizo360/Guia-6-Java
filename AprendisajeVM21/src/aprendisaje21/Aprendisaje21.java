/*
 * 21.
    Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
    3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
    dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
    se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
    que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
    la matriz M en la cual empieza el primer elemento de la submatriz P.

 */
package aprendisaje21;

/**
 *
 * @author Hernan
 */
public class Aprendisaje21 {

    public static void main(String[] args) {
        
        // NOTA: si se quiere pedir los numeros utilizo el scanner en el ciclo for.

        int matrizM[][] = {
            {1, 26, 36, 47, 5, 6, 72, 81, 95, 10},
            {11, 12, 13, 21, 41, 22, 67, 20, 10, 61},
            {56, 78, 87, 90, 9, 90, 17, 12, 87, 67},
            {41, 87, 24, 56, 97, 74, 87, 42, 64, 35},
            {32, 76, 79, 1, 36, 5, 67, 96, 12, 11},
            {99, 13, 54, 88, 89, 90, 75, 12, 41, 76},
            {67, 78, 87, 45, 14, 22, 26, 42, 56, 78},
            {98, 45, 34, 23, 32, 56, 74, 16, 19, 18},
            {24, 67, 97, 46, 87, 13, 67, 89, 93, 24},
            {21, 68, 78, 98, 90, 67, 12, 41, 65, 12}};

        int matrizP[][] = {{36, 5, 67}, {89, 90, 75}, {14, 22, 26}};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizP[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matrizM[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");

        int b = 0;
        int c = 0;
        int contador = 0;
        int filasCorrectas = 0;
        // recorrer el arreglo y comparar numeros

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matrizM[i][j] == matrizP[b][c]) { // primera cohincidencia en la fila 0
                    c++;
                    j++;
                    if (matrizM[i][j] == matrizP[b][c]) { // segunda cohincidencia en la fila 0
                        c++;
                        j++;
                        if (matrizM[i][j] == matrizP[b][c]) { // tercera cohincidencia en la fila 0

                            filasCorrectas++;

                            if ((b == 2) && (filasCorrectas == 3)) {
                                System.out.println("El primer elemento de la submatriz P. Se encuentra en la posición: " + (i - 2) + "," + (j - 2) + " de la matriz M");
                                contador = contador + 1;
                                filasCorrectas = 0;
                            }

                            if (b < 2) {
                                b++; // aumento el valor de la fila b para comparar la fila 1 
                                c = 0; // reset a columna 0 de matriz P
                            } else {
                                filasCorrectas = 0;
                                b = 0;
                                c = 0;
                            }

                        } else {
                            filasCorrectas = 0;
                            b = 0;
                            c = 0;
                        }

                    } else {
                        filasCorrectas = 0;
                        b = 0;
                        c = 0;
                    }
                }
            }
        }
        System.out.println("La matriz P esta contenida " + contador + " veces en la matriz M.");
    }
}
