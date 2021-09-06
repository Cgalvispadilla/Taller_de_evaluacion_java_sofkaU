package punto18;

public class Serie {
    private String titulo, genero, creador;
    private int temporadas;
    private boolean entregado;

    public Serie(){
        this.temporadas=3;
        this.entregado=false;
        this.titulo="";
        this.genero="";
        this.creador="";
    }
    private Serie(String titulo, String creador){
        this.temporadas=3;
        this.entregado=false;
        this.titulo=titulo;
        this.creador=creador;
        this.genero="";
    }

    public Serie(String titulo, String genero, String creador, int temporadas) {
        this.titulo = titulo;
        this.genero = genero;
        this.creador = creador;
        this.temporadas = temporadas;
        this.entregado=false;
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

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                ", temporadas=" + temporadas +
                ", entregado=" + entregado +
                '}';
    }
}