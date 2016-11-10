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
public class Modul {
    //<editor-fold defaultstate="collapsed" desc="atributs">
    public String nom;
    public String descripcio;
    public int hores;
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="constructors">
    public Modul(String nom, String descripcio, int hores) {
        this.setNom(nom);
        this.setDescripcio(descripcio);
        this.setHores(hores);
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="getters/setters">
    


    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the descripcio
     */
    public String getDescripcio() {
        return descripcio;
    }

    /**
     * @param descripcio the descripcio to set
     */
    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    /**
     * @return the hores
     */
    public int getHores() {
        return hores;
    }

    /**
     * @param hores the hores to set
     */
    public void setHores(int hores) {
        this.hores = hores;
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="operacions">
    public String getModulComplet(){
        return String.format("%s, %s, %d hores",getNom(),getDescripcio(),getHores());
    }
//</editor-fold>
}
