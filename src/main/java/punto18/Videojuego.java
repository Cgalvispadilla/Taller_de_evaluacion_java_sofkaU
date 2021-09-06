package punto18;

public class Videojuego {
    private  String titulo, genero, compania;
    private  int horasEstimadas;
    private boolean entregado;

    public Videojuego() {
        this.horasEstimadas=10;
        this.entregado=false;
        this.titulo="";
        this.genero="";
        this.compania="";
    }

    public Videojuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.compania="";
        this.genero="";
        this.entregado=false;
    }

    public Videojuego(String titulo, String genero, String compania, int horasEstimadas) {
        this.titulo = titulo;
        this.genero = genero;
        this.compania = compania;
        this.horasEstimadas = horasEstimadas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", compañia='" + compania + '\'' +
                ", horas Estimadas=" + horasEstimadas +
                ", entregado=" + entregado +
                '}';
    }
}
