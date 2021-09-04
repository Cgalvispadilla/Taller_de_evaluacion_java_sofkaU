package com.sofka.taller;

import java.util.Scanner;

public class Main {
    //función del ejercicio 1
    public static void esMayor() {
        int num1 = 10;
        int num2 = 20;
        if (num1 > num2) {
            System.out.println("El numero " + num1 + " es mayor a " + num2);
        } else if (num1 < num2) {
            System.out.println("El numero " + num2 + " es mayor a " + num1);
        } else {
            System.out.println("Los numeros son iguales");
        }
    }

    public static void main(String[] args) {
        int seleccion;
        do {
            System.out.println("Seleccione un item del menu");
            System.out.println("1- Punto 1\n2- Punto 2\n3- Punto 3\n4- Punto 4\n5- Punto 5" +
                    "6- Punto 6\n7- Punto 7\n8- Punto 8\n9- Punto 9\n10- Punto 10" +
                    "11- Punto 11\n12- Punto 12\n13- Punto 13\n14- Punto 14\n15- Punto 15" +
                    "16- Punto 1\n17- Punto 2\n18- Punto 18\n19- Salir");
            Scanner scanner = new Scanner(System.in);
            seleccion = scanner.nextInt();

            switch (seleccion) {

                case 1:
                    esMayor();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    break;
                case 12:
                    break;
                case 13:
                    break;
                case 14:
                    break;
                case 15:
                    break;
                case 16:
                    break;
                case 17:
                    break;
                case 18:
                    break;
                case 19:
                    seleccion = 19;
                    break;
                default:
                    System.out.println("Por favor escoge una opción valida");
            }
        }
        while (seleccion != 19);
    }
}
