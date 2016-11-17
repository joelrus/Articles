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
public class AlphaColor extends Color {
    //<editor-fold defaultstate="collapsed" desc="atributs">
    private double alpha;
    
    private static final double opac=0.0;
    private static final double transparent=1.0;
    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="constructors">

    public AlphaColor(int red,int green,int blue,double alpha) {
        super(red,green,blue);
        this.setAlpha(alpha);
    }
    
    public AlphaColor(int red,int green,int blue) {
        super(red,green,blue);
        this.setAlpha(opac);
    }
    
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="get/set">
    

    /**
     * @return the alpha
     */
    public double getAlpha() {
        return alpha;
    }

    /**
     * @param alpha the alpha to set
     */
    public void setAlpha(double alpha) {
        if(alpha<opac || alpha>transparent){
           throw new IllegalArgumentException(String.format("Valor %d incorrecte, ha de estar entre 0 i 1",alpha));
        }
        this.alpha = alpha;
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="sobreescriptura">

    
//</editor-fold>

    @Override
    public String toHexString() {
        return String.format("%s Opacity(%.2f)", super.toHexString(),getAlpha()); 
    }

    @Override
    public String toRGBString() {
        return String.format("%s Opacity(%.2f)", super.toRGBString(),getAlpha()); 
    }

    @Override
    public String toString() {
        return String.format("%s Opacity:(%.2f)", super.toString(),getAlpha());
    }
    
    
}

