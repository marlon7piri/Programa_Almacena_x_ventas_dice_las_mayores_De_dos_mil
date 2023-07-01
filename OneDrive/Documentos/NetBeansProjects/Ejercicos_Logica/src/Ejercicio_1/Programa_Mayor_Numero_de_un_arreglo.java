//programa que te diga el mayor numero de un arreglo x
package Ejercicio_1;

import java.util.Scanner;

public class Programa_Mayor_Numero_de_un_arreglo {

    public static void main(String[] args) {
        int[] array_de_numeros = new int[3];
        int mayor = 0, numero;
        Scanner sc = new Scanner(System.in);

        //llenar el array con los numeros deseados
        for (int i = 0; i < array_de_numeros.length; i++) {
            System.out.println("Digame el numero " + (i + 1));
            numero = sc.nextInt();//10
            array_de_numeros[i] = numero;

            if (numero > mayor) { //mayor = 8
                mayor = numero;
            }

        }

        System.out.println("El mayor de los numeros es " + mayor);

    }

}
