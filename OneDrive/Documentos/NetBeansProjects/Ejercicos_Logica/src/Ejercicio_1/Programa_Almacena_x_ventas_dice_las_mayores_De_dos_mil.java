//Programa que almacene x ventas del mes y que diga cuantas son mayores que $2000,
//Mostrar al final en pantalla las mayores de $2000
package Ejercicio_1;

import java.util.Scanner;

public class Programa_Almacena_x_ventas_dice_las_mayores_De_dos_mil {

    public static void main(String[] args) {

        int[] ventas = new int[5];
        int mayores_de_dos_mil = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < ventas.length; i++) {
            System.out.println("Digame la venta numero " + (i + 1));
            ventas[i] = sc.nextInt();//3000

            if (ventas[i] > 2000) {
                mayores_de_dos_mil++;//=1
            }

        }
        //para mostrar las ventas 
        for (int j = 0; j < ventas.length; j++) {
            System.out.println(ventas[j]);
        }
        //para mostrar las mayores a $2000
        System.out.println("Las ventas mayores que $2000 fueron " + mayores_de_dos_mil);

    }

}
