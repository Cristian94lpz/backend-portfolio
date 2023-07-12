
package com.pruebaacerca.demo.dto;


public class AcercaMiDto {
    
    
    private String descripcion;
    private String fotourl;

    public AcercaMiDto() {
    }

    public AcercaMiDto(String descripcion, String fotourl) {
        this.descripcion = descripcion;
        this.fotourl = fotourl;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFotourl() {
        return fotourl;
    }

    public void setFotourl(String fotourl) {
        this.fotourl = fotourl;
    }
    
    
}
