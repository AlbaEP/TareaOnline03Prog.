
package Ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Alba Estepa Perez
 */
public class ClasePrincipal {

    public static void main(String[] args) {

        int numero = 1;

        while (numero != 0) {

            System.out.println("---MENÚ--- ");
            System.out.println("0. Salir del menú."
                    + "\n1. Sumar. "
                    + "\n2. Restar. "
                    + "\n3. Multiplicar."
                    + "\n4. Dividir.");
            System.out.println("Seleccione una opción: ");
            try {
                Scanner teclado = new Scanner(System.in);
                numero = teclado.nextInt();

            } catch (Exception e) {

                System.out.println("--ERROR-- Introduzca un número de las opciones del menú.");

            }

            switch (numero) {
                case 1:

                    float resultado_suma = OperacionesMatematicas.sumar(8, 4);
                    System.out.println("La suma es: " + resultado_suma);

                    break;

                case 2:

                    float resultado_resta = OperacionesMatematicas.restar(8, 4);

                    System.out.println("La resta es: " + resultado_resta);

                    break;

                case 3:

                    float resultado_multiplicacion = OperacionesMatematicas.multiplicacion(8, 4);

                    System.out.println("La multiplicación es: " + resultado_multiplicacion);

                    break;

                case 4:

                    float resultado_division = OperacionesMatematicas.division(8, 4);

                    System.out.println("La división es: " + resultado_division);

                    break;

                default:
                    if (numero == 0) {

                        System.out.println("Hasta pronto.");

                    }
            }

        }

    }

}
