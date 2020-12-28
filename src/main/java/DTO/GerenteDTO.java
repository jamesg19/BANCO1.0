/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.io.Serializable;

/**
 *
 * @author james
 */
public class GerenteDTO implements Serializable{
    
    public static final String CODIGO_DB = "codigo";
    public static final String NOMBRE_DB = "nombre";
    public static final String SEXO_DB = "sexo";
    public static final String TURNO_DB = "turno";
    public static final String DPI_DB = "dpi";
    public static final String DIRECCION_DB = "direccion";
    
    private int codigo;
    private String nombre;
    private String sexo;
    private String turno;
    private String dpi;
    private String direccion;
    private String password;

    
    public GerenteDTO(){
    
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
