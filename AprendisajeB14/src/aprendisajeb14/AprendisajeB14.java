/*14. 
    Crea una aplicación que a través de una función nos convierta una cantidad de euros
    introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
    función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
    una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
    (void).
        El cambio de divisas es:
            * 0.86 libras es un 1 €
            * 1.28611 $ es un 1 €
            * 129.852 yenes es un 1 €
 */
package aprendisajeb14;

import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class AprendisajeB14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de euros a convertir");
        float cantidad = leer.nextFloat();

        System.out.println("Elija a que moneda desea convertir:");
        System.out.println("1. Libra");
        System.out.println("2. Dolar");
        System.out.println("3. Yen");
        int eleccion = leer.nextInt();
        //System.out.println("La eleccion es: " + eleccion);
        String moneda;

        switch (eleccion) {
            case 1:
                moneda = "0.86";
                convertir(cantidad, moneda);
                break;
            case 2:
                moneda = "1.28611";
                convertir(cantidad, moneda);
                break;
            case 3:
                moneda = "129.852";
                convertir(cantidad, moneda);
                break;
        }
    }

    public static void convertir(float cantidad, String moneda) { // PROCEDIMIENTO
        float monedaNueva = Float.valueOf(moneda);
        float dinero;
        dinero = cantidad * monedaNueva;
        switch (moneda) {
            case "0.86":
                System.out.println(cantidad + " € equivalen a " + dinero + " Libras");
                break;
            case "1.28611":
                System.out.println(cantidad + " € equivalen a " + dinero + " Dólares");
                break;
            case "129.852":
                System.out.println(cantidad + " € equivalen a " + dinero + " Yenes");
                break;
            default:
                break;
        }
    }
}
