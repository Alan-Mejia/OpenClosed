package com.company.modelos;

import com.company.servicio.EmpleadoBeneficios;

public class Empleado implements EmpleadoBeneficios {
    private String nombre;
    private String departamento;
    private int salario;

    public Empleado(String nombre, String departamento, int salario) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public int calcularSalario() {
        return salario*30;
    }

    @Override
    public int diasDeVacaciones() {
        return 20;
    }
}
