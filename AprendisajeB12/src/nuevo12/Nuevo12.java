/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevo12;

import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class Nuevo12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int contadorC = 0, contadorI = 0;
        String primeraL = "", ultimaL = "";
        boolean salir = false;

        while (!salir) {
            System.out.println("Ingrese la cadena.");
            String cadena = leer.nextLine();
            // SACAR LARGO DE LA CADENA
            int longitud = cadena.length();
            //Si el largo de la cadena es mayor a 5 incorrecto
            if (longitud > 5) {
                contadorI++;
            } else {
                if (cadena.equals("&&&&&")) {
                    break;
                } else {

                    for (int i = 1; i < longitud + 1; i++) {
                        if (i == 1) {
                            primeraL = cadena.substring(0, 1);
                        } else if (i == longitud) {
                            ultimaL = cadena.substring(longitud - 1, longitud);
                        }
                    }
                    if (primeraL.equals("X")) {
                        if (ultimaL.equals("O")) {
                            contadorC++;
                        } else {
                            contadorI++;
                        }
                    } else {
                        contadorI++;
                    }
                }
            }
        }
        System.out.println(">>>>>>>>|Informe de lectura|<<<<<<<");
        System.out.println(">>      Lecturas Correctas: " + contadorC + "    <<");
        System.out.println(">>      Lecturas Incorrectas: " + contadorI + "  <<");
        System.out.println(">>>>>>>>|Informe de lectura|<<<<<<<");
    }
}
