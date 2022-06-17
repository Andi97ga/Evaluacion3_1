/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Empleado;

/**
 *
 * @author User
 */
public interface IEmpleadoServicio {
    public Empleado crear(Empleado empleado);
    public List<Empleado> listar(); 
}
