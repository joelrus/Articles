/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.geoapp.model.businesslayer.entities;

/**
 *
 * @author alumne
 */
public class Cercle {
    //<editor-fold defaultstate="collapsed" desc="Estat: atribut">
    private double radi = 1;
    //</editor-fold>
 
    //<editor-fold defaultstate="collapsed" desc="Comportament: metodes">
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Cercle(double radi){
        this.setRadi(radi);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public double getRadi(){
        return radi;
    }
    public void setRadi(double radi){
        if (radi<=0.0){
            throw new IllegalArgumentException(
                String.format("valor %f no valid",radi));
        }
        this.radi = radi;
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="operacions">
    public double AreaCercle(){
        return Math.pow(getRadi(), 2)*Math.PI;
    }
    public double PerimeterCercle(){
        return 2*Math.PI*getRadi();
    }
    //</editor-fold>
    //</editor-fold>
}

