package ExamenFinal;

public class Empleados extends Trabajador {
    private String cargo;
    private Empleados empleados[];
    private int conta;

    public Empleados(String nombres, String apellidos, int dni, String tipo)
    {
        super(nombres, apellidos, dni, tipo);
        this.empleados = new Empleados[2];
        this.conta=0;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Empleados[] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleados empleados) {
        this.empleados[this.conta++] = empleados;
    }
}
