package ExamenFinal;

import java.util.Date;

public abstract class Trabajador {
    protected String nombres;
    protected String apellidos;
    protected int dni;
    protected String tipo;

    public Trabajador(String nombres, String apellidos, int dni, String tipo) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.tipo = tipo;
    }
}