//Clase para crear el objeto plano (POJO) con anotaciones
package org.dis;

import com.opencsv.bean.CsvBindByName;

public class POJO{

    @CsvBindByName
    private String posicion;

    @CsvBindByName
    private String nombre;

    @CsvBindByName
    private String apellido;

    @CsvBindByName
    private String pais;

    @CsvBindByName
    private String edad;

    public POJO(){}

    public POJO (String posicion, String nombre, String apellido, String pais, String edad){
        this.posicion = posicion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.pais = pais;
        this.edad = edad;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
}