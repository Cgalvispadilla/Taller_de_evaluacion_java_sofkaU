package com.sofka.taller;

import java.text.Normalizer;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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
    public static void esMayor(int num1, int num2) {
        if (num1 > num2) {
            System.out.println("El numero " + num1 + " es mayor a " + num2);
        } else if (num1 < num2) {
            System.out.println("El numero " + num2 + " es mayor a " + num1);
        } else {
            System.out.println("Los numeros son iguales");
        }
    }

    //función del ejercicio 3
    public static double areaCirculo(double radio) {
        if (radio > 0) {
            double area = Math.PI * Math.pow(radio, 2);
            return area;
        } else {
            return 0;
        }
    }

    //función del ejercicio 4
    public static double precioFinalProductoConIva(double precio) {
        final double IVA = 0.21;
        if (precio > 0) {
            return precio + (precio * IVA);
        } else {
            return 0;
        }
    }

    //funcion del ejercicio 5
    public static void numParesEImparesHastaCienWhile() {
        int num = 1;
        while (num <= 100) {
            if (num % 2 == 0) {
                System.out.println("el numero " + num + " es par");
            } else {
                System.out.println("el numero " + num + " es impar");
            }
            num++;
        }
    }

    //función del ejercicio 6
    public static void numParesEImparesHastaCienFor() {
        for (int num = 0; num <= 100; num++) {
            if (num % 2 == 0) {
                System.out.println("el numero " + num + " es par");
            } else {
                System.out.println("el numero " + num + " es impar");
            }
        }
    }

    //funcion del ejercicio 7
    public static void numeroMayorACero(Scanner scanner) {
        int num = -1;
        do {
            try {
                System.out.print("Ingrese un numero: ");
                num = scanner.nextInt();
                if (num > 0) System.out.println(num);
            } catch (Exception e) {
                System.out.println("Por favor ingrese solo numeros");
                break;
            }
        } while (num < 1);
    }

    //funcion para quitar acentos y pasar a minusculas
    public static String quitarAcentoYPasarAMinuscula(String cadena) {
        cadena.toUpperCase();
        cadena = Normalizer.normalize(cadena, Normalizer.Form.NFD);
        cadena = cadena.replaceAll("[^\\p{ASCII}]", "");
        return cadena.toLowerCase();
    }

    //funcion del ejercicio 8
    public static String diaEsLaboralONoLaboral(String dia) {
        String esLaboralONo = "";
        dia = quitarAcentoYPasarAMinuscula(dia);
        switch (dia) {
            case "lunes":
                esLaboralONo = "El Lunes es laboral";
                break;
            case "martes":
                esLaboralONo = "El martes es laboral";
                break;
            case "miercoles":
                esLaboralONo = "el miercoles es Laboral";
                break;
            case "jueves":
                esLaboralONo = "el jueves es Laboral";
                break;
            case "vienes":
                esLaboralONo = "el viernes es Laboral";
                break;
            case "sabado":
                esLaboralONo = "el sababado No es Laboral";
                break;
            case "domingo":
                esLaboralONo = "el domingo No es Laboral";
                break;
            default:
                esLaboralONo = "No ingreso un dia, por favor intente nuevamente";
        }
        return esLaboralONo;
    }

    //función del ejercicio 9
    public static String reemplazarYConcatenar(String miMensaje) {
        if (miMensaje.split(" ").length > 1) {
            String texto = "La sonrisa sera la mejor arma contra la tristeza";
            texto = texto.replace("a", "e");
            return texto + " " + miMensaje;
        } else {
            return "No es posible realizar la funcionalidad con una sola palabra o letra, necesita una frase:)";
        }
    }


    //funcion del ejecicio 10
    public static String eliminarEspacioEnTexto(String frase) {
        if (frase.split(" ").length > 1) {
            return frase.replace(" ", "");
        } else {
            return "No es posible realizar la funcionalidad con una sola palabra o letra, necesita una frase:)";
        }
    }

    //función del ejercicio 11
    public static void logitudYVocalesDeUnaFrase(String frase) {
        if (frase.split(" ").length > 1) {
            int count = 0;
            int longitud = frase.length();
            for (int i = 0; i < longitud; i++) {
                char ch = frase.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    count++;
                }
            }
            System.out.println("la frase ingresada tiene una logitud de " + longitud + " y " + count + " Vocales");
        } else {
            System.out.println("No es posible realizar la funcionalidad con una sola palabra o letra, necesita una frase:)");
        }
    }

    //función para encontrar las deferencia entre dos palabras parte de la función 12
    public static String diferenciaEntreDosPalabras(String palabra1, String palabra2) {
        int[] caracteres = new int[26];
        for (char c : palabra1.toCharArray()) {
            caracteres[c - 'a'] = 1;
        }
        for (char c : palabra2.toCharArray()) {
            caracteres[c - 'a'] = 1;
        }
        StringBuilder diferencia = new StringBuilder(26);
        for (int i = 0; i < caracteres.length; i++) {
            if (caracteres[i] > 0)
                diferencia.append((char) (i + 'a'));
        }
        return diferencia.toString();
    }

    //funcion del ejercicio 12
    public static Boolean palabrasIguales(String palabra1, String palabra2) {
        return palabra1.equals(palabra2) ? true : false;
    }

    //función del ejercicio 13
    public static String verFechaHoraActual() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY hh:mm:ss");
        String dateString = sdf.format(cal.getTime());
        return dateString;
    }

    //funcion del ejercicio 14
    public static void numerosDeDosEnDosHastaMil(int num) {
        if (num > 0 && num <= 1000) {
            for (int numero = num; numero < 1001; numero += 2) {
                System.out.println("numero: " + numero);
            }
        } else {
            System.out.println("Por favor ingrese un numero de 1 a 1000.");
        }
    }

    public static void main(String[] args) {
        int seleccion = 0;
        String entrada;
        do {
            Scanner scanner = new Scanner(System.in);
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
                            System.out.println("el area de " + radio + " es " + area);
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
                    scanner.useDelimiter("\n");
                    System.out.print("Ingrese una frase por favor: ");
                    entrada = scanner.next();
                    System.out.println(reemplazarYConcatenar(entrada));
                    break;
                case 10:
                    //configuramos scanner para que nos pueda leer una frase :)
                    scanner.useDelimiter("\n");
                    System.out.print("Ingrese una frase por favor: ");
                    entrada = scanner.next();
                    System.out.println(eliminarEspacioEnTexto(entrada));
                    break;
                case 11:
                    //configuramos scanner para que nos pueda leer una frase :)
                    scanner.useDelimiter("\n");
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
                        System.out.println("las palabras son diferentes y tienen las siguentes letras distintas " + diferenciaEntreDosPalabras(palabra1, palabra2));
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