package com.sofka.taller;

import punto16.Persona;
import punto17.*;
import punto18.Serie;
import punto18.Videojuego;


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
                    double acumPrecioElectrodomesticos=0,acumPrecioLavadoras=0, acumPrecioTelevisores=0;
                    //creacion de objetos para llenar el array
                    //electrodomesticos
                    Electrodomestico miLicuadora = new Electrodomestico();
                    Electrodomestico miSanduchera = new Electrodomestico(100000,1);
                    Electrodomestico miPortatil = new Electrodomestico(1700000,3);
                    Electrodomestico miVentilador = new Electrodomestico(150000,"blanco",'g',7);
                    //lavadoras
                    Lavadora miLavadora1 = new Lavadora();
                    Lavadora miLavadora2 = new Lavadora(200000,10);
                    Lavadora miLavadora3 = new Lavadora(300000,"Rojo",'B',15,30);
                    //televisores
                    Televisor miTelevisor = new Televisor();
                    Televisor miTelevisor2 = new Televisor(600000,10);
                    Televisor miTelevisor3 = new Televisor(1800000,"lila",'F',8,50,true);
                    //llenar datos
                    Electrodomestico [] misElectrodomesticos = {miLicuadora,
                                                                miSanduchera,
                                                                miPortatil,
                                                                miVentilador,
                                                                miLavadora1,
                                                                miLavadora2,
                                                                miLavadora3,
                                                                miTelevisor,
                                                                miTelevisor2,
                                                                miTelevisor3};

                    for (Electrodomestico e: misElectrodomesticos) {
                        if(e instanceof Electrodomestico ){
                            acumPrecioElectrodomesticos+=e.precioFinal();
                        }
                        if (e instanceof  Lavadora){
                            acumPrecioLavadoras+=e.precioFinal();
                        }
                        if(e instanceof  Televisor){
                            acumPrecioTelevisores+=e.precioFinal();
                        }
                    }
                    double precioTotal=acumPrecioElectrodomesticos+acumPrecioLavadoras+acumPrecioTelevisores;
                    System.out.println("EL precio de los electrodomesticos es "+acumPrecioElectrodomesticos+" COP, el precio de " +
                            "las lavadoras es "+acumPrecioLavadoras+" COP y el precio de los televisores es "+acumPrecioTelevisores+
                            " para un precio total de "+precioTotal+" COP");
                    break;
                case 18:
                    Serie miSerie1 = new Serie();
                    Serie miSerie2 = new Serie("game of thrones","David Benioff");
                    Serie miSerie3 = new Serie("Breaking Bad","Drama", "Vince Gilligan", 5);
                    Serie miSerie4 = new Serie("Peaky Blinders","Crime", "Steven Knight", 6);
                    Serie miSerie5 = new Serie("Los Simpson","Matt Groening");
                    Serie[] misSeries ={miSerie1, miSerie2, miSerie3, miSerie4, miSerie5};
                    Videojuego miVideojuego1 = new Videojuego();
                    Videojuego miVideojuego2 = new Videojuego("Halo 5",300);
                    Videojuego miVideojuego3 = new Videojuego("Call of duty: Cold war","Shoter","Activition",100);
                    Videojuego miVideojuego4 = new Videojuego("League of legends","MOBA","Riot game",100000);
                    Videojuego miVideojuego5 = new Videojuego("Halo 2",200);

                    Videojuego[] misVideojuegos={miVideojuego1, miVideojuego2, miVideojuego3, miVideojuego4, miVideojuego5};

                    misSeries[2].entregar();
                    misSeries[3].entregar();
                    misSeries[4].entregar();
                    misVideojuegos[2].entregar();
                    misVideojuegos[3].entregar();
                    misVideojuegos[4].entregar();


                    int cantidadEntregados=0;
                    for (Serie s: misSeries) {
                        if (s.isEntregado()){
                            cantidadEntregados+=1;
                            s.devolver();
                        }
                    }
                    for (Videojuego v: misVideojuegos) {
                        if (v.isEntregado()){
                            cantidadEntregados+=1;
                            v.devolver();
                        }
                    }
                    System.out.println("Existen "+cantidadEntregados +" entregados entre videojuegos y series");

                    Videojuego miVideoJuegoConMasHoras = misVideojuegos[0];
                    Serie miSerieConMasTemporadas = misSeries[0];

                    for (int iterador = 1; iterador < misVideojuegos.length; iterador++) {
                        if (misVideojuegos[iterador].compareTo(miVideoJuegoConMasHoras)==1){
                            miVideoJuegoConMasHoras=misVideojuegos[iterador];
                        }
                        if (misSeries[iterador].compareTo(miSerieConMasTemporadas)==1){
                            miSerieConMasTemporadas=misSeries[iterador];
                        }
                    }

                    System.out.println("el videojuego con más horas "+miVideoJuegoConMasHoras.toString());
                    System.out.println("la serie con más temporadas "+miSerieConMasTemporadas.toString());

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