package punto17;

import java.util.Arrays;
import java.util.List;

public class Electrodomestico {
    static final String TIPO_DE_CONSUMOS = "ABCDEF";
    static final List<String> COLORES_DISPONIBLES = Arrays.asList("Blanco", "Negro", "Rojo", "Azul", "Gris");
    private double precioBase;
    private String color;
    private char consumoEnergetico;
    private int peso;

    public Electrodomestico() {
        this.color = comprobarColor(this.color);
        this.consumoEnergetico = comprobarConsumoEnergetico(this.consumoEnergetico);
        this.precioBase = 100;
        this.peso = 5;
    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, int peso) {
        this.precioBase = precioBase;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public Electrodomestico(double precioBase, int peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = comprobarColor(this.color);
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

    private char comprobarConsumoEnergetico(char letra) {
        String aux = String.valueOf(letra);
        aux = aux.toUpperCase();
        if (TIPO_DE_CONSUMOS.contains(aux)) {
            return aux.charAt(0);
        }
        return 'F';
    }

    private String comprobarColor(String color) {
        final String[] colorAux = {"blanco"};
        COLORES_DISPONIBLES.forEach(s -> {
                    if (s.equalsIgnoreCase(color)) {
                        colorAux[0] = color;
                    }
                }
        );
        return colorAux[0];
    }

    protected double precioSegunConsumoEnergetico() {
        char consumo = getConsumoEnergetico();
        double precio = 0;
        switch (consumo) {
            case 'A':
                precio = 100;
                break;
            case 'B':
                precio = 80;
                break;
            case 'C':
                precio = 60;
                break;
            case 'D':
                precio = 50;
                break;
            case 'E':
                precio = 30;
                break;
            case 'F':
                precio = 10;
                break;
            default:
                precio=0;
                break;
        }
        return  precio;
    }

    protected double precioSegunPeso(){
        double precio=0;
        int peso=getPeso();
        if(peso>=0 && peso<=19){
            precio=10;
        }else if(peso>19 && peso<50){
            precio=50;
        }else if(peso>49 && peso<80){
            precio=80;
        }else if(precio>80){
            precio =100;
        }
        return precio;
    }

    public double precioFinal(){
        return getPrecioBase()+precioSegunPeso()+precioSegunConsumoEnergetico();
    }
}
