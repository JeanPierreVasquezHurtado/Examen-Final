package ExamenFinal;

import Tarea15.Docente;

public class main {
    public static void main(String[] args) {
        Docentes docente1 = new Docentes("Alberto","Garcia Gutierrez",2412455,"Docente");
        docente1.setHorasEmple(48);
        Docentes docente2 = new Docentes("Juan","Romero Rocha",127647543,"Docente");
        docente2.setHorasEmple(24);

        Empleados emple1 = new Empleados("Piero","vasquez Hurtado",7165283,"Empleado");
        emple1.setCargo("coordinador");
        Empleados emple2 = new Empleados("Rody","Rodrigues Velazquez",6335332,"Empleado");
        emple2.setCargo("asistente");

        Trabajadores trbaja = new Trabajadores();
        Trabajadores trabaja2 = new Trabajadores();
        Trabajadores trabaja3 = new Trabajadores();
        Trabajadores trabaja4 = new Trabajadores();

        trbaja.setTrabajadores(docente1);
        trabaja2.setTrabajadores(docente2);
        trabaja3.setTrabajadores(emple1);
        trabaja4.setTrabajadores(emple2);

        for (Trabajador traba: trabaja2.getTrabajadores()) {
            
        }


    }
}
