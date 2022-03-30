package Semana_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // PLAYGROUND
        /*
         Ejercitacion Estructuras
         Ejercicio 1
            Definir dos números enteros. Asignarles un valor a cada uno. Comprobar si un número es
            divisible por el segundo e indicar mediante un mensaje el resultado obtenido.
            NOTA: Que sea divisible quiere decir que al dividir da un valor exacto, es decir, sin
            decimales.

         */
                int num1 = 27;
                int num2 = 3;

                if(num1%num2 == 0){
                    System.out.println("El primer numero es divisible por el segundo numero");
                } else {
                    System.out.println("El primer numero no es divisible por el segundo numero");
                }

        /*
         CLASE 2

        Practica en clase - Ejercitación Sintaxis Java

         EJERCICIO 1:
                Ingresa tu nombre y tu apellido por separado, a partir de estas variables obtener en una
                tercera tus iniciales y tu fecha de nacimiento, para la fecha ingresa, 3 valores que
                representan día, mes y año.
                Luego muestra un mensaje, como si fuera una ficha, con tu nombre completo. Las iniciales
                de tu nombre y apellido y tu fecha de nacimiento con el formato “dd/mm/aaaa”
                Nota: Utilizar alguna función para resolver, por ejemplo una que dados los 3 valores
                devuelve la fecha como un string.
        */

        Scanner lector = new Scanner(System.in);
        String nombre;
        String apellido;
        String dia;
        String mes;
        String anio;

        System.out.println("Ingrese su nombre: ");
        nombre = lector.nextLine();
        System.out.println("Ingrese su apellido: ");
        apellido = lector.nextLine();
        System.out.println("Ingrese su día de nacimiento: ");
        dia = lector.nextLine();
        System.out.println("Ingrese su mes de nacimiento: ");
        mes = lector.nextLine();
        System.out.println("Ingrese su año de nacimiento: ");
        anio = lector.nextLine();


        System.out.println("Sus iniciales son: "+ nombre.charAt(0) + "." + apellido.charAt(0) + "." + "Su fecha de nacimiento es: " + dia + "/" + mes + "/" + anio);

        // Ejercicio 1 -- MT

        Clase_2 ejercicio1 = new Clase_2();

        if (ejercicio1.esPrimo(10)) {
            System.out.println(10 + " es primo.");
        } else {
            System.out.println(10 + " no es primo.");
        }

        System.out.println("------------------------");


        // Ejercicio 2 -- MT

        Clase_2 ejercicio2 = new Clase_2();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor para el número A:");
        Integer unNumeroA = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese el valor para el número B:");
        Integer unNumeroB = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese el valor para el número C:");
        Integer unNumeroC = scanner.nextInt();
        scanner.nextLine();

        ejercicio2.maximoEntreTresNumeros(unNumeroA,unNumeroB,unNumeroC);

        System.out.println("------------------------");


        // Ejercicio 3 -- MT

        Clase_2 ejercicio3 = new Clase_2();

        if (ejercicio3.cadenasDeTextoDistintas("Holis", "Holus")) {
            System.out.println("Son diferentes.");
        }
        else {
            System.out.println("Son iguales.");
        }
    }
}
