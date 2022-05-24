/*17:
 *  Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
 *  de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package aprendisajevm17;

import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class AprendisajeVM17 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector.");
        int n = leer.nextInt();

        int[] vector;
        vector = new int[n];
        int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;

        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 100000 + 1);
        }
        for (int i = 0; i < n; i++) {
            System.out.print("[" + vector[i] + "]");
            //Esta parte del if es solo para acomodar de 20 en 20 los numeros
            if ((i == 20)||(i ==40)||(i ==60)||(i ==80)||(i ==100)||(i ==120)||(i ==140)||(i ==160)
                ||(i ==180)||(i ==200)||(i ==220)||(i ==240)||(i ==260)||(i ==280)||(i ==300)||(i ==240)){
                System.out.println("");
            }
        }
        System.out.println("");
        for (int i = 0; i < n; i++) {
            if (vector[i] < 10) {
                cont1++;

            } else if (vector[i] > 9 && vector[i] < 100) {
                cont2++;

            } else if (vector[i] > 99 && vector[i] < 1000) {
                cont3++;

            } else if (vector[i] > 999 && vector[i] < 10000) {
                cont4++;

            } else if (vector[i] > 9999) {
                cont5++;
            }
        }
        System.out.println("Número de 1 Dígito: " + cont1);
        System.out.println("Número de 2 Dígito: " + cont2);
        System.out.println("Número de 3 Dígito: " + cont3);
        System.out.println("Número de 4 Dígito: " + cont4);
        System.out.println("Número de 5 Dígito: " + cont5);
    }
}
