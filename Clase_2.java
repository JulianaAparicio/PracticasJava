package Semana_1;

public class Clase_2 {
    // EJERCITACIÓN MESA DE TRABAJO - CLASE 2

    // EJERCICIO 1:

        /* Hacer una función que dado un número indica si es un número primo o no. Un número
        primo es aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo,
        ya que 25 es divisible por 1, 5 y 25. 17 sí es primo porque solo se puede dividir por 1 y por
        17.

        Usar esta función en un programa, que permita el ingreso de un número y luego llame a la
        función desarrollada para comprobar si es primo o no. Para resolverlo usar la función
        obtenida en el ejercicio desarrollado en la clase asincrónica. boolean esDivisible(int n, int
        divisor) */

    public boolean esPrimo(int num){
        int divisores = 1;
        for (int i = 2; i<= num; i  ++){
            if(num % i == 0){
                divisores++;
            }
        }
        return divisores == 2;
    }


    // EJERCICIO 2

    /*
    Escribir una función que reciba tres números y devuelva el máximo entre los tres números.
            Integer maximoEntreTresNumeros(Integer unNumeroA, Integer unNumeroB, Integer
            unNumeroC)
    Luego hacer un programa que permita el ingreso de 3 valores, utilice la función y muestre
    el resultado.
    */


    Integer maximoEntreTresNumeros(Integer unNumeroA, Integer unNumeroB, Integer
            unNumeroC){

        Integer maximo = unNumeroA;

        if(maximo < unNumeroB){
            maximo = unNumeroB;
        }
        if(maximo < unNumeroC){
            maximo = unNumeroC;
        }

        System.out.println("El máximo de "+ unNumeroA + ", " + unNumeroB + ", " + unNumeroC + " es: " + maximo);
        return maximo;
    }


    // EJERCICIO 3

    /*
    Escribir una función:
    boolean cadenasDeTextoDistintas(String unTextoA, String unTextoB)
    que debe tomar dos cadenas de texto y devolver true, en caso de que sean distintos, o
    false, en caso de que coincidan.
    */

    public boolean cadenasDeTextoDistintas(String unTextoA, String unTextoB){
        return !unTextoA.equals(unTextoB);
    }

}
