/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Empleado;
import servicio.EmpleadoServicio;

/**
 *
 * @author User
 */
public class EmpleadoControl  {
    private final EmpleadoServicio empleadoServicio = new EmpleadoServicio();
    
    public Empleado crear(String [] args){
        var empleado = new Empleado(Integer.valueOf(args[0]),args[1],
                args[2],args[2]);
        this.empleadoServicio.crear(empleado);
        return empleado;
    }
    
    public List<Empleado> listar(){
        return this.empleadoServicio.listar();
    }

   
}
