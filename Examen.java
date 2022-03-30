package Semana_5.preParcial;

public abstract class Examen {
    private String titulo;
    private String enunciado;
    private Double nota;

    public Examen(String titulo, String enunciado, Double nota, Alumno alumno) {
        this.titulo = titulo;
        this.enunciado = enunciado;
        this.nota = nota;
    }

    public abstract boolean estaAprobado();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }
}
