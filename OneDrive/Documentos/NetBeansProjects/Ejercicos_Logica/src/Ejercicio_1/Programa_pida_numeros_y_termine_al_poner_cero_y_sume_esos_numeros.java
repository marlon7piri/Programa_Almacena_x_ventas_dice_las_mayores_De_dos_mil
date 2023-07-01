//programa que pida numeros y termine si el numero introducido es 0, y a sume esos numeros
package Ejercicio_1;

import java.util.Scanner;

public class Programa_pida_numeros_y_termine_al_poner_cero_y_sume_esos_numeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeros = 0, resultado_suma = 0;
        int k = 1;

        do {
            System.out.println("Digame el numero " + k);
            numeros = sc.nextInt();

            resultado_suma = numeros + resultado_suma;
            k++;
        } while (numeros != 0);
        
        System.out.println("El resultado de su suma es " +  resultado_suma);

    }
}
