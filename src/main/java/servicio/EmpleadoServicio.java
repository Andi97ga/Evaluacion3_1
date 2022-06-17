/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Empleado;

/**
 *
 * @author User
 */
public class EmpleadoServicio implements IEmpleadoServicio {

    private final List<Empleado> empleadoList = new ArrayList<>();
    
    @Override
    public Empleado crear(Empleado empleado) {
        this.empleadoList.add(empleado);
        return empleado; 
    }

    @Override
    public List<Empleado> listar() {
        return this.empleadoList;
    }
    
}
