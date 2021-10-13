/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author jairo
 */
public class Empleado implements ITrabajador {
    private String cargo;

    public Empleado() {
    }

    public Empleado(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the sueldo
     */
    
    @Override
    public double obtenerSueldo() {
        double sueldo; 
        switch(cargo){
            case "Coordinador": sueldo = 5000; break;
            case "Asistente": sueldo = 4000; break;
            default: sueldo = 3000;
        }
        return sueldo;
    }

    @Override
    public double obtenerBonificacion() {
        return this.obtenerSueldo();
    }
    
    
    
    
}
