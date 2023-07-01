// programa que pide por dos numeros y los suma , al final muestra por pantalla el resultado de esa suma



package Ejercicio_1;

import java.util.Scanner;

public class Programa_pide_dos_num_y_los_suma {

    public static int valor1, valor2, resultado;
    public static int opcion = 0;

    Scanner entrada = new Scanner(System.in);

    public void PedirNumero() {
        System.out.print("Si desea salir presione 1 / 2.Para sumar:");
        opcion = entrada.nextInt();

        if (opcion != 1) {
            System.out.print("Digame el valor uno a sumar:");
            valor1 = entrada.nextInt();
            System.out.print("Digame el valor dos a sumar:");
            valor2 = entrada.nextInt();
            Operacion();
            System.out.println("El resultado de sus suma es " + resultado);
        } else {
            System.out.println("Gracias vuelva pronto");
        }

    }

    public void Operacion() {
        resultado = valor1 + valor2;
    }

    public static void main(String[] args) {
        Programa_pide_dos_num_y_los_suma mensajero = new Programa_pide_dos_num_y_los_suma();

        do {

          

            mensajero.PedirNumero();
           

        } while (opcion != 1);

    }

}
