
package com.pruebaacerca.demo.dto;




public class ExperienciaDto {
    
    private String puesto;
    private String empresa;
    private String inicio;
    private String fin;
    private String fotourl;

    public ExperienciaDto() {
    }

    public ExperienciaDto(String puesto, String empresa, String inicio, String fin, String fotourl) {
        this.puesto = puesto;
        this.empresa = empresa;
        this.inicio = inicio;
        this.fin = fin;
        this.fotourl = fotourl;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public String getFotourl() {
        return fotourl;
    }

    public void setFotourl(String fotourl) {
        this.fotourl = fotourl;
    }
    
    
    
}
