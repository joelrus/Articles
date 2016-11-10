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
    private String nom;
    private String descripcio;
    private int hores;
    
    private static final String descr = "Llenguatge de marques";
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="constructors">
    public Modul(String nom, String descripcio, int hores) {
        this.setNom(nom);
        this.setDescripcio(descripcio);
        this.setHores(hores);
    }
    public Modul(String nom, int hores) {
        this(nom,descr,hores);
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
        if (nom==null) {
            throw new IllegalArgumentException(
                String.format("El nom no pot ser null %s",nom));
        }
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
        if (hores<1) {
            throw new IllegalArgumentException(
                String.format("El modul no te el minim de hores %d",hores));
        }
        this.hores = hores;
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="operacions">
    public String getModulComplet(){
        return String.format("%s, %s, %d hores",getNom(),getDescripcio(),getHores());
    }
//</editor-fold>
}
