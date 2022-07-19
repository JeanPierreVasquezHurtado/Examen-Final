package ExamenFinal;


public class Docentes extends Trabajador {
    private int horasEmple;
    private Docentes docentes[];
    private int contadorr;

    public Docentes(String nombres, String apellidos, int dni, String tipo)
    {
        super(nombres, apellidos, dni, tipo);
        this.docentes= new Docentes[2];
        this.contadorr=0;
    }

    public int getHorasEmple() {
        return horasEmple;
    }

    public void setHorasEmple(int horasEmple) {
        this.horasEmple = horasEmple;
    }

    public Docentes[] getDocentes() {
        return docentes;
    }

    public void setDocentes(Docentes docentes) {
        this.docentes[this.contadorr++] = docentes;
    }
}
