/*
 Un programa que te diga cuanto debe pagar en base al descuento que se haga 
Si compras mas de 50 panes , el precio de los panes es 4.50 cada uno, 
Si compras mas de 100 panes , el precio de los panes es 3.50 cada uno
 */
package Ejercicio_1;

import java.util.Scanner;

public class Programa_Total_a_Pagar_segun_descuento {

    public static void main(String[] args) {
        int panes_a_comprar = 0;
        double precio_a_pagar = 0, precio_regular = 5.5,descuento_menor = 4.5, descuento_mayor=3.5;
        Scanner sc = new Scanner(System.in);

        System.out.print("Cuantos panes desea comprar ?:");
        panes_a_comprar = sc.nextInt();

        if (panes_a_comprar > 50 && panes_a_comprar < 100) {
            precio_a_pagar = panes_a_comprar * descuento_menor;
            System.out.println("Usted comprara " + panes_a_comprar + " panes por eso solo debe pagar " +  precio_a_pagar + " dolares, teniendo un descuento de " + descuento_menor + " dolares por cada pan");
        } else if (panes_a_comprar > 100) {
            precio_a_pagar = panes_a_comprar * descuento_mayor;
             System.out.println("Usted comprara " + panes_a_comprar + " por eso solo debe pagar " +  precio_a_pagar + " dolares teniendo un descuento de " + descuento_mayor + " dolares por cada pan");
        } else {
            precio_a_pagar = panes_a_comprar*precio_regular;
            System.out.println("El precio a pagar es " + precio_a_pagar);
        }
    }

}
