

package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Alba Estepa Pérez
 */
public class EPAOnline03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numero = 5;

        while (numero != 0) {
            System.out.println("MENÚ: ");
            System.out.println("0. Salir del menú."
                    + "\n1. Ejercicio 1. "
                    + "\n2. Ejercicio 2. "
                    + "\n3. Ejercicio 3. "
                    + "\n4. Ejercicio 4. "
                    + "\n5. Ejercicio 5. "
                    + "\n6. Ejercicio 6. "
                    + "\n7. Ejercicio 7. "
                    + "\n8. Ejercicio 8. "
                    + "\n9. Ejercicio 9. "
                    + "\n Seleccione un número:  ");

            numero = teclado.nextInt();

            switch (numero) {
                case 1:
                    double resultado = centímetrosPulgadas();

                    break;

                case 2:
                    sumaRestaMultiplicaciónDivisión();

                    break;

                case 3:
                    int resultado3 = numerosNegativos();

                    break;

                case 4:
                    boolean resultado4 = numeroPositivo();

                    break;

                case 5:
                    int resultado5 = diezNumerosPares();

                    break;

                case 6:
                    int resultado6 = sumaResta();
                    System.out.println("6.Resultado ejercicio 6: " + resultado6);

                    break;

                case 7:
                    divisionResultadoDivision();

                    break;

                case 8:
                    int resultado8 = numerosImpares();

                    break;

                case 9:
                    boolean resultado9 = parImpar();

                    break;

                default:
                    if (numero == 0) {

                        System.out.println("Hasta pronto.");
                    }
            }
        }
    }

    public static double centímetrosPulgadas() {

        double c = 0;
        double p = 0;
        double resultado = 0;
        int numeroLeido = 1;

        Scanner teclado = new Scanner(System.in);

        //Para crear un menú switch:
        while (numeroLeido > 0 && numeroLeido <= 2) {

            System.out.println("1. Pasar de centímetros a pulgadas.");
            System.out.println("2. Pasar de pulgadas a centímetros.");
            System.out.println("Elija una opción: ");

            numeroLeido = teclado.nextInt();

            switch (numeroLeido) {

                case 1:
                    System.out.println("Introduzca número de centímetros: ");
                    try {
                        c = teclado.nextDouble();
                    } catch (Exception e) {
                        System.out.println("-ERROR- Introduzca una opción válida.");

                    }
                    resultado = c * 2.54;
                    System.out.println("El número de pulgadas es: " + resultado);

                    break;
                case 2:
                    System.out.println("Introduzca número de pulgadas: ");
                    try {
                        p = teclado.nextDouble();
                    } catch (Exception e) {
                        System.out.println("-ERROR- Introduzca una opción válida.");
                    }
                    resultado = p / 2.54;
                    System.out.println("El número de centímetros es: " + resultado);

                    break;

                default:
                    System.out.println("Opción incorrecta.");

            }
        }
        return resultado;
    }

    public static void sumaRestaMultiplicaciónDivisión() {
        int n1 = 1;
        int n2 = 1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca dos números.");
        System.out.println("Primer número: ");
        try {
            n1 = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("-ERROR- Introduzca una opción válida.");
        }
        System.out.println("Segundo número: ");
        try {
            n2 = teclado.nextInt();
        } catch (Exception e) {

            System.out.println("-ERROR- Introduzca una opción válida.");
        }
        int s = n1 + n2;
        int r = n1 - n2;
        int m = n1 * n2;
        int d = n1 / n2;

        System.out.println("La suma de ambos números es: " + s + " ,su resta es: " + r + " ,siendo el resultado de su múltiplicación: " + m + " ,y su división: " + d);

    }

    public static int numerosNegativos() {

        int n = -1;
        int contador = -100;

        while (n >= contador) {
            System.out.println(n);
            n--;
        }
        return n;

    }

    public static boolean numeroPositivo() {

        System.out.println("Introduzca un número: ");
        Scanner teclado = new Scanner(System.in);
        boolean resultado = false;

        int numero = 1;

        try {
            numero = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("-ERROR- Introduzca una opción válida.");
        }

        if (numero > 0) {
            System.out.println("El número introducido es positivo.");
            resultado = true;
        }
        return resultado;
    }

    public static int diezNumerosPares() {

        int numero = 1;

        System.out.println("Introduzca un número: ");
        Scanner teclado = new Scanner(System.in);
        try {
            numero = teclado.nextInt() + 2;
        } catch (Exception e) {
            System.out.println("-ERROR- Introduzca una opción válida.");
        }

        int n = 0;
        while (n < 10) {

            if (numero % 2 == 0) {

                System.out.println(numero);

                n++;
            }

            numero++;

        }
        return numero;

    }

    public static int sumaResta() {

        int n1 = 1;
        int n2 = 1;
        int opcion;
        int resultado6 = 1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca 2 números: ");
        System.out.println("Primer número: ");
        try {
            n1 = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("-ERROR- Introduzca una opción válida.");
        }
        System.out.println("Segundo número: ");
        try {
            n2 = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("-ERROR- Introduzca una opción válida.");
        }

        System.out.println("Seleccione una opción: ");
        System.out.println("1. Si introduce un 1, se realizará la suma de ambos números.");
        System.out.println("2. Si introduce un 2, por lo contrario, se realizará la resta de ambos.");
        opcion = teclado.nextInt();

        switch (opcion) {

            case 1: //se realizará la suma
                resultado6 = n1 + n2;
                System.out.println("La suma de ambos números es: " + resultado6);

                break;
            case 2: //se realizará la resta
                resultado6 = n1 - n2;
                System.out.println("La resta de ambos números es: " + resultado6);

                break;
            default:
                System.out.println("Opción no válida.");

        }

        return resultado6;

    }

    public static void divisionResultadoDivision() {

        int n2 = 1;
        Scanner intro = new Scanner(System.in);
        int n = 100;

        System.out.println("Introduzca un número: ");
        try {
            n2 = intro.nextInt();
        } catch (Exception e) {
            System.out.println("-ERROR- Introduzca una opción válida.");
        }

        double d = n / n2;

        System.out.println(n + " / " + n2 + " = " + d);

        int n3 = 1;

        do {

            System.out.println("Introduzca un número: ");
            try {
                n3 = intro.nextInt();
            } catch (Exception e) {
                System.out.println("-ERROR- Introduzca una opción válida.");
            }
            double d2 = d / n3;

            System.out.println(d + " / " + n3 + " = " + d2);

        } while (n3 != 0);
        System.out.println("La división por cero no se puede realizar.");

    }

    public static int numerosImpares() {

        int n = 1;
        int contador = 50;
        while (n < contador) {
            if (n % 2 != 0) {

                System.out.println(n);

            } else {
            }
            n++;
        }
        return n;
    }

    public static boolean parImpar() {
        int n = 1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número entero: ");
        try {
            n = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("-ERROR- Introduzca una opción válida.");
        }
        boolean resultado = true;

        if (n % 2 == 0) {
            System.out.println("El número " + n + " es par.");
            resultado = true;

        } else {
            System.out.println("El número " + n + " es impar.");
        }
        return resultado;
    }
}
