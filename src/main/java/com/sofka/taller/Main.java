package com.sofka.taller;

import punto16.Persona;

import java.util.Scanner;

import static com.sofka.taller.Funcionalidades.*;


public class Main {


    public static void main(String[] args) {
        int seleccion = 0;
        String entrada;
        do {
            Scanner scanner = new Scanner(System.in);
            //configuramos scanner para que reciba frases
            scanner.useDelimiter("\n");
            try {
                System.out.println("Seleccione un item del menu");
                System.out.println("1- Ejercicio 1\n2- Ejercicio 2\n3- Ejercicio 3\n4- Ejercicio 4\n5- Ejercicio 5" +
                        "\n6- Ejercicio 6\n7- Ejercicio 7\n8- Ejercicio 8\n9- Ejercicio 9\n10- Ejercicio 10" +
                        "\n11- Ejercicio 11\n12- Ejercicio 12\n13- Ejercicio 13\n14- Ejercicio 14\n15- Ejercicio 15" +
                        "\n16- Ejercicio 16\n17- Ejercicio 17\n18- Ejercicio 18\n19- Salir");
                seleccion = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Ingrese solo un numero entre 1 y 19");
            }

            switch (seleccion) {

                case 1:
                    esMayor();
                    break;
                case 2:
                    try {
                        System.out.print("Ingrese el primer valor: ");
                        double num1 = scanner.nextInt();
                        System.out.print("Ingrese el primer valor: ");
                        double num2 = scanner.nextInt();
                        esMayor((int) num1, (int) num2);
                    } catch (Exception e) {
                        System.out.println("ocurrio un error " + e + " Posiblemente porque no ingreso un numero");
                    }
                    break;
                case 3:
                    try {
                        System.out.print("Ingrese el valor del radio: ");
                        entrada = scanner.next();
                        entrada = entrada.replace(",", ".");
                        double radio = Double.parseDouble(entrada);
                        double area = areaCirculo(radio);
                        if (area > 0) {
                            System.out.println("el area del circulo con radio " + radio + " es " + area);
                        } else {
                            System.out.println("Un radio nunca puede ser 0 o menor a cero");
                        }
                    } catch (Exception e) {
                        System.out.println("ocurrio un error " + e + " Posiblemente porque no ingreso un numero");
                    }
                    break;
                case 4:
                    try {
                        System.out.print("ingrese el precio del producto: ");
                        entrada = scanner.next();
                        entrada = entrada.replace(",", ".");
                        double precioProducto = Double.parseDouble(entrada);
                        double precioFinalProducto = precioFinalProductoConIva(precioProducto);
                        if (precioFinalProducto > 0) {
                            System.out.println("El precio total con iva aplicado del producto es: " + precioFinalProducto);
                        } else {
                            System.out.println("no es posible calcular el precio de un producto si ingresa 0 o un numero negativo");
                        }

                    } catch (Exception e) {
                        System.out.println("ocurrio un error " + e + " Posiblemente porque no ingreso un numero");
                    }
                    break;
                case 5:
                    numParesEImparesHastaCienWhile();
                    break;
                case 6:
                    numParesEImparesHastaCienFor();
                    break;
                case 7:
                    numeroMayorACero(scanner);
                    break;
                case 8:
                    System.out.print("Ingrese un dia de la semana: ");
                    entrada = scanner.next();
                    System.out.println(diaEsLaboralONoLaboral(entrada));
                    break;
                case 9:
                    //configuramos scanner para que nos pueda leer una frase :)
                    System.out.print("Ingrese una frase por favor: ");
                    entrada = scanner.next();
                    System.out.println(reemplazarYConcatenar(entrada));
                    break;
                case 10:
                    System.out.print("Ingrese una frase por favor: ");
                    entrada = scanner.next();
                    System.out.println(eliminarEspacioEnTexto(entrada));
                    break;
                case 11:
                    System.out.print("Ingrese una frase por favor: ");
                    entrada = scanner.next();
                    logitudYVocalesDeUnaFrase(entrada);
                    break;
                case 12:
                    System.out.print("ingrese una palabra: ");
                    String palabra1 = scanner.next();
                    System.out.print("ingrese otra palabra: ");
                    String palabra2 = scanner.next();
                    if (palabrasIguales(palabra1, palabra2)) {
                        System.out.println("Las palabras son iguales");
                    } else {
                        System.out.println(diferenciaEntreDosPalabras(palabra1, palabra2));
                    }
                    break;
                case 13:
                    System.out.println("fecha y hora actual: " + verFechaHoraActual());
                    break;
                case 14:
                    try {
                        System.out.print("Ingrese un numero: ");
                        int num = scanner.nextInt();
                        numerosDeDosEnDosHastaMil(num);
                    } catch (Exception e) {
                        System.out.println("ocurrio un error " + e + " Posiblemente porque no ingreso un numero");
                    }
                    break;
                case 15:
                    int eleccion = 0;
                    do {
                        try {
                            System.out.println("****** GESTION CINEMATOGRÁFICA ********\n" +
                                    "1-NUEVO ACTOR\n" +
                                    "2-BUSCAR ACTOR\n" +
                                    "3-ELIMINAR ACTOR\n" +
                                    "4-MODIFICAR ACTOR\n" +
                                    "5-VER TODOS LOS ACTORES\n" +
                                    "6- VER PELICULAS DE LOS ACTORES\n" +
                                    "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                                    "8-SALIR");

                            eleccion = scanner.nextInt();
                            switch (eleccion) {
                                case 1:
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
                                default:
                                    System.out.println("OPCION INCORRECTO");
                                    break;
                            }
                        } catch (Exception e) {
                            System.out.println("Error " + e + " probablemente por no ingresar un numero");
                            scanner.next();
                        }
                    } while (eleccion != 8);
                    break;
                case 16:
                    try {

                        int tipoPeso = 0;
                        boolean esMayorDeEdad = true;
                        //pedir datos
                        System.out.print("Ingrese el nombre de la persona: ");
                        String nombre = scanner.next();
                        System.out.print("Ingrese la edad de la persona: ");
                        int edad = scanner.nextInt();
                        while (edad < 1) {
                            System.out.println("La edad no es valida");
                            System.out.print("Ingrese la edad de la persona: ");
                            edad = scanner.nextInt();
                        }
                        System.out.print("Ingrese el sexo de la persona siendo \"H\" hombre y \"M\" mujer : ");
                        char sexo = scanner.next().charAt(0);
                        System.out.println(sexo);
                        System.out.print("Ingrese el peso de la persona en KG: ");
                        int peso = scanner.nextInt();
                        //minimo tres KG por si es un bebé prematuro
                        while (peso < 3) {
                            System.out.println("El peso no es valido");
                            System.out.print("Ingrese el peso de la persona en KG: ");
                            peso = scanner.nextInt();
                        }
                        System.out.print("Ingrese la altura de la persona en metros: ");
                        entrada = scanner.next();
                        entrada = entrada.replace(",", ".");
                        float altura = Float.parseFloat(entrada);
                        //40 cm por si es bebé prematuro
                        while (altura < 0.40) {
                            System.out.println("la altura no es valida");
                            System.out.print("Ingrese la altura de la persona en metros: ");
                            altura = scanner.nextFloat();
                        }
                        //crear instancias de Persona
                        Persona persona1 = new Persona(nombre, edad, peso, altura, sexo);
                        Persona persona2 = new Persona(nombre, edad, sexo);
                        Persona persona3 = new Persona();
                        //llenar datos de la persona 3
                        persona3.setNombre(nombre);
                        persona3.setEdad(edad);
                        persona3.setPeso(peso);
                        persona3.setAltura(altura);
                        persona3.setSexo(sexo);

                        //comprobar el peso de cada uno de las tres personas
                        tipoPeso = persona1.calcularIMC();
                        System.out.println("Persona 1 - " + comprobarPeso(tipoPeso));
                        tipoPeso = persona2.calcularIMC();
                        System.out.println("Persona 2 - " + comprobarPeso(tipoPeso));
                        tipoPeso = persona3.calcularIMC();
                        System.out.println("Persona 3 - " + comprobarPeso(tipoPeso));

                        //indicar si las personas son mayores de edad o no
                        esMayorDeEdad = persona1.esMayorDeEdad();
                        if (esMayorDeEdad) {
                            System.out.println("La persona 1 es mayor de edad");
                        }
                        esMayorDeEdad = persona2.esMayorDeEdad();
                        if (esMayorDeEdad) {
                            System.out.println("la persona 2 es mayor de edad");
                        }
                        esMayorDeEdad = persona3.esMayorDeEdad();
                        if (esMayorDeEdad) {
                            System.out.println("La persona 3 es mayot de edad");
                        }

                        //información general de todos
                        System.out.println(persona1.toString());
                        System.out.println(persona2.toString());
                        System.out.println(persona3.toString());


                    } catch (Exception e) {
                        System.out.println("Ocurrio un error " + e);
                    }
                    break;
                case 17:
                    break;
                case 18:
                    break;
                case 19:
                    break;
                default:
                    System.out.println("Por favor escoge una opción valida");
            }
        }
        while (seleccion != 19);
    }
}