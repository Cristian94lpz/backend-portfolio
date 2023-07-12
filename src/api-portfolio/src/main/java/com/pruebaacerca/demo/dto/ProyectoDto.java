
package com.pruebaacerca.demo.dto;


public class ProyectoDto {
    
    private String nombre;
    private String descripcion;
    private String url;
    private String fotourl;

    public ProyectoDto() {
    }

    public ProyectoDto(String nombre, String descripcion, String url, String fotourl) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.url = url;
        this.fotourl = fotourl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFotourl() {
        return fotourl;
    }

    public void setFotourl(String fotourl) {
        this.fotourl = fotourl;
    }
    
    
    
}
