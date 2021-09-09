package punto18;

public class Serie implements Entregable{
    static final boolean  ESTADO_ENTREGADO = false;
    static final int TEMPORADAS_POR_DEFECTO=0;
    private String titulo, genero, creador;
    private int temporadas;
    private boolean entregado;

    public Serie(){
        this.temporadas=TEMPORADAS_POR_DEFECTO;
        this.entregado=ESTADO_ENTREGADO;
        this.titulo="";
        this.genero="";
        this.creador="";
    }
    public Serie(String titulo, String creador){
        this.temporadas=TEMPORADAS_POR_DEFECTO;
        this.entregado=ESTADO_ENTREGADO;
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

    @Override
    public void prestar() {
        this.entregado=true;
    }

    @Override
    public void devolver() {
        this.entregado=false;
    }

    @Override
    public boolean isPrestado() {
        return this.entregado;
    }

    @Override
    public int compareTo(Object a) {
        //La serie con más temporadas retornara 1, 0 si son iguales y -1 si es menor :)
        int auxRes=-1;
        Serie miSerie= (Serie) a;
        if (this.temporadas>miSerie.getTemporadas()){
            auxRes=1;
        }else if(this.temporadas==miSerie.getTemporadas()){
            auxRes=0;
        }
        return auxRes;
    }
}
