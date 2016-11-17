/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.geoapp.model.businesslayer.entities;
import java.util.Random;

/**
 *
 * @author alumne
 */
public abstract class Color {
   
    //<editor-fold defaultstate="collapsed" desc="Estat: atribut">
    public int red;
    public int green;
    public int blue;
    
    public static final int MAX_VALUE=255;
    public static final int MIN_VALUE=0;
    private static int counter=0;
    private static int defecto=1;
    //</editor-fold>
 
    //<editor-fold defaultstate="collapsed" desc="Comportament: metodes">
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    
    public Color(int red, int green, int blue) {
        counter++;
        this.red = red;
        this.green = green;
        this.blue = blue;
    }
    
    public Color(){
        this(defecto,defecto,defecto);
        counter++;
    }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="metodes estatics">
    public static int getCounter() {
        return counter;
    }
    
    public static AlphaColor fromHexString(String color){
        if (color==null){
            throw new NullPointerException("Es obligatori indicar una cadena de text");
        }
        if (!color.matches("^#[0-9A-Fa-f]{6}$")){
            throw new IllegalArgumentException(
                    String.format("El text %s no te format hexadecimal", color));
        }
        return new AlphaColor(Integer.parseInt(color.substring(1,3), 16),
                        Integer.parseInt(color.substring(3,5),16),
                        Integer.parseInt(color.substring(5,7),16));
    }
    
    
    
    public static AlphaColor getRandom(){
        Random aleatori = new Random();
        return new AlphaColor(aleatori.nextInt(256),aleatori.nextInt(256),aleatori.nextInt(256));
    }
   
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
   
    /**
     * @return the red
     */
    public int getRed() {
        return red;
    }

    /**
     * @param red the red to set
     */
    public void setRed(int red) {
        if (red < 0 || red>255){
            throw new IllegalArgumentException(
                String.format("Valor %d no valido para el atributo RED", red));
        }
        this.red = red;
    }

    /**
     * @return the green
     */
    public int getGreen() {
        return green;
    }

    /**
     * @param green the green to set
     */
    public void setGreen(int green) {
        if (green < 0 || green>255){
            throw new IllegalArgumentException(
                String.format("Valor %d no valido para el atributo GREEN", green));
        }
        this.green = green;
    }

    /**
     * @return the blue
     */
    public int getBlue() {
        return blue;
    }

    /**
     * @param blue the blue to set
     */
    public void setBlue(int blue) {
        if (blue < 0 || blue>255){
            throw new IllegalArgumentException(
                String.format("Valor %d no valido para el atributo BLUE", blue));
        }
        this.blue = blue;
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="operacions">
    public String toHexString(boolean upper){
        return String.format(upper ? "#%02X%02X%02X" : "#%02x%02x%02x",
        getRed(), getGreen(), getBlue());
        
    }
    public String toHexString(){
        return String.format("#%02X%02X%02X",
        getRed(), getGreen(), getBlue());
        
    }
    public String toRGBString(boolean upper){
        return String.format(upper ? "RGB(%03d,%03d,%03d)" : "rgb(%03d,%03d,%03d)",
        getRed(), getGreen(), getBlue());
        
    }
    public String toRGBString(){
        return String.format("RGB(%03d,%03d,%03d)",
        getRed(), getGreen(), getBlue());
        
    }
    
    @Override
    public String toString() {
        return String.format("RGB(%03d,%03d,%03d) HEX:#%02X%02X%02X", getRed(), getGreen(), getBlue(),getRed(), getGreen(), getBlue()); //To change body of generated methods, choose Tools | Templates.
    }
    //</editor-fold>
    //</editor-fold>

    

    
}
