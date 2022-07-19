package ExamenFinal;

public class Trabajadores {
    private Trabajadores trabajadores[];
    private int contador;

    public Trabajadores() {

        this.trabajadores = new Trabajadores[4];
        this.contador = 0;
    }

    public Trabajadores[] getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(Trabajadores trabajadores) {
        this.trabajadores[this.contador++] = trabajadores;
    }
}
