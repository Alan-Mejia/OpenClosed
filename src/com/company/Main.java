package com.company;

import com.company.modelos.Empleado;
import com.company.modelos.Jefatura;
import com.company.servicio.EmpleadoBeneficios;
import com.company.servicio.EmpleadoBeneficiosCostoEmpresa;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Alan","TI",100);
        Jefatura jefe1 = new Jefatura("Rodrigo","Area TI",200);

        ArrayList<EmpleadoBeneficios> todosLosEmpleados = new ArrayList<>();
        todosLosEmpleados.add(empleado1);
        todosLosEmpleados.add(jefe1);

        EmpleadoBeneficiosCostoEmpresa costoDePlantilla = new EmpleadoBeneficiosCostoEmpresa();
        System.out.println("Costo de todos los empleados: " + costoDePlantilla.costoDeEmpleados(todosLosEmpleados));

    }
}
