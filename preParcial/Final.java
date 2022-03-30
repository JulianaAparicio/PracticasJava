package Semana_5.preParcial;

public class Final extends Examen implements Comparable{
    private Double notaOral;
    private String descripcionOral;

    public Final(String titulo, String enunciado, Double nota, Alumno alumno, Double notaOral, String descripcionOral) {
        super(titulo, enunciado, nota, alumno);
        this.notaOral = notaOral;
        this.descripcionOral = descripcionOral;
    }

    public Double getNotaOral() {
        return notaOral;
    }

    public void setNotaOral(Double notaOral) {
        this.notaOral = notaOral;
    }

    public String getDescripcionOral() {
        return descripcionOral;
    }

    public void setDescripcionOral(String descripcionOral) {
        this.descripcionOral = descripcionOral;
    }

    @Override
    public boolean estaAprobado() {
        return (this.getNota() >= 4 && notaOral >= 4);
    }

    @Override
    public int compareTo(Object o) { // positivo si this es mayor. 0 si son =. negativo
        Final finalAux = (Final) o;
        Double promFinal = (this.notaOral + this.getNota()) / 2;
        Double promFinalAux = (finalAux.getNotaOral() + finalAux.getNota()) / 2;

        return promFinal.intValue() - promFinalAux.intValue(); // estamos casteando el rdo lo convertimos a int así
        // casteo es cuando tenes un valor con un tipo de dato y queres convertirlo a otro

        // las notas son doubles y YO NECESITO RETORNAR UN INT xq es lo que me exige la interfaz por eso
        // casteo de double a int ¿perderia los decimales??

        // Este int deberia ser 0, negativo o positivo
    }
}
