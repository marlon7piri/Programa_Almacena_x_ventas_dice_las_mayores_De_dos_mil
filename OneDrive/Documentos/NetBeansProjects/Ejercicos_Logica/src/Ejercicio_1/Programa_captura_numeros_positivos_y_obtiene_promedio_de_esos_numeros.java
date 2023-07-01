/*
 Programa que pide numeros positivos y calcula el promedio de esos numeros
 */
package Ejercicio_1;

import java.util.Scanner;

public class Programa_captura_numeros_positivos_y_obtiene_promedio_de_esos_numeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad_numeros = 0;
        double promedio = 0;
        int numeros_introducido = 0, k = 0, suma = 0;

        do {
            System.out.println("Digame el numero " + (k + 1));
            numeros_introducido = sc.nextInt();

            if (numeros_introducido != 0) {
                suma = numeros_introducido + suma;
                cantidad_numeros++;
            }

            k++;
        } while (numeros_introducido > 0);

        promedio = suma / cantidad_numeros;
        System.out.println("El promedio de la suma de sus numeros es " + promedio);

    }

}
