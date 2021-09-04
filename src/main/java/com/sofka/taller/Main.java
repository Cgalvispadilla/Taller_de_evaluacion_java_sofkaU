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
    //función ejercicio 2
    public static void esMayor(int num1,int num2){
        if (num1 > num2) {
            System.out.println("El numero " + num1 + " es mayor a " + num2);
        } else if (num1 < num2) {
            System.out.println("El numero " + num2 + " es mayor a " + num1);
        } else {
            System.out.println("Los numeros son iguales");
        }
    }
    //función del ejercicio 3
    public static double areaCirculo(double radio){
        if (radio>0) {
            double area = Math.PI * Math.pow(radio, 2);
            return area;
        }else {
            return 0;
        }
    }
    //función del ejercio 4
    public static double precioFinalProductoConIva(double precio){
        final double IVA = 0.21;
        if(precio>0) {
            double precioTotal = precio + (precio * IVA);
            return precioTotal;
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int seleccion;
        String entrada;
        do {
            System.out.println("Seleccione un item del menu");
            System.out.println("1- Ejercicio 1\n2- Ejercicio 2\n3- Ejercicio 3\n4- Ejercicio 4\n5- Ejercicio 5" +
                    "\n6- Ejercicio 6\n7- Ejercicio 7\n8- Ejercicio 8\n9- Ejercicio 9\n10- Ejercicio 10" +
                    "\n11- Ejercicio 11\n12- Ejercicio 12\n13- Ejercicio 13\n14- Ejercicio 14\n15- Ejercicio 15" +
                    "\n16- Ejercicio 16\n17- Ejercicio 17\n18- Ejercicio 18\n19- Salir");
            Scanner scanner = new Scanner(System.in);
            seleccion = scanner.nextInt();

            switch (seleccion) {

                case 1:
                    esMayor();
                    break;
                case 2:
                    try {
                        System.out.print("Ingrese el primer valor: ");
                        double num1= scanner.nextInt();
                        System.out.print("Ingrese el primer valor: ");
                        double num2= scanner.nextInt();
                        esMayor((int)num1,(int) num2);
                    }catch (Exception e){
                        System.out.println("ocurrio un error " +e+" Posiblemente porque no ingreso un numero");
                    }
                    break;
                case 3:
                    try {
                        System.out.print("Ingrese el valor del radio: ");
                        double radio= scanner.nextDouble();
                        double area= areaCirculo(radio);
                        if(area>0){
                            System.out.println("el area de"+radio+" es "+area);
                        }else {
                            System.out.println("Un radio nunca puede ser 0 o menor a cero");
                        }
                    }catch (Exception e){
                        System.out.println("ocurrio un error " +e+" Posiblemente porque no ingreso un numero");
                    }
                    break;
                case 4:
                    try {
                        System.out.print("ingrese el precio del producto: ");
                        entrada = scanner.next();
                        entrada= entrada.replace(",",".");
                        double precioProducto= Double.parseDouble(entrada);
                        double precioFinalProducto=precioFinalProductoConIva(precioProducto);
                        if(precioFinalProducto>0){
                            System.out.println("El precio total con iva aplicado del producto es: "+precioFinalProducto);
                        }else {
                            System.out.println("no es posible calcular el precio de un producto si ingresa 0 o un numero negativo");
                        }

                    }catch (Exception e){
                        System.out.println("ocurrio un error " +e+" Posiblemente porque no ingreso un numero");
                    }
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
                default:
                    System.out.println("Por favor escoge una opción valida");
            }
        }
        while (seleccion != 19);
    }
}
