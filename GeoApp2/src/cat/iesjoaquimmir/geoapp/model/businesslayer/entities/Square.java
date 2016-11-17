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
public class Square extends Shape {
    //<editor-fold defaultstate="collapsed" desc="Estat: atribut">
    private double side = 1;
    
    
    
    private static double defecto=1;
    //</editor-fold>
 
    //<editor-fold defaultstate="collapsed" desc="Comportament: metodes">
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Square(double side,AlphaColor backgroundColor,AlphaColor foregroundColor){
        super(backgroundColor,foregroundColor);
        this.setSide(side);
        
    }
    public Square(double side){
        this(side,null,null);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public double getSide(){
        return side;
    }
    
    public void setSide(double side){
        if (side<=0.0){
            throw new IllegalArgumentException(
                String.format("valor %f no valid",side));
        }
        this.side = side;
    }
    
    /**
     * @return the backgroundColor
     */
    
    
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="operacions">
    public double AreaSquare(){
        return getSide() * getSide();
    }
    public double PerimeterSquare(){
        return getSide() * 4;

    }
    
    //</editor-fold>
    //</editor-fold>

    @Override
    public String toString() {
        return String.format("Dades del quadrat\n"
                + "Costat: %s\n"
                + "Area: %s\n"
                + "Perimetre: %s\n"
                + "%s"
                ,getSide(),AreaSquare(),PerimeterSquare(),super.toString()); 
    }

    
}
