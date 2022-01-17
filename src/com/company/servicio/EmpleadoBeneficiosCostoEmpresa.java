package com.company.servicio;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmpleadoBeneficiosCostoEmpresa {

    public int costoDeEmpleados(ArrayList<EmpleadoBeneficios> todosLosEmpleados){
        int totalSalarios = 0;
        int gastoVaciones = 0;
        for (EmpleadoBeneficios cadaEmpleado : todosLosEmpleados){
            totalSalarios += cadaEmpleado.calcularSalario();
            gastoVaciones += cadaEmpleado.diasDeVacaciones()*cadaEmpleado.calcularSalario();
        }
        return totalSalarios+gastoVaciones;
    }
}
