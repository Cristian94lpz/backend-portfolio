
package com.pruebaacerca.demo.dto;


public class HabilidadesBlandasDto {
    
    private String trabajo_equipo;
    private String pensamiento_critico;
    private String comunicacion_asertiva;
    private String escucha_activa;
    private String adaptacion_cambio;
    private String creatividad;
    private String respeto_opiniones;

    public HabilidadesBlandasDto() {
    }

    public HabilidadesBlandasDto(String trabajo_equipo, String pensamiento_critico, String comunicacion_asertiva, String escucha_activa, String adaptacion_cambio, String creatividad, String respeto_opiniones) {
        this.trabajo_equipo = trabajo_equipo;
        this.pensamiento_critico = pensamiento_critico;
        this.comunicacion_asertiva = comunicacion_asertiva;
        this.escucha_activa = escucha_activa;
        this.adaptacion_cambio = adaptacion_cambio;
        this.creatividad = creatividad;
        this.respeto_opiniones = respeto_opiniones;
    }

    public String getTrabajo_equipo() {
        return trabajo_equipo;
    }

    public void setTrabajo_equipo(String trabajo_equipo) {
        this.trabajo_equipo = trabajo_equipo;
    }

    public String getPensamiento_critico() {
        return pensamiento_critico;
    }

    public void setPensamiento_critico(String pensamiento_critico) {
        this.pensamiento_critico = pensamiento_critico;
    }

    public String getComunicacion_asertiva() {
        return comunicacion_asertiva;
    }

    public void setComunicacion_asertiva(String comunicacion_asertiva) {
        this.comunicacion_asertiva = comunicacion_asertiva;
    }

    public String getEscucha_activa() {
        return escucha_activa;
    }

    public void setEscucha_activa(String escucha_activa) {
        this.escucha_activa = escucha_activa;
    }

    public String getAdaptacion_cambio() {
        return adaptacion_cambio;
    }

    public void setAdaptacion_cambio(String adaptacion_cambio) {
        this.adaptacion_cambio = adaptacion_cambio;
    }

    public String getCreatividad() {
        return creatividad;
    }

    public void setCreatividad(String creatividad) {
        this.creatividad = creatividad;
    }

    public String getRespeto_opiniones() {
        return respeto_opiniones;
    }

    public void setRespeto_opiniones(String respeto_opiniones) {
        this.respeto_opiniones = respeto_opiniones;
    }
    
    
    
    
    
    
    
}
