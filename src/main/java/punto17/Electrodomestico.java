package punto17;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Electrodomestico {
    private final String TIPO_DE_CONSUMOS ="ABCDEF";
    private final List<String> COLORES_DISPONIBLES= Arrays.asList("Blanco","Negro","Rojo","Azul", "Gris");
    private double precioBase;
    private String color;
    private char consumoEnergetico;
    private int peso;

    public Electrodomestico() {
        this.color = "blanco";
        this.consumoEnergetico = comprobarConsumoEnergetico(this.consumoEnergetico);
        this.precioBase = 100;
        this.peso = 5;
    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, int peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico =comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public Electrodomestico(double precioBase, int peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = "blanco";
        this.consumoEnergetico = comprobarConsumoEnergetico(this.consumoEnergetico);
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    private char comprobarConsumoEnergetico(char letra){
        String aux=String.valueOf(letra);
        aux=aux.toUpperCase();
        if(TIPO_DE_CONSUMOS.contains(aux)){
            return aux.charAt(0);
        }
        return 'F';
    }
    private String comprobarColor(String color){
        final String[] colorAux = {"blanco"};
        COLORES_DISPONIBLES.forEach(s ->{
            if(s.equalsIgnoreCase(color)){
                colorAux[0] =color;
            }
        }
        );
        return colorAux[0];
    }
    public static void main(String[] args) {
        Electrodomestico electrodomestico=new Electrodomestico();
        System.out.println(electrodomestico.comprobarConsumoEnergetico('z'));

        System.out.println(electrodomestico.comprobarColor("negro"));
    }


}
