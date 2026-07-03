/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package merceria;

import java.util.Scanner;

/**
 *
 * @author Landon
 */
public class Merceria {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("-----------Merceria mayoritas------------");
        System.out.println("¿Cuantos paquetes desea comprar?");
        int cant = scan.nextInt();
        double total;
        if (cant < 5) {
            if (cant < 0) {
                System.out.println("No se admiten compras negativas");
            }
            System.out.println("No se puede hacer esta compra ya que el minimo es de 5 paquetes");
        } else {
            scan.nextLine();
            System.out.println("Cual fue el total de la compra");
            total = scan.nextDouble();
            if (total<100) {
                double faltante = 100 - total;
                System.out.println("No tienes descuento, le faltan "+faltante+ " para poder tener una promocion");
                
            }
            
            if (cant >= 5 && cant <= 10) {
                System.out.println("El costo del envio es de 10 dolares");
                if (total>100 && total < 300) {
                    double promocion1 = total * 0.05;
                    double pagoTotal= total + 10 - promocion1;
                    System.out.println("Al comprar 100 tiene un descuento del 5 porciento, asi que el total con envio seria de "+ pagoTotal);
                }
            } else {
                System.out.println("El envio es gratis");
            }
        }
    }

}
