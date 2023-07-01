//Hacer un ejercicio que te sume x cantidad de numeros que desee sumar 
// mostrar en pantalla la suma total de todos esos numeros 
//ejemplo: queremos sumar 10 numeros, por consola pedimos esos 10 numeros y al final mostramos
//la suma de esos 10 numeros


package Ejercicio_1;

import java.util.Scanner;

public class Programa_suma_x_numeros {

    public static void main(String[] args) {
        int cantidad_numeros_a_sumar = 0, numero = 0, resultado = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cuantos numeros desea sumar?");
        cantidad_numeros_a_sumar = entrada.nextInt();

        for (int i = 0; i <= cantidad_numeros_a_sumar; i++) {
            System.out.println("Cual es el valor " + (i+1));//i=1
            numero = entrada.nextInt();//86

            resultado = resultado + numero;//   resultado = 35 + 24 = 59
        }

        System.out.println("El resultado de su suma es " + resultado);

    }

}
