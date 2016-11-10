/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.alumnes.entities;

/**
 *
 * @author alumne
 */
public class Domicili {
    //<editor-fold defaultstate="collapsed" desc="Atributs">
    private String carrer;
    private int numero;
    private String pis;
    private String codi_postal;
    private String poblacio;
    private String provincia;
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="contructors">
    public Domicili(String carrer, int numero, String pis, String codi_postal, String poblacio, String provincia) {
        this.setCarrer(carrer);
        this.setNumero(numero);
        this.setPis(pis);
        this.setCodi_postal(codi_postal);
        this.setPoblacio(poblacio);
        this.setProvincia(provincia);
    }
    public Domicili(String carrer, int numero, String codi_postal, String poblacio, String provincia) {
        this(carrer,numero,null,codi_postal,poblacio,provincia);
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="getters/setters">
    


    /**
     * @return the carrer
     */
    public String getCarrer() {
        return carrer;
    }

    /**
     * @param carrer the carrer to set
     */
    public void setCarrer(String carrer) {
        this.carrer = carrer;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the pis
     */
    public String getPis() {
        return pis;
    }

    /**
     * @param pis the pis to set
     */
    public void setPis(String pis) {
        this.pis = pis;
    }

    /**
     * @return the codi_postal
     */
    public String getCodi_postal() {
        return codi_postal;
    }

    /**
     * @param codi_postal the codi_postal to set
     */
    public void setCodi_postal(String codi_postal) {
        this.codi_postal = codi_postal;
    }

    /**
     * @return the poblacio
     */
    public String getPoblacio() {
        return poblacio;
    }

    /**
     * @param poblacio the poblacio to set
     */
    public void setPoblacio(String poblacio) {
        this.poblacio = poblacio;
    }

    /**
     * @return the provincia
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * @param provincia the provincia to set
     */
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="operacions">
    public String getDomiciliAmigable(){
        return String.format("%s ,%d %s, %d, %s (%s)",getCarrer(),getNumero(),getPis(),getCodi_postal(),getPoblacio(),getProvincia());
    }
//</editor-fold>
    
}
