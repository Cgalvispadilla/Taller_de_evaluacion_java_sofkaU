package com.sofka.taller;

import java.text.Normalizer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class Funcionalidades {
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
        ArrayList<String> p1=new ArrayList<>(Arrays.asList(palabra1.split("")));
        ArrayList<String> p2=new ArrayList<>(Arrays.asList(palabra2.split("")));
        String auxRes="";
        for (String letra: p1) {
            if (!p2.contains(letra)){
                auxRes+=letra;
            }
        }
        return auxRes;
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

    //funcion para mostrar en que peso esta cada persona
    public static String comprobarPeso(int n){
        String auxRes="La persona esta en sobrepeso";
        if(n==-1){
            auxRes="La persona esta por debajo de su peso ideal";
        }else if (n==0){
            auxRes="La persona esta en su peso ideal";
        }
        return  auxRes;
    }
}
