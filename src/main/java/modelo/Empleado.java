/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author User
 */
public class Empleado {
    private int codigo;
    private String nombre;
    private String cargo;
    private String ciudadania;

    public Empleado(int codigo, String nombre, String cargo, String ciudadania) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cargo = cargo;
        this.ciudadania = ciudadania;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public String getCiudadania() {
        return ciudadania;
    }

    public void setCiudadania(String ciudadania) {
        this.ciudadania = ciudadania;
    }

    @Override
    public String toString() {
        return "Empleado{" + "codigo=" + codigo + ", nombre=" + nombre + 
                ", cargo=" + cargo + ", ciudadania=" + ciudadania + '}';
    }
    
    
}
