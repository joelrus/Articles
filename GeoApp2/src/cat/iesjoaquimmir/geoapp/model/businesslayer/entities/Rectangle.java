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
public class Rectangle {
    //<editor-fold defaultstate="collapsed" desc="Estat: atribut">
    private double base = 1;
    private double altura = 5;
    //</editor-fold>
 
    //<editor-fold defaultstate="collapsed" desc="Comportament: metodes">
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Rectangle(double base,double altura){
        this.setBase(base);
        this.setAltura(altura);
    }
    public Rectangle(double base){
        this.setBase(base);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public double getBase(){
        return base;
    }
    
    public void setBase(double base){
        if (base<=0.0){
            throw new IllegalArgumentException(
                String.format("valor %f no valid",base));
        }
        this.base = base;
    }
    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
        if (altura<=0.0){
            throw new IllegalArgumentException(
                String.format("valor %f no valid",altura));
        }
        this.altura = altura;
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="operacions">
    public double AreaRectangle(){
        return getBase() * getAltura();
    }
    public double PerimeterRectangle(){
        return (getBase()*2) + (getAltura()*2);
    }
    //</editor-fold>
    //</editor-fold>
}
