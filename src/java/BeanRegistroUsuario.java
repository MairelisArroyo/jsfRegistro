/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Mairelis Arroyo
 */
@ManagedBean
@SessionScoped
public class BeanRegistroUsuario {

    public String nombreUsuario;
    public String titulacion;
    public Integer fechaGraduacion;
    public Date fechaNacimiento;
    
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public Integer getFechaGraduacion() {
        return fechaGraduacion;
    }

    public void setFechaGraduacion(Integer fechaGraduacion) {
        this.fechaGraduacion = fechaGraduacion;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
