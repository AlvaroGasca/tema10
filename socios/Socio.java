/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema10.socios;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author alvarogasca
 */

class Socio implements Serializable, Comparable<Socio> {
    private String dni;
    private String nombre;
    private LocalDate fechaAlta;

    public Socio(String dni, String nombre, LocalDate fechaAlta) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaAlta = fechaAlta;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Socio other = (Socio) obj;
        if ((this.dni == null) ? (other.dni != null) : !this.dni.equals(other.dni)) {
            return false;
        }
        return true;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
    
    
    @Override
    public int compareTo(Socio otroSocio) {
        return this.dni.compareTo(otroSocio.dni);
    }
    
    public int antiguedad() {
        return LocalDate.now().getYear() - fechaAlta.getYear();
    }

    @Override
    public String toString() {
        return "Socio{" + "dni=" + dni + ", nombre=" + nombre + ", fechaAlta=" + fechaAlta + '}';
    }
    
    
}
