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
public abstract class Shape {
    //<editor-fold defaultstate="collapsed" desc="atributs">
    private AlphaColor backgroundColor;
    private AlphaColor foregroundColor;
    
    public static int counter;
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="constructors">
    public Shape(){
        counter++;
    }
    public Shape(AlphaColor backgroundColor, AlphaColor foregroundColor) {
        this.setBackgroundColor(backgroundColor);
        this.setForegroundColor(foregroundColor);
        counter++;
    }
    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="gets/sets">
    /**
     * @return the counter
     */
    public static int getCounter() {
        return counter;
    }
    
    public Color getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * @param backgroundColor the backgroundColor to set
     */
    public void setBackgroundColor(AlphaColor backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    /**
     * @return the foregroundColor
     */
    public Color getForegroundColor() {
        return foregroundColor;
    }

    /**
     * @param foregroundColor the foregroundColor to set
     */
    public void setForegroundColor(AlphaColor foregroundColor) {
        this.foregroundColor = foregroundColor;
    }
    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="operacions">
    @Override
    public String toString() {
        return String.format("Color de fons: %s\n"
                + "Color de vora: %s\n"
        ,getBackgroundColor().toString(),getForegroundColor().toString());
    }
//</editor-fold>

    
}
