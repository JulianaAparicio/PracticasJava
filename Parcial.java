package Semana_5.preParcial;

public class Parcial extends Examen implements Recuperable {
    private int numeroDeUnidad;
    private int reintentos;

    public Parcial(String titulo, String enunciado, Double nota, Alumno alumno, int numeroDeUnidad, int reintentos) {
        super(titulo, enunciado, nota, alumno);
        this.numeroDeUnidad = numeroDeUnidad;
        this.reintentos = reintentos;
    }

    @Override
    public boolean estaAprobado() {
        return this.getNota() >= 4;
    }

    @Override
    public boolean esRecuperable() {
        if(this.numeroDeUnidad <= 3){
            return this.reintentos < 3;
        } else{
            return this.reintentos < 2;
        }
    }
}
