/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import modelo.*;

/**
 *
 * @author jairo
 */
public class Test {
    public static void main(String[] args) {
        
        ITrabajador empleado = new Empleado("Coordinador");
        imprimirTrabajador(empleado);
        System.out.println("---------------------------------");
        ITrabajador docente = new Docente(40);
        imprimirTrabajador(docente);
    }
    
    public static void imprimirTrabajador(ITrabajador t){
        System.out.println("Sueldo: " + t.obtenerSueldo());
        System.out.println("Bonificacion: " + t.obtenerBonificacion());
    }
    
}
