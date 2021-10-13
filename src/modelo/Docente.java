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
public class Docente implements ITrabajador {
    private int horasDictadas;
    private double pagoPorHora;

    public Docente() {
    }

    public Docente(int horasDictadas) {
        this.horasDictadas = horasDictadas;
        this.pagoPorHora = 120;
    }

    /**
     * @return the horasDictadas
     */
    public int getHorasDictadas() {
        return horasDictadas;
    }

    /**
     * @param horasDictadas the horasDictadas to set
     */
    public void setHorasDictadas(int horasDictadas) {
        this.horasDictadas = horasDictadas;
    }

    /**
     * @return the pagoPorHora
     */
    public double getPagoPorHora() {
        return pagoPorHora;
    }

    /**
     * @param pagoPorHora the pagoPorHora to set
     */
    public void setPagoPorHora(double pagoPorHora) {
        this.pagoPorHora = pagoPorHora;
    }

    @Override
    public double obtenerSueldo() {
       return this.horasDictadas * this.pagoPorHora; 
    }

    @Override
    public double obtenerBonificacion() {
       return this.obtenerSueldo() * 0.7;
    }
    
    
    
}
