package punto17;

public class Television extends Electrodomestico{
    static final int resolucionPorDefecto=20;
    static final boolean sintonizadorTDTPorDefecto=false;
    private int resolucionEnPulgadas;
    private boolean sintonizadorTDT;

    public Television() {
        super();
        this.resolucionEnPulgadas = resolucionPorDefecto;
        this.sintonizadorTDT = sintonizadorTDTPorDefecto;
    }

    public Television(double precioBase, int peso) {
        super(precioBase, peso);
        this.resolucionEnPulgadas =resolucionPorDefecto;
        this.sintonizadorTDT = sintonizadorTDTPorDefecto;
    }

    public Television(double precioBase, String color, char consumoEnergetico, int peso, int resolucion, boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucionEnPulgadas = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucionEnPulgadas() {
        return resolucionEnPulgadas;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    @Override
    public double precioFinal() {
        double precioFinalAcumulado = super.precioFinal();
        if (getResolucionEnPulgadas() > 40){
            precioFinalAcumulado += precioFinalAcumulado * 0.30;
        }
        if (isSintonizadorTDT()){
            precioFinalAcumulado += 250000;
        }
        return precioFinalAcumulado;
    }
}
