package com.company.modelos;

import com.company.servicio.EmpleadoBeneficios;

public class Jefatura implements EmpleadoBeneficios {
    private String nombre;
    private String cargo;
    private int salario;

    public Jefatura(String nombre, String cargo, int salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
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
        return 30;
    }
}
