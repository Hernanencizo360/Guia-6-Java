/*
    Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
    usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
    numero y si se encuentra repetido
 */
package aprendisajevm16;


import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class AprendisajeVM16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] vector;
        System.out.println("Ingrese el tamaño del vector.");
        int n = leer.nextInt();
        
        vector = new int[n];
        
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
        System.out.println("Ingrese un número a buscar en el vector");
        int numAbuscar = leer.nextInt();
        int contador = 0;
        
        for (int i = 0; i < n; i++) {
            if (vector[i] == numAbuscar){
                contador++;
                System.out.println("El numero " + numAbuscar + " se encuentra en posición: " + i);
            }
        }
        if (contador > 1){
            System.out.println("En total se encontró: " + contador + " veces.");
        } else if (contador == 1){
            System.out.println("En total se encontró: " + contador + " vez.");
        } else{
            System.out.println("El número " + numAbuscar + " no se encuentra en el vector");
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print("["+vector[i]+"]");
        }
        System.out.println("");
    }    
}

